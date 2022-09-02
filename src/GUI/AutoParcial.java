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

public class AutoParcial extends javax.swing.JDialog {

    private String cuenta;
    private String password;

    public AutoParcial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }
    
    boolean control = false;
    int id;
    String marca, tipo, transmision, ano;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboTransmision = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        textAno = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar información del auto");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Marca:");

        textMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textMarcaKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        textTipo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTipoKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Transmisión: ");

        comboTransmision.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboTransmision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTOMÁTICO", "MANUAL", "CVT" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Año:");

        textAno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAnoKeyTyped(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoGrande.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(textMarca)
                                .addComponent(jLabel4)
                                .addComponent(textTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(comboTransmision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        Guardar();
    }//GEN-LAST:event_exit1ActionPerformed

    private void textAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAnoKeyTyped
        EventoAno(evt, textAno);
    }//GEN-LAST:event_textAnoKeyTyped

    private void textMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMarcaKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textMarcaKeyPressed

    private void textTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTipoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textTipoKeyPressed

    private void textAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAnoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textAnoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboTransmision;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelId;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textTipo;
    // End of variables declaration//GEN-END:variables

    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Guardar();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Regresar();
        }
    }
    
    private void EventoAno(KeyEvent evt, JTextField text) {
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter) && (caracter != evt.VK_BACK_SPACE) && (caracter != evt.VK_ENTER) && (caracter != evt.VK_ESCAPE)){
            getToolkit().beep();
            evt.consume();
        } else if (text.getText().length() == 4) {
            getToolkit().beep();
            evt.consume();
        }
    }
    
    private void Guardar() {
        try {
            String sql;
            ResultSet res;
            marca = textMarca.getText().toUpperCase();
            tipo = textTipo.getText().toUpperCase();
            transmision = comboTransmision.getSelectedItem().toString();
            ano = textAno.getText();
            if (marca.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Veifica la marca");
            } else if (tipo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Verifica el tipo de vehiculo");
            } else if (ano.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresa el año del vehiculo");
            } else {
                SQLCotizacion sc = new SQLCotizacion();
                Conexion con = new Conexion();
                sql = sc.GuardraAutoParcial(marca, tipo, transmision, ano);
                con.Conectar(cuenta, password);
                con.Modificar(sql);
                con.Cerrar();
                sql = sc.ObtenerIDAuto(marca, tipo, transmision, ano);
                con.Conectar(cuenta, password);
                res = con.Consulta(sql);
                while(res.next()){
                    labelId.setText(res.getString(1));
                }
                con.Cerrar();
                control = true;
                id = Integer.parseInt(labelId.getText().toString());
                this.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error07 - "+e.getMessage());
        }
    }
    
    private void Regresar(){
        control = false;
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
