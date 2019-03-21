/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Excepciones.CamposInvalidos;
import Excepciones.CamposVaciosException;
import inter.Inter;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.ListModel;

/**
 *
 * @author EnriqueS
 */
public class Internacionalizacion extends javax.swing.JFrame {

    static Inter inter = null;
    static Object elementosVisuales;
    static String id;

    /**
     * Creates new form Internacionalizacion
     */
    public Internacionalizacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jFrame3.setTitle("Practica Internacionalizacion");
        jFrame3.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.interiorBackground"));
        jFrame3.setMinimumSize(new Dimension(605, 498));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarElemento(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCancion(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4)
                            .addGap(2, 2, 2))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica Internacionalizacion");
        setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.interiorBackground"));
        setMinimumSize(new java.awt.Dimension(600, 498));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.setRequestFocusEnabled(false);

        jLabel2.setText("2");
        jLabel2.setVisible(false);

        jComboBox1.setVisible(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");
        jLabel3.setVisible(false);

        jLabel4.setText("jLabel4");
        jLabel4.setVisible(false);

        jLabel5.setText("jLabel5");
        jLabel5.setVisible(false);

        jLabel6.setText("jLabel6");
        jLabel6.setVisible(false);

        jButton2.setVisible(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAcceptar(evt);
            }
        });

        jTextField1.setToolTipText("");
        jTextField1.setVisible(false);

        jTextField2.setVisible(false);

        jTextField3.setVisible(false);

        jTextField4.setVisible(false);

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(117, 117, 117)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 282, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1))
        );

        jComboBox1.getAccessibleContext().setAccessibleName("");

        jButton1.setText("jButton1");

        jMenu1.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCanciones(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenu3.setText("Configuracion");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Idioma");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickIdioma(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName(jFrame1.getTitle());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClickIdioma(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickIdioma
        try {
            try {
                // TODO add your handling code here:
                inter.crearMusica(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(),
                        jTextField4.getText());
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            } catch (CamposInvalidos ex) {
                JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 14));
            }
        } catch (CamposVaciosException ex) {
            JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 13));
        }
    }//GEN-LAST:event_ClickIdioma

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

        System.out.println();
        String idioma = "";
        idioma = jComboBox1.getSelectedItem().toString();
        inter.setIdiomaActual(idioma);
        jLabel1.setText(inter.obtenerLinea(idioma, 0));
        jLabel2.setText(inter.obtenerLinea(idioma, 1));
        jMenu1.setText(inter.obtenerLinea(idioma, 2));
        jMenu2.setText(inter.obtenerLinea(idioma, 3));
        jMenu3.setText(inter.obtenerLinea(idioma, 4));
        jMenuItem1.setText(inter.obtenerLinea(idioma, 5));
        jMenuItem2.setText(inter.obtenerLinea(idioma, 6));
        jMenuItem3.setText(inter.obtenerLinea(idioma, 7));
        jLabel3.setText(inter.obtenerLinea(idioma, 8));
        jLabel4.setText(inter.obtenerLinea(idioma, 9));
        jLabel5.setText(inter.obtenerLinea(idioma, 10));
        jLabel6.setText(inter.obtenerLinea(idioma, 11));
        jLabel7.setText(inter.obtenerLinea(idioma, 20));
        jButton2.setText(inter.obtenerLinea(idioma, 12));

        jButton3.setText(inter.obtenerLinea(idioma, 18));
        jButton4.setText(inter.obtenerLinea(idioma, 19));

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jComboBox1.setVisible(true);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.setVisible(true);
        jLabel2.setVisible(false);
        jComboBox1.setVisible(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jButton2.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void clickAcceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAcceptar
        // TODO add your handling code here:
        if (!jButton2.getText().equals(inter.obtenerLinea(inter.getIdiomaActual(), 12))) {

            try {
                inter.actualizarMusica(jTextField1.getText().trim(), jTextField2.getText().trim(), jTextField3.getText().trim(), jTextField4.getText().trim(), id + "");
                jButton2.setText(inter.obtenerLinea(inter.getIdiomaActual(), 12));

            } catch (CamposInvalidos ex) {
                JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 15));
            } catch (CamposVaciosException ex) {
                JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 13));
            }
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 17));

        } else {
            try {
                try {
                    // TODO add your handling code here:
                    inter.crearMusica(jTextField1.getText().trim(), jTextField2.getText().trim(), jTextField3.getText().trim(), jTextField4.getText().trim());
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 14));
                } catch (CamposInvalidos ex) {
                    JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 15));
                }
            } catch (CamposVaciosException ex ) {
                JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 13));
            }
        }
    }//GEN-LAST:event_clickAcceptar

    private void mostrarCanciones(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCanciones
        // TODO add your handling code here:
        jFrame3.setVisible(true);
        DefaultListModel dlm = new DefaultListModel();
        String nombres;
        for (int i = 0; i < inter.getCanciones().size(); i++) {
            nombres = jLabel3.getText() + ": " + inter.getCanciones().get(i).getNombre() + ". "
                    + jLabel4.getText() + ": " + inter.getCanciones().get(i).getCantante() + ". "
                    + jLabel5.getText() + ": " + inter.getCanciones().get(i).getAlbum() + ". "
                    + jLabel6.getText() + ": " + inter.getCanciones().get(i).getFecha() + ".";

            dlm.add(i, nombres);
        }
        jList1.setModel(dlm);
    }//GEN-LAST:event_mostrarCanciones

    private void modificarElemento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarElemento
        // TODO add your handling code here:
        jLayeredPane1.setVisible(true);
        jLabel2.setVisible(false);
        jComboBox1.setVisible(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jButton2.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jFrame3.setVisible(false);
        // TODO add your handling code here:
        String eleccion = jList1.getSelectedValue();
        ArrayList<String> ar;
        try {
            ar = inter.buscarNombre(eleccion);

            System.out.println(ar);
            if (ar.size() > 0) {
                jTextField1.setText(ar.get(0));
                jTextField2.setText(ar.get(1));
                jTextField3.setText(ar.get(2));
                jTextField4.setText(ar.get(3));
                jButton2.setText(inter.obtenerLinea(inter.getIdiomaActual(), 18));
                id = ar.get(4);
            }
        } catch (CamposInvalidos ex) {
            JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 16));
        }

    }//GEN-LAST:event_modificarElemento

    private void eliminarCancion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCancion
        // TODO add your handling code here:
        jLayeredPane1.setVisible(true);
        jLabel2.setVisible(false);
        jComboBox1.setVisible(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jButton2.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jFrame3.setVisible(false);
        // TODO add your handling code here:
        String eleccion = jList1.getSelectedValue();
        ArrayList<String> ar;
        try {
            ar = inter.buscarNombre(eleccion);

            System.out.println(ar);
            if (ar.size() > 0) {
                id = ar.get(4);
                inter.eliminarMusica(id);
                JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 21));

            }
        } catch (CamposInvalidos ex) {
            JOptionPane.showMessageDialog(jPanel1, inter.obtenerLinea(inter.getIdiomaActual(), 16));
        }

    }//GEN-LAST:event_eliminarCancion

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Internacionalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internacionalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internacionalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internacionalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Internacionalizacion in = new Internacionalizacion();
                in.setVisible(true);
                try {
                    inter = new Inter();
                    in.jLabel1.setText(inter.obtenerLinea("po", 0));
                    for (int i = 0; i < inter.getNombreIdiomas().size(); i++) {
                        in.jComboBox1.addItem(inter.getNombreIdiomas().get(i));
                    }
                } catch (Exception ex) {
                    // JPopupMenu jp = new JPopupMenu(inter.obtenerLinea(inter.getIdiomaActual(), 13
                    JOptionPane.showMessageDialog(in.jFrame1, "Error al cargar los idiomas");
                }

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
