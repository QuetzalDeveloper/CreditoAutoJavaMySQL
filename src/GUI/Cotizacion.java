package GUI;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import Files.CAT;
import Files.CotizacionPDF;
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
import javax.swing.table.DefaultTableModel;

public class Cotizacion extends javax.swing.JFrame {
    
    private String marA, nomA, nomC, nomE, idE, telC,date;
    private int idC, idA, mA;
    private double tasi, iva, com, sva, pA, eA;
    private double financiamiento, comision, seguro, mensualidad=0; 
    private double taci, tmsi, tmci;
    private double sumIntereses, sumIvat, sumCapital, sumMensualidad;    
    private double[][] t = new double[80][6];;
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private boolean comZero;
    private String cuenta;
    private String password;
    private double cat;
    
    public Cotizacion() {
        initComponents();
        LookAndFeel();
    } 

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        botonImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelEnganche = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelFinanciamiento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelMensualidades = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelPlazo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelComision = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelSeguro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelTasa = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textCAT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cotización");

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# PAGO", "PAGO MENSUAL", "CAPITAL", "INTERESES", "IVA", "SALDO INSOLUTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(20);
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        botonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Precio del auto:");

        labelPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Enganche:");

        labelEnganche.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Financiamiento:");

        labelFinanciamiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Mensualidades:");

        labelMensualidades.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Plazo:");

        labelPlazo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Comisión:");

        labelComision.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Seguro de vida anual:");

        labelSeguro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Tasa ordinaria fija sin IVA:");

        labelTasa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("CAT:");

        textCAT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCATKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excel.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelEnganche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelFinanciamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelMensualidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPlazo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelComision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelSeguro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEnganche, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFinanciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelComision, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textCAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Salir();
    }//GEN-LAST:event_exitActionPerformed

    private void botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirActionPerformed
        botonImprimir.setEnabled(false);
        Imprimir();
        botonImprimir.setEnabled(true);
    }//GEN-LAST:event_botonImprimirActionPerformed

    private void tablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyTyped
        Eventos(evt);
    }//GEN-LAST:event_tablaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ObtenerCAT();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textCATKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCATKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                && (caracter != '.')) {
            getToolkit().beep(); 
            evt.consume();
        }
        if (caracter == '.' && textCAT.getText().contains(".")) {
            getToolkit().beep(); 
            evt.consume();
        }
    }//GEN-LAST:event_textCATKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonImprimir;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelComision;
    private javax.swing.JLabel labelEnganche;
    private javax.swing.JLabel labelFinanciamiento;
    private javax.swing.JLabel labelMensualidades;
    private javax.swing.JLabel labelPlazo;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelSeguro;
    private javax.swing.JLabel labelTasa;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textCAT;
    // End of variables declaration//GEN-END:variables

    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Imprimir();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Salir();
        }
    }
    
    private void Imprimir() {
        if (!textCAT.getText().isEmpty()) {
            cat = Double.parseDouble(textCAT.getText());
            int op = JOptionPane.showConfirmDialog(this, "¿Seguro deseas imprimir la cotización?", "Impresión de cotización", JOptionPane.YES_NO_CANCEL_OPTION);
            if (op == 0) {
                try {
                    CotizacionPDF cp = new CotizacionPDF();
                    Conexion con = new Conexion();
                    SQLCotizacion sc = new SQLCotizacion();
                    String sql = sc.ObtenerUltimaCotizacion();
                    String fecha = GetFechaActual();
                    int folio = 0;
                    con.Conectar(cuenta, password);
                    ResultSet res = con.Consulta(sql);
                    System.out.println("1");
                    if (res.next()) {
                        folio = res.getInt(1) + 1;
                    } else {
                        folio = 1;
                    }
                    con.Cerrar();

                    System.out.println("2");
                    sql = sc.GuardarCotizacion(folio, idA, pA, eA, financiamiento, mensualidad, mA, comision, seguro, tasi, idC, date, idE, fecha,cat);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    System.out.println("4");
                    cp.setDatos(pA, eA, financiamiento, mensualidad, mA, comision, seguro, tasi, nomC, marA, nomA, fecha, telC, nomE);
                    cp.setTabla(t, sumIntereses, sumIvat, sumCapital, sumMensualidad);
                    System.out.println("Folio = " + folio);
                    cp.Cotizacion(folio);
                    this.dispose();
                } catch (Exception e) {
                    System.out.println("Imprimir - " + e.getMessage());
                }
            } 
        } else {
            JOptionPane.showMessageDialog(this,"Ingresa el valor del CAT");
        }
    }
    
     public String GetFechaActual(){
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
        date = ano+"-"+m+"-"+d;
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
        return fe;
    }
    
    public void LlenarTabla(){
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        int ct = 0;
        Object fila[] = {null,null,null,null,null,null};
        ntm.addRow(fila);
        double intereses, ivat, capital, insoluto;    
        tabla.setValueAt("1", ct, 0);  //Numero de pago        
        tabla.setValueAt(nf.format(mensualidad), ct, 1);  //Pago mensual
        intereses = financiamiento*(tmsi/100);
        sumIntereses = intereses;        
        tabla.setValueAt(nf.format(intereses), ct, 3);    //Intereses
        ivat = intereses*0.16;
        sumIvat = ivat;        
        tabla.setValueAt(nf.format(ivat), ct, 4);    //IVA
        capital = mensualidad-intereses-ivat;
        sumCapital = capital;        
        tabla.setValueAt(nf.format(capital), ct, 2);    //Capital    
        insoluto = financiamiento-capital;        
        tabla.setValueAt(nf.format(insoluto), ct, 5);    //Saldo Insoluto
        t[ct][0] = 1.0;
        t[ct][1]= mensualidad;
        t[ct][2]=capital;
        t[ct][3]= intereses;
        t[ct][4]= ivat;
        t[ct][5] = insoluto;
        ct++;
        for (int i = 2; i <= mA; i++) {
            ntm.addRow(fila);
            tabla.setValueAt(i, ct, 0);  //Numero de pago
            tabla.setValueAt(nf.format(mensualidad), ct, 1);  //Pago mensual
            intereses = insoluto * (tmsi / 100);
            sumIntereses = sumIntereses+intereses;
            tabla.setValueAt(nf.format(intereses), ct, 3);    //Intereses
            ivat = intereses * 0.16;
            sumIvat = sumIvat + ivat;
            tabla.setValueAt(nf.format(ivat), ct, 4);    //IVA
            capital = mensualidad - intereses - ivat;
            sumCapital = sumCapital+capital;
            tabla.setValueAt(nf.format(capital), ct, 2);    //Capital    
            insoluto = insoluto - capital;
            tabla.setValueAt(nf.format(insoluto), ct, 5);    //Saldo Insoluto
            t[ct][0] = i;
            t[ct][1] = mensualidad;
            t[ct][2] = capital;
            t[ct][3] = intereses;
            t[ct][4] = ivat;
            t[ct][5] = insoluto;
            ct++;
        }
        tabla.setValueAt(nf.format(0.0), (ct - 1), 5);
        ntm.addRow(fila);
        ntm.addRow(fila);
        ct++;
        sumMensualidad = sumIntereses+sumIvat+sumCapital;
        tabla.setValueAt(nf.format(sumMensualidad), ct, 1);  //Pago mensual
        tabla.setValueAt(nf.format(sumIntereses), ct, 3);    //Intereses
        tabla.setValueAt(nf.format(sumIvat), ct, 4);    //IVA
        tabla.setValueAt(nf.format(sumCapital), ct, 2);    //Capital   
    }
    public void LlenarLateral(){  
        labelPrecio.setText(nf.format(pA));      
        labelEnganche.setText(nf.format(eA));
        financiamiento = pA - eA;
        labelFinanciamiento.setText(nf.format(financiamiento));
        ObtenerMensualidad();
        labelMensualidades.setText(nf.format(mensualidad));
        labelPlazo.setText(mA+"");
        if (!comZero) {
            comision = (pA * com) / 100;
            labelComision.setText(nf.format(comision));
        }
        else{
            comision = 0;
            labelComision.setText(nf.format(0.0));
        }
        seguro = (pA * sva)/100;
        labelSeguro.setText(nf.format(seguro));
        labelTasa.setText(tasi+"%");
        LlenarTabla();
    }
    
    public void VerificarComision(){
        Conexion con = new Conexion();
        SQLCotizacion sc = new SQLCotizacion();
        ResultSet res;
        int valor=0;
        try{
        String sql = sc.ComisionCero();
        con.Conectar(cuenta, password);
        res = con.Consulta(sql);
        if(res.next()){
            valor = res.getInt(3);
        }
        if(valor == 0){
            comZero = true;
        }
        else{
            comZero = false;
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "VerificarComision -- "+e.getMessage());
        }
    }
    
    private void ObtenerMensualidad(){
        double x, y;
        taci = tasi*((iva/100)+1);  
        tmsi = tasi/12;
        tmci = taci /12;
        y = tmci/100;
        x= 1 + y;
        x = Math.pow(x, mA);
        mensualidad = ((y * x)*financiamiento)/(x-1);
        System.out.println(mA+"-"+taci+"-"+tmsi+"-"+tmci+"-"+mensualidad);
    }
    
    public void RecibirPorcentajes(double tasi, double iva, double com, double sva){
        this.tasi = tasi; // Tasa ordinaria anual fija sin iva
        this.iva = iva; // IVA
        this.com = com; // Comision
        this.sva = sva; // Seguro de vida anual
        System.out.println("Variables= "+tasi+"/"+iva+"/"+com+"/"+sva);
    }
    
    public void RecibirAuto(int idA, String marA, String nomA, double pA, double eA, int mA){
        this.idA = idA; //ID 
        this.marA = marA; // Marca
        this.nomA = nomA; // Nombre
        this.pA = pA; // Precio
        this.eA = eA; // Enganche
        this.mA = mA; // Plazo
        System.out.println("Auto: "+idA+"/"+marA+"/"+nomA+"/"+pA+"/"+eA+"/"+mA);
    }
    
    public void RecibirEmpleado(String idE, String nomE){
        this.idE = idE; //ID 
        this.nomE = nomE; // Nombre
        System.out.println("Empleado: "+idE+"/"+nomE);
    }
    
    public void RecibirCliente(int idC, String nomC, String telC){
        this.idC = idC; //ID 
        this.nomC = nomC; // Nombre
        this.telC = telC; //Telefono
        System.out.println("Empleado: "+idC+"/"+nomC);
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
    
    void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }

    private void ObtenerCAT() {
        CAT f = new CAT(comision-financiamiento,mA,mensualidad);
        f.AbrirArchivo();
    }
   
}
