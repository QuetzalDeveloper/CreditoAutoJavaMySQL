package GUI;

import DataBase.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NuevoEmpleado extends javax.swing.JDialog {

    private boolean clave = false;
    private String password;
    private String cuenta;
    
    public NuevoEmpleado(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textCuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textPaterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textPassword = new javax.swing.JTextField();
        labelImage = new javax.swing.JLabel();
        labelMensaje = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        checkCargo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo empleado");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cuenta:");

        textCuenta.setColumns(15);
        textCuenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textCuentaFocusLost(evt);
            }
        });
        textCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCuentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCuentaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Paterno:");

        textPaterno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textPaternoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPaternoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Materno:");

        textMaterno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textMaternoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textMaternoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre (s):");

        textNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono:");

        textTelefono.setColumns(10);
        textTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Contraseña:");

        textPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textPasswordKeyPressed(evt);
            }
        });

        labelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar.png"))); // NOI18N
        exit1.setText("Guardar");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevoUsuario.png"))); // NOI18N

        checkCargo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkCargo.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(textPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Salir();
    }//GEN-LAST:event_exitActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        Guardar();
    }//GEN-LAST:event_exit1ActionPerformed

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        if(textTelefono.getText().length()== 25){
            evt.consume();
        }
    }//GEN-LAST:event_textTelefonoKeyTyped

    private void textCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCuentaKeyTyped
        if(textCuenta.getText().length()== 15){
            evt.consume();
        }
    }//GEN-LAST:event_textCuentaKeyTyped

    private void textCuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCuentaFocusLost
        ComprobarClave();
    }//GEN-LAST:event_textCuentaFocusLost

    private void textPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPaternoKeyTyped
        EventoTexto(evt,textPaterno);
    }//GEN-LAST:event_textPaternoKeyTyped

    private void textMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMaternoKeyTyped
        EventoTexto(evt,textMaterno);
    }//GEN-LAST:event_textMaternoKeyTyped

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        EventoTexto(evt,textNombre);
    }//GEN-LAST:event_textNombreKeyTyped

    private void textCuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCuentaKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textCuentaKeyPressed

    private void textPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPaternoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textPaternoKeyPressed

    private void textMaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMaternoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textMaternoKeyPressed

    private void textNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textNombreKeyPressed

    private void textTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textTelefonoKeyPressed

    private void textPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPasswordKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textPasswordKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkCargo;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JTextField textCuenta;
    private javax.swing.JTextField textMaterno;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textPaterno;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
    
    private void EventoTexto(KeyEvent evt, JTextField text){ //Key Typed
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c)&& (c != evt.VK_BACK_SPACE) && (c != evt.VK_ENTER) && (c != evt.VK_ESCAPE) && (c != evt.VK_SPACE)){
            getToolkit().beep();
            evt.consume();    
        }
    }
    
    private void Guardar(){
        ComprobarClave();
        if(!clave){
            JOptionPane.showMessageDialog(this, "Verifique la clave de empleado");
        }
        else if(textPaterno.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifique el apellido paterno del empleado");
        }
        else if(textMaterno.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifique el apellido materno del empleado");
        }
        else if(textNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifique el nombre del empleado");
        }
        else if(textTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifique el teléfono del empleado");
        }
        else if(textPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifique la contraseña del empleado");
        }
        else{
            Conexion con = new Conexion();
            SQLEmpleados se = new SQLEmpleados();
            String clave = textCuenta.getText().toUpperCase();
            String paterno = textPaterno.getText().toLowerCase();
            String materno = textMaterno.getText().toUpperCase();
            String nombre = textNombre.getText().toUpperCase();
            String telefono = textTelefono.getText();
            String password = textPassword.getText();
            int cargo;
            if(checkCargo.isSelected()){
                cargo = 1;
            }
            else{
                cargo = 0;
            }
            con.Conectar(cuenta, this.password);
            String sql = se.GuardarEmpleado(clave, paterno, materno, nombre, telefono, cargo, password);
            con.Modificar(sql);
            System.out.println("1");
            con.Cerrar();
            sql = se.GenerarCuentaMysql(clave, password);
            con.Conectar(cuenta, this.password);    
            con.Modificar(sql);
            System.out.println("2");
            con.Cerrar();
            sql = se.PermisosCuentaMysql(clave, password);
            con.Conectar(cuenta, this.password);    
            con.Modificar(sql);
            System.out.println("3");
            con.Cerrar();
            JOptionPane.showMessageDialog(this, "Empleado registrado en el sistema");
            textCuenta.setText(null);
            textPaterno.setText(null);
            textMaterno.setText(null);
            textNombre.setText(null);
            textTelefono.setText(null);
            checkCargo.setSelected(false);                    
            textPassword.setText(null);
        }
    }
    
    private void ComprobarClave(){
        Conexion con = new Conexion();
        SQLEmpleados se = new SQLEmpleados();
        String sql;
        ResultSet res;
        ImageIcon img;
        try{
            con.Conectar(cuenta, password);
            sql = se.ConsultarClave(textCuenta.getText());
            res = con.Consulta(sql);
            if(res.next()){
                img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
                labelImage.setIcon(img);
                labelMensaje.setText("El usuario ya está ocupado");
                clave = false;
            }
            else{
                if(textCuenta.getText().isEmpty()){
                    img = new ImageIcon(getClass().getResource("/Images/AdvertenciaAma.png"));
                    labelImage.setIcon(img);
                    labelMensaje.setText("Debes asignar una clave de usuario");
                    clave = false;
                }
                else {
                    img = new ImageIcon(getClass().getResource("/Images/tick.png"));
                    labelImage.setIcon(img);
                    labelMensaje.setText("El usuario está disponible");
                    clave = true;
                }
            }
            con.Cerrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error03 - "+e.getMessage());
        }
    }
    
    private void Salir(){
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
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){}
    }
    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Guardar();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Salir();
        }
    }
    
    void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }

}
