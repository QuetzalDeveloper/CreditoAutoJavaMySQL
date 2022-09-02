package Files;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import DataBase.SQLPagos;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class AnexoA {
    
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private double mensualidad, tasi, financiamiento;
    private int ivaVariable=0, plazo;
    private String cuenta, password, contrato;
    
    public void GuardarCuenta() {
        boolean flag = false;
        SQLPagos sp = new SQLPagos();
        Conexion con = new Conexion();
        String sql = sp.VerificarCuenta(contrato);
        try {
            con.Conectar(cuenta, password);
            ResultSet res = con.Consulta(sql);
            if (res.next()) {
                flag = true;
            }
            con.Cerrar();
            if (!flag) {
                sql = sp.CearCuenta(contrato, (mensualidad * plazo), mensualidad, plazo, GetFechaMeses(1), GetFechaMeses(plazo + 1));
                con.Conectar(cuenta, password);
                con.Modificar(sql);
                con.Cerrar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar cuenta", "Anexo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
     
    public void ImpresionAnexo(){
        int i = 0;
        while (i < 2) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            java.io.File fichero = new java.io.File("Contrato//AnexoA.pdf");
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
            i++;
        }
    }
    
    public void Documento(String contrato, int cotizacion) {
        Conexion con = new Conexion();
        SQLCotizacion ac = new SQLCotizacion();
        ResultSet res;
        String sql, cnombre = "";
        double cprecio = 0, cfinanciamiento = 0, cenganche = 0, cmensualidad = 0, ctasa = 0, cinteres=0;
        int cplazo = 0;
        try{
            this.contrato = contrato;
            Document doc = new Document(PageSize.LETTER,2,2,15,15);
            Font grande = new Font(Font.FontFamily.TIMES_ROMAN,9,Font.BOLD);
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN,8,Font.BOLD);
            Font normal = new Font(Font.FontFamily.TIMES_ROMAN,8);
            PdfWriter.getInstance(doc, new FileOutputStream("Contrato//AnexoA.pdf"));
            doc.open();
            
            
            
            PdfPTable tinfo = new PdfPTable(4);
            tinfo.setWidths(new float[]{2,2,2,4});
            tinfo.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            tinfo.getDefaultCell().setBorderColor(BaseColor.WHITE);
           
            
            try{
                con.Conectar(cuenta, password);
                res = con.Consulta(ac.CabeceraAnexo(this.contrato));
                if (res.next()) {
                    cprecio = res.getDouble(1);
                    cfinanciamiento = res.getDouble(2);
                    cenganche = res.getDouble(3);
                    cmensualidad = res.getDouble(4);
                    cplazo = res.getInt(5);
                    cnombre = res.getString(6) + " " + res.getString(7) + " " + res.getString(8);
                    ctasa = res.getDouble(9);
                    cinteres = res.getDouble(11);
                }
                con.Cerrar();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Cabecera // "+e.getMessage(), "Anexo", JOptionPane.ERROR_MESSAGE);
            }
            
            Paragraph cabe = new Paragraph();
            Chunk c1;

            cabe = new Paragraph();
            c1 = new Chunk("PRECIO AUTO", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(nf.format(cprecio), normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("CLIENTE", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(cnombre, normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("A FINANCIAR", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(nf.format(cprecio), normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("CONTRATO", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(contrato, normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("ENGANCHE", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(nf.format(cenganche), normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("IGUAL A", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(nf.format(cfinanciamiento), normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("MENSUALIDAD", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(nf.format(cmensualidad), normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("PLAZO", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(cplazo+"", normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk("TASA ANUAL", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(ctasa + "%", normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", negrita);
            cabe.add(c1);
            tinfo.addCell(cabe);
            
            cabe = new Paragraph();
            c1 = new Chunk(" ", normal);
            cabe.add(c1);
            tinfo.addCell(cabe);
            doc.add(tinfo);
            
            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidths(new float[]{2,2,2,2,2,3});
            tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            Paragraph texto = new Paragraph();
            Chunk t1;
            PdfPCell celda;
            
            t1 = new Chunk("ANEXO A",grande);          
            texto.add(t1);
            celda = new PdfPCell(texto);            
            celda.setColspan(6);
            celda.setRowspan(1);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            celda.setVerticalAlignment(Element.ALIGN_CENTER);
            celda.setUseAscender(true);
            tabla.addCell(celda);
            
            texto = new Paragraph();
            t1 = new Chunk("NO. DE PAGOS",negrita);
            texto.add(t1);
            tabla.addCell(texto);
            
            texto = new Paragraph();
            t1 = new Chunk("PAGO MENSUAL",negrita);
            texto.add(t1);
            tabla.addCell(texto);
            
            texto = new Paragraph();
            t1 = new Chunk("CAPITAL",negrita);
            texto.add(t1);
            tabla.addCell(texto);
            
            texto = new Paragraph();
            t1 = new Chunk("INTERESES",negrita);
            texto.add(t1);
            tabla.addCell(texto);
            
            texto = new Paragraph();
            t1 = new Chunk("IVA",negrita);
            texto.add(t1);
            tabla.addCell(texto);
            
            texto = new Paragraph();
            t1 = new Chunk("SALDO INSOLUTO", negrita);
            texto.add(t1);
            tabla.addCell(texto);

            try{
                sql = ac.ConsultarCotizacion(cotizacion);
                con.Conectar(cuenta, password);
                res = con.Consulta(sql);
                if(res.next()){
                    financiamiento = res.getDouble(5);
                    mensualidad =res.getDouble(6);
                    tasi = res.getDouble(10);
                    plazo = res.getInt(7);
                    
                }
                con.Cerrar();              
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "AnexoA -- "+e.getMessage());
            }
            
            try{
                sql = ac.ObtenerVariablesCotizacion();
                con.Conectar(cuenta, password);
                res = con.Consulta(sql);
                if(res.next()){
                    ivaVariable = res.getInt(2);          
                }
                con.Cerrar();              
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "AnexoA -- "+e.getMessage());
            }
                               
            System.out.println("tasi = " + tasi);
            System.out.println("iva = " + ivaVariable);
            double tmsi = ivaVariable/ 100;
            System.out.println("tmsi = "+tmsi);
            tmsi = tasi * (tmsi + 1);           
            tmsi = tmsi / 12;          
            double intereses = financiamiento * (tmsi / 100);
            double sumIntereses = intereses;
            double ivat = intereses * 0.16;
            double sumaivat = ivat;
            double capital = mensualidad - intereses - ivat;
            double sumacapital = capital;
            double insoluto = financiamiento - capital;
            double sumaMensualidad = mensualidad;
            
            texto = new Paragraph();
            t1 = new Chunk("1. "+GetFechaMeses(1),normal);
            texto.add(t1);
            tabla.addCell(texto);
            
            texto = new Paragraph();
            t1 = new Chunk(nf.format(mensualidad),normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(capital), normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(intereses), normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(ivat), normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(insoluto), normal);
            texto.add(t1);
            tabla.addCell(texto);

            for (int i = 2; i <= plazo; i++) {
                intereses = insoluto * (tmsi/100);
                sumIntereses = sumIntereses + intereses;
                ivat = intereses * 0.16;
                sumaivat = sumaivat + ivat;
                capital = mensualidad - intereses - ivat;
                sumacapital = sumacapital + capital;
                insoluto = insoluto - capital;
                sumaMensualidad = sumaMensualidad + mensualidad;
                
                texto = new Paragraph();
                t1 = new Chunk(i+". "+GetFechaMeses(i), normal);
                texto.add(t1);
                tabla.addCell(texto);

                texto = new Paragraph();
                t1 = new Chunk(nf.format(mensualidad), normal);
                texto.add(t1);
                tabla.addCell(texto);

                texto = new Paragraph();
                t1 = new Chunk(nf.format(capital), normal);
                texto.add(t1);
                tabla.addCell(texto);

                texto = new Paragraph();
                t1 = new Chunk(nf.format(intereses), normal);
                texto.add(t1);
                tabla.addCell(texto);

                texto = new Paragraph();
                t1 = new Chunk(nf.format(ivat), normal);
                texto.add(t1);
                tabla.addCell(texto);

                texto = new Paragraph();
                t1 = new Chunk(nf.format(insoluto), normal);
                texto.add(t1);
                tabla.addCell(texto);
            }
            //--------------- Inicio de separador-------------
            texto = new Paragraph();
            t1 = new Chunk(" ", normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(" ", normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(" ", normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(" ", normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(" ", normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(" ", normal);
            texto.add(t1);
            tabla.addCell(texto);
            //-----------------Fin de separador-------------------------
            texto = new Paragraph();
            t1 = new Chunk( "TOTALES", normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(sumaMensualidad), normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(sumacapital), normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(sumIntereses), normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(nf.format(sumaivat), normal);
            texto.add(t1);
            tabla.addCell(texto);

            texto = new Paragraph();
            t1 = new Chunk(" ", normal);
            texto.add(t1);
            tabla.addCell(texto);

            doc.add(tabla);
            doc.close();
            
//            try {
//                File path = new File("Contrato//AnexoA "+contrato+".pdf");
//                Desktop.getDesktop().open(path);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }
    
    public String GetFechaMeses(int i){
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.MONTH, i);
        String fe, m, d;
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        int diadepago = fecha.get(Calendar.DAY_OF_MONTH);
        if(mes <10){
            m = "0"+mes;
        }
        else{
            m = ""+mes;
        }
        if(diadepago <10){
            d = "0"+diadepago;
        }
        else{
            d = ""+diadepago;
        }
        fe = ano+"-"+m+"-"+d;
        return fe;
    }
    
    public void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }

}
