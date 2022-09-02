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
import java.util.Locale;
import javax.swing.JOptionPane;
import org.bolivia.qulqi.Qulqi;
import org.bolivia.qulqi.Qulqi$COIN;
import org.bolivia.qulqi.Qulqi$FLOATING;

public class Contrato {
    
    String texto = new String("");
    private String nombreC, nacionC,oficioC, telefonoTC,dirTC,dirC,telefonoC,RFCC;
    private String nombreAval, nacAval,oficioAval,telLab,domLab,rfcAval,domPar,telPar;
    private String marca,tipo,transmision,color,serie,motor, distribuidor,uso;
    private int ano,dia, plazo;
    private String precio,enganche,financiamiento,intereses,total,seguro,comision,factura,saldo,fecha,fmeses;
    private int edadC, residenciaC, edadA, residenciaA;
    private String correoC, curpC, civilC, empresaC, puestoC, ingresoC, civilA;
    private String curpA, correoA, empresaA, ingresoA, puestoA;
    private String ubicacion, contrato;
    private String denominacion;
    private String datos;
    private String folio;
    private String lugar;
    private String registro;
    private double mensualidad;
    private int a;
    private int d;
    private String m;
    private String usuario,password;
    private String tasi;
    private double cat;
    private String beneficiario;
    private double porcentaje;
    
    public void setUsuario(String cuenta, String password){
        usuario = cuenta;
        this.password = password;
    }
    
    public void LeerContrato(int cotizacion){
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
            GetFechaMeses();
            String cadena;
            FileReader f = new FileReader("Contrato//contrato.rtf");
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine()) != null){
                texto = texto + cadena;
            }
            b.close();
            HacerContrato();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error con el archivo original-- "+e.toString());
        }
    }
    
    public void LeerCopia(int cotizacion){
        
        try{
            texto = "";
            String cadena;
            FileReader f = new FileReader("Contrato//contratocliente.rtf");
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine()) != null){
                texto = texto + cadena;
            }
            b.close();
            HacerCopia();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error con el archivo copia-- "+e.toString());
        }
    }
    
    public void HacerCopia() {
        try {
            File archivo = new File("Contrato//CopiaCliente.rtf");
            BufferedWriter bw;
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(LlenarVariables());
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(LlenarVariables());
            }
            bw.close();
//            try {
//                File path = new File("Contrato\\copia " + contrato + ".rtf");
//                Desktop.getDesktop().open(path);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con el archivo hacer copia-- "+e.getMessage() );
        }
    }
    
    public void HacerContrato() {
        try {
            File archivo = new File("Contrato//OriginalCliente.rtf");
            BufferedWriter bw;
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(LlenarVariables());
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(LlenarVariables());
            }
            bw.close();
//            try {
//                File path = new File("Contrato\\" + contrato + ".rtf");
//                Desktop.getDesktop().open(path);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con el archivo hecer copia-- "+e.getMessage() );
        }
    }

    private String LlenarVariables(){
        //OTROS
        texto = texto.replace("(OA)", factura);
        texto = texto.replace("(OB)", saldo);
        texto = texto.replace("(OC)", fecha);
        texto = texto.replace("(OD)", fmeses);
        texto = texto.replace("(OE)", contrato+"");
        texto = texto.replace("(OF)", dia+"");    
        texto = texto.replace("(OG)", beneficiario); 
        texto = texto.replace("(OH)", porcentaje+"%");
        //COTIZACION
        texto = texto.replace("(ZA)", precio);
        texto = texto.replace("(ZB)", enganche);
        texto = texto.replace("(ZC)", plazo+"");
        texto = texto.replace("(ZCA)", plazo+"");
        texto = texto.replace("(ZD)", financiamiento);
        texto = texto.replace("(ZE)", intereses);
        texto = texto.replace("(ZF)", total);
        texto = texto.replace("(ZG)", seguro);
        texto = texto.replace("(ZH)", comision);
        texto = texto.replace("(ZI)", NumeroLetras(mensualidad));
        texto = texto.replace("(ZJ)", tasi+" %");
        texto = texto.replace("(ZK)", cat+" %");
        //VEHICULO  
        texto = texto.replace("(VA)", marca);         //Marca
        texto = texto.replace("(VB)", tipo);          //Tipo y version 
        texto = texto.replace("(VC)", transmision);   //Transmision
        texto = texto.replace("(VD)", color);         //Color
        texto = texto.replace("(VE)", serie);         //Numero de serie
        texto = texto.replace("(VF)", motor);         //Numero de motor
        texto = texto.replace("(VG)", ano+"");        //Ano
        texto = texto.replace("(VH)", distribuidor);  //Distribuidor
        texto = texto.replace("(VI)", uso);           //Uso
        //CLIENTE
        texto = texto.replace("(CA)", nombreC);   // Nombre
        texto = texto.replace("(CB)", nacionC);   //Nacionalidad
        texto = texto.replace("(CC)", oficioC);   //Trabajo
        texto = texto.replace("(CD)", telefonoTC);//Telefono laboral
        texto = texto.replace("(CE)", dirTC);     //Domicilio laboral
        texto = texto.replace("(CF)", RFCC);      //RFC
        texto = texto.replace("(CG)", dirC);      //Domicilio particular
        texto = texto.replace("(CH)", telefonoC); //Telefono particular
        texto = texto.replace("(CI)", edadC+"");
        texto = texto.replace("(CJ)", residenciaC+"");
        texto = texto.replace("(CK)", correoC);
        texto = texto.replace("(CL)", curpC);
        texto = texto.replace("(CM)", civilC);
        texto = texto.replace("(CN)", empresaC);
        texto = texto.replace("(CO)", puestoC);
        texto = texto.replace("(CP)", ingresoC);
        //AVAL
        texto = texto.replace("(AA)", nombreAval);// Nombre
        texto = texto.replace("(AB)", nacAval);   //Nacionalidad
        texto = texto.replace("(AC)", oficioAval);//Trabajo
        texto = texto.replace("(AD)", telLab);    //Telefono laboral
        texto = texto.replace("(AE)", domLab);    //Domicilio laboral
        texto = texto.replace("(AF)", rfcAval);   //RFC
        texto = texto.replace("(AG)", domPar);    //Domicilio particular
        texto = texto.replace("(AH)", telPar);    //Telefono particular
        texto = texto.replace("(AI)", edadA+"");
        texto = texto.replace("(AJ)", residenciaA+"");
        texto = texto.replace("(AK)", civilA);
        texto = texto.replace("(AL)", curpA);
        texto = texto.replace("(AM)", correoA);
        texto = texto.replace("(AN)", empresaA);
        texto = texto.replace("(AO)", ingresoA);
        texto = texto.replace("(AP)", puestoA);
        //Garantia
        texto = texto.replace("(GA)", ubicacion);
        texto = texto.replace("(GB)", denominacion);
        texto = texto.replace("(GC)", datos);
        texto = texto.replace("(GD)", folio);
        texto = texto.replace("(GE)", lugar);
        texto = texto.replace("(GF)", registro);
        //Fecha actual
        texto = texto.replace("(FA)", d+"");
        texto = texto.replace("(FB)", m);
        texto = texto.replace("(FC)", a+"");
        return texto;
    }

    public void setClienteContrato(String patC, String matC, String nomC, String nacC,
            String proC, String teltC, String caltC, String inttC, String exttC, String coltC,
            String muntC, int cptC, String esttC, String rfcC, String calC, String intC,
            String extC, String colC, String munC, int cpC, String estC, String telC,
            int edad, int residencia, String correo, String curp, String civil,
            String empresa, String puesto, String ingreso) {
        nombreC = FormatoString(patC+" "+matC+" "+nomC);
        nacionC = FormatoString(nacC);
        oficioC = SinTexto(FormatoString(proC));
        telefonoTC = SinTexto(teltC);
        dirTC = SinTexto(FormatoString(caltC+" INT. "+inttC+" EXT. "+exttC+", "+coltC+", "+muntC+", "+ "CP:"+cptC+", "+esttC));
        RFCC = FormatoString(rfcC);
        dirC = SinTexto(FormatoString(calC+" INT. "+intC+" EXT. "+extC+", "+colC+", "+munC+", "+ "CP:"+cpC+", "+estC));
        telefonoC = SinTexto(telC);    
        edadC = edad;
        residenciaC = residencia;
        correoC = correo;
        curpC = FormatoString(curp);
        civilC = FormatoString(civil);
        empresaC = FormatoString(empresa);
        puestoC = FormatoString(puesto);
        ingresoC = FormatoString(ingreso);
    }

    public void setVehiculoContrato(String marca, String tipo, String transmision,
            String color, String serie, String motor, int ano, String distribuidor,
            String uso) {
        this.marca = FormatoString(marca);
        this.tipo = FormatoString(tipo);
        this.transmision = FormatoString(transmision);
        this.color = FormatoString(color);
        this.serie = FormatoString(serie);
        this.motor = FormatoString(motor);
        this.ano = ano;
        this.distribuidor = FormatoString(distribuidor);
        this.uso = SinTexto(FormatoString(uso));
    }

    public void setCotizacionContrato(double precio, double enganche, int plazo, 
            double financiamiento, double intereses, double total, double seguro,
            double comision, String tasi, double cat) {   
        this.precio = NumeroLetras(precio);
        this.enganche = NumeroLetras(enganche);
        this.plazo = plazo;
        this.financiamiento = NumeroLetras(financiamiento);
        this.intereses = NumeroLetras(intereses);
        this.total = NumeroLetras(total);
        this.seguro = NumeroLetras(seguro);
        this.comision = NumeroLetras(comision);
        this.tasi = tasi;
        this.cat = cat;
    }

    public void setOtrosContrato(double factura, double saldo, String contrato, String fecha, String fmeses, int dia, String beneficiario) {
        this.factura = NumeroLetras(factura);
        this.saldo = NumeroLetras(saldo);
        this.contrato = contrato;
        this.fecha = fecha;
        this.fmeses = fmeses;
        this.dia = dia;
        this.beneficiario = FormatoString(beneficiario);
    }
    
    public String NumeroLetras(double a){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        Qulqi ql = new Qulqi();
        ql.setDecimalPartVisible(true);
        ql.setCoin(Qulqi$COIN.peso_mexicano);   
        ql.setFloating(Qulqi$FLOATING.POINT);
        String c = ql.showMeTheMoney(String.valueOf(a)).toUpperCase();
        int z = c.indexOf("/");
        String x = c.substring((z-3));
        c = c.substring(0, z-3)+" PESOS"+x;
        String b = nf.format(a)+" "+c;
        System.out.println(b);
        return b;
    }
    
    private String SinTexto(String a){
        if(a.isEmpty()){
            a = "_";
        }
        return a;
    }
    
    private String FormatoString(String a){
        a = a.toUpperCase();
        a = a.replace("Á", "A");
        a = a.replace("É", "E");
        a = a.replace("Í", "I");
        a = a.replace("Ó", "O");
        a = a.replace("Ú", "U");
        return a;
    }

    public void setAvalContrato(String nombreAval, String nacAval, 
            String oficioAval, String telLab, String domLab, 
            String rfcAval, String domPar, String telPar, 
            int edadAval, String civilAval, int residenciaAval, String curpAval, 
            String correoAval, String empresaAval, String ingresoAval, String puestoAval) {
        this.edadA = edadAval;
        this.civilA = FormatoString(civilAval);
        this.residenciaA = residenciaAval;
        this.curpA = FormatoString(curpAval);
        this.correoA = correoAval;
        this.empresaA = empresaAval;
        this.ingresoA = ingresoAval;
        this.puestoA = puestoAval;
        this.nombreAval = FormatoString(nombreAval);
        this.nacAval = FormatoString(nacAval);
        this.oficioAval = FormatoString(oficioAval);
        this.telLab = FormatoString(telLab);
        this.domLab = FormatoString(domLab);
        this.rfcAval = FormatoString(rfcAval);
        this.domPar = FormatoString(domPar);
        this.telPar = FormatoString(telPar);
    }

    public void setGarantia(String ubicacion, String denominacion, String datos, String folio, String lugar, String registro) {
        this.ubicacion = FormatoString(ubicacion);
        this.denominacion = FormatoString(denominacion);
        this.datos = FormatoString(datos);
        this.folio = FormatoString(folio);
        this.lugar = FormatoString(lugar);
        this.registro = FormatoString(registro);
    }
    
    public void GetFechaMeses(){ //25  días del mes de abril del año 2018.
        Calendar fecha = Calendar.getInstance();
        a = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        d = fecha.get(Calendar.DAY_OF_MONTH);
        switch(mes){
            case 1 : m = "enero" ; break;
            case 2 : m = "febrero" ; break;
            case 3 : m = "marzo" ; break;
            case 4 : m = "abril" ; break;
            case 5 : m = "mayo" ; break;
            case 6 : m = "junio" ; break;
            case 7 : m = "julio" ; break;
            case 8 : m = "agosto" ; break;
            case 9 : m = "septimbre" ; break;
            case 10 : m = "octubre" ; break;
            case 11 : m = "noviembre" ; break;
            case 12 : m = "diciembre" ; break;
            default: m = "error" ; break;
        }
    }
    
    public void ImpresionContrato(){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        java.io.File fichero = new java.io.File("Contrato//OriginalCliente.rtf");
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
    
    public void ImpresionCopia(){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        java.io.File fichero = new java.io.File("Contrato//CopiaCliente.rtf");
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

    public void setComisionPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
