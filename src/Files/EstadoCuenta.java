package Files;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class EstadoCuenta {

    private String contrato,nombre;
    private String[][] datos;
    private double total, mensualidad;
    private double monto;

    public void setDatos(String contrato, String nombre, String[][] datos, double total, double mensualidad, double monto) {
        this.contrato = contrato;
        this.nombre = nombre;
        this.datos = datos;
        this.total = total;
        this.mensualidad = mensualidad;
        this.monto = monto;
    }
    
    public void CrearEstado(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        try{
            Document doc = new Document(PageSize.LETTER, 2,2,20,20);
            PdfWriter.getInstance(doc, new FileOutputStream("Contrato//Estado.pdf"));
            doc.open();
            Font fuente = new Font();
            fuente.setStyle(Font.BOLD);
            fuente.setSize(10);
            Paragraph t1 = new Paragraph("ESTADO DE CUENTA\n");
            t1.getFont().setSize(10);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1);
            t1 = new Paragraph("   ");
            t1.getFont().setSize(5);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1);
            //-----------------------------------------Cabecera
            PdfPTable cabecera = new PdfPTable(2); 
            cabecera.setWidths(new float[]{5,1});
            cabecera.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            t1 = new Paragraph("TEXCOPLAN AUTO S.A. DE C.V. \nCALLE PRIMERA ESCUELA LOTE 14, COL. SAN MATEO, TEXCOCO, MÉXICO\nTEL. 015959546676, HORARIO LUNES A VIERNES DE 10:00 A 18:00 HRS Y SÁBADOS DE 10:00 A 14:00 HORAS");
            t1.getFont().setSize(7);
            cabecera.addCell(t1);
            t1 = new Paragraph("CONTRATO: \n"+contrato);
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            cabecera.addCell(t1);
            doc.add(cabecera);
            //-------------------------------------------Datos
            PdfPTable datos = new PdfPTable(4); 
            datos.setWidths(new float[]{2,4,2,4});
            //Fila 1
            t1 =new Paragraph("CLIENTE:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);
            t1 =new Paragraph(nombre);
            t1.getFont().setSize(9);
            datos.addCell(t1);
            doc.add(datos);
            t1 =new Paragraph("FECHA:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);
            t1 =new Paragraph(getFechaActual());
            t1.getFont().setSize(9);
            datos.addCell(t1);
            //Fila 2
            t1 =new Paragraph("PAGARE:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);
            t1 =new Paragraph(nf.format(monto));
            t1.getFont().setSize(9);
            datos.addCell(t1);
            t1 =new Paragraph("MENSUALIDAD:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);
            t1 =new Paragraph(nf.format(mensualidad));
            t1.getFont().setSize(9);
            datos.addCell(t1);
            //fila 3
            t1 =new Paragraph("PAGADO:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);            
            t1 =new Paragraph(nf.format((monto-total)));
            t1.getFont().setSize(9);
            datos.addCell(t1);
            t1 =new Paragraph("A PAGAR:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);
            t1 =new Paragraph(nf.format(total));
            t1.getFont().setSize(9);
            datos.addCell(t1);
            doc.add(datos);
            //----------------------------------Informativo
            PdfPTable info = new PdfPTable(1); 
            info.setWidths(new float[]{1});
            info.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            t1 =new Paragraph("ESTADO DE CUENTA DE CARACTER INFORMATIVO");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            info.addCell(t1);
            doc.add(info);
            //----------------------------------Pagos
            PdfPTable pagos = new PdfPTable(6);
            pagos.setWidths(new float[]{2, 2, 2, 2, 2, 1});
            pagos.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            t1 = new Paragraph("FECHA");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("ABONO");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("GUIA");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("A PAGAR");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("ADEUDO");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("PLAZO");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            for (int i = 0; i < this.datos.length; i++) {
                t1 = new Paragraph(this.datos[i][1]);
                t1.getFont().setSize(7);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][2]);
                t1.getFont().setSize(7);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][3]);
                t1.getFont().setSize(7);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][4]);
                t1.getFont().setSize(7);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][5]);
                t1.getFont().setSize(7);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][6]);
                t1.getFont().setSize(7);
                pagos.addCell(t1);
            }
            doc.add(pagos);
            doc.close();
            Impresion();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al generar estado de cuenta\n-- "+e.getMessage());
        }
    }
    
     private void Impresion() {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        java.io.File fichero = new java.io.File("Contrato//Estado.pdf");
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
    
    public String getFechaActual(){
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

}
