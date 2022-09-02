package GUI;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class EditarCotizacion extends javax.swing.JDialog {

    private String date = null, marca, tipoAuto;
    private String idEmpleado, nomEmpleado;
    private String nomCliente, telCliente;
    private String texto="";
    private int idCliente = 0;
    private int idAuto = 0;
    private double as,b = 0, c = 0, d = 0,numero=0, numEng = 0;
    double[] a =  new double[7];
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private String cuenta;
    private String password;
    private int folio;
    private String paterno;
    private String materno;
    private String nombre;
    private String transmision;
    private String ano;
    
    public EditarCotizacion(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textAuto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textEnganche = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboPlazo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelTasa = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelFolio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva cotización");

        labelFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFecha.setText("Fecha");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        textCliente.setEditable(false);
        textCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textClienteMouseReleased(evt);
            }
        });
        textCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textClienteKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregarCliente.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textAuto.setEditable(false);
        textAuto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textAutoMouseReleased(evt);
            }
        });
        textAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAutoKeyPressed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoSmall.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Precio del auto:");

        textPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textPrecioFocusLost(evt);
            }
        });
        textPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrecioKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Enganche:");

        textEnganche.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textEnganche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textEngancheFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textEngancheFocusLost(evt);
            }
        });
        textEnganche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textEngancheKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEngancheKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Plazo:");

        comboPlazo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboPlazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "24", "30", "36", "48", "54", "60" }));
        comboPlazo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPlazoItemStateChanged(evt);
            }
        });
        comboPlazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPlazoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Automóvil:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tasa ordinaria anual fija");

        labelTasa.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTasa.setText("0.0%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cotizador.png"))); // NOI18N
        exit1.setText("Cotizar");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Folio:");

        labelFolio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFolio.setText("0");

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
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(textEnganche, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(comboPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(jLabel2)
                    .addComponent(labelFolio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEnganche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textClienteMouseReleased
        StatusCliente();
    }//GEN-LAST:event_textClienteMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StatusCliente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StatusAuto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        Cotizar();
    }//GEN-LAST:event_exit1ActionPerformed

    private void textAutoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAutoMouseReleased
        StatusAuto();
    }//GEN-LAST:event_textAutoMouseReleased

    private void textPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrecioKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                && (caracter != '.')) {
            getToolkit().beep(); 
            evt.consume();
        }
        if (caracter == '.' && textPrecio.getText().contains(".")) {
            getToolkit().beep(); 
            evt.consume();
        }
    }//GEN-LAST:event_textPrecioKeyTyped

    private void textPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPrecioFocusLost
        texto = textPrecio.getText();
        if (!texto.isEmpty()) {
            numero = Double.parseDouble(texto);
            textPrecio.setText(nf.format(numero));
        }
    }//GEN-LAST:event_textPrecioFocusLost

    private void textEngancheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEngancheKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                && (caracter != '.')) {
            getToolkit().beep(); 
            evt.consume();
        }
        if (caracter == '.' && textEnganche.getText().contains(".")) {
            getToolkit().beep(); 
            evt.consume();
        }
    }//GEN-LAST:event_textEngancheKeyTyped

    private void textEngancheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEngancheFocusLost
        texto = textEnganche.getText();
        if (!texto.isEmpty()) {
            numEng = Double.parseDouble(texto);
            textEnganche.setText(nf.format(numEng));
        }
    }//GEN-LAST:event_textEngancheFocusLost

    private void textPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPrecioFocusGained
        textPrecio.setText(null);
    }//GEN-LAST:event_textPrecioFocusGained

    private void textEngancheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEngancheFocusGained
        textEnganche.setText(null);
    }//GEN-LAST:event_textEngancheFocusGained

    private void textClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClienteKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textClienteKeyPressed

    private void textAutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAutoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textAutoKeyPressed

    private void textPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrecioKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textPrecioKeyPressed

    private void textEngancheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEngancheKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textEngancheKeyPressed

    private void comboPlazoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboPlazoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_comboPlazoKeyPressed

    private void comboPlazoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPlazoItemStateChanged
        ObtenerTasaAnualFija();
    }//GEN-LAST:event_comboPlazoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPlazo;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFolio;
    private javax.swing.JLabel labelTasa;
    private javax.swing.JTextField textAuto;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textEnganche;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables

    public void setUsuario(String cuenta, String password, int folio) {
        Conexion con = new Conexion();
        SQLCotizacion sc = new SQLCotizacion();
        ResultSet res;
        String sql;
        this.cuenta = cuenta;
        this.password = password;
        this.folio = folio;
        ObtenerVariables();
        //General
        try {
            labelFolio.setText(folio + "");
            String cp = "";
            sql = sc.ObtenerCotizacion(folio);
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            if (res.next()) {
                idAuto = res.getInt(2);     //ID auto
                numero = res.getDouble(3); //Precio de auto
                numEng = res.getDouble(4);  //Enganche
                cp = res.getString(7); //Plazo
                as = res.getDouble(10);
                idCliente = res.getInt(11);              
            }
            con.Cerrar();
            textPrecio.setText(nf.format(numero));
            textEnganche.setText(nf.format(numEng));
            comboPlazo.setSelectedItem(cp);
            labelTasa.setText(as+"%");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener cotizacion\n--" + e.getMessage(), "Error en cotizacion", JOptionPane.ERROR_MESSAGE);
            con.Cerrar();
        }
        //Cliente
        try{
            sql = sc.ConsultarClienteParcial(idCliente);
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            if(res.next()){
               paterno = res.getString(1);
               materno = res.getString(2);
               nombre = res.getString(3);
               telCliente = res.getString(4);
            }
            con.Cerrar();
            nomCliente = paterno + " " + materno + " " + nombre;
            textCliente.setText(nomCliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener cliente\n--" + e.getMessage(), "Error en cotizacion", JOptionPane.ERROR_MESSAGE);
            con.Cerrar();
        }
        //Auto
        try {
            sql = sc.ConsultarAutoParcial(idAuto);
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            if (res.next()) {
                marca = res.getString(1);
                tipoAuto = res.getString(2);
                transmision = res.getString(3);
                ano = res.getString(4);
            }
            con.Cerrar();
            textAuto.setText(tipoAuto+" "+transmision+" "+ano);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener cliente\n--" + e.getMessage(), "Error en cotizacion", JOptionPane.ERROR_MESSAGE);
            con.Cerrar();
        }
    }

    //-----------------------------------------------------------------------------
    
    public void ObtenerTasaAnualFija(){
        int cp = comboPlazo.getSelectedIndex();
        as = a[cp];
        labelTasa.setText(as+"%");
    }
    
    private void Eventos(KeyEvent evt){ //Key Pressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Cotizar();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Regresar();
        }
    }
    
    public void ObtenerVariables(){
        Conexion con = new Conexion();
        SQLCotizacion sc = new SQLCotizacion();
        String sql;
        ResultSet res;
        try{
            sql = sc.ObtenerVariablesCotizacion();
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            while(res.next()){
                a[0] = res.getDouble(1); 
                b = res.getDouble(2);
                c = res.getDouble(3);
                d = res.getDouble(4);
                a[1] = res.getDouble(5);
                a[2] = res.getDouble(10);
                a[3] = res.getDouble(6);
                a[4] = res.getDouble(7);
                a[5] = res.getDouble(8);        
                a[6] = res.getDouble(9);    
            }
            con.Cerrar();
            //as = a[0];
            //labelTasa.setText(as+"%");
        }catch(SQLException e){
            
        }
    }
    
    
    private void Cotizar(){
        if(textCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa los datos del cliente");
        }
        else if(textAuto.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresa los datos del auto");
        }
        else if (textPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa el precio del auto");
        } else if (textEnganche.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa el enganche del auto");
        } else {
            EditarTablaCotizacion co = new EditarTablaCotizacion(this,true);
            double precioAuto = numero;
            double engancheAuto = numEng;
            int plazoAuto = Integer.parseInt(comboPlazo.getSelectedItem().toString());
            co.setUsuario(cuenta, password, folio);
            co.VerificarComision();
            co.RecibirAuto(idAuto, marca, tipoAuto, precioAuto, engancheAuto, plazoAuto);
            co.RecibirCliente(idCliente, nomCliente, telCliente);
            co.RecibirEmpleado(idEmpleado, nomEmpleado);
            co.RecibirPorcentajes(as, b, c, d);
            co.LlenarLateral();
            co.setLocationRelativeTo(null);
            co.setVisible(true);
        }
    }
    
    public void RecibirEmpleado(String cuenta, String nombre){
        idEmpleado = cuenta;
        nomEmpleado = nombre;
    }
    
    private void Regresar(){
        this.dispose();
    }
    
    private void StatusAuto(){
        EditarAutoParcial ap = new EditarAutoParcial(this, true);
        ap.setUsuario(cuenta, password, idAuto, marca, tipoAuto, transmision, ano);
        ap.setLocationRelativeTo(null);
        ap.setVisible(true);
        marca = ap.marca;
        tipoAuto = ap.tipo;
        transmision = ap.transmision;
        ano = ap.ano;
        textAuto.setText(tipoAuto + " " + transmision + " " + ano);
    }
    
    private void StatusCliente() {
        EditarClienteParcial cp = new EditarClienteParcial(this, true);
        cp.setUsuario(cuenta, password, idCliente, paterno, materno, nombre, telCliente);
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
        paterno = cp.paterno;
        materno = cp.materno;
        nombre = cp.nombre;
        nomCliente = paterno + " " + materno + " " + nombre;
        telCliente = cp.telefono;
        textCliente.setText(nomCliente);
    }
    
    public void GetFechaActual(){
        Calendar fecha = new GregorianCalendar();
        String fe, m, d;
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
            case 1 : fe = dia + " - enero - "+ano; break;
            case 2 : fe = dia + " - febrero - "+ano; break;
            case 3 : fe = dia + " - marzo - "+ano; break;
            case 4 : fe = dia + " - abril - "+ano; break;
            case 5 : fe = dia + " - mayo - "+ano; break;
            case 6 : fe = dia + " - junio - "+ano; break;
            case 7 : fe = dia + " - julio - "+ano; break;
            case 8 : fe = dia + " - agosto - "+ano; break;
            case 9 : fe = dia + " - septiembre - "+ano; break;
            case 10 : fe = dia + " - octubre - "+ano; break;
            case 11 : fe = dia + " - noviembre - "+ano; break;
            case 12 : fe = dia + " - diciembre - "+ano; break;
            default : fe = "00 - enero - 3000"; break;
        }
        labelFecha.setText("Fecha: "+fe);
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
