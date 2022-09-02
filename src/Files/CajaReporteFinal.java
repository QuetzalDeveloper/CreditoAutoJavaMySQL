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

public class CajaReporteFinal {

    private double total;
    private double gastos;
    private double tarjeta;
    private double efectivo;
    
    public void setDatos(double total, double gastos, double tarjeta, double efectivo){
        this.total = total;
        this.efectivo = efectivo;
        this.gastos = gastos;
        this.tarjeta = tarjeta;
    }
  
    public void CrearReporte(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        try{
            Document doc = new Document(PageSize.LETTER, 2, 2, 20, 20);
            PdfWriter.getInstance(doc, new FileOutputStream("Facturas//Caja.pdf"));
            doc.open();
            Font fuente = new Font();
            fuente.setStyle(Font.BOLD);
            fuente.setSize(10);
            Paragraph t1 = new Paragraph("REPORTE FINAL\n");
            t1.getFont().setSize(14);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1);
            t1 = new Paragraph("   ");
            t1.getFont().setSize(5);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1); 
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            //----- Tabla
            PdfPTable cabecera = new PdfPTable(2); 
            cabecera.setWidths(new float[]{3,1});
            cabecera.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            t1 = new Paragraph(" ");
            t1.getFont().setSize(7);
            cabecera.addCell(t1);
            t1 = new Paragraph("IMPRESIÓN: \n"+getFechaActual());
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            cabecera.addCell(t1);
            
            t1 = new Paragraph("TOTAL DE INGRESOS:");
            t1.getFont().setSize(12);
            cabecera.addCell(t1);
            t1 = new Paragraph(nf.format(total));
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            t1.setAlignment(Element.ALIGN_LEFT);
            cabecera.addCell(t1);
            
            t1 = new Paragraph("-- GASTOS:");
            t1.getFont().setSize(12);
            cabecera.addCell(t1);
            t1 = new Paragraph(nf.format(gastos));
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            t1.setAlignment(Element.ALIGN_LEFT);
            cabecera.addCell(t1);
            
            t1 = new Paragraph("-- TARJETA:");
            t1.getFont().setSize(12);
            cabecera.addCell(t1);
            t1 = new Paragraph(nf.format(tarjeta));
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            t1.setAlignment(Element.ALIGN_LEFT);
            cabecera.addCell(t1);
            
            t1 = new Paragraph("TOTAL EN CAJA:");
            t1.getFont().setSize(12);
            cabecera.addCell(t1);
            t1 = new Paragraph(nf.format(efectivo));
            t1.getFont().setSize(9);
            t1.getFont().setStyle(Font.BOLD);
            t1.setAlignment(Element.ALIGN_LEFT);
            cabecera.addCell(t1);
            doc.add(cabecera);
            
            t1 = new Paragraph("   ");
            t1.getFont().setSize(5);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1); 
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            doc.add(t1);
            
            t1 = new Paragraph("________________________________");
            t1.getFont().setSize(10);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1);
            t1 = new Paragraph("RECIBI EFECTIVO");
            t1.getFont().setSize(12);
            t1.setAlignment(Element.ALIGN_CENTER);
            doc.add(t1);
            
            doc.close();
            Impresion();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al generar reporte\n--"+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
