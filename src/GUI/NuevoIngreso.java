
package GUI;

import DataBase.Conexion;
import DataBase.SQLCaja;
import datechooser.beans.DateChooserCombo;
import java.awt.Color;
import java.awt.Image;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NuevoIngreso extends javax.swing.JDialog {

    private String cuenta;
    private String password;
    private double total;
    private double tarjeta;
    private double efectivo;
    private double cantidad = 0.0;

    public NuevoIngreso(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        radioEfectivo = new javax.swing.JRadioButton();
        radioTarjeta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        dateFecha = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        textConcepto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textRecibo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso en caja");

        grupo.add(radioEfectivo);
        radioEfectivo.setText("Efectivo");

        grupo.add(radioTarjeta);
        radioTarjeta.setText("Tarjeta");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Fecha:");

        dateFecha.setFormat(1);
        dateFecha.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Concepto:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Recibo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        textCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textCantidadFocusLost(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ingreso.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pago.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textRecibo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)
                                    .addComponent(dateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(textConcepto))
                                .addComponent(jLabel3))
                            .addComponent(jLabel4)
                            .addComponent(textCantidad))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEfectivo)
                    .addComponent(radioTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCantidadFocusGained
        textCantidad.setText(null);
    }//GEN-LAST:event_textCantidadFocusGained

    private void textCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCantidadFocusLost
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String texto = textCantidad.getText();
        if (!texto.isEmpty()) {
            cantidad = Double.parseDouble(texto);
            textCantidad.setText(nf.format(cantidad));
        }
    }//GEN-LAST:event_textCantidadFocusLost

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateFecha;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton radioEfectivo;
    private javax.swing.JRadioButton radioTarjeta;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textConcepto;
    private javax.swing.JTextField textRecibo;
    // End of variables declaration//GEN-END:variables

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
    
    private void Guardar(){
        SQLCaja sc = new SQLCaja();
        Conexion con = new Conexion();
        if(!dateFecha.getText().isEmpty()) {
            if (cantidad >= 0) {
                int op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea guardar el ingreso?");
                if (op == 0) {
                    String fecha = getFecha(dateFecha);
                    String concepto = textConcepto.getText();
                    if(concepto.isEmpty()){
                        concepto = " ";
                    }
                    String recibo = textRecibo.getText();
                    if(recibo.isEmpty()){
                        recibo = " ";
                    }
                    int origen = 0;
                    if(radioEfectivo.isSelected()){
                        origen = 0;
                        efectivo = efectivo + cantidad;
                    }else{
                        origen = 1;
                        tarjeta = tarjeta + cantidad;
                    }
                    String sql = sc.GuardarIngreso(fecha,0,concepto,recibo,cantidad,origen);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    total = total + cantidad;
                    sql = sc.GuardarTotal(total,efectivo,tarjeta);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();  
                    JOptionPane.showMessageDialog(this, "Ingreso guardado");
                    textConcepto.setText(null);
                    textRecibo.setText(null);
                    textCantidad.setText(null);
                    cantidad = 0.0;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa la cantidad");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona la fecha");
        }
    }
    
    private String getFecha(DateChooserCombo dateChooser) {
        String fecha = "";
        int num;
        Calendar date = null;
        date = dateChooser.getSelectedDate();
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

    public void setDatos(String cuenta, String password, double total, double tarjeta, double efectivo) {
        radioEfectivo.setSelected(true);
        radioTarjeta.setSelected(false);
        this.cuenta = cuenta;
        this.password = password;
        this.total = total;
        this.tarjeta = tarjeta;
        this.efectivo = efectivo;
    }
}
