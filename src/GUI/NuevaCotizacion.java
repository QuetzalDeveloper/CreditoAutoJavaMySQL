package GUI;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
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

public class NuevaCotizacion extends javax.swing.JFrame {

    private String date = null, marca, tipoAuto;
    private String idEmpleado, nomEmpleado;
    private String nomCliente, telCliente;
    private String texto="";
    private int idCliente = 0;
    private int idAuto = 0;
    private double as = 0,b = 0, c = 0, d = 0,numero=0, numEng = 0;
    double[] a =  new double[7];
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private String cuenta;
    private String password;
    
    public NuevaCotizacion() {
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
        exit2 = new javax.swing.JButton();

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

        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/limpiarSmall.png"))); // NOI18N
        exit2.setText("Limpiar");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textEnganche, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelFecha)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(textEnganche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        Limpiar();
    }//GEN-LAST:event_exit2ActionPerformed

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
    private javax.swing.JButton exit2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelTasa;
    private javax.swing.JTextField textAuto;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textEnganche;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables

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
            as = a[0];
            labelTasa.setText(as+"%");
        }catch(Exception e){
            
        }
    }
    
    private void Limpiar(){
        textCliente.setText(null);
        textAuto.setText(null);
        textPrecio.setText(null);
        textEnganche.setText(null);
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
            Cotizacion co = new Cotizacion();
            double precioAuto = numero;
            double engancheAuto = numEng;
            int plazoAuto = Integer.parseInt(comboPlazo.getSelectedItem().toString());
            co.setUsuario(cuenta, password);
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
        AutoParcial ap = new AutoParcial(this, true);
        ap.setUsuario(cuenta, password);
        ap.setLocationRelativeTo(null);
        ap.setVisible(true);
        if(ap.control){
            idAuto = ap.id;
            marca = ap.marca;
            tipoAuto = ap.tipo+" "+ap.transmision+" "+ap.ano;
            textAuto.setText(tipoAuto);
        }   
    }
    
    private void StatusCliente(){
        int a = JOptionPane.showConfirmDialog(this, "¿El cliente ya ha hecho contrato o cotizado con la empresa?","Selecciona una opción",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a == 0){ //si
           ElegirCliente ec = new ElegirCliente(this, true);
           ec.setUsuario(cuenta, password);
           ec.setLocationRelativeTo(null);
           ec.Consulta();
           ec.setVisible(true);     
           if(ec.control) {
                idCliente = ec.id;
                nomCliente = ec.paterno + " " + ec.materno + " " + ec.nombre;
                telCliente = ec.telefono;
                textCliente.setText(nomCliente);
                //labelId.setText(idCliente+"");
            }
        }
        else if (a == 1){
            ClienteParcial cp = new ClienteParcial(this, true);
            cp.setUsuario(cuenta, password);
            cp.setLocationRelativeTo(null);
            cp.setVisible(true); 
            if(cp.id > 0){
                idCliente = cp.id;
                nomCliente =cp.paterno+" "+cp.materno+" "+cp.nombre;
                telCliente = cp.telefono;
                textCliente.setText(nomCliente);
                //labelId.setText(idCliente+"");
            }
            else{
                textCliente.setText(null);
            }
        }
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

    void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }
    
}
