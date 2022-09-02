package GUI;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class TablaPagos extends DefaultTableCellRenderer implements TableCellRenderer{

    private int plazo;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        setBackground(null);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        int valor = (Integer) table.getValueAt(row, 7);
        if ( valor > plazo) {
            setBackground(Color.PINK);
        } 
        else{}
        
        return this;
    }
    
    public void setPlazo(int plazo){
        this.plazo = plazo;
    }

}
