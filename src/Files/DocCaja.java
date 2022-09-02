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

public class DocCaja {

    private double total, efectivo, tarjeta;
    private String inicio, fin;
    private String[][] datos;
    private double ingreso;
    private double gasto;
    private int bandera; // 1 = gastos, 2 = tarjeta
    private double iE;
    
    public void setDatos(double total, double efectivo, double tarjeta, String inicio, String fin, String[][] datos,double gasto,double ingresa, int bandera, double iE){
        this.total = total;
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        this.inicio = inicio;
        this.fin = fin;
        this.datos = datos;
        this.ingreso = ingresa;
        this.gasto = gasto;
        this.bandera = bandera;
        this.iE = iE;
    }
    
    public void CrearCaja(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        try{
            Document doc = new Document(PageSize.LETTER, 2, 2, 20, 20);
            PdfWriter.getInstance(doc, new FileOutputStream("Facturas//Caja.pdf"));
            doc.open();
            Font fuente = new Font();
            fuente.setStyle(Font.BOLD);
            fuente.setSize(10);
            Paragraph t1 = new Paragraph("REPORTE DE CAJA\n");
            t1.getFont().setSize(10);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1);
            t1 = new Paragraph("   ");
            t1.getFont().setSize(5);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1);     
//-------------------------------------------------------------------------------
            PdfPTable cabecera = new PdfPTable(2); 
            cabecera.setWidths(new float[]{5,1});
            cabecera.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            t1 = new Paragraph("TEXCOPLAN AUTO S.A. DE C.V. \nCALLE PRIMERA ESCUELA LOTE 14, COL. SAN MATEO, TEXCOCO, MÉXICO\nTEL. 015959546676, HORARIO LUNES A VIERNES DE 10:00 A 18:00 HRS Y SÁBADOS DE 10:00 A 14:00 HORAS");
            t1.getFont().setSize(7);
            cabecera.addCell(t1);
            t1 = new Paragraph("IMPRESIÓN: \n"+getFechaActual());
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            cabecera.addCell(t1);
            doc.add(cabecera);
//-------------------------------------------------------------------------------
            PdfPTable datos = new PdfPTable(4);
            datos.setWidths(new float[]{1, 1, 1, 1});
            if(bandera == 1) {
                t1 = new Paragraph("GASTOS:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(gasto));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                doc.add(datos);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
            }
            if(bandera == 2) {
                t1 = new Paragraph("TOTAL DE TARJETA:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(tarjeta));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                doc.add(datos);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
            }
            if(bandera == 3) {
                t1 = new Paragraph("TOTAL DE INGRESOS:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(ingreso));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                doc.add(datos);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph("EFECTIVO:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(iE));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                t1 = new Paragraph("TARJETA:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(tarjeta));
                t1.getFont().setSize(9);
                datos.addCell(t1);
            }

            else{
             t1 = new Paragraph("TOTAL:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(total));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                doc.add(datos);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(" ");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph("INGRESOS:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(ingreso));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                doc.add(datos);
                t1 = new Paragraph("GASTOS:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(gasto));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                //Fila 2
                t1 = new Paragraph("EFECTIVO:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(efectivo));
                t1.getFont().setSize(9);
                datos.addCell(t1);
                t1 = new Paragraph("TARJETA:");
                t1.getFont().setSize(9);
                t1.getFont().setStyle(Font.BOLD);
                datos.addCell(t1);
                t1 = new Paragraph(nf.format(tarjeta));
                t1.getFont().setSize(9);
                datos.addCell(t1);
            }
            //fila 3
            t1 = new Paragraph("INCIO:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);
            t1 = new Paragraph(inicio);
            t1.getFont().setSize(9);
            datos.addCell(t1);
            t1 = new Paragraph("FINAL:");
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            datos.addCell(t1);
            t1 = new Paragraph(fin);
            t1.getFont().setSize(9);
            datos.addCell(t1);
            doc.add(datos);
       //------------------------------------------------------------------------
            PdfPTable pagos = new PdfPTable(6);
            pagos.setWidths(new float[]{1, 1, 1, 1, 1, 1});
            pagos.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            t1 = new Paragraph("FECHA");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("CATEGORIA");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("CONCEPTO");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("RECIBO");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("CANTIDAD");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            t1 = new Paragraph("ORIGEN");
            t1.getFont().setSize(7);
            t1.getFont().setStyle(Font.BOLD);
            pagos.addCell(t1);
            for (int i = 0; i < this.datos.length; i++) {
                t1 = new Paragraph(this.datos[i][1]);
                t1.getFont().setSize(8);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][2]);
                t1.getFont().setSize(8);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][3]);
                t1.getFont().setSize(8);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][4]);
                t1.getFont().setSize(8);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][5]);
                t1.getFont().setSize(8);
                pagos.addCell(t1);
                t1 = new Paragraph(this.datos[i][6]);
                t1.getFont().setSize(8);
                pagos.addCell(t1);
            }
            doc.add(pagos);
            doc.close();
            Impresion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en crear reporte\n-- "+e.getMessage(), "Reporte", JOptionPane.ERROR_MESSAGE);
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

    private void Impresion() {
        try {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            java.io.File fichero = new java.io.File("Facturas//Caja.pdf");
            if (desktop.isSupported(Desktop.Action.PRINT)) {

                desktop.print(fichero);

            } else {
                System.out.print("El sistema no permite imprimir usando la clase Desktop");
            }
        } catch (Exception e) {
            System.out.print("El sistema no permite imprimir usando la clase Desktop");
            e.printStackTrace();
        }
    }

}
