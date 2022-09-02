package GUI;

import DataBase.Conexion;
import DataBase.SQLAdicionales;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CostosAdicionales extends javax.swing.JDialog {
    
    private double factura, comision;
    private double limite;
    private String cuenta;
    private String password;

    public CostosAdicionales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFactura = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        checkComision = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        textLimite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Costos adicionales");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Precio de factura:");

        textFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textFactura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFacturaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFacturaFocusLost(evt);
            }
        });
        textFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFacturaKeyTyped(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitKeyPressed(evt);
            }
        });

        exit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/herramienta.png"))); // NOI18N
        exit3.setText("Cambiar");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });
        exit3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exit3KeyPressed(evt);
            }
        });

        jTextField1.setEditable(false);

        checkComision.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkComision.setText("Comisión cero");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Límite sin aviso:");

        textLimite.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textLimite.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textLimiteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textLimiteFocusLost(evt);
            }
        });
        textLimite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textLimiteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(checkComision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(exit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textLimite)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(checkComision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void exitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_exitKeyPressed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed

        Cambiar();
    }//GEN-LAST:event_exit3ActionPerformed

    private void exit3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exit3KeyPressed
        Eventos(evt);
    }//GEN-LAST:event_exit3KeyPressed

    private void textFacturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFacturaFocusGained
        textFactura.setText("");
    }//GEN-LAST:event_textFacturaFocusGained

    private void textFacturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFacturaFocusLost
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        if(!textFactura.getText().isEmpty()) {
            factura = Double.parseDouble(textFactura.getText());
            textFactura.setText(nf.format(factura));
        }
        else{
            textFactura.setText(nf.format(factura));
        }
    }//GEN-LAST:event_textFacturaFocusLost

    private void textFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFacturaKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                && (caracter != '.')) {
            getToolkit().beep(); 
            evt.consume();
        }
        if (caracter == '.' && textFactura.getText().contains(".")) {
            getToolkit().beep(); 
            evt.consume();
        }
    }//GEN-LAST:event_textFacturaKeyTyped

    private void textLimiteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLimiteFocusGained
        textLimite.setText(null);
    }//GEN-LAST:event_textLimiteFocusGained

    private void textLimiteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLimiteFocusLost
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        if(!textLimite.getText().isEmpty()) {
            limite = Double.parseDouble(textLimite.getText());
            textLimite.setText(nf.format(limite));
        }
        else{
            textLimite.setText(nf.format(limite));
        }
    }//GEN-LAST:event_textLimiteFocusLost

    private void textLimiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLimiteKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                && (caracter != '.')) {
            getToolkit().beep(); 
            evt.consume();
        }
        if (caracter == '.' && textLimite.getText().contains(".")) {
            getToolkit().beep(); 
            evt.consume();
        }
    }//GEN-LAST:event_textLimiteKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkComision;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField textFactura;
    private javax.swing.JTextField textLimite;
    // End of variables declaration//GEN-END:variables

    private void Cambiar(){
        SQLAdicionales sa = new SQLAdicionales();
        Conexion con = new Conexion();
        String sql = sa.CambiarValor(1,factura);
        con.Conectar(cuenta,password);
        con.Modificar(sql);
        con.Cerrar();
        if (checkComision.isSelected()) {
            sql = sa.CambiarValor(2, 0);
        }
        else{
            sql = sa.CambiarValor(2, 1);
        }
        con.Conectar(cuenta,password);
        con.Modificar(sql);
        con.Cerrar();
        sql = sa.CambiarValor(3,limite);
        con.Conectar(cuenta,password);
        con.Modificar(sql);
        con.Cerrar();
        JOptionPane.showMessageDialog(this, "Cambios guardados");
        LlenarCampos();
    }
    
    private void Eventos(KeyEvent evt){ //Key Pressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Cambiar();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Regresar();
        }
    }
    
    private void Regresar(){
        this.dispose();
    }
    
    public void LlenarCampos() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        SQLAdicionales sa = new SQLAdicionales();
        Conexion con = new Conexion();
        ResultSet res;
        try {
            String sql = sa.ConsultarFacturaSaldo();
            con.Conectar(cuenta,password);
            res = con.Consulta(sql);
            if (res.next()) {
                factura = res.getDouble(3);
                res.next();
                comision = res.getInt(3);
                res.next();
                limite = res.getDouble(3);
            }
            con.Cerrar();
            textFactura.setText(nf.format(factura));
            if (comision == 0) {
                checkComision.setSelected(true);
            } else {
                checkComision.setSelected(false);
            }
            textLimite.setText(nf.format(limite));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Llenar campo -- " + e.getMessage());
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

    void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }

}
