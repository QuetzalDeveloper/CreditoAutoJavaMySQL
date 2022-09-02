package GUI;

import DataBase.Conexion;
import DataBase.SQLContrato;
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

public class ConsultarContrato extends javax.swing.JDialog {

    private NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private String usuario;
    private String password;
    private int ct = 0;

    public ConsultarContrato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFolio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateFecha = new datechooser.beans.DateChooserCombo();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Folio:");

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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cliente: ");

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

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        dateFecha.setFormat(1);
        dateFecha.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 14));
        dateFecha.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateFechaOnSelectionChange(evt);
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

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Cliente", "Auto", "Fecha", "Total", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(30);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        jButton2.setText("Seleccionar");
        jButton2.setPreferredSize(new java.awt.Dimension(113, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Consulta();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        
    }//GEN-LAST:event_jButton3KeyPressed

    private void textFolioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFolioFocusGained
        textCliente.setText(null);
        dateFecha.setSelectedDate(null);
    }//GEN-LAST:event_textFolioFocusGained

    private void textFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFolioKeyTyped
        //EventoEnteroLimite(evt,textFolio,8);
    }//GEN-LAST:event_textFolioKeyTyped

    private void textClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textClienteFocusGained
        textFolio.setText(null);
        dateFecha.setSelectedDate(null);
    }//GEN-LAST:event_textClienteFocusGained

    private void textClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClienteKeyTyped
        EventoTexto(evt,textCliente);
    }//GEN-LAST:event_textClienteKeyTyped

    private void dateFechaOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateFechaOnSelectionChange
        textCliente.setText(null);
        textFolio.setText(null);
    }//GEN-LAST:event_dateFechaOnSelectionChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SeleccionarContrato();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        ElementoTabla(evt);
    }//GEN-LAST:event_tablaMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Regresar();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textFolio;
    // End of variables declaration//GEN-END:variables

    private void Regresar(){
        this.dispose();
    }
    
    public void setUusario(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
        dateFecha.setText(null);
    }
    
    private void LookAndFeel() {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            updateComponentTreeUI(this);
            Image icon = new ImageIcon(getClass().getResource("/Images/icono.png")).getImage();
            setIconImage(icon);
            this.getContentPane().setBackground(Color.WHITE);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){}
    }
    
    private void SeleccionarContrato(){
        EditarContrato ec = new EditarContrato(this,true);
        int fila = tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Selecciona un contrato de la tabla");
        }
        else{
            String folio = tabla.getValueAt(fila, 0).toString();
            ec.setUsuario(usuario, password);
            ec.setContrato(folio);
            ec.setLocationRelativeTo(null);
            ec.setVisible(true);
        }       
    }
    
    private void ElementoTabla(MouseEvent evt){ //Mouse Pressed
        if(evt.getClickCount()==2){
            SeleccionarContrato();
        }
    }
    
    private void EventoTexto(KeyEvent evt, JTextField text){ //Key Typed
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c) && (c != evt.VK_SPACE)){
            getToolkit().beep();
            evt.consume();    
        }
    }
    
    public void TodoConsulta(){
        SQLContrato sc = new SQLContrato();       
        String sql = sc.ConsultarTodoContrato();
        VaciarTabla();
        LlenarDatos(sql);
    }
    
    public void Consulta(){
        SQLContrato sc = new SQLContrato();       
        String sql = "";
        if(textFolio.getText().isEmpty() && textCliente.getText().isEmpty() && dateFecha.getText().isEmpty()){
            sql = sc.ConsultarTodoContrato();
        }
        else if(textCliente.getText().isEmpty() && dateFecha.getText().isEmpty()){
            String x = textFolio.getText();
            sql = sc.ConsultarFolioContrato(x);
        } 
        else if(textFolio.getText().isEmpty() && dateFecha.getText().isEmpty()){
            String y = textCliente.getText();
            sql = sc.ConsultarClienteContrato(y);
        } 
        else if(textFolio.getText().isEmpty() && textCliente.getText().isEmpty()){
            sql = sc.ConsultarFechaContrato(getFecha());
        } 
        else{
            sql = sc.ConsultarTodoContrato();
        }
        VaciarTabla();
        LlenarDatos(sql);
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
    
    private void LlenarDatos(String sql){
        VaciarTabla();
        Conexion con = new Conexion();
        ResultSet res;
        String texto = "";
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        Object nf[] = {null, null, null, null, null};
        try{
            con.Conectar(usuario, password);;
            res = con.Consulta(sql);
            while(res.next()){
                ntm.addRow(nf);
                tabla.setValueAt(res.getString(1), ct, 0);
                texto = res.getString(2)+" "+res.getString(3)+" "+res.getString(4);
                tabla.setValueAt(texto, ct, 1);
                texto = res.getString(5)+" "+res.getString(6)+" "+res.getString(7);
                tabla.setValueAt(texto, ct, 2);
                tabla.setValueAt(res.getString(8), ct, 3);
                tabla.setValueAt(formato.format(res.getDouble(9)), ct, 4);
                ct++;
            }  
            con.Cerrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error LlenarDatos -- "+e.getMessage());
        }
    }
    
    private void VaciarTabla(){
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        for(int b = (ct-1); b>=0; b--){
            ntm.removeRow(b);
        }
        ct = 0;
    }
    
    
    
}
