package GUI;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
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

public class EditarClienteParcial extends javax.swing.JDialog {
    
    int id;
    String paterno, materno,nombre, telefono;
    private String cuenta;
    private String password;

    public EditarClienteParcial(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textPat = new javax.swing.JTextField();
        textMat = new javax.swing.JTextField();
        textNom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cotización: nuevo cliente");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Apellido paterno:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Apellido materno:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombre (s):");

        textPat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textPatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPatKeyTyped(evt);
            }
        });

        textMat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textMatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textMatKeyTyped(evt);
            }
        });

        textNom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNomKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Teléfono móvil:");

        textTel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelKeyTyped(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregarClienteMed.png"))); // NOI18N

        labelId.setBackground(new java.awt.Color(255, 255, 255));
        labelId.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(textPat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(labelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Regresar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelKeyTyped
        EventoEnteroLimite(evt,textTel, 25);
    }//GEN-LAST:event_textTelKeyTyped

    private void textPatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPatKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textPatKeyPressed

    private void textMatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMatKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textMatKeyPressed

    private void textNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textNomKeyPressed

    private void textTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textTelKeyPressed

    private void textPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPatKeyTyped
        EventoTexto(evt,textPat);
    }//GEN-LAST:event_textPatKeyTyped

    private void textMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMatKeyTyped
        EventoTexto(evt,textMat);
    }//GEN-LAST:event_textMatKeyTyped

    private void textNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomKeyTyped
        EventoTexto(evt,textNom);
    }//GEN-LAST:event_textNomKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelId;
    private javax.swing.JTextField textMat;
    private javax.swing.JTextField textNom;
    private javax.swing.JTextField textPat;
    private javax.swing.JTextField textTel;
    // End of variables declaration//GEN-END:variables

    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Registrar();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Regresar();
        }
    }
    
    private void EventoTexto(KeyEvent evt, JTextField text){
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c)&& (c != evt.VK_BACK_SPACE) && (c != evt.VK_ENTER) && (c != evt.VK_ESCAPE) && (c != evt.VK_SPACE)){
            getToolkit().beep();
            evt.consume();    
        }
    }
    
    private void EventoEnteroLimite(KeyEvent evt, JTextField text, int limite) {
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter) && (caracter != evt.VK_BACK_SPACE) && (caracter != evt.VK_ENTER) && (caracter != evt.VK_ESCAPE)){
            getToolkit().beep();
            evt.consume();
        } else if (text.getText().length() == limite) {
            getToolkit().beep();
            evt.consume();
        }
    }
    
    private void Registrar(){
        String sql;
        if(textPat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifica que hayas escrito el apellido paterno");
        }
        else if(textMat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifica que hayas escrito el apellido materno");
        }
        else if(textNom.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifica que hayas escrito el (los) nombre(s)");
        }
        else if(textTel.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifica que hayas escrito el telefono movil");
        } else {
            int a = JOptionPane.showConfirmDialog(this, "Seguro que los datos son correctos?");
            if (a == 0) {
                try {
                    paterno = textPat.getText().toUpperCase();
                    materno = textMat.getText().toUpperCase();
                    nombre = textNom.getText().toUpperCase();
                    telefono = textTel.getText();
                    SQLCotizacion sc = new SQLCotizacion();
                    Conexion con = new Conexion();
                    sql = sc.EditarClienteParcial(id, paterno, materno, nombre, telefono);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    JOptionPane.showMessageDialog(this, "Cliente almacenado");           
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error06 " + e.getMessage());
                }
                this.dispose();
            } else {
                id = -1;
                JOptionPane.showMessageDialog(this, "Operación cancelada");
            }
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

    void setUsuario(String cuenta, String password, int idCliente, String paterno, String materno, String nombre, String telCliente) {
        this.id = idCliente;
        this.cuenta = cuenta;
        this.password = password;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.telefono = telCliente;
        textPat.setText(paterno);
        textMat.setText(materno);
        textNom.setText(nombre);
        textTel.setText(telefono);
    }

}
