package GUI;

import DataBase.Conexion;
import DataBase.SQLContrato;
import Files.AnexoA;
import Files.Contrato;
import Files.Pagare;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Date;
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

public class EditarContrato extends javax.swing.JDialog {

    private int edad, residencia;
    private String correo,curp,civil, empresa, puesto, ingreso;
    private String ubicacion, denominacion, datos, folio, lugar, registro;
    private String cuenta;
    private String password,idContrato, intA, extA,extTA, intTA;
    private Date fecha;
    private String patA, matA, nomA, telA, rfcA, nacA, proA, calA;
    private int cpA, cpTA,edaA,resA;
    private String colA, munA, estA, calTA, estTA, munTA, colTA, telTA,edoA;
    private String curpA, corA, ingA, pueA, empA, ubiG, garG, folG, fecG,lugG, datG;
    private int edadC;
    private String correoC;
    private String curpC;
    private String civilC;
    private int resiC;
    private String empC;
    private String puestoC;
    private String ingC;
    private String tasi;
    private Double cat;
    private String beneficiario;
    
    public EditarContrato(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }
    
    private int idV, ano, diadepago;
    private String marca,tipo,transmision,color,serie,motor,distribuidor,uso;
    private boolean verificado = true, verAuto = true, verAval = true;
    private int idC,cpC,cptC, plazo;
    private String patC, matC, nomC, nacC,proC,calC,colC,munC,estC,rfcC,
            caltC,coltC,muntC,esttC,telC,teltC,intC, extC,exttC, inttC;
    private int idcotizacion;
    private double precio, enganche, financiamiento, intereses, total, seguro,
            comision, factura, saldo;
    private double limite;

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
        labelc = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelc1 = new javax.swing.JLabel();
        labelTasi = new javax.swing.JLabel();
        labelc2 = new javax.swing.JLabel();
        labelCAT = new javax.swing.JLabel();
        labelAviso = new javax.swing.JLabel();
        hjvg = new javax.swing.JLabel();
        textGarantia = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        hjvg1 = new javax.swing.JLabel();
        textBeneficiario = new javax.swing.JTextField();
        botonPagare = new javax.swing.JButton();
        botonAnexos = new javax.swing.JButton();
        botonCopia = new javax.swing.JButton();
        botonOriginal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar contrato");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Folio de la cotización:");

        textFolio.setEditable(false);
        textFolio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFolioActionPerformed(evt);
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
                .addContainerGap(38, Short.MAX_VALUE))
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

        labelc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelc.setText("Certificación de saldo:");

        labelSaldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSaldo.setText("$ 0.0");

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
                            .addComponent(labelc)
                            .addComponent(labele)
                            .addComponent(tftf))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelComision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelc1)
                        .addGap(26, 26, 26)
                        .addComponent(labelTasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelc2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCAT, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelc)
                    .addComponent(labelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelc1)
                    .addComponent(labelTasi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelc2)
                    .addComponent(labelCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

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

        botonPagare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonPagare.setText("Pagaré");
        botonPagare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagareActionPerformed(evt);
            }
        });

        botonAnexos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonAnexos.setText("Anexos");
        botonAnexos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnexosActionPerformed(evt);
            }
        });

        botonCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonCopia.setText("Copia");
        botonCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCopiaActionPerformed(evt);
            }
        });

        botonOriginal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/impresoraBoton.png"))); // NOI18N
        botonOriginal.setText("Original");
        botonOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOriginalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botonOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPagare, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(butCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAval, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hjvg)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(hjvg1)
                            .addComponent(textBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(butCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(textGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(textAval, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(textAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(hjvg))
                            .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hjvg1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonPagare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        Guardar();
    }//GEN-LAST:event_exit1ActionPerformed

    private void textFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFolioActionPerformed

    private void textClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textClienteMouseReleased
        AbrirClienteCompleto();
    }//GEN-LAST:event_textClienteMouseReleased

    private void textAutoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAutoMouseReleased
        AbrirAutoCompleto();
    }//GEN-LAST:event_textAutoMouseReleased

    private void textAvalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAvalMouseReleased
        AbrirAvalCompleto();
    }//GEN-LAST:event_textAvalMouseReleased

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

    private void botonPagareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagareActionPerformed
        botonPagare.setEnabled(false);
        ImprimirPagare();
        botonPagare.setEnabled(true);
    }//GEN-LAST:event_botonPagareActionPerformed

    private void botonAnexosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnexosActionPerformed
        botonAnexos.setEnabled(false);
        ImprimirAnexos();
        botonAnexos.setEnabled(true);
    }//GEN-LAST:event_botonAnexosActionPerformed

    private void botonCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCopiaActionPerformed
        botonCopia.setEnabled(false);
        ImprimirCopia();
        botonCopia.setEnabled(true);
    }//GEN-LAST:event_botonCopiaActionPerformed

    private void botonOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOriginalActionPerformed
        botonOriginal.setEnabled(false);
        ImprimirOriginal();
        botonOriginal.setEnabled(true);
    }//GEN-LAST:event_botonOriginalActionPerformed


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
    private javax.swing.JLabel labelEnganche;
    private javax.swing.JLabel labelFactura;
    private javax.swing.JLabel labelFinanciamiento;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelIntereses;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSeguro;
    private javax.swing.JLabel labelTasi;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelc;
    private javax.swing.JLabel labelc1;
    private javax.swing.JLabel labelc2;
    private javax.swing.JLabel labele;
    private javax.swing.JTextField textAuto;
    private javax.swing.JTextField textAval;
    private javax.swing.JTextField textBeneficiario;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textFolio;
    private javax.swing.JTextField textGarantia;
    private javax.swing.JLabel tftf;
    // End of variables declaration//GEN-END:variables

    public void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
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

    //----------------------------------------------------  Editar contrato
    
    private void getTASI(){
        Conexion con = new Conexion();
        SQLContrato sc = new SQLContrato();
        ResultSet res;
        con.Conectar(cuenta, password);
        try{
            String sql = sc.obtenerTasi(idcotizacion);
            res = con.Consulta(sql);
            if(res.next()){
                tasi = res.getString(1);
                plazo = res.getInt(2);
                cat = res.getDouble(3);
            }else{
                System.out.println("No hay tasi");
            }
            labelTasi.setText(tasi+" %");
            labelCAT.setText(cat+" %");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al obtener TASI\n"+e.getMessage());
        }
        con.Cerrar();
    }
    
    public void setContrato(String idContrato){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        this.idContrato = idContrato;
        Conexion con = new Conexion();
        SQLContrato sc = new SQLContrato();
        String sql = sc.ConsultarContrato(this.idContrato);
        ResultSet res;
        con.Conectar(cuenta, password);
        try {
            res = con.Consulta(sql);
            if (res.next()) {
                idcotizacion = res.getInt(2);
                idC = res.getInt(3);
                idV = res.getInt(5);
                precio = res.getDouble(6);
                enganche = res.getDouble(7);
                financiamiento = res.getDouble(8);
                intereses = res.getDouble(9);
                total = res.getDouble(10);
                seguro = res.getDouble(11);
                comision = res.getDouble(12);
                factura = res.getDouble(13);
                saldo = res.getDouble(14);
                fecha = res.getDate(15);
                beneficiario = res.getString(18);
            }
            textFolio.setText(idcotizacion+"");
            labelPrecio.setText(nf.format(precio));
            labelEnganche.setText(nf.format(enganche));
            labelFinanciamiento.setText(nf.format(financiamiento));
            labelIntereses.setText(nf.format(intereses));
            labelTotal.setText(nf.format(total));
            labelSeguro.setText(nf.format(seguro));
            labelComision.setText(nf.format(comision));
            labelFactura.setText(nf.format(factura));
            labelSaldo.setText(nf.format(saldo));
            textBeneficiario.setText(beneficiario);
            BuscarCliente();
            BuscarAuto();
            BuscarAvalYGarantia();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error setContrato -- " + e.getMessage());
        }
        con.Cerrar();
        getTASI();
    }
     
    private void BuscarCliente() {
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
                edadC = res.getInt(24);
                correoC = res.getString(25);
                curpC = res.getString(26);
                civilC = res.getString(27);
                resiC = res.getInt(28);
                empC = res.getString(29);
                puestoC = res.getString(30);
                ingC = res.getString(31);
            }
            con.Cerrar();
            textCliente.setText(patC + " " + matC + " " + nomC);
        } catch (Exception e) {
            con.Cerrar();
            JOptionPane.showMessageDialog(this, "BuscarCliente - " + e.getMessage());
        }
    }
    
    private void BuscarAuto(){
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
        }catch(Exception e){
            con.Cerrar();
            JOptionPane.showMessageDialog(this, "BuscarAutoParcial // "+e.getMessage());
        }
    }
       
    private void BuscarAvalYGarantia(){
        SQLContrato sc = new SQLContrato();
        Conexion con = new Conexion();
        String sql;
        ResultSet res;
        sql = sc.ComprobarAval(idC);
        con.Conectar(cuenta, password);
        try{
            res = con.Consulta(sql);
            if(res.next()){
                patA = res.getString(2);
                matA = res.getString(3);
                nomA = res.getString(4);
                telA = res.getString(5);
                rfcA = res.getString(6);
                nacA = res.getString(7);
                proA = res.getString(8);
                calA = res.getString(9);
                intA = res.getString(10);
                extA = res.getString(11);
                colA = res.getString(12);
                munA = res.getString(13);
                estA = res.getString(14);
                cpA = res.getInt(15);
                calTA = res.getString(16);
                intTA = res.getString(17);
                extTA = res.getString(18);
                colTA = res.getString(19);
                munTA = res.getString(20);
                estTA = res.getString(21);
                cpTA = res.getInt(22);
                telTA = res.getString(23);
                edaA = res.getInt(24);
                edoA = res.getString(25);
                resA = res.getInt(26);
                curpA = res.getString(27);
                corA = res.getString(28);
                empA = res.getString(29);
                ingA = res.getString(30);
                pueA = res.getString(31);
                ubiG = res.getString(32);
                garG = res.getString(33);
                folG = res.getString(34);
                fecG = res.getString(35);
                lugG = res.getString(36);    
                datG = res.getString(37);
            }
            textAval.setText(patA+" "+matA+" "+nomA);
            textGarantia.setText(folG+". "+garG);
        }   catch(Exception e){
            
        }   
        con.Cerrar();
    }
    
    private void AbrirGarantiaCompleto(){
        Garantia g = new Garantia(this, true);
        g.setUsuario(cuenta, password);
        g.setId(idC);
        g.setDatos(ubiG, garG, datG, folG, lugG, fecG);
        g.setLocationRelativeTo(null);
        g.setVisible(true);
        BuscarAvalYGarantia();
    }
   //------------------------------------------------------------------------------    

    private void ImprimirOriginal(){
        Contrato ct = new Contrato();
        ct.setUsuario(cuenta, password);
        ct.setClienteContrato(patC, matC, nomC, nacC, proC, teltC, caltC, inttC, exttC, coltC,
                muntC, cptC, esttC, rfcC, calC, intC, extC, colC, munC, cpC, estC, telC, edadC, resiC, correoC,
                curpC, civilC, empC, puestoC, ingC);
        ct.setAvalContrato(patA + " " + matA + " " + nomA, nacA, proA, telTA,
                calTA + " INT. " + intTA + " EXT. " + extTA + ", " + colTA + ", " + munTA + ", CP:" + cpTA + ", " + estTA,
                rfcA,
                calA + " INT. " + intA + " EXT. " + extA + ", " + colA + ", " + munA + ", CP:" + cpA + ", " + estA, telA,
                edaA, edoA, resA, curpA, corA, empA, ingA, pueA);
        ct.setVehiculoContrato(marca, tipo, transmision, color, serie, motor, ano, distribuidor, uso);
        ct.setCotizacionContrato(precio, enganche, plazo, financiamiento, intereses, total, seguro, comision, tasi, cat);
        ct.setOtrosContrato(factura, saldo, idContrato, GetFechaActual(), GetFechaMeses(1), diadepago, beneficiario);
        ct.setGarantia(ubiG, garG, datG, folG, lugG, fecG);
        ct.setComisionPorcentaje(getComPor());
        ct.LeerContrato(idcotizacion);
        ct.ImpresionContrato();
    }
   
    private void ImprimirCopia() {
        Contrato ct = new Contrato();
        ct.setUsuario(cuenta, password);
        ct.setClienteContrato(patC, matC, nomC, nacC, proC, teltC, caltC, inttC, exttC, coltC,
                muntC, cptC, esttC, rfcC, calC, intC, extC, colC, munC, cpC, estC, telC, edadC, resiC, correoC,
                curpC, civilC, empC, puestoC, ingC);
        ct.setAvalContrato(patA + " " + matA + " " + nomA, nacA, proA, telTA,
                calTA + " INT. " + intTA + " EXT. " + extTA + ", " + colTA + ", " + munTA + ", CP:" + cpTA + ", " + estTA,
                rfcA,
                calA + " INT. " + intA + " EXT. " + extA + ", " + colA + ", " + munA + ", CP:" + cpA + ", " + estA, telA,
                edaA, edoA, resA, curpA, corA, empA, ingA, pueA);
        ct.setVehiculoContrato(marca, tipo, transmision, color, serie, motor, ano, distribuidor, uso);
        ct.setCotizacionContrato(precio, enganche, plazo, financiamiento, intereses, total, seguro, comision, tasi, cat);
        ct.setOtrosContrato(factura, saldo, idContrato, GetFechaActual(), GetFechaMeses(1), diadepago, beneficiario);
        ct.setGarantia(ubiG, garG, datG, folG, lugG, fecG);
        ct.setComisionPorcentaje(getComPor());
        ct.LeerContrato(idcotizacion);
        ct.LeerCopia(idcotizacion);
        ct.ImpresionCopia();
    }

    private void ImprimirAnexos() {
        AnexoA aa = new AnexoA();
        aa.setUsuario(cuenta, password);
        aa.Documento(idContrato, idcotizacion);
        aa.GuardarCuenta();
        aa.ImpresionAnexo();
    }

    private void ImprimirPagare() {
        String nu = JOptionPane.showInputDialog(this, "Número de pagaré: ", "Pagaré", JOptionPane.INFORMATION_MESSAGE);
        if (!nu.isEmpty()) {
            Pagare pa = new Pagare();
            pa.setUsuario(cuenta, password);
            pa.setDatos(idcotizacion, total, plazo, GetFechaActual(), nu);
            pa.LeerPagare();
        } else {
            JOptionPane.showMessageDialog(this, "Ingresa un número de pagaré", "Pagaré", JOptionPane.ERROR_MESSAGE);
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

    private void Guardar() {
        if(!textBeneficiario.getText().isEmpty()){
            beneficiario = textBeneficiario.getText();
            int op = JOptionPane.showConfirmDialog(this, "¿Estas seguro de que deseas continuar?");
            if (op == 0) {
                Conexion con = new Conexion();
                SQLContrato sc = new SQLContrato();
                String sql = sc.CambiarBeneficiario(idContrato,beneficiario);
                con.Conectar(cuenta, password);
                con.Modificar(sql);
                con.Cerrar();
            } else {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Ingresa el nombre del beneficiario");
        }
    }

    private void AbrirClienteCompleto() {
        ClienteCompleto cc = new ClienteCompleto(this, true);
        cc.setUsuario(cuenta, password);
        cc.setDatos(idC, patC, matC, nomC, telC, rfcC, nacC, proC, edad, correo, curp, civilC);
        cc.setDatosDomicilio(calC, intC, extC, colC, munC, estC, cpC, residencia);
        cc.setDatosTrabajo(caltC, inttC, exttC, coltC, muntC, esttC, cptC, teltC, empresa, puesto, ingreso);
        cc.setDatos2(edadC, correoC, curpC, civilC, resiC, empC, puestoC, ingC);
        cc.setLocationRelativeTo(null);
        cc.setVisible(true);
        BuscarCliente();
        textCliente.setText(patC + " " + matC + " " + nomC);
    }

    private void AbrirAutoCompleto() {
        AutoCompleto ac = new AutoCompleto(this, true);
        ac.setUsuario(cuenta, password);
        ac.setDatosAuto(idV, marca, tipo, transmision, color, serie, motor, ano, distribuidor, uso);
        ac.setLocationRelativeTo(null);
        ac.setVisible(true);
        textAuto.setText(marca + " - " + tipo + " - " + ano);
    }

    private void AbrirAvalCompleto() {
        AvalCompleto ac = new AvalCompleto(this, true);
        ac.setUsuario(cuenta, password);
        ac.setIdAval(idC);
        ac.VerificarExistencia();
        ac.setLocationRelativeTo(null);
        ac.setVisible(true);
        BuscarAvalYGarantia();

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
}
