package Files;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.bolivia.qulqi.Qulqi;
import org.bolivia.qulqi.Qulqi$COIN;
import org.bolivia.qulqi.Qulqi$FLOATING;

public class Pagare {

    private double total;
    private double mensualidad;
    private int plazo;
    private String fecha,totalLetras,vencimiento;
    private String usuario;
    private String password;
    private String fechaMesDespues;
    private String texto = new String("");
    private String mensuLetras;
    private String numero;
    
    private void LlenarVariables(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        texto = texto.replace("(FS)", fecha);
        texto = texto.replace("(FV)", vencimiento);
        texto = texto.replace("(BP)", nf.format(total));
        texto = texto.replace("(CP)", totalLetras);
        texto = texto.replace("(NP)", plazo+"");
        texto = texto.replace("(CM)", mensuLetras);
        texto = texto.replace("(FI)", fechaMesDespues);
        texto = texto.replace("(PN)", numero);
    }

    public void LeerPagare() {
        String cadena;
        try {
            FileReader f = new FileReader("Contrato//pagare.rtf");
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                texto = texto + cadena;
            }
            b.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Leer = " + ex.getMessage());
        }
        HacerPagare();
    }
    
    private void HacerPagare(){
        try{
            File archivo = new File("Contrato//pagarehecho.rtf");
            BufferedWriter bw;
            LlenarVariables();
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));               
                bw.write(texto);
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(texto);
            }
            bw.close();
            Impresion();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "HacerPagare // "+e.getMessage());
        }
    }
    
    private void Impresion(){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        java.io.File fichero = new java.io.File("Contrato//pagarehecho.rtf");
        if (desktop.isSupported(Desktop.Action.PRINT)) {
            try {
                desktop.print(fichero);
            } catch (Exception e) {
                System.out.print("El sistema no permite imprimir usando la clase Desktop");
                e.printStackTrace();
            }
        } else {
            System.out.print("El sistema no permite imprimir usando la clase Desktop");
        }
    }    
    
    public void setUsuario(String cuenta, String password){
        usuario = cuenta;
        this.password = password;
    }
    
    public void setDatos(int cotizacion, double total, int plazo, String fecha, String numero) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        Qulqi ql = new Qulqi();
        ql.setDecimalPartVisible(true);
        ql.setCoin(Qulqi$COIN.peso_mexicano);
        ql.setFloating(Qulqi$FLOATING.POINT);
        this.total = total;
        this.plazo = plazo;
        this.fecha = fecha;
        this.numero = numero;
        try{
            Conexion con = new Conexion();
            SQLCotizacion ac = new SQLCotizacion();
            ResultSet res;
            String sql;
            sql = ac.ConsultarCotizacion(cotizacion);
            con.Conectar(usuario, password);
            res = con.Consulta(sql);
            if (res.next()) {
                mensualidad = res.getDouble(6);
            }
            con.Cerrar();
            totalLetras = ql.showMeTheMoney(String.valueOf(total)).toUpperCase();
            int z = totalLetras.indexOf("/");
            String x = totalLetras.substring((z - 3));
            totalLetras = totalLetras.substring(0, z - 3) + " PESOS" + x;
            totalLetras = nf.format(this.total) + " " + totalLetras;
            this.fecha = GetFechaActual();
            vencimiento = GetFechaMeses(plazo+1);
            fechaMesDespues = GetFechaMesSiguiente();
            mensuLetras = ql.showMeTheMoney(String.valueOf(this.mensualidad)).toUpperCase();
            z = mensuLetras.indexOf("/");
            x = mensuLetras.substring((z - 3));
            mensuLetras = mensuLetras.substring(0, z - 3) + " PESOS" + x;
            mensuLetras = nf.format(this.mensualidad) + " " + mensuLetras;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Pagare\nError al capturar datos");
        }
    }
    
     public String GetFechaMesSiguiente(){
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.MONTH, 1);
        String fe, m, d;
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        if(dia <10){
            d = "0"+dia;
        }
        else{
            d = ""+dia;
        }
        switch(mes){
            case 1 : m = "ENERE" ; break;
            case 2 : m = "FEBRERO" ; break;
            case 3 : m = "MARZO" ; break;
            case 4 : m = "ABRIL" ; break;
            case 5 : m = "MAYO" ; break;
            case 6 : m = "JUNIO" ; break;
            case 7 : m = "JULIO" ; break;
            case 8 : m = "AGOSTO" ; break;
            case 9 : m = "SEPTIEMBRE" ; break;
            case 10 : m = "OCTUBRE" ; break;
            case 11 : m = "NOVIEMBRE" ; break;
            case 12 : m = "DICIEMBRE" ; break;
            default: m = "error" ; break;
        }
        fe = d+" DE "+m+" DE "+ano;
        return fe;
    }
    
    public String GetFechaActual(){
        Calendar fecha = new GregorianCalendar();
        String fe, m, d;
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        if(mes <10){
            m = "0"+mes;
        }
        else{
            m = ""+mes;
        }
        if(dia <10){
            d = "0"+dia;
        }
        else{
            d = ""+dia;
        }
        fe = d+"/"+m+"/"+ano;
        return fe;
    }
    
    public String GetFechaMeses(int i){
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.MONTH, i);
        String fe, m, d;
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        if(mes <10){
            m = "0"+mes;
        }
        else{
            m = ""+mes;
        }
        if(dia <10){
            d = "0"+dia;
        }
        else{
            d = ""+dia;
        }
        fe = d+"/"+m+"/"+ano;
        return fe;
    } 
    
}
