package GUI;

import DataBase.Conexion;
import DataBase.SQLContrato;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ClienteCompleto extends javax.swing.JDialog {
    
    public boolean control = false;
    public int id, cp;
    public String pat, mat, nom, tel, rfc, nac, pro, cal, col, mun, edo, calT, colT, munT, edoT, telT;
    public int edad, residencia,cpT;
    public String correo, curp, civil, empresa, puesto, ingreso;
    public String cuenta, inteT, exteT, inte,exte;
    private String password;

    public ClienteCompleto(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        textPaterno = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textRFC = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textNacionalidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        boxTrabajador = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        textProfesion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textInterior = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textExterior = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        textColonia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        textCP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        textMunicipio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        textInteriorT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textExteriorT = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        textColoniaT = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        textCPT = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        textMunicipioT = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textCalleT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        textTelefonoT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        textEdad = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        textCorreo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        textCURP = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        comboCivil = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        textResidencia = new javax.swing.JTextField();
        comboEdo = new javax.swing.JComboBox<>();
        comboEdoT = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        textEmpresa = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        textPuesto = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        textIngreso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos del cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Apellido paterno:");

        textPaterno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPaternoKeyTyped(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Telefono:");

        textTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("RFC:");

        textRFC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRFCKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Nacionalidad:");

        textNacionalidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textNacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNacionalidadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellido materno:");

        textMaterno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textMaternoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre (s):");

        textNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });

        boxTrabajador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boxTrabajador.setText("Trabajador");
        boxTrabajador.setIconTextGap(5);
        boxTrabajador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                boxTrabajadorStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Profesión:");

        textProfesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textProfesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProfesionKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Calle:");

        textCalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Domicilio del cliente.");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("# Interior");

        textInterior.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textInterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textInteriorKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("# Exterior");

        textExterior.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textExterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textExteriorKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Colonia:");

        textColonia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("CP:");

        textCP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCPKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Municipio:");

        textMunicipio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textMunicipioKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("# Interior");

        textInteriorT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textInteriorT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textInteriorTKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("# Exterior");

        textExteriorT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textExteriorT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textExteriorTKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Colonia:");

        textColoniaT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("CP:");

        textCPT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCPT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCPTKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Municipio:");

        textMunicipioT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMunicipioT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textMunicipioTKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Estado:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Calle:");

        textCalleT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Domicilio laboral del cliente.");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Teléfono:");

        textTelefonoT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textTelefonoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoTKeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trabajo.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casa.png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Edad:");

        textEdad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEdadKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("Correo:");

        textCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("CURP:");

        textCURP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCURP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCURPKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("Estado civil:");

        comboCivil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "COMPROMETIDO" }));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("Años de residencia:");

        textResidencia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textResidencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textResidenciaKeyTyped(evt);
            }
        });

        comboEdo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboEdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado de México", "Ciudad de México", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacan", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosi", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan", "Zacatecas" }));

        comboEdoT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboEdoT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado de México", "Ciudad de México", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacan", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosi", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan", "Zacatecas" }));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Empresa:");

        textEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Puesto:");

        textPuesto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Fecha de ingreso:");

        textIngreso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(textPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMaterno)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boxTrabajador)
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel19))
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34)
                                            .addComponent(textEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35)
                                            .addComponent(textPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36)
                                            .addComponent(textIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel26)
                                                    .addComponent(textMunicipioT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel27)
                                                    .addComponent(comboEdoT, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textCPT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(textCalleT, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(textInteriorT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(textExteriorT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(textTelefonoT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24)
                                            .addComponent(textColoniaT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(textMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(comboEdo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textCP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textResidencia)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(textInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(textExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(textColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(textRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(textNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel31)
                                            .addComponent(textCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(comboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(846, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(37, 37, 37)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel29)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboEdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(36, 36, 36)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textCP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxTrabajador)
                                    .addComponent(jLabel19)
                                    .addComponent(textProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(36, 36, 36))
                            .addComponent(textIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textCalleT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textInteriorT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textExteriorT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textColoniaT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(textMunicipioT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboEdoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addGap(36, 36, 36)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textCPT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textTelefonoT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(36, 36, 36))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(13, 13, 13))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(276, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Regresar();
    }//GEN-LAST:event_exitActionPerformed

    private void boxTrabajadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_boxTrabajadorStateChanged
        AnularProfesion();
    }//GEN-LAST:event_boxTrabajadorStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPaternoKeyTyped
        EventoTexto(evt,textPaterno);
    }//GEN-LAST:event_textPaternoKeyTyped

    private void textMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMaternoKeyTyped
        EventoTexto(evt, textMaterno);
    }//GEN-LAST:event_textMaternoKeyTyped

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        EventoTexto(evt, textNombre);
    }//GEN-LAST:event_textNombreKeyTyped

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        EventoEnteroLimite(evt, textTelefono,25);
    }//GEN-LAST:event_textTelefonoKeyTyped

    private void textRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRFCKeyTyped
        EventoLimite(evt,textRFC, 13);
    }//GEN-LAST:event_textRFCKeyTyped

    private void textNacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNacionalidadKeyTyped
        EventoTexto(evt,textNacionalidad);
    }//GEN-LAST:event_textNacionalidadKeyTyped

    private void textProfesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProfesionKeyTyped
        EventoTexto(evt,textProfesion);
    }//GEN-LAST:event_textProfesionKeyTyped

    private void textInteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textInteriorKeyTyped
      
    }//GEN-LAST:event_textInteriorKeyTyped

    private void textExteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textExteriorKeyTyped
        
    }//GEN-LAST:event_textExteriorKeyTyped

    private void textMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMunicipioKeyTyped
        EventoTexto(evt,textMunicipio);
    }//GEN-LAST:event_textMunicipioKeyTyped

    private void textCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCPKeyTyped
        EventoEnteroLimite(evt,textCP,5);
    }//GEN-LAST:event_textCPKeyTyped

    private void textInteriorTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textInteriorTKeyTyped
        
    }//GEN-LAST:event_textInteriorTKeyTyped

    private void textExteriorTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textExteriorTKeyTyped
       
    }//GEN-LAST:event_textExteriorTKeyTyped

    private void textMunicipioTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMunicipioTKeyTyped
        EventoTexto(evt,textMunicipioT);
    }//GEN-LAST:event_textMunicipioTKeyTyped

    private void textCPTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCPTKeyTyped
        EventoEnteroLimite(evt,textCPT,5);
    }//GEN-LAST:event_textCPTKeyTyped

    private void textTelefonoTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoTKeyTyped
        EventoEnteroLimite(evt,textTelefonoT,25);
    }//GEN-LAST:event_textTelefonoTKeyTyped

    private void textEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEdadKeyTyped
        EventoEnteroLimite(evt, textEdad, 2);
    }//GEN-LAST:event_textEdadKeyTyped

    private void textCURPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCURPKeyTyped
        EventoLimite(evt,textCURP,18);
    }//GEN-LAST:event_textCURPKeyTyped

    private void textResidenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textResidenciaKeyTyped
        EventoEnteroLimite(evt, textResidencia, 2);
    }//GEN-LAST:event_textResidenciaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxTrabajador;
    private javax.swing.JComboBox<String> comboCivil;
    private javax.swing.JComboBox<String> comboEdo;
    private javax.swing.JComboBox<String> comboEdoT;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField textCP;
    private javax.swing.JTextField textCPT;
    private javax.swing.JTextField textCURP;
    private javax.swing.JTextField textCalle;
    private javax.swing.JTextField textCalleT;
    private javax.swing.JTextField textColonia;
    private javax.swing.JTextField textColoniaT;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textEmpresa;
    private javax.swing.JTextField textExterior;
    private javax.swing.JTextField textExteriorT;
    private javax.swing.JTextField textIngreso;
    private javax.swing.JTextField textInterior;
    private javax.swing.JTextField textInteriorT;
    private javax.swing.JTextField textMaterno;
    private javax.swing.JTextField textMunicipio;
    private javax.swing.JTextField textMunicipioT;
    private javax.swing.JTextField textNacionalidad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPaterno;
    private javax.swing.JTextField textProfesion;
    private javax.swing.JTextField textPuesto;
    private javax.swing.JTextField textRFC;
    private javax.swing.JTextField textResidencia;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textTelefonoT;
    // End of variables declaration//GEN-END:variables

    private void EventoLimite(KeyEvent evt, JTextField text, int limite) { //Key Typed
         if (text.getText().length() == limite) {
            getToolkit().beep();
            evt.consume();
        }
    }
    
    private void EventoTexto(KeyEvent evt, JTextField text){ //Key Typed
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c)&& (c != evt.VK_SPACE)){
            getToolkit().beep();
            evt.consume();    
        }
    }
    
    private void Registrar(){
        int control = 0;
        pat = textPaterno.getText();
        mat = textMaterno.getText();
        nom = textNombre.getText();
        tel = textTelefono.getText();
        rfc = textRFC.getText();
        nac = textNacionalidad.getText();
        edad = Integer.parseInt(textEdad.getText());
        correo = textCorreo.getText();
        if(correo.isEmpty()){
            correo = "N/A";
        }
        curp = textCURP.getText();
        civil = comboCivil.getSelectedItem().toString();
        if(pat.isEmpty() || mat.isEmpty() || nom.isEmpty() || tel.isEmpty() || rfc.isEmpty() || nac.isEmpty() 
                || correo.isEmpty() || curp.isEmpty() || civil.isEmpty()){
            JOptionPane.showMessageDialog(this,"Verifica la información del cliente");
            control = 0;
        }
        else{
            control++; //1
        }
        cal = textCalle.getText();
        if(!textInterior.getText().isEmpty()){
            inte = textInterior.getText();
        }
        else{
            inte = "S/N";
        }       
        exte = textExterior.getText();
        col = textColonia.getText();
        mun = textMunicipio.getText();
        edo = comboEdo.getSelectedItem().toString();
        cp = Integer.parseInt(textCP.getText());
        residencia = Integer.parseInt(textResidencia.getText());
        if(cal.isEmpty() || exte.isEmpty() || col.isEmpty() || mun.isEmpty() || edo.isEmpty() || cp == 0){
            JOptionPane.showMessageDialog(this,"Verifica el domicilio del cliente");
            control = 0;
        }
        else{
            control ++; //2
        }
        System.out.println("profesion");
        if (boxTrabajador.isSelected()) {
            pro = textProfesion.getText();
            if(pro.isEmpty()){
                pro = "N/A";
            }
            calT = textCalleT.getText();
            if(calT.isEmpty()){
                calT = "N/A";
            }
            if(textInteriorT.getText().isEmpty()){
                inteT = "S/N";
            }
            else {
                inteT = textInteriorT.getText();
            }
            exteT = textExteriorT.getText();
            colT = textColoniaT.getText();
            munT = textMunicipioT.getText();
            edoT = (String) comboEdoT.getSelectedItem();
            cpT = Integer.parseInt(textCPT.getText());
            telT = textTelefonoT.getText();
            empresa = textEmpresa.getText();
            if(empresa.isEmpty()){
                empresa = "N/A";
            }
            puesto = textPuesto.getText();
            if(puesto.isEmpty()){
                puesto = "N/A";
            }
            ingreso = textIngreso.getText();
            if(ingreso.isEmpty()){
                ingreso = "N/A";
            }
            if(pro.isEmpty() || calT.isEmpty() || exteT.isEmpty()|| colT.isEmpty() || munT.isEmpty() || edoT.isEmpty() || cpT == 0 
                    || telT.isEmpty() || empresa.isEmpty() || puesto.isEmpty() || ingreso.isEmpty()){
                JOptionPane.showMessageDialog(this, "Verifica el domicilio laboral del cliente");
                control = 0;
            }
            else{
                control++; //3
            }
        } else {
            pro = "_";
            calT = "_";
            inteT = "_";
            exteT = "_";
            colT = "_";
            munT = "_";
            edoT = "_";
            cpT = 0;
            telT = "_";
            empresa = "_";
            puesto = "_";
            ingreso = "_";
            control++; //3
        }
        System.out.println("Verificacion terminada :D");
        if(control == 3){
            Conexion con = new Conexion();
            SQLContrato sc = new SQLContrato();
            String sql = sc.GuardarClienteCompleto(id,pat,mat,nom,nac,pro,cal,
                    inte,exte,col,mun,cp,edo,tel,rfc,calT,exteT,inteT,colT,munT,
                    cpT,edoT,telT,edad,correo,curp,civil,residencia,empresa,
                    puesto,ingreso);
            con.Conectar(cuenta, password);
            con.Modificar(sql);
            con.Cerrar();
            this.control = true;
            this.dispose();
        }          
    }
    
    public void setDatos(int id, String pat, String mat, String nom, String tel, 
            String rfc, String nac, String pro, int edad, String correo, String curp, String civil){
        this.id = id;
        this.pat = pat;
        this.mat = mat;
        this.nom = nom;
        this.tel = tel;
        this.rfc = rfc;
        this.nac = nac;
        this.pro = pro;
        this.edad = edad;
        this.correo = correo;
        this.curp = curp;
        this.civil = civil;
        textPaterno.setText(pat);
        textMaterno.setText(mat);
        textNombre.setText(nom);
        textTelefono.setText(tel);
        textRFC.setText(rfc);
        textNacionalidad.setText(nac);
        textProfesion.setText(pro);
        textEdad.setText(""+edad);
        textCorreo.setText(correo);
        textCURP.setText(curp);
        System.out.println("civil = "+civil);
        comboCivil.setSelectedItem(civil);
        if(textProfesion.getText().isEmpty()){
            boxTrabajador.setSelected(false);
            AnularProfesion();
        }
        else{
            boxTrabajador.setSelected(true);
            textProfesion.setText(pro);
        }
    }
    
    public void setDatosDomicilio(String cal, String inte, String exte, String col, String mun, String edo, int cp,
            int residencia){
        this.residencia = residencia;
        textResidencia.setText(""+residencia);
        this.cal = cal;
        textCalle.setText(cal);
        this.inte = inte;
        textInterior.setText(inte+"");
        this.exte = exte;
        textExterior.setText(exte+"");
        this.col = col;
        textColonia.setText(col);
        this.mun = mun;
        textMunicipio.setText(mun);
        this.edo = edo;
        comboEdo.setSelectedItem(edo);
        this.cp = cp;
        textCP.setText(cp+"");
    }
    
    public void setDatosTrabajo(String calT, String inteT, String exteT, String colT, 
            String munT, String edoT, int cpT, String telT,
            String empresa, String puesto, String ingreso){
        this.ingreso = ingreso;
        textIngreso.setText(ingreso);
        this.puesto = puesto;
        textPuesto.setText(puesto);
        this.empresa = empresa;
        textEmpresa.setText(empresa);
        this.calT = calT;
        textCalleT.setText(calT);
        this.inteT = inteT;
        textInteriorT.setText(inteT+"");
        this.exteT = exteT;
        textExteriorT.setText(exteT+"");
        this.colT = colT;
        textColoniaT.setText(colT);
        this.munT = munT;
        textMunicipioT.setText(munT);
        this.edoT = edoT;
        comboEdoT.setSelectedItem(edoT);
        this.cpT = cpT;
        textCPT.setText(cpT+"");
        this.telT = telT;
        textTelefonoT.setText(telT);
    }
    
    private void Regresar(){
        this.dispose();
        //this.control = false;
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

    private void AnularProfesion() {
       if(boxTrabajador.isSelected()){
           textProfesion.setEditable(true);
           textCalleT.setEditable(true);
           textInteriorT.setEditable(true);
           textExteriorT.setEditable(true);
           textColoniaT.setEditable(true);
           textMunicipioT.setEditable(true);
           comboEdoT.setSelectedItem(edoT);
           textCPT.setEditable(true);
           textTelefonoT.setEditable(true);
           textEmpresa.setEditable(true);
           textPuesto.setEditable(true);
           textIngreso.setEditable(true);
       }
       else{
           textProfesion.setText(null);
           textProfesion.setEditable(false);
           textCalleT.setText(null);
           textCalleT.setEditable(false);
           textInteriorT.setText(null);
           textInteriorT.setEditable(false);
           textExteriorT.setText(null);
           textExteriorT.setEditable(false);
           textColoniaT.setText(null);
           textColoniaT.setEditable(false);
           textMunicipioT.setText(null);
           textMunicipioT.setEditable(false);
           comboEdoT.setSelectedItem(edoT);
           textCPT.setText(null);
           textCPT.setEditable(false);
           textTelefonoT.setText(null);
           textTelefonoT.setEditable(false);
           textEmpresa.setText(null);
           textEmpresa.setEditable(false);
           textPuesto.setText(null);
           textPuesto.setEditable(false);
           textIngreso.setText(null);
           textIngreso.setEditable(false);
       }
    }
    
    private void EventoEnteroLimite(KeyEvent evt, JTextField text, int limite) { //Key Typed
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter) && (caracter != evt.VK_BACK_SPACE) && (caracter != evt.VK_ENTER) && (caracter != evt.VK_ESCAPE)){
            getToolkit().beep();
            evt.consume();
        } else if (text.getText().length() == limite) {
            getToolkit().beep();
            evt.consume();
        }
    }
    
    void setUsuario(String cuenta, String password) {
        this.cuenta = cuenta;
        this.password = password;
    }

    void setDatos2(int edadC, String correoC, String curpC, String civilC, int resiC, String empC, String puestoC, String ingC) {
        edad = edadC;
        correo = correoC;
        curp = curpC;
        civil = civilC;
        residencia = resiC;
        empresa = empC;
        puesto = puestoC;
        ingreso = ingC;
        textEdad.setText(edad+"");
        textCorreo.setText(correo);
        textCURP.setText(curp);
        comboEdo.setSelectedItem(civil);
        textResidencia.setText(residencia+"");
        textEmpresa.setText(empresa);
        textPuesto.setText(puesto);
        textIngreso.setText(ingreso);
    }

}
