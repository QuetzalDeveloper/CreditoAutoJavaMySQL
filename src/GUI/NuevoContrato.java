package GUI;

import DataBase.Conexion;
import DataBase.SQLContrato;
import Files.AnexoA;
import Files.Contrato;
import Files.Pagare;
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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NuevoContrato extends javax.swing.JDialog {

    private int edad, residencia;
    private String tasi;
    private String correo,curp,civil, empresa, puesto, ingreso;
    private String ubicacion, denominacion, datos, folio, lugar, registro;
    private String cuenta;
    private String password;
    private double cat;
    private String beneficiario;
    private String contrato;
    private boolean guardado = false;
    
    public NuevoContrato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();   
    }
    
    private int idV, ano, diadepago;
    private String marca,tipo,transmision,color,serie,motor,distribuidor,uso;
    private boolean verificado = false, verAuto = false, verAval = false,verificadoCotiza;
    private int idC,cpC,cptC, plazo;
    private String patC, matC, nomC, nacC,proC,calC,colC,munC,estC,rfcC,
            caltC,coltC,muntC,esttC,telC,teltC,intC, extC,exttC, inttC;
    private int idcotizacion;
    private double precio, enganche, financiamiento, intereses, total, seguro,
            comision, factura, saldo;
    private String nombreAval, nacAval,oficioAval,telLab,domLab, rfcAval,domPar,telPar;
    private double limite;
    private int edadAval, residenciaAval;
    private String civilAval,curpAval,correoAval,empresaAval,ingresoAval,puestoAval;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFolio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCliente = new javax.swing.JTextField();
        butCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textAuto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textAval = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        labelImage = new javax.swing.JLabel();
        labelMensaje = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        labelImageCliente = new javax.swing.JLabel();
        labelMensajeCliente = new javax.swing.JLabel();
        labelImageAuto = new javax.swing.JLabel();
        labelMensajeAuto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelEnganche = new javax.swing.JLabel();
        labelFinanciamiento = new javax.swing.JLabel();
        labelIntereses = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelSeguro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tftf = new javax.swing.JLabel();
        labelComision = new javax.swing.JLabel();
        labele = new javax.swing.JLabel();
        labelFactura = new javax.swing.JLabel();
        labelc1 = new javax.swing.JLabel();
        labelTasi = new javax.swing.JLabel();
        labelc2 = new javax.swing.JLabel();
        labelCAT = new javax.swing.JLabel();
        labelImageAval = new javax.swing.JLabel();
        labelMensajeAval = new javax.swing.JLabel();
        labelAviso = new javax.swing.JLabel();
        hjvg = new javax.swing.JLabel();
        textGarantia = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        labelImageGarantia = new javax.swing.JLabel();
        labelMensajeGarantia = new javax.swing.JLabel();
        hjvg1 = new javax.swing.JLabel();
        textBeneficiario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textContrato = new javax.swing.JTextField();
        labelMensaje1 = new javax.swing.JLabel();
        labelContrato = new javax.swing.JLabel();
        botonAnexos = new javax.swing.JButton();
        botonOriginal = new javax.swing.JButton();
        botonCopia = new javax.swing.JButton();
        botonPagare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo contrato");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Folio de la cotización:");

        textFolio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textFolio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFolioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFolioFocusLost(evt);
            }
        });
        textFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFolioActionPerformed(evt);
            }
        });
        textFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFolioKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        textCliente.setEditable(false);
        textCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textClienteMouseReleased(evt);
            }
        });

        butCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregarCliente.png"))); // NOI18N
        butCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Automóvil:");

        textAuto.setEditable(false);
        textAuto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textAutoMouseReleased(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoSmall.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Aval:");

        textAval.setEditable(false);
        textAval.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textAval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textAvalMouseReleased(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregarAval.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        labelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMensaje.setText("Ultimo contrato:");

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

        labelImageCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelImageAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Precio del auto: ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Financiamiento:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Enganche del auto:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Total a pagar:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Intereses con IVA:");

        labelPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPrecio.setText("$ 0.0");

        labelEnganche.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelEnganche.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEnganche.setText("$ 0.0");

        labelFinanciamiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFinanciamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFinanciamiento.setText("$ 0.0");

        labelIntereses.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelIntereses.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelIntereses.setText("$ 0.0");

        labelTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotal.setText("$ 0.0");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Seguro de vida");

        labelSeguro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSeguro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSeguro.setText("$ 0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEnganche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFinanciamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelIntereses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(labelSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(labelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(labelEnganche, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(labelFinanciamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(labelIntereses, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(labelSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tftf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tftf.setText("Comisión de contrato:");

        labelComision.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelComision.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelComision.setText("$ 0.0");

        labele.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labele.setText("Precio de factura:");

        labelFactura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFactura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFactura.setText("$ 0.0");

        labelc1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelc1.setText("Tasa anual ordinaria fija");

        labelTasi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTasi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTasi.setText("0.0 %");

        labelc2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelc2.setText("CAT:");

        labelCAT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCAT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCAT.setText("0.0 %");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labele)
                            .addComponent(tftf))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelComision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelc1)
                        .addGap(26, 26, 26)
                        .addComponent(labelTasi, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelc2)
                        .addGap(26, 26, 26)
                        .addComponent(labelCAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftf)
                    .addComponent(labelComision, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labele)
                    .addComponent(labelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelc1)
                    .addComponent(labelTasi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelc2)
                    .addComponent(labelCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelImageAval.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelAviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAviso.setForeground(new java.awt.Color(102, 0, 0));

        hjvg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hjvg.setText("Garantía:");

        textGarantia.setEditable(false);
        textGarantia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textGarantia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textGarantiaMouseReleased(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garantiaSmall.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        labelImageGarantia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        hjvg1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hjvg1.setText("Beneficiario:");

        textBeneficiario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textBeneficiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textBeneficiarioMouseReleased(evt);
            }
        });
        textBeneficiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBeneficiarioKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Número de contrato:");

        textContrato.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textContrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textContratoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textContratoFocusLost(evt);
            }
        });
        textContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContratoActionPerformed(evt);
            }
        });
        textContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textContratoKeyTyped(evt);
            }
        });

        labelContrato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelContrato.setText("Ultimo contrato:");

        botonAnexos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonAnexos.setText("Anexos");
        botonAnexos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnexosActionPerformed(evt);
            }
        });

        botonOriginal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonOriginal.setText("Original");
        botonOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOriginalActionPerformed(evt);
            }
        });

        botonCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonCopia.setText("Copia");
        botonCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCopiaActionPerformed(evt);
            }
        });

        botonPagare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonPagare.setText("Pagaré");
        botonPagare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botonAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonPagare, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(textGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(textContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addGap(12, 12, 12)
                                .addComponent(labelContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMensajeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMensajeAval, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(544, 544, 544)
                        .addComponent(labelMensajeGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hjvg)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(butCliente))
                    .addComponent(hjvg1)
                    .addComponent(textBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(labelImageGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(labelImageCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(labelMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(490, 490, 490)
                        .addComponent(labelMensajeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(labelImageAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textAval, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(12, 12, 12)
                        .addComponent(labelImageAval, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(76, 76, 76)
                        .addComponent(textGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(labelMensajeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addComponent(labelMensajeAval, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(labelMensajeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(314, 314, 314)
                                        .addComponent(labelMensajeGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(204, 204, 204)
                                                .addComponent(labelImageGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addComponent(labelImageAval, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(labelImageAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(labelImageCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(31, 31, 31))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(butCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(38, 38, 38)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(textAval, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(hjvg))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(82, 82, 82)
                                                                .addComponent(hjvg1))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(textBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))))))
                .addGap(18, 18, 18)
                .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonPagare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteActionPerformed
        AbrirClienteCompleto();
    }//GEN-LAST:event_butClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AbrirAutoCompleto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AbrirAvalCompleto();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void textFolioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFolioFocusLost
        if(textFolio.getText().isEmpty()){
            textFolio.setText("0");
        }
        VerificarCotizacion();
        if(verificadoCotiza){
            BuscarClienteParcial();
            BuscarAutoParcial();
            BuscarAdicionales();
        }
    }//GEN-LAST:event_textFolioFocusLost

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        Guardar();
    }//GEN-LAST:event_exit1ActionPerformed

    private void textFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFolioActionPerformed

    private void textFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFolioKeyTyped
        SoloNumeros(evt,textFolio);
    }//GEN-LAST:event_textFolioKeyTyped

    private void textClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textClienteMouseReleased
        AbrirClienteCompleto();
    }//GEN-LAST:event_textClienteMouseReleased

    private void textAutoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAutoMouseReleased
        AbrirAutoCompleto();
    }//GEN-LAST:event_textAutoMouseReleased

    private void textAvalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAvalMouseReleased
        AbrirAvalCompleto();
    }//GEN-LAST:event_textAvalMouseReleased

    private void textFolioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFolioFocusGained
        textFolio.setText(null);
    }//GEN-LAST:event_textFolioFocusGained

    private void textGarantiaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGarantiaMouseReleased
        AbrirGarantiaCompleto();
    }//GEN-LAST:event_textGarantiaMouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AbrirGarantiaCompleto();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void textBeneficiarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBeneficiarioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textBeneficiarioMouseReleased

    private void textBeneficiarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBeneficiarioKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)){
            getToolkit().beep(); 
            evt.consume();
        }
    }//GEN-LAST:event_textBeneficiarioKeyTyped

    private void textContratoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textContratoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textContratoFocusGained

    private void textContratoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textContratoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textContratoFocusLost

    private void textContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textContratoActionPerformed

    private void textContratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContratoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textContratoKeyTyped

    private void botonAnexosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnexosActionPerformed
        botonAnexos.setEnabled(false);
        ImprimirAnexos();
        botonAnexos.setEnabled(true);
    }//GEN-LAST:event_botonAnexosActionPerformed

    private void botonOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOriginalActionPerformed
        botonOriginal.setEnabled(false);
        ImprimirOriginal();
        botonOriginal.setEnabled(true);
    }//GEN-LAST:event_botonOriginalActionPerformed

    private void botonCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCopiaActionPerformed
        botonCopia.setEnabled(false);
        ImprimirCopia();
        botonCopia.setEnabled(true);
    }//GEN-LAST:event_botonCopiaActionPerformed

    private void botonPagareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagareActionPerformed
        botonPagare.setEnabled(false);
        ImprimirPagare();
        botonPagare.setEnabled(true);
    }//GEN-LAST:event_botonPagareActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnexos;
    private javax.swing.JButton botonCopia;
    private javax.swing.JButton botonOriginal;
    private javax.swing.JButton botonPagare;
    private javax.swing.JButton butCliente;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel hjvg;
    private javax.swing.JLabel hjvg1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelCAT;
    private javax.swing.JLabel labelComision;
    private javax.swing.JLabel labelContrato;
    private javax.swing.JLabel labelEnganche;
    private javax.swing.JLabel labelFactura;
    private javax.swing.JLabel labelFinanciamiento;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelImageAuto;
    private javax.swing.JLabel labelImageAval;
    private javax.swing.JLabel labelImageCliente;
    private javax.swing.JLabel labelImageGarantia;
    private javax.swing.JLabel labelIntereses;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelMensaje1;
    private javax.swing.JLabel labelMensajeAuto;
    private javax.swing.JLabel labelMensajeAval;
    private javax.swing.JLabel labelMensajeCliente;
    private javax.swing.JLabel labelMensajeGarantia;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelSeguro;
    private javax.swing.JLabel labelTasi;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelc1;
    private javax.swing.JLabel labelc2;
    private javax.swing.JLabel labele;
    private javax.swing.JTextField textAuto;
    private javax.swing.JTextField textAval;
    private javax.swing.JTextField textBeneficiario;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textContrato;
    private javax.swing.JTextField textFolio;
    private javax.swing.JTextField textGarantia;
    private javax.swing.JLabel tftf;
    // End of variables declaration//GEN-END:variables

    private void UltimoContrato(){
        Conexion con = new Conexion();
        SQLContrato sc = new SQLContrato();
        String sql = sc.ObtenerUltimoContrato();
        con.Conectar(cuenta, password);
        try {
            ResultSet res = con.Consulta(sql);
            if (res.next()) {
                labelContrato.setText("Ultimo contrato: " + res.getString(1));
            }
            else {
                labelContrato.setText("No hay contratos hechos");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Ultimo contrato\n Error al mostrar ultimo contrato");
        }
    }
    
    private void AbrirGarantiaCompleto(){
        Garantia g = new Garantia(this, true);
        g.setUsuario(cuenta, password);
        g.setId(idC);
        g.setDatos(ubicacion, denominacion, datos, folio, lugar, registro);
        g.setLocationRelativeTo(null);
        g.setVisible(true);
        ImageIcon img = new ImageIcon(getClass().getResource("/Images/tick.png"));
        labelImageGarantia.setIcon(img);
        labelMensajeGarantia.setText("Datos del cliente verificados");
        ubicacion = g.ubicacion;
        denominacion = g.denominacion;
        datos = g.datos;
        folio = g.folio;
        lugar = g.lugar;
        registro = g.registro;
        textGarantia.setText(folio+". "+denominacion);
    }
    
    private void SoloNumeros(KeyEvent evt, JTextField text) { //Key Typed
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) && (caracter != evt.VK_BACK_SPACE) && (caracter != evt.VK_ENTER) && (caracter != evt.VK_ESCAPE)) {
            getToolkit().beep();
            evt.consume();
        }
    }
    
    private void BuscarAdicionales(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        SQLContrato sc = new SQLContrato();
        Conexion con = new Conexion();
        ResultSet res;
        String sql;
        try{
            sql = sc.ObtenerAdicionales();
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            if(res.next()){
                factura = res.getDouble(3);
                res.next();
                saldo = res.getDouble(3);
                res.next();
                limite = res.getDouble(3);
            }
            con.Cerrar();
            labelFactura.setText(nf.format(factura));
            if(limite <= total){
                labelAviso.setText("Operación obligada con aviso");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Buscaradicionales -- "+e.getMessage());
        }
    }
    
    private void BuscarAutoParcial(){
        SQLContrato sc = new SQLContrato();
        Conexion con = new Conexion();
        String sql;
        ResultSet res;
        try{
            sql = sc.AutoCotizacion(idcotizacion);
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            while(res.next()){
                idV = res.getInt(1);
                marca = res.getString(2);
                tipo = res.getString(3);
                transmision =res.getString(4);
                color = res.getString(5);
                serie = res.getString(6);
                motor = res.getString(7);
                ano = res.getInt(8);
                distribuidor = res.getString(9);
                uso = res.getString(10);
            }
            con.Cerrar();
            textAuto.setText(marca + " - " + tipo + " - " + ano);
            ImageIcon img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
            labelImageAuto.setIcon(img);
            labelMensajeAuto.setText("Datos del auto incompletos");
            verAuto = false;
        }catch(Exception e){
            con.Cerrar();
            JOptionPane.showMessageDialog(this, "BuscarAutoParcial // "+e.getMessage());
        }
    }
    
    private void BuscarClienteParcial() {
        SQLContrato sc = new SQLContrato();
        Conexion con = new Conexion();
        String sql;
        ResultSet res;
        try {
            sql = sc.ClienteCotizacion(idcotizacion);
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            while (res.next()) {
                idC = res.getInt(1);
                patC = res.getString(2);
                matC = res.getString(3);
                nomC = res.getString(4);
                nacC = res.getString(5);
                proC = res.getString(6);
                calC = res.getString(7);
                intC = res.getString(8);
                extC = res.getString(9);
                colC = res.getString(10);
                munC = res.getString(11);
                cpC = res.getInt(12);
                estC = res.getString(13);
                telC = res.getString(14);
                rfcC = res.getString(15);
                caltC = res.getString(16);
                exttC = res.getString(17);
                inttC = res.getString(18);
                coltC = res.getString(19);
                muntC = res.getString(20);
                cptC = res.getInt(21);
                esttC = res.getString(22);
                teltC = res.getString(23);
                edad = res.getInt(24);
                correo = res.getString(25);
                curp = res.getString(26);
                civil = res.getString(27);
                residencia = res.getInt(28);
                empresa = res.getString(29);
                puesto = res.getString(30);
                ingreso = res.getString(31);
            }
            con.Cerrar();
            textCliente.setText(patC + " " + matC + " " + nomC);
            ImageIcon img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
            labelImageCliente.setIcon(img);
            labelMensajeCliente.setText("Datos del cliente incompletos");
            verificado = false;
        } catch (Exception e) {
            con.Cerrar();
            JOptionPane.showMessageDialog(this, "BuscarCliente - " + e.getMessage());
        }
    }
    
    private void ImprimirAnexos(){
        if (guardado) {
            AnexoA aa = new AnexoA();
            aa.setUsuario(cuenta, password);
            aa.Documento(contrato, idcotizacion);
            aa.GuardarCuenta();
            aa.ImpresionAnexo();   
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes guardar antes de imprimir");
        }
    }
    
    private void ImprimirPagare(){
        if (guardado) {
            String nu = JOptionPane.showInputDialog(this, "Número de pagaré: ", "Pagaré", JOptionPane.INFORMATION_MESSAGE);
            if (!nu.isEmpty()) {
                Pagare pa = new Pagare();
                pa.setUsuario(cuenta, password);
                pa.setDatos(idcotizacion, total, plazo, GetFechaActual(), nu);
                pa.LeerPagare();
            }
            else{
                JOptionPane.showMessageDialog(this, "Ingresa un número de pagaré", "Pagaré", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debes guardar antes de imprimir");
        }
    }
    
    private void ImprimirCopia(){
        if (guardado) {
            Contrato ct = new Contrato();
            ct.setUsuario(cuenta, password);
            ct.setClienteContrato(patC, matC, nomC, nacC, proC, teltC, caltC, inttC, exttC, coltC,
                    muntC, cptC, esttC, rfcC, calC, intC, extC, colC, munC, cpC, estC, telC, edad, residencia, correo,
                    curp, civil, empresa, puesto, ingreso);
            ct.setAvalContrato(nombreAval, nacAval, oficioAval, telLab, domLab, rfcAval, domPar, telPar, edadAval, civilAval, residenciaAval, curpAval, correoAval, empresaAval, ingresoAval, puestoAval);
            ct.setVehiculoContrato(marca, tipo, transmision, color, serie, motor, ano, distribuidor, uso);
            ct.setCotizacionContrato(precio, enganche, plazo, financiamiento, intereses, total, seguro, comision, tasi, cat);
            ct.setOtrosContrato(factura, saldo, contrato, GetFechaActual(), GetFechaMeses(1), diadepago, beneficiario);
            ct.setGarantia(ubicacion, denominacion, datos, folio, lugar, registro);
            ct.setComisionPorcentaje(getComPor());
            ct.LeerContrato(idcotizacion);
            ct.LeerCopia(idcotizacion);
            ct.ImpresionCopia();
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes guardar antes de imprimir");
        }
    }
    
    private void ImprimirOriginal(){
        if (guardado) {
            Contrato ct = new Contrato();
            ct.setUsuario(cuenta, password);
            ct.setClienteContrato(patC, matC, nomC, nacC, proC, teltC, caltC, inttC, exttC, coltC,
                    muntC, cptC, esttC, rfcC, calC, intC, extC, colC, munC, cpC, estC, telC, edad, residencia, correo,
                    curp, civil, empresa, puesto, ingreso);
            ct.setAvalContrato(nombreAval, nacAval, oficioAval, telLab, domLab, rfcAval, domPar, telPar, edadAval, civilAval, residenciaAval, curpAval, correoAval, empresaAval, ingresoAval, puestoAval);
            ct.setVehiculoContrato(marca, tipo, transmision, color, serie, motor, ano, distribuidor, uso);
            ct.setCotizacionContrato(precio, enganche, plazo, financiamiento, intereses, total, seguro, comision, tasi, cat);
            ct.setOtrosContrato(factura, saldo, contrato, GetFechaActual(), GetFechaMeses(1), diadepago, beneficiario);
            ct.setGarantia(ubicacion, denominacion, datos, folio, lugar, registro);
            ct.setComisionPorcentaje(getComPor());
            ct.LeerContrato(idcotizacion);
            ct.ImpresionContrato();          
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes guardar antes de imprimir");
        }
    }
    
    private void Guardar() {
        if (verificado && verAval && verificadoCotiza) {
            if (!textBeneficiario.getText().isEmpty()) {
                beneficiario = textBeneficiario.getText();
                if (verAuto) {
                    int op = JOptionPane.showConfirmDialog(this, "¿Estas seguro de que deseas continuar?");
                    if (op == 0) {
                        SQLContrato sc = new SQLContrato();
                        Conexion con = new Conexion();
                        String sql;
                        try {
                            this.contrato = textContrato.getText().toString();
                            if (!contrato.isEmpty()) {
                                sql = sc.GuardarContrato(contrato, idC, idV, idcotizacion, precio, enganche, financiamiento, intereses, total, seguro, comision, factura, saldo, plazo, GetFechaActual(), GetFechaMeses(1), diadepago, beneficiario);
                                con.Conectar(cuenta, password);
                                con.Modificar(sql);
                                con.Cerrar();
                                this.guardado = true;
                                JOptionPane.showMessageDialog(this, "Contrato guardado", "Contrato", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showConfirmDialog(this, "No tienes el número de contrato");
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Guardar -- " + e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Operación cancelada");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Ingresa el nombre del beneficiario");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Verifica que los datos esten completos");
        }
    }
    
    private double getComPor(){
        Conexion con = new Conexion();
        SQLContrato sc = new SQLContrato();
        ResultSet res;
        double a = 2.4;
        String sql = sc.ConsultarPorcentajeComision();
        try{
            con.Conectar(cuenta, password);
            res = con.Consulta(sql);
            if(res.next()){
                a = res.getDouble(1);
            }
            con.Cerrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Fallo al recuperar porcentaje de comision");
        }
        return a;
    }
    
    private void VerificarCotizacion() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        SQLContrato sc = new SQLContrato();
        Conexion con = new Conexion();
        String sql;
        ImageIcon img;
        LimpiarTodo();
        idcotizacion = Integer.parseInt(textFolio.getText());
        ResultSet res;
        if (idcotizacion != 0) {
            try { 
                sql = sc.ComprobarCotizacion(idcotizacion);
                con.Conectar(cuenta, password);
                res = con.Consulta(sql);
                if(res.next()){
                    img = new ImageIcon(getClass().getResource("/Images/tick.png"));
                    labelImage.setIcon(img);
                    labelMensaje.setText("La cotizacion existe en el sistema");
                    img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
                    labelImageGarantia.setIcon(img);
                    labelMensajeGarantia.setText("Garantia sin revisar");
                    verificadoCotiza = true;
                    precio = res.getDouble(3);
                    enganche = res.getDouble(4);
                    financiamiento = res.getDouble(5);
                    total = res.getDouble(6)*res.getDouble(7);
                    intereses = total - financiamiento;
                    seguro = res.getDouble(9);
                    comision = res.getDouble(8);   
                    plazo = res.getInt(7);
                    tasi = res.getString(10);
                    cat = res.getDouble(15);
                }
                else{
                    img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
                    labelImage.setIcon(img);
                    labelMensaje.setText("La cotizacion no existe en el sistema");
                    verificadoCotiza = false;
                }
                con.Cerrar();
                if (verificadoCotiza) {
                    sql = sc.ComprobarCotizacionContrato(idcotizacion);
                    con.Conectar(cuenta, password);
                    res = con.Consulta(sql);
                    if (res.next()) {
                        img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
                        labelImage.setIcon(img);
                        labelMensaje.setText("La cotizacion ya tiene un contrato");
                        verificadoCotiza = false;
                    } else {
                        img = new ImageIcon(getClass().getResource("/Images/tick.png"));
                        labelImage.setIcon(img);
                        labelMensaje.setText("La cotizacion no tiene contrato");
                        verificadoCotiza = true;
                        System.out.println("ver + "+verificadoCotiza);
                        labelPrecio.setText(nf.format(precio));
                        labelEnganche.setText(nf.format(enganche));
                        labelFinanciamiento.setText(nf.format(financiamiento));
                        labelIntereses.setText(nf.format(intereses));
                        labelTotal.setText(nf.format(total));
                        labelSeguro.setText(nf.format(seguro));
                        labelComision.setText(nf.format(comision));
                        labelTasi.setText(tasi+" %");
                        labelCAT.setText(cat+" %");
                    }
                }
            } catch (Exception e) {
                con.Cerrar();
            }
        } else {
            img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
            labelImage.setIcon(img);
            labelMensaje.setText("Ingresa un número de cotización válido");
            verificadoCotiza = false;
            labelAviso.setText(null);
        }
        System.out.println("ver ="+verificadoCotiza);
    }

    private void Regresar() {
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

    private void AbrirClienteCompleto() {
        System.out.println("ver fun = "+verificadoCotiza);
        if (verificadoCotiza) {
            ClienteCompleto cc = new ClienteCompleto(this, true);
            cc.setUsuario(cuenta, password);
            cc.setDatos(idC, patC, matC, nomC, telC, rfcC, nacC, proC, edad,correo, curp, civil);
            cc.setDatosDomicilio(calC, intC, extC, colC, munC, estC, cpC, residencia);
            cc.setDatosTrabajo(caltC, inttC, exttC, coltC, muntC, esttC, cptC, teltC, empresa, puesto, ingreso);
            cc.setDatos2(edad, correo, curp, civil, residencia, empresa, puesto, ingreso);
            cc.setLocationRelativeTo(null);
            cc.setVisible(true);
            if (cc.control) {
                ImageIcon img = new ImageIcon(getClass().getResource("/Images/tick.png"));
                labelImageCliente.setIcon(img);
                labelMensajeCliente.setText("Datos del cliente verificados");
                idC = cc.id;
                empresa = cc.empresa;
                puesto = cc.puesto;
                ingreso = cc.ingreso;
                residencia = cc.residencia;
                edad = cc.edad;
                correo = cc.correo;
                curp = cc.curp;
                civil = cc.civil;
                patC = cc.pat;
                matC = cc.mat;
                nomC = cc.nom;
                nacC = cc.nac;
                proC = cc.pro;
                calC = cc.cal;
                intC = cc.inte;
                extC = cc.exte;
                colC = cc.col;
                munC = cc.mun;
                cpC = cc.cp;
                estC = cc.edo;
                telC = cc.tel;
                rfcC = cc.rfc;
                caltC = cc.calT;
                exttC = cc.exteT;
                inttC = cc.inteT;
                coltC = cc.colT;
                muntC = cc.munT;
                cptC = cc.cpT;
                esttC = cc.edoT;
                teltC = cc.telT;
                textCliente.setText(patC + " " + matC + " " + nomC);
                verificado = true;
            } else {
                ImageIcon img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
                labelImageCliente.setIcon(img);
                labelMensajeCliente.setText("Datos del cliente no verificados");
                verificado = false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Primero indica la cotización");
        }
    }
    
    private void AbrirAutoCompleto() {
        if (verificadoCotiza) {
            AutoCompleto ac = new AutoCompleto(this, true);
            ac.setUsuario(cuenta, password);
            ac.setDatosAuto(idV, marca, tipo, transmision, color, serie, motor, ano, distribuidor, uso);
            ac.setLocationRelativeTo(null);
            ac.setVisible(true);
            if (ac.control) {
                ImageIcon img = new ImageIcon(getClass().getResource("/Images/tick.png"));
                labelImageAuto.setIcon(img);
                labelMensajeAuto.setText("Datos del auto verificados");
                idV = ac.idV;
                marca = ac.marca;
                tipo = ac.tipo;
                transmision = ac.transmision;
                color = ac.color;
                serie = ac.serie;
                motor = ac.motor;
                ano = ac.ano;
                distribuidor = ac.distribuidor;
                uso = ac.uso;
                textAuto.setText(marca + " - " + tipo + " - " + ano);
                verAuto = true;
            } else {
                ImageIcon img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
                labelImageAuto.setIcon(img);
                labelMensajeAuto.setText("Datos del auto no verificados");
                verAuto = false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Primero indica la cotización");
        }
}

    private void AbrirAvalCompleto() {
        if (verificadoCotiza) {
            AvalCompleto ac = new AvalCompleto(this, true);
            ac.setUsuario(cuenta, password);
            ac.setIdAval(idC);
            ac.VerificarExistencia();
            ac.setLocationRelativeTo(null);
            ac.setVisible(true);
            if (ac.control) {
                ImageIcon img = new ImageIcon(getClass().getResource("/Images/tick.png"));
                labelImageAval.setIcon(img);
                labelMensajeAval.setText("Datos del aval verificados");
                verAval = true;
                nombreAval = ac.getNombre();
                nacAval = ac.getNacionalidad();
                oficioAval = ac.getOficio();
                telLab = ac.getTelefonoLaboral();
                domLab = ac.getDomicilioLaboral();
                rfcAval = ac.getRFC();
                domPar = ac.getDomicilio();
                telPar = ac.getTelefono();
                edadAval = ac.getEdad();
                civilAval = ac.getEdoCivil();
                residenciaAval = ac.getResidencia();
                curpAval = ac.getCurp();
                correoAval = ac.getCorreo();
                empresaAval = ac.getEmpresa();
                ingresoAval = ac.getIngreso();
                puestoAval = ac.getPuesto();
                textAval.setText(nombreAval);
            } else {
                ImageIcon img = new ImageIcon(getClass().getResource("/Images/Advertencia.png"));
                labelImageAval.setIcon(img);
                labelMensajeAval.setText("Datos del aval no verificados");
                verAval = false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Primero indica la cotización");
        }
    }
    
    private void LimpiarTodo(){
        textCliente.setText(null);
        textAuto.setText(null);
        textAval.setText(null);
        labelPrecio.setText("$ 0.0");
        labelEnganche.setText("$ 0.0");
        labelFinanciamiento.setText("$ 0.0");
        labelIntereses.setText("$ 0.0");
        labelTotal.setText("$ 0.0");
        labelSeguro.setText("$ 0.0");
        labelComision.setText("$ 0.0");
        labelFactura.setText("$ 0.0");
        labelPrecio.setText("$ 0.0");
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
        fe = ano+"-"+m+"-"+d;
        return fe;
    }
    
    public String GetFechaMeses(int i){
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.MONTH, i);
        String fe, m, d;
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        diadepago = fecha.get(Calendar.DAY_OF_MONTH);
        if(mes <10){
            m = "0"+mes;
        }
        else{
            m = ""+mes;
        }
        if(diadepago <10){
            d = "0"+diadepago;
        }
        else{
            d = ""+diadepago;
        }
        fe = ano+"-"+m+"-"+d;
        return fe;
    }
    
    void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
        UltimoContrato();
    }

}
