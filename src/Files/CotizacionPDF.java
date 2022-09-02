package Files;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.text.NumberFormat;
import java.util.Locale;

public class CotizacionPDF {
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private double pA;
    private double eA;
    private double financiamieto;
    private double mensualidad;
    private double comision;
    private int mA;
    private int folio;
    private double sva;
    private double tasi;
    private String nomC;
    private String marA;
    private String nomA;
    private String fecha;
    private String telC;
    private String nomE;
    private double[][] t;
    private double sumIntereses;
    private double sumIvat;
    private double sumMensualidad;
    private double sumCapital;
    
    private void Impresion() {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        java.io.File fichero = new java.io.File("Cotizaciones//" + folio + 
                ".pdf");
        if (desktop.isSupported(Desktop.Action.PRINT)) {
            try {
                desktop.print(fichero);
            } catch (Exception e) {
                System.out.print("El sistema no permite imprimir usando "
                        + "la clase Desktop");
                e.printStackTrace();
            }
        } else {
            System.out.print("El sistema no permite imprimir usando la "
                    + "clase Desktop");
        }
    }
    
    public void Cotizacion(int folio){
        this.folio = folio;
        try {            
            Document doc = new Document(PageSize.LETTER,2,2,20,20);
            PdfWriter.getInstance(doc, new FileOutputStream("Cotizaciones//"+folio+".pdf"));
            doc.open();
            Font fuente = new Font();
            fuente.setStyle(Font.BOLD);
            fuente.setSize(10);
            Paragraph t1 = new Paragraph("TEXCOPLAN AUTO S.A. DE C.V. \nCALLE PRIMERA ESCUELA LOTE 14, COL. SAN MATEO, TEXCOCO, MÉXICO\nTEL. 015959546676, HORARIO LUNES A VIERNES DE 10:00 A 18:00 HRS Y SÁBADOS DE 10:00 A 14:00 HORAS");
            t1.getFont().setSize(7);
            
            //Cabecera
            PdfPTable cabecera = new PdfPTable(2); 
            cabecera.setWidths(new float[]{5,1});
            cabecera.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            cabecera.addCell(t1);
            t1 = new Paragraph("FOLIO: \n"+folio);
            t1.getFont().setSize(7);
            cabecera.addCell(t1);
            //Datos
            PdfPTable datos = new PdfPTable(4);
            datos.setWidths(new float[]{1,1,1,3});
            Paragraph t2 = new Paragraph();
            t2 = new Paragraph("PRECIO AUTO");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nf.format(pA));
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("CLIENTE:");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(""+nomC);
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("MENOS ENGANCHE");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nf.format(eA));
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("MARCA AUTO:");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(marA);
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("TOTAL A FINANCIAR");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nf.format(financiamieto));
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("TIPO:");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nomA);
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("MENSUALIDADES");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nf.format(mensualidad));
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("FECHA:");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(fecha);
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("PLAZO");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(""+mA);
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("TELÉFONO:");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(telC);
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("COMISIÓN");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nf.format(comision));
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("ATENDIDO POR:");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nomE);
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("SEGURO DE VIDA ANUAL");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(nf.format(sva));
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("SEG. AUTO:");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("A COTIZAR");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph("TASA ORDINARIA\nANUAL FIJA");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            t2 = new Paragraph(tasi+"%");
            t2.getFont().setSize(7);
            datos.addCell(t2);
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN,6,Font.BOLD);
            Font normal = new Font(Font.FontFamily.TIMES_ROMAN,6);
            Chunk p1 = new Chunk("COTIZACIÓN DE CARACTER INFORMATIVO, PRECIOS SUJETOS A CAMBIO SIN PREVIO AVISO,CONSULTE TÉRMINOS Y CONDICIONES PARA OTORGAMIENTO DE FINANCIAMIENTO.", normal);            
            //Chunk p2 = new Chunk("VIGENCIA DE 15 DIAS.",negrita);
            t2 = new Paragraph();
            t2.add(p1);
            //t2.add(p2);
            PdfPCell  celda = new PdfPCell(t2);
            celda.setColspan(2);
            celda.setVerticalAlignment(Element.ALIGN_CENTER);
            celda.setUseAscender(true);
            datos.addCell(celda);
            //Tabla
            PdfPTable tabla = new PdfPTable(6);
            tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            tabla.setWidths(new float[]{1,1,1,1,1,2});
            t2 = new Paragraph("# PAGO");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph("MENSUALIDAD");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph("CAPITAL");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph("INTERESES");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph("IVA");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph("SALDO INSOLUTO");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            for (int i = 0; i < mA; i++) {
                int j = i + 1;
                t2 = new Paragraph(j+"");
                t2.getFont().setSize(6);
                tabla.addCell(t2);
                t2 = new Paragraph(nf.format(t[i][1]));
                t2.getFont().setSize(6);
                tabla.addCell(t2);
                t2 = new Paragraph(nf.format(t[i][2]));
                t2.getFont().setSize(6);
                tabla.addCell(t2);
                t2 = new Paragraph(nf.format(t[i][3]));
                t2.getFont().setSize(6);
                tabla.addCell(t2);
                t2 = new Paragraph(nf.format(t[i][4]));
                t2.getFont().setSize(6);
                tabla.addCell(t2);
                t2 = new Paragraph(nf.format(t[i][5]));
                t2.getFont().setSize(6);
                tabla.addCell(t2);
            }

            t2 = new Paragraph("Totales");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph(nf.format(sumMensualidad));
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph(nf.format(sumCapital));
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph(nf.format(sumIntereses));
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph(nf.format(sumIvat));
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            t2 = new Paragraph("");
            t2.getFont().setSize(6);
            tabla.addCell(t2);
            
            doc.add(cabecera);
            doc.add(datos);
            doc.add(tabla);
            doc.close();
            try {
                File path = new File("Cotizaciones\\"+folio+".pdf");
                Desktop.getDesktop().open(path);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            Impresion();
        }catch(Exception e){
            System.out.println("Exception = "+e.getMessage());
        }
    }

    public void setDatos(double pA, double eA, double financiamiento, double mensualidad, int mA, double comision, double sva, double tasi, String nomC, 
        String marA, String nomA, String GetFechaActual, String telC, String nomE) {
        this.pA =pA;
        this.eA = eA;
        this.financiamieto = financiamiento;
        this.mensualidad = mensualidad;
        this.mA = mA;
        this.comision = comision;
        this.sva = sva;
        this.tasi = tasi;
        this.nomC = nomC;
        this.marA = marA;
        this.nomA = nomA;
        this.fecha = GetFechaActual;
        this.telC = telC;
        this.nomE = nomE;
    }

    public void setTabla(double[][] t, double sumIntereses, double sumIvat, double sumCapital, double sumMensualidad) {
        this.t = t;
        this.sumIntereses = sumIntereses;
        this.sumIvat = sumIvat;
        this.sumCapital = sumCapital;
        this.sumMensualidad = sumMensualidad;
    }
    
}
