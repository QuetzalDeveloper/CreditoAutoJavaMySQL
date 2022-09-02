package GUI;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AjustesCotizador extends javax.swing.JDialog {

    private String cuenta;
    private String password;

    public AjustesCotizador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt12 = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt24 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt36 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt48 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt54 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt60 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt30 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textIVA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textCom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textSVA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajustes de cotizador");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Tasa anual sin IVA %:");

        txt12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt12KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt12KeyTyped(evt);
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

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/herramienta.png"))); // NOI18N
        exit1.setText("Cambiar");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        exit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exit1KeyPressed(evt);
            }
        });

        jLabel5.setText("12 meses");

        jLabel6.setText("24 meses");

        txt24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setText("36 meses");

        txt36.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setText("48 meses");

        txt48.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setText("54 meses");

        txt54.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel10.setText("60 meses");

        txt60.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setText("30 meses");

        txt30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("IVA %:");

        textIVA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textIVAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIVAKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Comisión %:");

        textCom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textComKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textComKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Seguro de vida anual %:");

        textSVA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textSVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSVAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSVAKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(textIVA, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(textCom)
                    .addComponent(textSVA))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(textIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(textSVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt24, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt30, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt36, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt48, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt54, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt60, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txt54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txt60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(31, 31, 31))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        Cambiar();
    }//GEN-LAST:event_exit1ActionPerformed

    private void exit1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exit1KeyPressed
        Eventos(evt);
    }//GEN-LAST:event_exit1KeyPressed

    private void exitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_exitKeyPressed

    private void txt12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt12KeyTyped
        NumeroDecimal(evt,txt12);
    }//GEN-LAST:event_txt12KeyTyped

    private void textIVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIVAKeyTyped
        NumeroDecimal(evt,textIVA);
    }//GEN-LAST:event_textIVAKeyTyped

    private void textComKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textComKeyTyped
        NumeroDecimal(evt,textCom);
    }//GEN-LAST:event_textComKeyTyped

    private void textSVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSVAKeyTyped
        NumeroDecimal(evt,textSVA);
    }//GEN-LAST:event_textSVAKeyTyped

    private void txt12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt12KeyPressed
        Eventos(evt);
    }//GEN-LAST:event_txt12KeyPressed

    private void textIVAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIVAKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textIVAKeyPressed

    private void textComKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textComKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textComKeyPressed

    private void textSVAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSVAKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textSVAKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textCom;
    private javax.swing.JTextField textIVA;
    private javax.swing.JTextField textSVA;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt48;
    private javax.swing.JTextField txt54;
    private javax.swing.JTextField txt60;
    // End of variables declaration//GEN-END:variables
    
    private void NumeroDecimal(KeyEvent evt, JTextField text){
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                && (caracter != '.') && (caracter != evt.VK_ENTER) && (caracter != evt.VK_ESCAPE)) {
            getToolkit().beep(); 
            evt.consume();
        }
        if (caracter == '.' && text.getText().contains(".")) {
            getToolkit().beep(); 
            evt.consume();
        }
    }
    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Cambiar();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Regresar();
        }
    }
    
    private void Cambiar(){
        Conexion con = new Conexion();
        SQLCotizacion sa = new SQLCotizacion();
        double t12,t24,t36,t48,t54,t60, i, c, s, t30;
        String sql;
        String ta12 = txt12.getText();
        String ta24 = txt24.getText();
        String ta30 = txt30.getText();
        String ta36 = txt36.getText();
        String ta48 = txt48.getText();
        String ta54 = txt54.getText();
        String ta60 = txt60.getText();
        String iv = textIVA.getText();
        String co = textCom.getText();
        String sv = textSVA.getText();
       
        if(ta12.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad de la tasa anual sija sin IVA a 12 meses");
        }
        else if(ta24.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad de la tasa anual sija sin IVA a 12 meses");
        }
        else if(ta30.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad de la tasa anual sija sin IVA a 12 meses");
        }
        else if(ta36.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad de la tasa anual sija sin IVA a 12 meses");
        }
        else if(ta48.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad de la tasa anual sija sin IVA a 12 meses");
        }
        else if(ta54.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad de la tasa anual sija sin IVA a 12 meses");
        }
        else if(ta60.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad de la tasa anual sija sin IVA a 12 meses");
        }
        else if(iv.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la cantidad del IVA");
        }
        else if(co.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa la comicion");
        }
        else if(sv.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa el seguro de auto anual");
        }
        else{
            t12 = Double.parseDouble(ta12);
            t24 = Double.parseDouble(ta24);
            t30 = Double.parseDouble(ta30);
            t36 = Double.parseDouble(ta36);
            t48 = Double.parseDouble(ta48);
            t54 = Double.parseDouble(ta54);
            t60 = Double.parseDouble(ta60);
            i = Double.parseDouble(iv);
            c = Double.parseDouble(co);
            s = Double.parseDouble(sv);
            sql = sa.CambiarVariablesCotizacion(t12,t24,t30,t36,t48,t54,t60, i, c, s);
            con.Conectar(cuenta, password);
            con.Modificar(sql);
            con.Cerrar();
            LlenarCampos();
            JOptionPane.showMessageDialog(this, "Datos actualizados");
        }
    }
    
    public void LlenarCampos() {
        try {
            Conexion con = new Conexion();
            SQLCotizacion sa = new SQLCotizacion();
            ResultSet res;
            String sql = sa.ObtenerVariablesCotizacion();
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            while(res.next()){
                txt12.setText(res.getDouble(1)+"");
                textIVA.setText(res.getDouble(2)+"");
                textCom.setText(res.getDouble(3)+"");
                textSVA.setText(res.getDouble(4)+"");
                txt24.setText(res.getDouble(5)+"");
                txt36.setText(res.getDouble(6)+"");
                txt48.setText(res.getDouble(7)+"");
                txt54.setText(res.getDouble(8)+"");
                txt60.setText(res.getDouble(9)+"");
                txt30.setText(res.getDouble(10)+"");
            }
            con.Cerrar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error08 - " +e.getMessage());
        }
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
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){}
    }

    void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }
}
