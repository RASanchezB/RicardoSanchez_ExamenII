package examenii_ricardosanchez;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_ArmasA = new javax.swing.ButtonGroup();
        bg_ArmasR = new javax.swing.ButtonGroup();
        bg_ArmasP = new javax.swing.ButtonGroup();
        pm_MenuT = new javax.swing.JPopupMenu();
        mi_Mod = new javax.swing.JMenuItem();
        mi_Elim = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AR_1 = new javax.swing.JRadioButton();
        AR_2 = new javax.swing.JRadioButton();
        AR_3 = new javax.swing.JRadioButton();
        tf_NombreR = new javax.swing.JTextField();
        tf_IdR = new javax.swing.JTextField();
        tf_EdadR = new javax.swing.JTextField();
        tf_RangoR = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        AP_1 = new javax.swing.JRadioButton();
        AP_2 = new javax.swing.JRadioButton();
        AP_3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        tf_ApodoP = new javax.swing.JTextField();
        tf_NumCuentaP = new javax.swing.JTextField();
        tf_EdadP = new javax.swing.JTextField();
        tf_GradoAcademicoP = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_AliasA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_EdadA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_CastaA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AA_1 = new javax.swing.JRadioButton();
        AA_2 = new javax.swing.JRadioButton();
        AA_3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Ejercitos = new javax.swing.JTree();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        mi_Mod.setText("Modificar");
        mi_Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ModActionPerformed(evt);
            }
        });
        pm_MenuT.add(mi_Mod);

        mi_Elim.setText("Eliminar");
        mi_Elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ElimActionPerformed(evt);
            }
        });
        pm_MenuT.add(mi_Elim);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercito");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Reclutamiento de Rusos");

        jLabel8.setText("Nombre");

        jLabel9.setText("ID");

        jLabel10.setText("Edad");

        jLabel11.setText("Rango");

        jLabel13.setText("Tipo de arma:");

        bg_ArmasR.add(AR_1);
        AR_1.setText("AK - 47");

        bg_ArmasR.add(AR_2);
        AR_2.setText(" Revolver Navant");

        bg_ArmasR.add(AR_3);
        AR_3.setText("RPG - 7");

        jButton2.setText("Reclutar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(jLabel11)))
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_NombreR, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(tf_IdR)
                                    .addComponent(tf_RangoR)
                                    .addComponent(tf_EdadR)))
                            .addComponent(jLabel3)
                            .addComponent(AR_1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AR_2)
                            .addComponent(AR_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_NombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_IdR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tf_EdadR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_RangoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(AR_1)
                .addGap(18, 18, 18)
                .addComponent(AR_2)
                .addGap(18, 18, 18)
                .addComponent(AR_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Rusos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel14.setText("Reclutar alumnos");

        jLabel15.setText("Apodo:");

        jLabel16.setText("Numero de cuenta");

        jLabel17.setText("Edad");

        jLabel19.setText("Grado academico");

        jLabel20.setText("Tipo arma");

        bg_ArmasP.add(AP_1);
        AP_1.setSelected(true);
        AP_1.setText("Discos duros");

        bg_ArmasP.add(AP_2);
        AP_2.setText("Controles de Wii ");

        bg_ArmasP.add(AP_3);
        AP_3.setText("Laptops");

        jButton3.setText("Reclutar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_ApodoP, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(tf_NumCuentaP)
                    .addComponent(tf_EdadP)
                    .addComponent(tf_GradoAcademicoP))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(AP_1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AP_3)
                            .addComponent(AP_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_ApodoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_NumCuentaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_EdadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_GradoAcademicoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(AP_1)
                .addGap(18, 18, 18)
                .addComponent(AP_2)
                .addGap(18, 18, 18)
                .addComponent(AP_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Alumnos progra", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Reclutamiento de alemanes");

        jLabel2.setText("Alias");

        jLabel4.setText("Edad");

        jLabel5.setText("Casta");

        jLabel7.setText("Tipo de arma");

        bg_ArmasA.add(AA_1);
        AA_1.setSelected(true);
        AA_1.setText("Subfusil MP40");

        bg_ArmasA.add(AA_2);
        AA_2.setText("Pistola Walther");

        bg_ArmasA.add(AA_3);
        AA_3.setText(" Ametralladora MG42 ");

        jButton1.setText("Reclutar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AA_1)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AA_3)
                                    .addComponent(AA_2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_CastaA))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_AliasA, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_EdadA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 6, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_AliasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_EdadA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_CastaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(AA_1)
                .addGap(18, 18, 18)
                .addComponent(AA_2)
                .addGap(18, 18, 18)
                .addComponent(AA_3)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Alemanes", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel21.setText("Lista de Soldados");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Ejercitos");
        jt_Ejercitos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Ejercitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_EjercitosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Ejercitos);

        jButton6.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        jButton6.setText("FIGHT");

        jButton7.setText("Actualizar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jLabel6.setText("JTree:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Para cargar los soldados desde binario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(172, 172, 172)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista soldados", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String NombreR = tf_NombreR.getText();
        String IdR = tf_IdR.getText();
        int EdadR = Integer.parseInt(tf_EdadR.getText());
        String RangoR = tf_RangoR.getText();
        int PoderR = 0;
        int ResistenciaR = EdadR * 8;
        String TipoArmaR = null;
        if (AR_1.isSelected()) {
            TipoArmaR = "AK - 47";
            PoderR = 27;
        } else if (AR_2.isSelected()) {
            TipoArmaR = "Revolver Navant";
            PoderR = 13;
        } else if (AR_3.isSelected()) {
            TipoArmaR = "RPG - 7";
            PoderR = 57;
        }
        if (EdadR <= 18) {
            JOptionPane.showMessageDialog(AP_1, "Edad insuficiente para unirse a la guerra");
        } else if (EdadR < 25 && TipoArmaR.equals("RPG - 7")) {
            JOptionPane.showMessageDialog(AP_1, "Edad insuficiente para utilizar una RPG-7");
        } else {
            Rusos r = new Rusos(NombreR, IdR, EdadR, RangoR, ResistenciaR, TipoArmaR, PoderR);
            EjercitoR.add(r);
            JOptionPane.showMessageDialog(AP_1, "Soldado Guardado");
            AdministrarRusos AR = new AdministrarRusos("./EjercitoRuso.rsb");
            AR.cargarArchivo();
            AR.AgregarR(r);
            AR.escribitArchivo();
            //Limpiar texto
            tf_NombreR.setText("");
            tf_IdR.setText("");
            tf_EdadR.setText("");
            tf_RangoR.setText("");
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String ApodoP = tf_ApodoP.getText();
        String NumCuentaP = tf_NumCuentaP.getText();
        int EdadP = Integer.parseInt(tf_EdadP.getText());
        int ResistenciaP = EdadP * 8;
        String TipoArmaP = null;
        String GradoAcademicoP = tf_GradoAcademicoP.getText();
        int PoderP = 0;
        if (AP_1.isSelected()) {
            TipoArmaP = "Disco duro";
            PoderP = 23;
        } else if (AP_2.isSelected()) {
            TipoArmaP = "Controles de Wii";
            PoderP = 47;
        } else {
            TipoArmaP = "Laptops";
            PoderP = 76;
        }
        if (EdadP <= 16) {
            JOptionPane.showMessageDialog(AP_1, "Edad insuficiente para unirse a la guerra");
        } else {
            AlumnosD_Progra p = new AlumnosD_Progra(ApodoP, NumCuentaP, EdadP, ResistenciaP, TipoArmaP, GradoAcademicoP, PoderP);
            EjercitoP.add(p);
            JOptionPane.showMessageDialog(AP_1, "Soldado Guardado");
            AdministrarProgra AP = new AdministrarProgra("./EjercitoProgra.rsb");
            AP.cargarArchivo();
            AP.AgregarP(p);
            AP.escribitArchivo();
            //Limpiar TextField
            tf_ApodoP.setText("");
            tf_NumCuentaP.setText("");
            tf_EdadP.setText("");
            tf_GradoAcademicoP.setText("");
        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String AliasA = tf_AliasA.getText();
        int EdadA = Integer.parseInt(tf_EdadA.getText());
        String CastaA = tf_CastaA.getText();
        int ResistenciaA = EdadA * 8;
        String TipoArmaA = null;
        int PoderA = 0;
        if (AA_1.isSelected()) {
            TipoArmaA = "SubFusil MP40";
            PoderA = 25;
        } else if (AA_2.isSelected()) {
            TipoArmaA = "Pistola Walther";
            PoderA = 32;
        } else if (AA_3.isSelected()) {
            TipoArmaA = "Ametralladora MG-42";
            PoderA = 11;
        }
        if (EdadA <= 0) {
            JOptionPane.showMessageDialog(AP_1, "Edad insuficiente para unirse a la guerra");
        } else {
            Alemanes a = new Alemanes(AliasA, EdadA, CastaA, ResistenciaA, TipoArmaA, PoderA);
            EjercitoA.add(a);
            JOptionPane.showMessageDialog(AP_1, "Soldado Guardado");
            AdministrarArchivo AA = new AdministrarArchivo("./EjercitoAlemanes.rsb");
            AA.cargarArchivo();
            AA.AgregarA(a);
            AA.escribitArchivo();
            //Limpiar TextField
            tf_AliasA.setText("");
            tf_EdadA.setText("");
            tf_CastaA.setText("");
            
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jt_EjercitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_EjercitosMouseClicked
        if (evt.isMetaDown()) {
            pm_MenuT.pack();
            pm_MenuT.show(jt_Ejercitos, evt.getX(), evt.getY());
            pm_MenuT.setVisible(true);
        }
    }//GEN-LAST:event_jt_EjercitosMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        DefaultTreeModel modelo = (DefaultTreeModel) jt_Ejercitos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        //Reiniciar la JTree (Vaciar todo menos la raiz)
        raiz.removeAllChildren();
        modelo.reload();
        //Conseguir los soldados de binario
        AdministrarRusos AR = new AdministrarRusos("./EjercitoRuso.rsb");
        AdministrarArchivo AA = new AdministrarArchivo("./EjercitoAlemanes.rsb") ;
        AdministrarProgra AP = new AdministrarProgra("./EjercitoProgra.rsb");
        //Cargar los soldados
        AR.cargarArchivo();
        AA.cargarArchivo();
        AP.cargarArchivo();
        //Crear los nodos
        DefaultMutableTreeNode Rusos = new DefaultMutableTreeNode("Soldados Rusos");
        DefaultMutableTreeNode Alemanes = new DefaultMutableTreeNode("Soldados Alemanes");
        DefaultMutableTreeNode Progra = new DefaultMutableTreeNode("Soldados Programacion");
        //Meter todos los soldados en el tree
        for (int i = 0; i < AR.getEjercitoR().size(); i++) {
            DefaultMutableTreeNode SR = new DefaultMutableTreeNode(AR.getEjercitoR().get(i));
            Rusos.add(SR);
            raiz.add(Rusos);
        }
        for (int i = 0; i < AA.getEjercitoA().size(); i++) {
            DefaultMutableTreeNode SA = new DefaultMutableTreeNode(AA.getEjercitoA().get(i));
            Alemanes.add(SA);
            raiz.add(Alemanes);
        }
        for (int i = 0; i < AP.getEjercitoP().size(); i++) {
            DefaultMutableTreeNode SP = new DefaultMutableTreeNode(AP.getEjercitoP().get(i));
            Progra.add(SP);
            raiz.add(Progra);
        }
        modelo.reload();
    }//GEN-LAST:event_jButton7MouseClicked

    private void mi_ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ModActionPerformed
        DefaultTreeModel modelo = (DefaultTreeModel)jt_Ejercitos.getModel();
        MutableTreeNode raiz = (MutableTreeNode)modelo.getRoot();
        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) jt_Ejercitos.getSelectionPath().getLastPathComponent();
        Object objeto=nodo.getUserObject();
        if (objeto instanceof Rusos) {
            String ModN = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
            String ModI = JOptionPane.showInputDialog("Ingrese la nueva identidad");
            int ModE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad"));
            String ModR = JOptionPane.showInputDialog("Ingrese rango");
            int ModRe = ModE * 8;
            int ModTA = Integer.parseInt(JOptionPane.showInputDialog("Elija un arma: "
                    + "\n1) AK-47"
                    + "\n2) Revolver"
                    + "\n3) RPG-7"));
            String ModArma = null;
            int ModP = 0;
            if(ModTA == 1){
                ModArma = "AK-47";
                ModP = 27;
            }else if(ModTA == 2){
                ModArma = "Revolver Navant";
                ModP = 13;
            }else{
                ModArma = "RPG-7";
                ModP = 57;
            }
            ((Rusos) objeto).setNombre(ModN);
            ((Rusos) objeto).setID(ModI);
            ((Rusos) objeto).setEdad(ModE);
            ((Rusos) objeto).setRango(ModR);
            ((Rusos) objeto).setResistencia(ModRe);
            ((Rusos) objeto).setTipoDArma(ModArma);
            ((Rusos) objeto).setPoder(ModP);
            
            
            
        }
        if (objeto instanceof Alemanes) {
            String ModA = JOptionPane.showInputDialog("Ingrese Alias");
            int ModE =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
            String ModC = JOptionPane.showInputDialog("Ingrese casta");
            int ModTDA = Integer.parseInt("Tipo de arma:"
                    + "\n1)Subfusil MP-40"
                    + "\n2)Pistola Walther"
                    + "\n3)Ametralladora MG42");
            String ModArma = null;
            int ModP = 0;
            if(ModTDA == 1){
                ModArma = "Subfusil MP-40";
                ModP = 25;
            }else if(ModTDA == 2){
                ModArma = "Pistola Walther";
                ModP = 32;
            }else{
                ModArma = "Ametralladora MG42";
                ModP = 11;
            }
            ((Alemanes) objeto).setAlias(ModA);
            ((Alemanes) objeto).setEdad(ModE);
            ((Alemanes) objeto).setCasta(ModC);
            ((Alemanes) objeto).setTipoDArma(ModArma);
            ((Alemanes) objeto).setPoder(ModP);
            
        }
        if (objeto instanceof AlumnosD_Progra) {
            
        }
                
    }//GEN-LAST:event_mi_ModActionPerformed

    private void mi_ElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ElimActionPerformed
        DefaultTreeModel modelo = (DefaultTreeModel)jt_Ejercitos.getModel();
        MutableTreeNode raiz = (MutableTreeNode)modelo.getRoot();
        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) jt_Ejercitos.getSelectionPath().getLastPathComponent();
        Object objeto=nodo.getUserObject();
        if (objeto instanceof Rusos) {
            EjercitoR.remove((Rusos)objeto);
        }
        if (objeto instanceof Alemanes) {
            EjercitoA.remove((Alemanes)objeto);
        }
        if (objeto instanceof AlumnosD_Progra) {
            EjercitoP.remove((AlumnosD_Progra)objeto);
        }
        
    }//GEN-LAST:event_mi_ElimActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AA_1;
    private javax.swing.JRadioButton AA_2;
    private javax.swing.JRadioButton AA_3;
    private javax.swing.JRadioButton AP_1;
    private javax.swing.JRadioButton AP_2;
    private javax.swing.JRadioButton AP_3;
    private javax.swing.JRadioButton AR_1;
    private javax.swing.JRadioButton AR_2;
    private javax.swing.JRadioButton AR_3;
    private javax.swing.ButtonGroup bg_ArmasA;
    private javax.swing.ButtonGroup bg_ArmasP;
    private javax.swing.ButtonGroup bg_ArmasR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree jt_Ejercitos;
    private javax.swing.JMenuItem mi_Elim;
    private javax.swing.JMenuItem mi_Mod;
    private javax.swing.JPopupMenu pm_MenuT;
    private javax.swing.JTextField tf_AliasA;
    private javax.swing.JTextField tf_ApodoP;
    private javax.swing.JTextField tf_CastaA;
    private javax.swing.JTextField tf_EdadA;
    private javax.swing.JTextField tf_EdadP;
    private javax.swing.JTextField tf_EdadR;
    private javax.swing.JTextField tf_GradoAcademicoP;
    private javax.swing.JTextField tf_IdR;
    private javax.swing.JTextField tf_NombreR;
    private javax.swing.JTextField tf_NumCuentaP;
    private javax.swing.JTextField tf_RangoR;
    // End of variables declaration//GEN-END:variables
    ArrayList<Alemanes> EjercitoA = new ArrayList();
    ArrayList<Rusos> EjercitoR = new ArrayList();
    ArrayList<AlumnosD_Progra> EjercitoP = new ArrayList();
}
