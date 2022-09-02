package GUI;

import DataBase.Conexion;
import DataBase.SQLPagos;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class EditarMensualidad extends javax.swing.JDialog {

    private String cuenta, password;
    private double cantidad;
    private String recibo;
    private String fecha;
    private int num;
    private String contrato;
    private String fecIni;
    private int plazo;
    private int platot;
    
    public EditarMensualidad(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        radioEfectivo = new javax.swing.JRadioButton();
        radioBanco = new javax.swing.JRadioButton();
        labelFecha1 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        textRecibo = new javax.swing.JTextField();
        labelRecibo = new javax.swing.JLabel();
        exit2 = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        radioTransferencia = new javax.swing.JRadioButton();
        dateFecha = new datechooser.beans.DateChooserCombo();
        labelRecibo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComentario = new javax.swing.JTextArea();
        labelRecibo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pago de mensualidades");

        grupo.add(radioEfectivo);
        radioEfectivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioEfectivo.setSelected(true);
        radioEfectivo.setText("Efectivo");
        radioEfectivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioEfectivoItemStateChanged(evt);
            }
        });

        grupo.add(radioBanco);
        radioBanco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioBanco.setText("Banco");
        radioBanco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioBancoItemStateChanged(evt);
            }
        });

        labelFecha1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFecha1.setText("Cantidad pagada:");

        textCantidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textCantidadFocusLost(evt);
            }
        });
        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
            }
        });

        textRecibo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        labelRecibo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRecibo.setText("Número de guía/referencia");

        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit2.setText("Regresar");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });

        exit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinero.png"))); // NOI18N
        exit3.setText("Pagar");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });

        grupo.add(radioTransferencia);
        radioTransferencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioTransferencia.setText("Transferencia");
        radioTransferencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioTransferenciaItemStateChanged(evt);
            }
        });

        dateFecha.setFormat(1);
        dateFecha.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));

        labelRecibo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRecibo1.setText("Fecha de pago:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pago.png"))); // NOI18N

        areaComentario.setColumns(20);
        areaComentario.setRows(5);
        jScrollPane1.setViewportView(areaComentario);

        labelRecibo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRecibo2.setText("Comentario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioEfectivo)
                                .addGap(27, 27, 27)
                                .addComponent(radioBanco)
                                .addGap(42, 42, 42)
                                .addComponent(radioTransferencia))
                            .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelRecibo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(textRecibo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(labelRecibo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFecha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(labelRecibo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEfectivo)
                    .addComponent(radioBanco)
                    .addComponent(radioTransferencia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFecha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelRecibo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelRecibo1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelRecibo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit2)
                    .addComponent(exit3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        Regresar();
    }//GEN-LAST:event_exit2ActionPerformed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "¿Seguro que los datos on correctos?");
        if (op == 0) {
            Pagar();
        }
    }//GEN-LAST:event_exit3ActionPerformed

    private void radioEfectivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioEfectivoItemStateChanged
        if(radioEfectivo.isSelected()){
            labelRecibo.setVisible(false);
            textRecibo.setVisible(false);
        }
    }//GEN-LAST:event_radioEfectivoItemStateChanged

    private void radioBancoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioBancoItemStateChanged
        if(radioBanco.isSelected()){
            labelRecibo.setVisible(true);
            textRecibo.setVisible(true);
        }
    }//GEN-LAST:event_radioBancoItemStateChanged

    private void radioTransferenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioTransferenciaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTransferenciaItemStateChanged

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                && (caracter != '.')) {
            getToolkit().beep(); 
            evt.consume();
        }
        if (caracter == '.' && textCantidad.getText().contains(".")) {
            getToolkit().beep(); 
            evt.consume();
        }
    }//GEN-LAST:event_textCantidadKeyTyped

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
    private javax.swing.JTextArea areaComentario;
    private datechooser.beans.DateChooserCombo dateFecha;
    private javax.swing.JButton exit2;
    private javax.swing.JButton exit3;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFecha1;
    private javax.swing.JLabel labelRecibo;
    private javax.swing.JLabel labelRecibo1;
    private javax.swing.JLabel labelRecibo2;
    private javax.swing.JRadioButton radioBanco;
    private javax.swing.JRadioButton radioEfectivo;
    private javax.swing.JRadioButton radioTransferencia;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textRecibo;
    // End of variables declaration//GEN-END:variables
   
    private void Pagar() {
        try {
            Conexion con = new Conexion();
            SQLPagos sp = new SQLPagos();
            String sql;
            if (!textCantidad.getText().isEmpty()) {
                if (!textRecibo.getText().isEmpty()) {
                    recibo = textRecibo.getText();
                    if (radioEfectivo.isSelected()) {
                        recibo = "R-" + recibo;
                    } else if (radioBanco.isSelected()) {
                        recibo = "B-" + recibo;
                    } else {
                        recibo = "T-" + recibo;
                    }
                    fecha = getFecha();
                    Fechas();
                    if (plazo > 0) {
                        con.Conectar(cuenta, password);
                        sql = sp.CambiarPago(contrato, num, fecha, cantidad, recibo, plazo,areaComentario.getText());
                        con.Conectar(cuenta, password);
                        con.Modificar(sql);
                        con.Cerrar();
                        JOptionPane.showMessageDialog(this, "Pago guardado");
                        this.dispose();
                    }else if(plazo > platot){
                        JOptionPane.showMessageDialog(this, "La fecha excede del plazo establecido por el contrato");
                    }
                    else if(plazo <= 0){
                        JOptionPane.showMessageDialog(this, "La fecha no puede ser anterior a la fecha del primer plazo");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingresa el número de guia o recibo");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa la cantidad pagada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Pagar\n-- "+e.getMessage());
        }
    }

    private void Fechas(){
        try {
            Calendar inicio = new GregorianCalendar();
            Calendar fin = new GregorianCalendar();
            inicio.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(fecIni));
            fin.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(fecha));
            int difA = fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
            int difM = difA * 12 + fin.get(Calendar.MONTH) - inicio.get(Calendar.MONTH);
            System.out.println(difM);
            this.plazo = difM +1;
        } catch(Exception ex) {
            System.out.println("Fecha");
        }
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
    
    void setDatos(String contrato, int num, int platot) {
        Conexion con = new Conexion();
        SQLPagos sp = new SQLPagos();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        this.num = num;
        this.contrato = contrato; //# contrato
        this.platot = platot; //Plazo total;
        String fechaPago = "";
        double abonoPago = 0.0;
        String guiaPago = "";
        try{
            String sql = sp.BuscarPago(contrato,num);
            con.Conectar(cuenta, password);
            ResultSet res = con.Consulta(sql);
            if(res.next()){
                fechaPago = res.getString(4);
                abonoPago = res.getDouble(5);
                guiaPago = res.getString(6);
                areaComentario.setText(res.getString(8));
            }
            con.Cerrar();
            textCantidad.setText(nf.format(abonoPago));
            Calendar date = new GregorianCalendar();
            date.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(fechaPago));
            dateFecha.setSelectedDate(date);
            textRecibo.setText(guiaPago.substring(2));
            if(guiaPago.charAt(0)=='R'){
                radioEfectivo.setSelected(true);
                radioBanco.setSelected(false);
                radioTransferencia.setSelected(false);
            }    
            else if(guiaPago.charAt(0)=='B'){
                radioEfectivo.setSelected(false);
                radioBanco.setSelected(true);
                radioTransferencia.setSelected(false);
            }  
            else{
                radioEfectivo.setSelected(false);
                radioBanco.setSelected(false);
                radioTransferencia.setSelected(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos\n -- "+e.getMessage());
        }
        
    }

    void setFechaInicio(String toString) {
        this.fecIni = toString;
    }
}
