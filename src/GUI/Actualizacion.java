package GUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Actualizacion extends javax.swing.JDialog {

    public Actualizacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información de actualización");

        jLabel1.setText("Version 1.10.04082020");

        jLabel2.setText("Novedades de la version:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        area.setEditable(false);
        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jLabel3.setText("Desarrollado por: Aplicaciones Quetzal");

        jLabel4.setText("Contacto: Diego Hernandez Cote");

        jLabel5.setText("Correo: quetzal.developer@gmail.com");

        jLabel6.setText("Telefono: 5511729320");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                        .addGap(156, 156, 156))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void ImprimirNovedades(){
        String a =""
                + "V 1.10.04082020\n\n"
                + "- Se podrán hacer pagos a una cuenta aun despues de finalizar el plazo, por lo\n"
                + "     que no aumenta la deuda con mensualidades extra\n"
                + "- Los pagos fuera de plazo, son resaltados con color rosa\n"
                + "- Se corrigio un error que mostraba, en ocasiones, otro mes en los pagos no\n"
                + "     realizados por el cliente\n"
                + "- En la ventana de pagos de contrato, se corrigio un error que no sumaba\n"
                + "     correctamente el total pagado del cliente\n"
                + "- Se actualizó la interfaz de inicio de sesión\n"
                + "- Se actualizó la interfaz de la ventana principal\n"
                + "- Se aumento el tamaño de la fuente y de las filas en las ventanas de contrato\n"
                + "     y caja\n"
                + "************************************************************************************\n"
                + "V 1.9.06032019\n\n"
                + "- Se corrigio el problema al no crear cotizaciones a 60 meses\n"
                + "- Se modifico el contrato para el cambio de la tasa de interes\n"
                + "- Se dejo un espeacio mas grande al pagare para la hoja membretada\n"
                + "- Se corrigo el no poder seleccionar una cotización en la consulta\n\n\n"
                + "************************************************************************************\n"
                + "V 1.8.22022019\n\n"
                + "- Se cambio el diseño de la ventana que ajusta los valores del cotizador\n"
                + "- Al crear un pagare, se pide el número del mismo\n"
                + "- El documento de pagaré, imprime el número de pagaré que ingresa el usuario\n"
                + "- Se agregó la opción de 30 meses\n\n\n"
                + "************************************************************************************\n"
                + "V 1.7.08022019\n\n"
                + "- Se corrigio un error en la factura, donde aparecian las fechas repetidas y no\n"
                + "  la de compra\n"
                + "- Se cambio el formato de la fecha en toda la estructura de pagos (incluyendo \n"
                + "  el estado de cuenta)\n"
                + "- Se incremento el tamaño de las ventanas y el ancho de las filas en la consulta\n"
                + "  de pagos\n\n"
                + "************************************************************************************\n"
                + "V 1.6.19122018\n\n"
                + "- Se cambio el tipo de pedimento en factura, dejando que el usuario ingrese un\n"
                + "  valor alfanúmerico\n"
                + "- Se agrego la versión en la ventana de loggin, para referencias futuras\n\n\n"
                + "************************************************************************************\n"
                + "V 1.5.08122018\n\n"
                + "- Se agrego la ventana de novedades, que se activa dando clic en el numero de la\n"
                + "  version en la ventana principal\n"
                + "- En el archivo de anexo, se agregaron atributos como cabecera del documento\n"
                + "- La ventana de factura cambió:\n"
                + "     * Se realiza busqueda activa por medio del numero de serie y del nombre del\n"
                + "         cliente\n"
                + "     * Se selecciona un elemento de la tabla para adquirir información de factura\n"
                + "     * El botón 'Imprimir' abre una nueva ventana, mostrando los datos a imprimir\n"
                + "         en papel\n"
                + "- Se corrigio una falta ortográfica en el Anexo (dicembre -> diciembre)\n"
                + "";
        area.setText(a);
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
