package GUI;

import DataBase.Conexion;
import DataBase.SQLPagos;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Cuentas extends javax.swing.JDialog {

    private String cuenta;
    private String password;
    private int conta = 0;
    private int acceso;

    public Cuentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        Activos = new javax.swing.JButton();
        exit2 = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        Activos1 = new javax.swing.JButton();
        exit4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textContrato = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Contrato", "Total", "Mensualidad", "Plazo", "Inicio", "Fin", "A pagar", "Adeudo", "Estatus", "edo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(0).setMaxWidth(90);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(3).setMinWidth(30);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(3).setMaxWidth(70);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(9).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Activos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        Activos.setText("Activos");
        Activos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivosActionPerformed(evt);
            }
        });

        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinero.png"))); // NOI18N
        exit2.setText("Abrir");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });

        exit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        exit3.setText("Todo");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });

        Activos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        Activos1.setText("Finalizado");
        Activos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Activos1ActionPerformed(evt);
            }
        });

        exit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarSmall.png"))); // NOI18N
        exit4.setText("Buscar");
        exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Contrato:");

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminarSmall.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exit4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 528, Short.MAX_VALUE)
                                .addComponent(exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Activos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Activos1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Activos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Activos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        ElementoTabla(evt);
    }//GEN-LAST:event_tablaMousePressed

    private void ActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivosActionPerformed
        ElegirConsulta(1);
    }//GEN-LAST:event_ActivosActionPerformed

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        SeleccionarCuenta();
    }//GEN-LAST:event_exit2ActionPerformed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed
        ElegirConsulta(0);
    }//GEN-LAST:event_exit3ActionPerformed

    private void Activos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Activos1ActionPerformed
        ElegirConsulta(2);
    }//GEN-LAST:event_Activos1ActionPerformed

    private void exit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit4ActionPerformed
        ElegirConsulta(3);
    }//GEN-LAST:event_exit4ActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres eliminar la cuenta?\nSe eliminará el contrato, cotización, auto y pagos correspondientes al numero del contrato", "Eliminar contrato", JOptionPane.WARNING_MESSAGE);
        if(op == 0){
            EliminarContrato();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Activos;
    private javax.swing.JButton Activos1;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit2;
    private javax.swing.JButton exit3;
    private javax.swing.JButton exit4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textContrato;
    // End of variables declaration//GEN-END:variables

    private void EliminarContrato(){
        Conexion con = new Conexion();
        SQLPagos sp = new SQLPagos();
        int fila = tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Selecciona una cuenta de la tabla");
        }
        else{           
            String folio = tabla.getValueAt(fila, 0).toString();
            int estado = Integer.parseInt(tabla.getValueAt(fila, 9).toString());
            if(estado == 0){
                JOptionPane.showMessageDialog(this, "Solo se pueden eliminar contratos finalizados", "Erro al eliminar", JOptionPane.ERROR_MESSAGE);
            } else {
                int cotizacion=0, auto=0;
                String sql = sp.ObtenerIdsContrato(folio);
                con.Conectar(cuenta, password);
                try {
                    ResultSet res = con.Consulta(sql);
                    if (res.next()) {
                        cotizacion = res.getInt(2);
                        auto = res.getInt(3);
                    }
                    con.Cerrar();
                    sql = sp.EliminarCotizacion(cotizacion);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    sql = sp.EliminarAuto(auto);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    sql = sp.EliminarPagoContrato(folio);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    sql = sp.EliminarCuentaContrato(folio);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    sql = sp.EliminarContrato(folio);
                    con.Conectar(cuenta, password);
                    con.Modificar(sql);
                    con.Cerrar();
                    JOptionPane.showMessageDialog(this, "Contrato eliminado", "Eliminar contrato", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar\n-- " + e.getMessage(), "Error al eliminar", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public void ElegirConsulta(int i){
        SQLPagos sp = new SQLPagos();
        String sql;
        if(i == 0){ //ConsultarTodo
            sql = sp.TodasCuentas();
        }        
        else if(i == 1){ //Consultar activos
            sql = sp.CuentasActivas();
        }
        else if (i == 3) {
            if (textContrato.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresa el numero de contrato", "Pagos", JOptionPane.ERROR_MESSAGE);
                sql = sp.TodasCuentas();
            } else {
                sql = sp.CuentaContrato(textContrato.getText());
            }
        } else {   //Consultar finalizados
            sql = sp.CuentasFinalizadas();
        }
        Consultar(sql);
    }
    
    private void SeleccionarCuenta(){
        ContratoPagos cp = new ContratoPagos(this, true);
        int fila = tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Selecciona una cuenta de la tabla");
        }
        else{
            String folio = tabla.getValueAt(fila, 0).toString();
            int estado = Integer.parseInt(tabla.getValueAt(fila, 9).toString());
            cp.setUsuario(cuenta, password,acceso,folio, estado);
            cp.Consultar();
            cp.setLocationRelativeTo(null);
            cp.setVisible(true);
            ElegirConsulta(1);
        }
    }
    
    private void ElementoTabla(MouseEvent evt){
        if(evt.getClickCount() == 2){
            SeleccionarCuenta();
        }
    }
    
    private void VaciarTabla(){
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        for(int b = (conta-1); b>=0; b--){
            ntm.removeRow(b);
        }
        conta = 0;
    }
    
    private void Consultar(String sql){
        VaciarTabla();
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.getDefault());
         DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        Object nf[] = {null, null, null, null, null,null,null,null,null, null};
        Conexion con = new Conexion();
        try{
            String fin,contrato;
            int es,a;
            double men, pen, tot;
            con.Conectar(cuenta, password);
            ResultSet res = con.Consulta(sql);
            while(res.next()){
                ntm.addRow(nf);
                contrato = res.getString(1);
                tabla.setValueAt(contrato, conta, 0); // Contrato
                tabla.setValueAt(format.format(res.getDouble(2)), conta, 1);  //Total
                men = res.getDouble(3);  
                tabla.setValueAt(format.format(men), conta, 2);  //Mensualidad
                tabla.setValueAt(res.getInt(4), conta, 3);  //Plazo
                tabla.setValueAt(FechaLetras(res.getString(5)), conta, 4);  //Inicio
                fin = res.getString(6);
                tabla.setValueAt(FechaLetras(fin), conta, 5);  //Fin
                tot = res.getDouble(8);
                tabla.setValueAt(format.format(tot), conta, 6);
                pen = res.getDouble(9);
                tabla.setValueAt(format.format(pen), conta, 7);
                int estado = res.getInt(10);
                tabla.setValueAt(estado, conta, 9);
                if (estado == 0) {
                    tabla.setValueAt("Activo", conta, 8);
                } else{
                    if (pen <= 0 && tot <= 0) {
                         tabla.setValueAt("Finalizado", conta, 8);
                    }
                    else if(tot > 0){
                         tabla.setValueAt("Fin con adeudo", conta, 8);
                    }
                    
                }
                if((pen/men) >= 3){
                    tabla.setValueAt("Ret. 3 meses", conta, 8);
                }
                
                conta++;
            }
            con.Cerrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Consultar todo\n--"+e.getMessage());
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
    
    void setUsuario(String cuenta, String password, int acceso) {
        this.cuenta = cuenta;
        this.password = password;
        this.acceso = acceso;
        if(acceso == 0){    //Empleado
            botonEliminar.setVisible(false);
        }
        else{
            botonEliminar.setVisible(true);
        }
        ElegirConsulta(1);
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
