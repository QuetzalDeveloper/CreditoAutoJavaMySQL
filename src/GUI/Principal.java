package GUI;

import DataBase.Conexion;
import DataBase.SQLCotizacion;
import DataBase.SQLEmpleados;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {
    
    private String nombreEmpleado;
    private String cuenta;
    private String password;
    private int acceso;

    public Principal() {
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCuenta = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuContrato = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuPagos = new javax.swing.JMenu();
        Mensualidad = new javax.swing.JMenuItem();
        itemExternos = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        menuCaja = new javax.swing.JMenu();
        menuAjustes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 700));

        exit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cerrar.png"))); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Texcoplan.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("V 1.10.04082020");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenid@ ");

        textCuenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCuenta.setText("Cuenta");

        labelNombre.setBackground(new java.awt.Color(255, 51, 153));
        labelNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelNombre.setText("Nombre");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(textCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cotizador.png"))); // NOI18N
        jMenu2.setText("Cotizador     |");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevoarchivo.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        jMenuItem3.setText("Consultar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenu1.setText("jMenu1");
        jMenu2.add(jMenu1);

        jMenuBar1.add(jMenu2);

        menuContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ContratoSmall.png"))); // NOI18N
        menuContrato.setText("Contrato      |");
        menuContrato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevoContrato30.png"))); // NOI18N
        jMenuItem5.setText("Nuevo contrato");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuContrato.add(jMenuItem5);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        jMenuItem7.setText("Consulta");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuContrato.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/factura.png"))); // NOI18N
        jMenuItem8.setText("Factura");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuContrato.add(jMenuItem8);

        jMenuBar1.add(menuContrato);

        menuPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pagos.png"))); // NOI18N
        menuPagos.setText("Pagos             |");
        menuPagos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Mensualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinero.png"))); // NOI18N
        Mensualidad.setText("Mensualidades");
        Mensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MensualidadActionPerformed(evt);
            }
        });
        menuPagos.add(Mensualidad);

        itemExternos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garantiaSmall.png"))); // NOI18N
        itemExternos.setText("Contratos externos");
        itemExternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExternosActionPerformed(evt);
            }
        });
        menuPagos.add(itemExternos);

        jMenuBar1.add(menuPagos);

        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleados.png"))); // NOI18N
        menuEmpleado.setText("Empleados    |");
        menuEmpleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmpleadoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuEmpleado);

        menuCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caja.png"))); // NOI18N
        menuCaja.setText("Caja             | ");
        menuCaja.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCajaMouseClicked(evt);
            }
        });
        menuCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCajaActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuCaja);

        menuAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ajustesSmall.png"))); // NOI18N
        menuAjustes.setText("Ajustes     |");
        menuAjustes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cotizador30.png"))); // NOI18N
        jMenuItem2.setText("Variables de cotizador");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAjustes.add(jMenuItem2);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinero.png"))); // NOI18N
        jMenuItem6.setText("Costos adicionales");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuAjustes.add(jMenuItem6);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminarSmall.png"))); // NOI18N
        jMenuItem4.setText("Eliminar cotizaciones (15 dias)");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuAjustes.add(jMenuItem4);

        jMenuBar1.add(menuAjustes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Salir();
    }//GEN-LAST:event_exitActionPerformed

    private void menuEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmpleadoMouseClicked
        Empleados emp = new Empleados(this, true);
        emp.setUsuario(cuenta, password);
        emp.setLocationRelativeTo(null);
        emp.Inicio();
        emp.setVisible(true);
    }//GEN-LAST:event_menuEmpleadoMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VariablesCotizador();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NuevoCotizador();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        BuscarCotizaciones(); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        EliminarCotizaciones15dias();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        NuevoContrato nc = new NuevoContrato(this, true);
        nc.setUsuario(cuenta, password);
        nc.setLocationRelativeTo(null);
        nc.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        AbrirCostosAdicionales();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        AbrirConsultarContrato();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        AbrirCrearFactura();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void MensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensualidadActionPerformed
        AbrirContratoPagos();
    }//GEN-LAST:event_MensualidadActionPerformed

    private void menuCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCajaActionPerformed
        AbrirCaja();
    }//GEN-LAST:event_menuCajaActionPerformed

    private void menuCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCajaMouseClicked
        AbrirCaja();
    }//GEN-LAST:event_menuCajaMouseClicked

    private void itemExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExternosActionPerformed
        AbrirContratosExternos();
    }//GEN-LAST:event_itemExternosActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Actualizacion a = new Actualizacion(this, true);
        a.ImprimirNovedades();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Mensualidad;
    private javax.swing.JButton exit;
    private javax.swing.JMenuItem itemExternos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JMenu menuAjustes;
    private javax.swing.JMenu menuCaja;
    private javax.swing.JMenu menuContrato;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuPagos;
    private javax.swing.JLabel textCuenta;
    // End of variables declaration//GEN-END:variables

    private void AbrirContratoPagos(){
        Cuentas cp = new Cuentas(this, true);
        cp.setUsuario(cuenta, password, acceso);
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }
    
    private void AbrirCrearFactura(){
        CrearFactura cf = new CrearFactura(this, true);
        cf.setUsuario(cuenta, password);
        cf.setLocationRelativeTo(null);
        cf.setVisible(true);
    }
    
    private void AbrirConsultarContrato(){
        ConsultarContrato cc = new ConsultarContrato(this, true);
        cc.setUusario(cuenta, password);
        cc.TodoConsulta();
        cc.setLocationRelativeTo(null);
        cc.setVisible(true);
    }
    
    private void AbrirCostosAdicionales(){
        CostosAdicionales ca = new CostosAdicionales(this, true);
        ca.setUsuario(cuenta, password);
        ca.LlenarCampos();
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
    }
    
    private void VariablesCotizador(){
        AjustesCotizador ac = new AjustesCotizador(this, true);
        ac.setUsuario(cuenta, password);
        ac.setLocationRelativeTo(null);
        ac.LlenarCampos();
        ac.setVisible(true);
    }
    
    private void NuevoCotizador(){
        NuevaCotizacion nc = new NuevaCotizacion();
        nc.setUsuario(cuenta, password);
        nc.setLocationRelativeTo(null);
        nc.ObtenerVariables();
        nc.GetFechaActual();
        nc.RecibirEmpleado(cuenta, nombreEmpleado);
        nc.setVisible(true);
    }
    
    private void Salir(){
        System.exit(0);
    }
    
    public void AccedioEmpleado(String cuenta, String password, int c){
        Conexion con = new Conexion();
        SQLEmpleados se = new SQLEmpleados();
        this.cuenta = cuenta;
        this.password = password;
        this.acceso = c;
        textCuenta.setText(cuenta);
        try{
            String sql = se.ConsultarEmpleado(cuenta);
            System.out.println(sql);
            ResultSet res;
            con.Conectar(cuenta,password);
            res = con.Consulta(sql);
            System.out.println("1");
            while(res.next()){
                nombreEmpleado = res.getString(2)+" "+res.getString(3)+" "+res.getString(4);
                labelNombre.setText(nombreEmpleado);
            }
            con.Cerrar();
            if(acceso == 0){ //Empleado
                menuEmpleado.setVisible(false);
                menuAjustes.setVisible(false);
                menuPagos.setVisible(true);
                menuContrato.setVisible(true);
                menuCaja.setVisible(false);
                //itemExternos.setVisible(true);
            }
            else{ //Administrador
                menuEmpleado.setVisible(true);
                menuAjustes.setVisible(true);
                menuPagos.setVisible(true);
                menuContrato.setVisible(true);
                menuCaja.setVisible(true);
               // itemExternos.setVisible(true);
            }
        }catch(Exception e){
            
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

    private void BuscarCotizaciones() {
        ConsultarCotizacion cc = new ConsultarCotizacion(this, true);
        cc.setUsuario(cuenta, password, nombreEmpleado);
        cc.setLocationRelativeTo(null);
        cc.Consulta();
        cc.setVisible(true);
    }

    private void EliminarCotizaciones15dias() {
        int op = JOptionPane.showConfirmDialog(this,"Se eliminarán las cotización con mas de 15 días de vigencia","Eliminar cotizaciones",JOptionPane.YES_NO_OPTION);
        Conexion con = new Conexion();
        String fe, m, d, sql;
        int i = 0;
        int[] a = null,f = null;
        if (op == 0) {
            try {
                SQLCotizacion sc = new SQLCotizacion(); 
                ResultSet res;
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DATE, -15);
                int ano = calendar.get(Calendar.YEAR);
                int mes = calendar.get(Calendar.MONTH) + 1;
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                if (mes < 10) {
                    m = "0" + mes;
                } else {
                    m = "" + mes;
                }
                if (dia < 10) {
                    d = "0" + dia;
                } else {
                    d = "" + dia;
                }
                fe = ano + "-" + m + "-" + d;
                System.out.println(fe);
                sql = sc.ConsultarCotizacionesAntesFecha(fe);
                con.Conectar(cuenta,password);
                res = con.Consulta(sql);
                while (res.next()) {
                    f[i] = res.getInt(1);
                    a[i] = res.getInt(2);
                    i++;
                }
                con.Cerrar();
                for(int j = 0; j < i; j++){
                    sql = sc.EliminarAuto(a[j]);
                    con.Conectar(cuenta,password);
                    con.Modificar(sql);
                    con.Cerrar();
                }
                for(int j = 0; j < i; j++){
                    sql = sc.EliminarCotizacion(f[j]);
                    con.Conectar(cuenta,password);
                    con.Modificar(sql);
                    con.Cerrar();
                    File ar = new File("cotizaciones\\"+f[j]+".pdf");
                    ar.delete();
                }
            } catch (Exception e) {
                con.Cerrar();
                JOptionPane.showMessageDialog(this, "Error eliminar - " + e.getMessage());
            }
        }
    }

    private void AbrirCaja() {
        Caja c = new Caja(this, true);
        c.setUsuario(cuenta, password);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }

    private void AbrirContratosExternos() {
        ConsultaExternos ce = new ConsultaExternos(this,true);
        ce.setUsuario(cuenta, password,acceso);
        ce.setLocationRelativeTo(null);
        ce.setVisible(true);
    }
}
