package GUI;

import DataBase.Conexion;
import DataBase.SQLFactura;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class CrearFactura extends javax.swing.JDialog {

    private String cuenta;
    private String password;
    private String fe, pedimento;
    private String contrato;
    private String compra;
    private int conta=0;

    public CrearFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        textSerie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateC = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        textSeleccion = new javax.swing.JLabel();
        textPedimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Constancia factura");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Número de serie: ");

        textSerie.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSerieKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        textCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textClienteKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Pedimento:");

        Crear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        Crear.setText("Imprimir");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/factura grande.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de compra:");

        dateC.setFormat(1);
        dateC.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        dateC.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 13));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Contrato", "Cliente", "Vehiculo", "#Serie", "#Motor", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(25);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jLabel6.setText("Seleccionado:");

        textSeleccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textSeleccion.setForeground(new java.awt.Color(102, 0, 0));

        textPedimento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(textSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(64, 64, 64)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                        .addComponent(textPedimento))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(textSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(textPedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        Imprimir();
    }//GEN-LAST:event_CrearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void textSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSerieKeyReleased
       ConsultarSerie();
    }//GEN-LAST:event_textSerieKeyReleased

    private void textClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClienteKeyReleased
        ConsultarCliente();
    }//GEN-LAST:event_textClienteKeyReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        SeleccionarContrato();
    }//GEN-LAST:event_tablaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private datechooser.beans.DateChooserCombo dateC;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textPedimento;
    private javax.swing.JLabel textSeleccion;
    private javax.swing.JTextField textSerie;
    // End of variables declaration//GEN-END:variables

    private void SeleccionarContrato(){
        int fila = tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Selecciona una fila de la tabla", "Seleccion", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            contrato = (String) tabla.getValueAt(fila, 0);
            textSeleccion.setText(contrato + " -- "+tabla.getValueAt(fila, 1));
        }
    }
    
    private void ConsultarCliente(){
        SQLFactura f = new SQLFactura();
        Conexion con = new Conexion();
        ResultSet res;
        con.Conectar(cuenta, password);
        res = con.Consulta(f.ObtenerNombre(textCliente.getText()));
        LlenarTabla(res);
        con.Cerrar();
    }
    
    private void ConsultarSerie(){
        SQLFactura f = new SQLFactura();
        Conexion con = new Conexion();
        ResultSet res;
        con.Conectar(cuenta, password);
        res = con.Consulta(f.ObtenerSerie(textSerie.getText()));
        LlenarTabla(res);
        con.Cerrar();
    }
    
    public void LlenarTabla(ResultSet res) {
        try {
            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
            DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
            Object[] fila = {null, null, null, null, null, null};
            for (int i = (conta - 1); i >= 0; i--) {
                dtm.removeRow(i);
            }
            conta = 0;

            while (res.next()) {
                dtm.addRow(fila);
                tabla.setValueAt(res.getString(1), conta, 0);
                tabla.setValueAt(res.getString(2)+" "+res.getString(3)+" "+res.getString(4), conta, 1);
                tabla.setValueAt(res.getString(5)+" "+res.getString(6), conta, 2);
                tabla.setValueAt(res.getString(7), conta, 3);
                tabla.setValueAt(res.getString(8), conta, 4);
                tabla.setValueAt(nf.format(res.getDouble(9)), conta, 5);
                conta++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error// " + e.getMessage(), "Error en tabla", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Imprimir(){
        try{ 
            pedimento = textPedimento.getText().toUpperCase();
            compra = getFechaCombo();
            GetFechaActual();
            DatosFactura fc = new DatosFactura(this, true);
            fc.setDatos(cuenta, password, contrato, pedimento, compra, fe);
            fc.setLocationRelativeTo(this);
            fc.setVisible(true);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verifica la información de la factura");
        }
    }
    
    private void Regresar(){
        this.dispose();
    }
    
    public void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }
    
    private String getFechaCombo() {
        String fecha = "";
        int d,m,a;
        Calendar date = null;
        date = dateC.getSelectedDate();
        a = date.get(Calendar.YEAR);
        m = date.get(Calendar.MONTH) + 1;   
        d = date.get(Calendar.DATE);
        if(d < 10){
            fecha = "0"+d;
        }
        else{
            fecha = ""+d;
        }
        switch(m){
            case 1 : fecha = fecha+" de enero de "+a ; break;
            case 2 : fecha = fecha+" de febrero de "+a; break;
            case 3 : fecha = fecha+" de marzo de "+a; break;
            case 4 : fecha = fecha+" de abril de "+a; break;
            case 5 : fecha = fecha+" de mayo de "+a; break;
            case 6 : fecha = fecha+" de junio de "+a; break;
            case 7 : fecha = fecha+" de julio de "+a; break;
            case 8 : fecha = fecha+" de agosto de "+a; break;
            case 9 : fecha = fecha+" de septiembre de "+a; break;
            case 10 : fecha = fecha+" de octubre de "+a; break;
            case 11 : fecha = fecha+" de noviembre de "+a; break;
            case 12 : fecha = fecha+" de diciembre de "+a; break;
            default : fecha = fecha+" de enero de "+a; break;
        }
        return fecha;
    }
    
    public void GetFechaActual(){
        Calendar fecha = new GregorianCalendar();
        String m, d;
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
        switch(mes){
            case 1 : fe = dia+" de enero de "+ano; break;
            case 2 : fe = dia+" de febrero de "+ano; break;
            case 3 : fe = dia+" de marzo de "+ano; break;
            case 4 : fe = dia+" de abril de "+ano; break;
            case 5 : fe = dia+" de mayo de "+ano; break;
            case 6 : fe = dia+" de junio de "+ano; break;
            case 7 : fe = dia+" de julio de "+ano; break;
            case 8 : fe = dia+" de agosto de "+ano; break;
            case 9 : fe = dia+" de septiembre de "+ano; break;
            case 10 : fe = dia+" de octubre de "+ano; break;
            case 11 : fe = dia+" de noviembre de "+ano; break;
            case 12 : fe = dia+" de diciembre de "+ano; break;
            default : fe = "00 de enero de 0000"; break;
        }
        
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

}
