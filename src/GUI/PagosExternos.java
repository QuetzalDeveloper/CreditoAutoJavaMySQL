package GUI;

import DataBase.Conexion;
import DataBase.SQLPagos;
import Files.EstadoCuenta;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.ParseException;
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
import javax.swing.table.DefaultTableModel;

public class PagosExternos extends javax.swing.JDialog {

    private String cuenta, password;
    private String contrato;
    private int conta = 0;
    private double mensualidad;
    private boolean estado = false;
    private double total;
    private int plazo, maxp = 0;
    private String inicio;
    private double adeudo;
    private int acceso;
    private int plaac, plante;
    int estatus;
    private double resta;
    private String fecha;
    private int numMax;
    private double monto;

    public PagosExternos(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        textContrato = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        exit1 = new javax.swing.JButton();
        exit2 = new javax.swing.JButton();
        botonPagar = new javax.swing.JButton();
        labelEstatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelMensualidad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelPlazo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelInicio = new javax.swing.JLabel();
        botonCambio = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonImprimir = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelPagado = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Contrato:");

        textContrato.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textContratoKeyPressed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg", "No.", "Fecha", "Abono", "Guia", "Total a pagar", "Adeudo", "Plazo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(22);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(0);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabla.getColumnModel().getColumn(0).setMaxWidth(1);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(15);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(7).setMaxWidth(50);
        }

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit2.setText("Regresar");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });

        botonPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinero.png"))); // NOI18N
        botonPagar.setText("Pagar");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });

        labelEstatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Monto total:");

        labelTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTotal.setText("$ 0.0");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Mensualidad:");

        labelMensualidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMensualidad.setText("$ 0.0");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Plazo");

        labelPlazo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPlazo.setText("0");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Inicio de pago:");

        labelInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelInicio.setText("0");

        botonCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cambio.png"))); // NOI18N
        botonCambio.setText("Finalizar");
        botonCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioActionPerformed(evt);
            }
        });

        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ajustesSmall.png"))); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirActionPerformed(evt);
            }
        });

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminarSmall.png"))); // NOI18N
        botonEliminar.setText("Eliminar pago");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Pagado:");

        labelPagado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPagado.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCambio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(labelMensualidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPagar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonImprimir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPlazo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPagado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMensualidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPagado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPlazo)
                        .addGap(4, 4, 4)
                        .addComponent(botonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit2))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        Consultar();
    }//GEN-LAST:event_exit1ActionPerformed

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        Regresar();
    }//GEN-LAST:event_exit2ActionPerformed

    private void textContratoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContratoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textContratoKeyPressed

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        AbrirPagarMensualidad();
    }//GEN-LAST:event_botonPagarActionPerformed

    private void botonCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioActionPerformed
        TerminarCuenta();
    }//GEN-LAST:event_botonCambioActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        AbrirEditarMensualidad();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirActionPerformed
        botonImprimir.setEnabled(false);
        ImprimirEstadoCuenta();
        botonImprimir.setEnabled(true);
    }//GEN-LAST:event_botonImprimirActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        SQLPagos sp = new SQLPagos();
        Conexion con = new Conexion();
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un pago de la tabla");
        } else {
            int op = JOptionPane.showConfirmDialog(this, "¿Seguro deseas eliminar el pago?", "Eliminar pago", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                int num = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
                String sql = sp.EliminarPago(num);
                con.Conectar(cuenta, password);
                con.Modificar(sql);
                con.Cerrar();
                Consultar();
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        if(evt.getClickCount()==2){
            SelecionarComentario();
        }
    }//GEN-LAST:event_tablaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambio;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonImprimir;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton exit1;
    private javax.swing.JButton exit2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEstatus;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelMensualidad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPagado;
    private javax.swing.JLabel labelPlazo;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textContrato;
    // End of variables declaration//GEN-END:variables

    private void SelecionarComentario(){
        Conexion con = new Conexion();
        SQLPagos sp = new SQLPagos();
        String t = new String();
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un pago de la tabla");
        } else {
            int num = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            String sql = sp.ComentarioPago(num);
            con.Conectar(cuenta, password);
            try {
                ResultSet res = con.Consulta(sql);
                if (res.next()) {
                    t = res.getString(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en el comentario", "Error", JOptionPane.ERROR_MESSAGE);
            }
            con.Cerrar();
            if(!t.isEmpty()){
                JOptionPane.showMessageDialog(this, t, "Comentario", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Sin comentarios", "Comentario", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    public void Consultar(){
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.getDefault());
        Conexion con = new Conexion();
        SQLPagos sp = new SQLPagos();
        String sql;
        ResultSet res;
        try{
            if (!textContrato.getText().isEmpty()) {
                contrato = textContrato.getText();
                sql = sp.ComprobarContratoExterno(contrato);
                con.Conectar(cuenta, password);
                res = con.Consulta(sql);             
                if (res.next()) {
                    labelNombre.setText(res.getString(2) + " " + res.getString(3) + " " + res.getString(4));                  
                    this.total = res.getDouble(6);
                    this.mensualidad = res.getDouble(7);
                    this.plazo = res.getInt(8);
                    this.inicio = res.getString(9);
                    this.monto = total;
                    labelTotal.setText(formato.format(total));
                    labelMensualidad.setText(formato.format(mensualidad));
                    labelPlazo.setText(plazo+"");
                    labelInicio.setText(inicio);
                } else {
                    estado = false;
                    JOptionPane.showMessageDialog(this, "El contrato no existe en el sistema");
                }
                con.Cerrar();
                sql = sp.ObtenerTodosPagos(contrato);
                VaciarTabla();
                LlenarTabla(sql);
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa el número de contrato");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Consultar\n"+e.getMessage());
        }
    }
    
    private void VaciarTabla(){
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        for(int b = (conta-1); b>=0; b--){
            ntm.removeRow(b);
        }
        conta = 0;
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
    
    private void LlenarTabla(String sql){
        numMax = 0;
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.getDefault());
        Conexion con = new Conexion();
        ResultSet res;
        double abono = 0, adean = 0.0;
        int rp; // resta plazo actual - plazo anterior
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        Object nf[] = {null, null, null, null, null,null};
        try{
            double sumAbono = 0.0;
            plante = 1;
            adeudo = 0.0;
            resta = 0.0;
            int j = 1, numAc;
            this.fecha = inicio;
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            while (res.next()) {     
                plaac = res.getInt(7);
                rp = plaac - plante;
                while (rp > 1) {
                    if (plaac != 1 && conta == 0) { //Caso que no se page en el plazo 1
                        j = 0;
                        rp++;
                    }
                    ntm.addRow(nf);
                    adeudo = adeudo + mensualidad;
                    tabla.setValueAt(-1, conta, 0); //Registro
                    tabla.setValueAt("NP", conta, 1);  //Numero de pago
                    tabla.setValueAt(ObtenerMes(fecha,j), conta, 2); //Fecha
                    tabla.setValueAt("0.0", conta, 3); //Abono
                    tabla.setValueAt("NP", conta, 4); //Guia
                    tabla.setValueAt(formato.format(total), conta, 5); //Total 
                    tabla.setValueAt(plaac - (rp - 1), conta, 7); //plazo 
                    tabla.setValueAt(formato.format(adeudo), conta, 6); //adeudo 
                    conta++;
                    rp--;
                    j++;
                }
                if (rp <= 1) {
                    ntm.addRow(nf);
                    tabla.setValueAt(res.getInt(1), conta, 0); //Registro
                    numAc = res.getInt(3);
                    if(numAc > numMax){
                        numMax = numAc;
                    }
                    tabla.setValueAt(numAc, conta, 1);  //Numero de pago
                    fecha = res.getString(4);
                    tabla.setValueAt(FechaLetras(fecha), conta, 2); //Fecha
                    abono = res.getDouble(5);
                    tabla.setValueAt(formato.format(abono), conta, 3); //Abono
                    tabla.setValueAt(res.getString(6), conta, 4); //Guia
                    total = total - abono;
                    resta = mensualidad - abono;
                    tabla.setValueAt(formato.format(total), conta, 5); //Total 
                    tabla.setValueAt(plaac, conta, 7); //plazo 

                    if (rp == 0) {
                        sumAbono = sumAbono + abono;
                        adeudo = (mensualidad - sumAbono) + adean;
                        tabla.setValueAt(formato.format(adeudo), conta, 6); //adeudo 
                    } else {
                        if (rp == 1) {
                            sumAbono = abono;
                            adean = adeudo;
                            adeudo = (mensualidad - abono) + adeudo;
                            tabla.setValueAt(formato.format(adeudo), conta, 6); //adeudo 
                        }
                        plante = plaac;

                    }
                    conta++;
                    
                }
            }
            labelPagado.setText(formato.format(sumAbono));
            con.Cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error02 -  " + e.getMessage());
        }
    }
    
    private void Regresar(){
        Conexion con = new Conexion();
        SQLPagos sp = new SQLPagos();
        String sql = sp.CambiarCubiertoPendienteExterno(contrato,total,adeudo);
        con.Conectar(cuenta, password);
        con.Modificar(sql);
        con.Cerrar();
        this.dispose();
    }
    
    private void ImprimirEstadoCuenta(){
        EstadoCuenta ec = new EstadoCuenta();
        String [][] datos = new String [tabla.getRowCount()][7];
        for(int i = 0; i < tabla.getRowCount(); i++){
            datos[i][0] = tabla.getValueAt(i, 1).toString();
            datos[i][1] = tabla.getValueAt(i, 2).toString();
            datos[i][2] = tabla.getValueAt(i, 3).toString();
            datos[i][3] = tabla.getValueAt(i, 4).toString();
            datos[i][4] = tabla.getValueAt(i, 5).toString();
            datos[i][5] = tabla.getValueAt(i, 6).toString();
            datos[i][6] = tabla.getValueAt(i, 7).toString();
        }
        String nombre = labelNombre.getText();
        ec.setDatos(contrato,nombre, datos, total, mensualidad, monto);
        ec.CrearEstado();
    }
    
    private void AbrirEditarMensualidad(){
        EditarMensualidad em = new EditarMensualidad(this, true);
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un pago de la tabla");
        } else {
            int num = Integer.parseInt(tabla.getValueAt(fila, 1).toString());
            em.setUsuario(cuenta, password);
            em.setDatos(contrato,num,plazo);
            em.setFechaInicio(inicio);
            em.setLocationRelativeTo(null);
            em.setVisible(true);
            Consultar();
        }
    }
    
    private boolean VerificarFecha() {
        boolean edo = false;
        try {
            Calendar inicio = new GregorianCalendar();
            Calendar hoy = new GregorianCalendar();
            inicio.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(this.inicio));
            inicio.add(Calendar.MONTH, plazo + 1);
            if (hoy.get(Calendar.MONTH) > inicio.get(Calendar.MONTH) && hoy.get(Calendar.YEAR) > inicio.get(Calendar.YEAR)) {
                edo = false;
            }
            else{
                edo =  true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verificar fechas\n--" + e.getMessage());
        }
        return edo;
    }
    
    private void AbrirPagarMensualidad(){
        if (estado) {
            if (VerificarFecha()) {
                PagarMensualidad pm = new PagarMensualidad(this, true);
                pm.setUsuario(cuenta, password);
                pm.setDatos(contrato,numMax + 1, plazo);
                pm.setFechaInicio(labelInicio.getText().toString());
                pm.setLocationRelativeTo(null);
                pm.setVisible(true);
                Consultar();
            }
            else{
                JOptionPane.showMessageDialog(this, "La fecha actual excede el plazo del contrato");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecciona un contrato válido");
        }
    }
    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Consultar();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Regresar();
        }
    }
    
    void setUsuario(String cuenta, String password,int acceso, String folio, int estado) {
        estatus = estado;
        this.cuenta = cuenta;
        this.password = password;
        this.acceso = acceso;
        textContrato.setText(folio);
        if (estatus == 0) {
            this.estado = true;
            labelEstatus.setText("ACTIVO");
            labelEstatus.setForeground(Color.GREEN);
            botonCambio.setText("Finalizar");
        } else if (estatus == 1) {
            this.estado = false;
            labelEstatus.setText("TERMINADO");
            labelEstatus.setForeground(Color.RED);
            botonCambio.setText("Activar");
        }
        if(acceso == 0){
            botonPagar.setVisible(false);
            botonCambio.setVisible(false);
            botonEditar.setVisible(false);
            botonEliminar.setVisible(false);
        }
        else{
            botonPagar.setVisible(true);
            botonCambio.setVisible(true);
            botonEditar.setVisible(true);
            botonEliminar.setVisible(true);
        }
    }
    
    private void TerminarCuenta() {
        Conexion con = new Conexion();
        SQLPagos sp = new SQLPagos();
        String sql;
        if (estatus == 0) {
            sql = sp.CambiarEstatusCuentaExterna(contrato, 1);
            labelEstatus.setText("FINALIZADO");
            labelEstatus.setForeground(Color.RED);
            botonCambio.setText("Activar");
        }
        else{
            sql = sp.CambiarEstatusCuentaExterna(contrato, 0);
            labelEstatus.setText("ACTIVO");
            labelEstatus.setForeground(Color.GREEN);
            botonCambio.setText("Finalizar");
        }
        con.Conectar(cuenta, password);
        con.Modificar(sql);
        con.Cerrar();
        Consultar();
    }

    private String ObtenerMes(String fecha, int i) throws ParseException{
        String letra =  "";
        Calendar inicio = new GregorianCalendar();
        inicio.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(fecha));
        inicio.add(Calendar.MONTH, i);
        int m = inicio.get(Calendar.MONTH)+1;
        int a = inicio.get(Calendar.YEAR);
        switch(m){
            case 1: letra = "ENERO "+a; break;
            case 2: letra = "FEBRERO "+a; break;
            case 3: letra = "MARZO "+a; break;
            case 4: letra = "ABRIL "+a; break;
            case 5: letra = "MAYO "+a; break;
            case 6: letra = "JUNIO "+a; break;
            case 7: letra = "JULIO "+a; break;
            case 8: letra = "AGOSTO "+a; break;
            case 9: letra = "SEPTIEMBRE "+a; break;
            case 10: letra = "OCTUBRE "+a; break;
            case 11: letra = "NOVIEMBRE "+a; break;
            case 12: letra = "DICIEMBRE "+a; break;
            default : letra ="? "+a; break;
        }
       this.fecha = fecha;
        return letra;
    }

    private String FechaLetras(String fe){
        int mes = Integer.parseInt(fe.substring(5, 7));
        String date;
        switch(mes){
            case 1: date = fe.substring(8,10)+" de enero de "+fe.substring(0,4); break;
            case 2: date = fe.substring(8,10)+" de febrero de "+fe.substring(0,4); break;
            case 3: date = fe.substring(8,10)+" de marzo de "+fe.substring(0,4); break;
            case 4: date = fe.substring(8,10)+" de abril de "+fe.substring(0,4); break;
            case 5: date = fe.substring(8,10)+" de mayo de "+fe.substring(0,4); break;
            case 6: date = fe.substring(8,10)+" de junio de "+fe.substring(0,4); break;
            case 7: date = fe.substring(8,10)+" de julio de "+fe.substring(0,4); break;
            case 8: date = fe.substring(8,10)+" de agosto de "+fe.substring(0,4); break;
            case 9: date = fe.substring(8,10)+" de septiembre de "+fe.substring(0,4); break;
            case 10: date = fe.substring(8,10)+" de octubre de "+fe.substring(0,4); break;
            case 11: date = fe.substring(8,10)+" de noviembre de "+fe.substring(0,4); break;
            case 12: date = fe.substring(8,10)+" de diciembre de "+fe.substring(0,4); break;
            default : date ="? "; break;
        }
        return date;
    }
}
