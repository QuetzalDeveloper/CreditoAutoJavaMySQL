package GUI;

import DataBase.Conexion;
import DataBase.SQLCaja;
import Files.CajaReporteFinal;
import Files.DocCaja;
import datechooser.beans.DateChooserCombo;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Caja extends javax.swing.JDialog {

    private String cuenta;
    private String password;
    private int bandera = 0; // 1 = gastos
    private double efectivo, ingreso, gasto;
    private double tarjeta;
    private double total, iE = 0;
    private int conta = 0;

    public Caja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelEfectivo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTarjeta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dateInicio = new datechooser.beans.DateChooserCombo();
        dateFinal = new datechooser.beans.DateChooserCombo();
        boxIngreso = new javax.swing.JCheckBox();
        boxGasto = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        botonImprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        labelGasto = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelIngreso = new javax.swing.JLabel();
        boxEfectivo = new javax.swing.JCheckBox();
        boxTarjeta = new javax.swing.JCheckBox();
        botonImprimir1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caja");
        setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Fecha inicial:");

        labelTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelTotal.setText("$0.0");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Efectivo:");

        labelEfectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelEfectivo.setText("$0.0");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Tarjeta:");

        labelTarjeta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelTarjeta.setText("$0.0");

        tabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Fecha", "Categoria", "Concepto", "Recibo", "Cantidad", "Origen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(25);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(70);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(0).setMaxWidth(70);
            tabla.getColumnModel().getColumn(3).setMinWidth(250);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(3).setMaxWidth(250);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Total:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Fecha final:");

        dateInicio.setFormat(1);
        try {
            dateInicio.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }

        try {
            dateFinal.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }

        boxIngreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boxIngreso.setText("Ingresos");

        boxGasto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boxGasto.setText("Gastos");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gasto.png"))); // NOI18N
        jButton3.setText("Hacer gasto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ingreso.png"))); // NOI18N
        jButton4.setText("Hacer ingreso");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cambio.png"))); // NOI18N
        jButton5.setText("Reiniciar a ceros");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        botonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Gastos:");

        labelGasto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelGasto.setText("$0.0");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Ingresos:");

        labelIngreso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelIngreso.setText("$0.0");

        boxEfectivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boxEfectivo.setText("Efectivo");

        boxTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boxTarjeta.setText("Tarjeta");
        boxTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTarjetaActionPerformed(evt);
            }
        });

        botonImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonImprimir1.setText("Reporte final");
        botonImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimir1ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminarSmall.png"))); // NOI18N
        jButton6.setText("Eliminar movimiento");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelGasto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botonImprimir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxIngreso)
                            .addComponent(boxGasto))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxEfectivo)
                            .addComponent(boxTarjeta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotal))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxEfectivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxTarjeta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxIngreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxGasto))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelEfectivo)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTarjeta)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(453, 453, 453))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        bandera = 0;
        iE = 0;
        GenerarConsulta();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NuevoGasto ni = new NuevoGasto(this, true);
        ni.setDatos(cuenta,password,total,tarjeta,efectivo);
        ni.setLocationRelativeTo(null);
        ni.setVisible(true);
        ObtenerDatos();
        GenerarConsulta();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NuevoIngreso ni = new NuevoIngreso(this, true);
        ni.setDatos(cuenta,password,total,tarjeta,efectivo);
        ni.setLocationRelativeTo(null);
        ni.setVisible(true);
        ObtenerDatos();
        GenerarConsulta();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "¿Seguro deseas continuar?\nEsta acción no se podrá deshacer.", "Reiniciar caja", JOptionPane.WARNING_MESSAGE);
        if(op == 0){
            ReiniciarCaja();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirActionPerformed
//        botonImprimir.setEnabled(true);
        ImprimirReporte();
//        botonImprimir.setEnabled(false);
    }//GEN-LAST:event_botonImprimirActionPerformed

    private void boxTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTarjetaActionPerformed

    private void botonImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimir1ActionPerformed
        CajaReporteFinal rf = new CajaReporteFinal();
        rf.setDatos(ingreso, gasto, tarjeta, efectivo);
        rf.CrearReporte();
    }//GEN-LAST:event_botonImprimir1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EliminarMovimiento();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonImprimir;
    private javax.swing.JButton botonImprimir1;
    private javax.swing.JCheckBox boxEfectivo;
    private javax.swing.JCheckBox boxGasto;
    private javax.swing.JCheckBox boxIngreso;
    private javax.swing.JCheckBox boxTarjeta;
    private datechooser.beans.DateChooserCombo dateFinal;
    private datechooser.beans.DateChooserCombo dateInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEfectivo;
    private javax.swing.JLabel labelGasto;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelTarjeta;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void EliminarMovimiento(){
        SQLCaja sc = new SQLCaja();
        Conexion con = new Conexion();
        int categoria = -1, origen = -1;
        double cantidad = -1;
        ResultSet res;
        int fila = tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Selecciona un movimiento de la tabla","Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int op = JOptionPane.showConfirmDialog(this, "¿Seguro deseas eliminar el movimiento?");
            if(op == 0) {
                try {
                    int num = (int) tabla.getValueAt(fila, 0);
                    String sql = sc.ConsultarMovimiento(num);
                    con.Conectar(cuenta, password);
                    res = con.Consulta(sql);
                    while (res.next()) {
                        categoria = res.getInt(3);
                        cantidad = res.getDouble(6);
                        origen = res.getInt(7);
                    }
                    con.Cerrar();
                    if (categoria == 0){ //Ingreso
                        if(origen == 0){ //Efectivo
                            total = total - cantidad;
                            efectivo = efectivo - cantidad;
                            ingreso = ingreso - cantidad;
                        }                        
                        else{   //Tarjeta
                            total = total - cantidad;
                            tarjeta = tarjeta - cantidad;
                            ingreso = ingreso - cantidad;
                        }
                    }
                    else{  //Gasto
                        if(origen == 0){    //Efectivo
                            total = total + cantidad;
                            efectivo = efectivo + cantidad;
                            gasto = gasto -cantidad;
                        }
                        else{   //Tarjeta
                            total = total + cantidad;
                            tarjeta = tarjeta + cantidad;
                            gasto = gasto - cantidad;                             
                        }
                    }
                    sql = sc.GuardarTotal(total, efectivo, tarjeta);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    sql = sc.EliminarMovimiento(num);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    JOptionPane.showMessageDialog(this, "El movimiento de la caja se ha eliminado.\nLa ventana se cerrará para confirmar los cambios.", "Eliminar movimiento",JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar movimiento\n--- "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    private void ImprimirReporte(){
        DocCaja dc = new DocCaja();
        String inicio, fin;
        String[][] datos = new String[tabla.getRowCount()][7];
        if(dateInicio.getText().isEmpty()){
           inicio = "Primer dia";
        }
        else{
            inicio = getFecha(dateInicio);
        }
        if(dateFinal.getText().isEmpty()){
           fin = "Hoy" ;
        }
        else{
            fin = getFecha(dateFinal);
        }
        for(int i = 0; i<tabla.getRowCount(); i++){
            datos[i][0] = tabla.getValueAt(i, 0).toString();
            datos[i][1] = tabla.getValueAt(i, 1).toString();
            datos[i][2] = tabla.getValueAt(i, 2).toString();
            datos[i][3] = tabla.getValueAt(i, 3).toString();
            datos[i][4] = tabla.getValueAt(i, 4).toString();
            datos[i][5] = tabla.getValueAt(i, 5).toString();
            datos[i][6] = tabla.getValueAt(i, 6).toString();
        }
        dc.setDatos(total, efectivo, tarjeta, inicio, fin, datos, gasto, ingreso, bandera, iE);
        dc.CrearCaja();
    } 
    
    private void ReiniciarCaja(){
        SQLCaja sc = new SQLCaja();
        Conexion con = new Conexion();
        String sql = sc.GuardarTotal(0.0, 0.0, 0.0);
        con.Conectar(cuenta, password);
        con.Modificar(sql);
        con.Cerrar();
        sql = sc.ReiniciarGastos();
        con.Conectar(cuenta, password);
        con.Modificar(sql);
        con.Cerrar();
        this.dispose();
    }
    
    public void GenerarConsulta(){
        SQLCaja sc = new SQLCaja();
        String sql="";
        //no no no no
        if(dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && !boxGasto.isSelected()){
            sql = sc.ConsultarTodo();
        }
        //no no si si
        else if(dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && boxIngreso.isSelected() && boxGasto.isSelected()){
            sql = sc.ConsultarTodo();
        }
        //no no si no
        else if(dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && boxIngreso.isSelected() && !boxGasto.isSelected()){
            bandera = 3;
            sql = sc.TodoIngresos();
        }
        //no no no si
        else if(dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && boxGasto.isSelected()){
            bandera = 1;
            sql = sc.TodoGastos();
        }
        //si no no no
        else if(!dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && !boxGasto.isSelected()){
            String ini = getFecha(dateInicio);
            sql = sc.TodoInicio(ini);
        }
        //no si no no
        else if(dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && !boxGasto.isSelected()){
            String fin = getFecha(dateFinal);
            sql = sc.TodoFinal(fin);
        }
        //si si no no
        else if(!dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && !boxGasto.isSelected()){
            String ini = getFecha(dateInicio);
            String fin = getFecha(dateFinal);
            sql = sc.InicioFinal(ini,fin);
        }
        //si no si no
        else if(!dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && boxIngreso.isSelected() && !boxGasto.isSelected()){
            bandera = 3;
            String ini = getFecha(dateInicio);
            sql = sc.InicioIngresos(ini);
        }
        //no si si no
        else if(dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && boxIngreso.isSelected() && !boxGasto.isSelected()){
            bandera = 3;
            String fin = getFecha(dateFinal);
            sql = sc.FinalIngresos(fin);
        }
        //si si si no
        else if(!dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && boxIngreso.isSelected() && !boxGasto.isSelected()){
            bandera = 3;
            String ini = getFecha(dateInicio);
            String fin = getFecha(dateFinal);
            sql = sc.InicioFinalIngresos(ini,fin);
        }
        //si no no si
        else if(!dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && boxGasto.isSelected()){
            bandera = 1;
            String ini = getFecha(dateInicio);
            sql = sc.InicioGastos(ini);
        }
        //no si no si
        else if(dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && boxGasto.isSelected()){
            bandera = 1;
            String fin = getFecha(dateFinal);
            sql = sc.FinalGastos(fin);
        }
        //si si no si
        else if(!dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && !boxIngreso.isSelected() && boxGasto.isSelected()){
            bandera = 1;
            String ini = getFecha(dateInicio);
            String fin = getFecha(dateFinal);
            sql = sc.InicioFinalGastos(ini,fin);
        }
        //si no si si
        else if(!dateInicio.getText().isEmpty() && dateFinal.getText().isEmpty() && boxIngreso.isSelected() && boxGasto.isSelected()){
            String ini = getFecha(dateInicio);
            sql = sc.TodoInicio(ini);
        }
        //no si si si
        else if(dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && boxIngreso.isSelected() && boxGasto.isSelected()){
            String fin = getFecha(dateFinal);
            sql = sc.TodoFinal(fin);
        }
        //si si si si
        else if(!dateInicio.getText().isEmpty() && !dateFinal.getText().isEmpty() && boxIngreso.isSelected() && boxGasto.isSelected()){
            String ini = getFecha(dateInicio);
            String fin = getFecha(dateFinal);
            sql = sc.InicioFinal(ini,fin);
        }
        else{
            System.out.println("Error");
        }
        LlenarTabla(sql);
    }
    
    public void ObtenerDatos(){
        Conexion con = new Conexion();
        SQLCaja sc = new SQLCaja();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        try {
            String sql = sc.ConsultarCaja();
            con.Conectar(cuenta, password);
            ResultSet res = con.Consulta(sql);
            if (res.next()) {
                this.total = res.getDouble(1);
                this.efectivo = res.getDouble(2);
                this.tarjeta = res.getDouble(3);
            }
            con.Cerrar();
            labelTotal.setText(nf.format(total));
            labelEfectivo.setText(nf.format(efectivo));
            labelTarjeta.setText(nf.format(tarjeta));
            sql = sc.ConsultarTodo();
            LlenarTabla(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el usuario\n--- " + e.getMessage());
        }
    }
       
    public void setUsuario(String cuenta, String password){
        this.cuenta = cuenta;
        this.password = password; 
        ObtenerDatos();
    }

    private void LlenarTabla(String sql){
        Conexion con = new Conexion();
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        labelGasto.setText(null);
        labelIngreso.setText(null);
        gasto = 0;
        ingreso = 0;
        for (int i = (conta - 1); i >= 0; i--) {
            ntm.removeRow(i);
        }
        conta = 0;
        double canti = 0;
        Object fi[] = {null, null, null, null, null, null, null};
        con.Conectar(cuenta, password);
        try {
            ResultSet res = con.Consulta(sql);
            while (res.next()) {
                if(boxEfectivo.isSelected() && !boxTarjeta.isSelected()) {
                    if (res.getInt(7) == 0) {
                        ntm.addRow(fi);
                        tabla.setValueAt(res.getInt(1), conta, 0);
                        tabla.setValueAt(res.getString(2), conta, 1);
                        canti = res.getDouble(6);
                        if (res.getInt(3) == 0) {
                            ingreso = ingreso + canti;
                            tabla.setValueAt("Ingreso", conta, 2);
                        } else {
                            tabla.setValueAt("Gasto", conta, 2);
                            gasto = gasto + canti;
                        }
                        tabla.setValueAt(res.getString(4), conta, 3);
                        tabla.setValueAt(res.getString(5), conta, 4);
                        tabla.setValueAt(nf.format(canti), conta, 5);
                        tabla.setValueAt("Efectivo", conta, 6);
                        conta++;
                    }
                }
                else if(boxTarjeta.isSelected() && !boxEfectivo.isSelected()){
                    if (res.getInt(7) == 1) {
                        ntm.addRow(fi);
                        tabla.setValueAt(res.getInt(1), conta, 0);
                        tabla.setValueAt(res.getString(2), conta, 1);
                        canti = res.getDouble(6);
                        if (res.getInt(3) == 0) {
                            ingreso = ingreso + canti;
                            tabla.setValueAt("Ingreso", conta, 2);
                        } else {
                            tabla.setValueAt("Gasto", conta, 2);
                            gasto = gasto + canti;
                        }
                        tabla.setValueAt(res.getString(4), conta, 3);
                        tabla.setValueAt(res.getString(5), conta, 4);
                        tabla.setValueAt(nf.format(canti), conta, 5);
                        tabla.setValueAt("Tarjeta", conta, 6);
                        conta++;
                    }
                    bandera = 2;
                }
                else {
                    ntm.addRow(fi);
                    tabla.setValueAt(res.getInt(1), conta, 0);
                    tabla.setValueAt(res.getString(2), conta, 1);
                    canti = res.getDouble(6);
                    if (res.getInt(3) == 0) {
                        ingreso = ingreso + canti;
                        tabla.setValueAt("Ingreso", conta, 2);
                    } else {
                        tabla.setValueAt("Gasto", conta, 2);
                        gasto = gasto + canti;
                    }
                    tabla.setValueAt(res.getString(4), conta, 3);
                    tabla.setValueAt(res.getString(5), conta, 4);
                    tabla.setValueAt(nf.format(canti), conta, 5);
                    if (res.getInt(7) == 0) {
                        iE = iE + canti;
                        tabla.setValueAt("Efectivo", conta, 6);
                    } else {
                        tabla.setValueAt("Tarjeta", conta, 6);
                    }
                    conta++;
                }
                
            }
            con.Cerrar();
            labelGasto.setText(nf.format(gasto));
            labelIngreso.setText(nf.format(ingreso));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla\n--- " + e.getMessage());
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
    
}
