package GUI;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class ConsultarCotizacion extends javax.swing.JDialog {
    
    private int ct = 0;
    private NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private String cuenta;
    private String password;
    private String nombreEmpleado;

    public ConsultarCotizacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFolio = new javax.swing.JTextField();
        textCliente = new javax.swing.JTextField();
        dateFecha = new datechooser.beans.DateChooserCombo();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar cotizaciones");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Cliente", "Auto", "Fecha", "Mensualidad", "Plazo", "Total a pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(20);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Folio:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        textFolio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textFolio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFolioFocusGained(evt);
            }
        });
        textFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFolioKeyTyped(evt);
            }
        });

        textCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textClienteFocusGained(evt);
            }
        });
        textCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textClienteKeyTyped(evt);
            }
        });

        dateFecha.setCalendarPreferredSize(new java.awt.Dimension(350, 180));
        dateFecha.setFormat(1);
        dateFecha.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        dateFecha.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        dateFecha.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateFechaOnSelectionChange(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminarSmall.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Regresar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SeleccionarCotizacion();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Consulta();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
       
    }//GEN-LAST:event_jButton3KeyPressed

    private void textFolioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFolioFocusGained
        textCliente.setText(null);
        dateFecha.setSelectedDate(null);
    }//GEN-LAST:event_textFolioFocusGained

    private void textClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textClienteFocusGained
        textFolio.setText(null);
        dateFecha.setSelectedDate(null);
    }//GEN-LAST:event_textClienteFocusGained

    private void dateFechaOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateFechaOnSelectionChange
        textCliente.setText(null);
        textFolio.setText(null);
    }//GEN-LAST:event_dateFechaOnSelectionChange

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        ElementoTabla(evt);
    }//GEN-LAST:event_tablaMousePressed

    private void textFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFolioKeyTyped
        EventoEnteroLimite(evt,textFolio,8);
    }//GEN-LAST:event_textFolioKeyTyped

    private void textClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClienteKeyTyped
        EventoTexto(evt, textCliente);
    }//GEN-LAST:event_textClienteKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EliminarCotizacion();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textFolio;
    // End of variables declaration//GEN-END:variables

    private void EliminarCotizacion(){
        Conexion con = new Conexion();
        SQLCotizacion sc = new SQLCotizacion();
        int fila = tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Selecciona una cotizacion de la tabla");
        } else {
            int folio = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            String sql = sc.ObtenerCotizacionContrato(folio);
            boolean flag = false;
            con.Conectar(cuenta, password);
            try{
                ResultSet res = con.Consulta(sql);
                if(res.next()){
                    flag = false;
                }
                else{
                    flag = true;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error al eliminar cotización\n-- "+e.getMessage(),"Eliminar cotización", JOptionPane.ERROR_MESSAGE);
            }
            con.Cerrar();
            if(flag){
                sql = sc.EliminarCotizacion(folio);
                con.Conectar(cuenta, password);
                con.Modificar(sql);
                con.Cerrar();
                JOptionPane.showMessageDialog(this, "Cotización eliminada", "Eliminar cotización", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "La cotización pertenece a un contrato.\nElimina el contrato para eliminar la cotización", "Eliminar cotización", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    private void SeleccionarCotizacion() {
        int fila = tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Selecciona una cotizacion de la tabla");
        } else {
            int folio = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            EditarCotizacion ec = new EditarCotizacion(this, true);
            ec.setUsuario(cuenta, password,folio);
            ec.setLocationRelativeTo(null);
            ec.GetFechaActual();
            ec.RecibirEmpleado(cuenta, nombreEmpleado);
            ec.setVisible(true);
        }
    }
    
    private void EventoTexto(KeyEvent evt, JTextField text){ //Key Typed
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c) && (c != evt.VK_SPACE)){
            getToolkit().beep();
            evt.consume();    
        }
    }
    
    private void EventoEnteroLimite(KeyEvent evt, JTextField text, int limite) { //Key Typed
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter) && (caracter != evt.VK_BACK_SPACE) && (caracter != evt.VK_ENTER) && (caracter != evt.VK_ESCAPE)){
            getToolkit().beep();
            evt.consume();
        } else if (text.getText().length() == limite) {
            getToolkit().beep();
            evt.consume();
        }
    }
    
    private void ElementoTabla(MouseEvent evt){ //Mouse Pressed
        if(evt.getClickCount()==2){
            SeleccionarCotizacion();
        }
    }
     
    public void Consulta(){
        SQLCotizacion sc = new SQLCotizacion();       
        String sql = "";
        if(textFolio.getText().isEmpty() && textCliente.getText().isEmpty() && dateFecha.getText().isEmpty()){
            sql = sc.ConsultarTodoCotizaciones();
        }
        else if(textCliente.getText().isEmpty() && dateFecha.getText().isEmpty()){
            int x = Integer.parseInt(textFolio.getText());
            sql = sc.ConsultarFolioCotizacion(x);
        } 
        else if(textFolio.getText().isEmpty() && dateFecha.getText().isEmpty()){
            String y = textCliente.getText();
            sql = sc.ConsultarClienteCotizacion(y);
        } 
        else if(textFolio.getText().isEmpty() && textCliente.getText().isEmpty()){
            sql = sc.ConsultarFechaCotizacion(getFecha());
        } 
        VaciarTabla();
        LlenarTabla(sql);
    }
    
     private String getFecha() {
        String fecha = "";
        int num;
        Calendar date = null;
        date = dateFecha.getSelectedDate();
        num = date.get(Calendar.YEAR);
        fecha = num + "-";
        num = date.get(Calendar.MONTH) + 1;
        if (num < 10) {
            fecha = fecha + "0" + num + "-";
        } else {
            fecha = fecha + "" + num + "-";
        }
        num = date.get(Calendar.DATE);
        if (num < 10) {
            fecha = fecha + "0" + num;
        } else {
            fecha = fecha + "" + num;
        }
        return fecha;
    }

    private void LlenarTabla(String sql){
        Conexion con = new Conexion();
        ResultSet res;
        String texto = "";
        double a , b;
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        Object nf[] = {null, null, null, null, null, null, null};
        try{
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            while(res.next()){
                ntm.addRow(nf);
                tabla.setValueAt(res.getString(1), ct, 0);
                texto = res.getString(2)+" "+res.getString(3)+" "+res.getString(4);
                tabla.setValueAt(texto, ct, 1);
                texto = res.getString(5)+" - "+res.getString(6)+" - "+res.getString(7);
                tabla.setValueAt(texto, ct, 2);
                tabla.setValueAt(res.getString(8), ct, 3);
                a = res.getDouble(9);
                b = res.getDouble(10);
                tabla.setValueAt(formato.format(a), ct, 4);
                tabla.setValueAt(""+b, ct, 5);
                a = a * b;
                tabla.setValueAt(formato.format(a), ct, 6);
                ct++;
            }
            con.Cerrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error02 -  "+e.getMessage());
        }
    }
    
    private void VaciarTabla(){
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        for(int b = (ct-1); b>=0; b--){
            ntm.removeRow(b);
        }
        ct = 0;
    }
    
    private void Regresar(){
        this.dispose();
    }
    
    private void LookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            updateComponentTreeUI(this);
            Image icon = new ImageIcon(getClass().getResource("/Images/icono.png")).getImage();
            setIconImage(icon);
            this.getContentPane().setBackground(Color.WHITE);
            dateFecha.setSelectedDate(null);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){}
    }
    
    void setUsuario(String cuenta, String password, String nombreEmpleado) {
        this.cuenta = cuenta;
        this.password = password;
        this.nombreEmpleado = nombreEmpleado;
    }
    
}
