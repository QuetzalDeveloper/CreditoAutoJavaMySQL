package Files;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CAT {
    
    public CAT(double v, int plazo, double mensualidad){
        HSSFCell celda;
        HSSFRow fila = null;
        try {
            System.out.println("Excel 1");
            HSSFWorkbook doc = new HSSFWorkbook();
            HSSFSheet hoja = doc.createSheet();
            fila = hoja.createRow(0);
            celda = fila.createCell(0);
            celda.setCellValue(v);
            System.out.println("Excel 2");
            for (int r = 1; r <= plazo; r++) {
                fila = hoja.createRow(r);
                celda = fila.createCell(0);
                celda.setCellValue(mensualidad);
                if (r == 3) {
                    celda = fila.createCell(4);
                    celda.setCellValue("TIR");
                    celda = fila.createCell(5);
                    celda.setCellValue("=TIR(A1:A"+(plazo+1)+")");
                }
                if (r == 4) {
                    celda = fila.createCell(4);
                    celda.setCellValue("CAT");
                    celda = fila.createCell(5);
                    celda.setCellValue("=((1+F4)^12)-1");
                }
            }

            System.out.println("3");
            String fichero = "Cotizaciones//CAT.xls";
            File file = new File(fichero);
            FileOutputStream salida = new FileOutputStream(file);
            System.out.println("Excel 8");
            doc.write(salida);
            salida.flush();
            salida.close();
        } catch (Exception ex) {
            System.out.println("Error Excel-- "+ex.getMessage());
        }
    }

    public void AbrirArchivo() {
        try {
            File path = new File("Cotizaciones//CAT.xls");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
