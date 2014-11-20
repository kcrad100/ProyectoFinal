/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class MenuPpal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPpal
     */
    public MenuPpal() {
        initComponents();
        String ruta = getRuta();
        if (ruta.equalsIgnoreCase("ninguno")) {
            
        } else {
            cargar(ruta);
        }
        
    }
    
    public void guardar(String ruta) {
        
        if (ruta.equalsIgnoreCase("ninguno")) {
            JOptionPane.showMessageDialog(null, "Atención Usuario los datos no se guardaran.");
        } else {
            FileOutputStream fos = null;
            ObjectOutputStream salida = null;
            try {
                fos = new FileOutputStream(ruta);
                salida = new ObjectOutputStream(fos);
                salida.writeObject(this.bd);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "Ocurrio un error, no se puede encontrar el archivo. \n "
                        + e.getMessage(), "Error!",
                        JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ocurrio un error, problema con la clase IO. \n "
                        + e.getMessage(), "Error!",
                        JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                    if (salida != null) {
                        salida.close();
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,
                            "Ocurrio un error, problema con la clase IO. \n "
                            + e.getMessage(), "Error!",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }
    
    public static void cargar(String ruta) {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        BaseDatos basedatos = null;
        try {
            fis = new FileInputStream(ruta);
            entrada = new ObjectInputStream(fis);
            basedatos = (BaseDatos) entrada.readObject();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocurrio un error, no se puede encontrar el archivo. \n "
                    + e.getMessage(), "Error!",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrio un error, no existe la clase. \n "
                    + e.getMessage(), "Error!",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrio un error, problema con la clase IO. \n "
                    + e.getMessage(), "Error!",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ocurrio un error, problema con la clase IO. \n "
                        + e.getMessage(), "Error!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (basedatos != null) {
            bd = basedatos;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro ninguna instancia de la Clase BaseDatos para cargar. Intente de nuevo.");
            bd = new BaseDatos();
        }
        
    }
    
    public String getRuta() {
        String rutaArchivo = "ninguno";
        JFileChooser filechooser = new JFileChooser();
        int returnVal = filechooser.showDialog(filechooser, null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            rutaArchivo = file.getAbsolutePath();
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            int respuesta = JOptionPane.showConfirmDialog(null,
                    "¿Desea seleccionar algun archivo?", "Advertencia",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                rutaArchivo = "ninguno";
            } else if (respuesta == JOptionPane.YES_OPTION) {
                getRuta();
            }
        }
        return rutaArchivo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btAddProd = new javax.swing.JButton();
        btConsProd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btAddClie = new javax.swing.JButton();
        btConsClie = new javax.swing.JButton();
        btAddVent = new javax.swing.JButton();
        btConsVent = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("PRODUCTOS");

        btAddProd.setText("Agregar");
        btAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProdActionPerformed(evt);
            }
        });

        btConsProd.setText("Consultar");
        btConsProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsProdActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CLIENTES");

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("VENTAS");

        btAddClie.setText("Agregar");
        btAddClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddClieActionPerformed(evt);
            }
        });

        btConsClie.setText("Consultar");
        btConsClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsClieActionPerformed(evt);
            }
        });

        btAddVent.setText("Agregar");
        btAddVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddVentActionPerformed(evt);
            }
        });

        btConsVent.setText("Consultar");
        btConsVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsVentActionPerformed(evt);
            }
        });

        jLabel4.setText("MENÚ PRINCIPAL");

        jButton1.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btAddVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(btAddProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAddClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btConsProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btConsClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btConsVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddProd)
                    .addComponent(btConsProd))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddClie)
                    .addComponent(btConsClie))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddVent)
                    .addComponent(btConsVent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddClieActionPerformed
        this.setVisible(false);
        this.addClie.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_btAddClieActionPerformed

    private void btConsClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsClieActionPerformed
        this.setVisible(false);
        this.consultar.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsClieActionPerformed

    private void btAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProdActionPerformed
        this.setVisible(false);
        addProd.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddProdActionPerformed

    private void btConsProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsProdActionPerformed
        this.setVisible(false);

        // Evento que llama el formulario de consultar producto
    }//GEN-LAST:event_btConsProdActionPerformed

    private void btConsVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsVentActionPerformed

        // Evento que llama el formulario de consultar venta
    }//GEN-LAST:event_btConsVentActionPerformed

    private void btAddVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddVentActionPerformed
        if (bd.getClientes().isEmpty() || bd.getProductos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deben existir al menos un Cliente y un Producto para agregar una Venta", "Error Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            this.setVisible(false);
            addVenta.setVisible(true);
        }
    }//GEN-LAST:event_btAddVentActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        guardar(getRuta());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private static MenuPpal menupri;
    
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
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        bd = new BaseDatos();
        menupri = new MenuPpal();
        menupri.setVisible(true);
        addClie = new AddCliente(menupri);
        addClie.setBd(bd);
        consultar = new ConsCliente(menupri);
        consultar.setBd(bd);
        addProd = new AddProducto(menupri);
        addProd.setBd(bd);
        addVenta = new AddVenta(menupri);
        addVenta.setBd(bd);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddClie;
    private javax.swing.JButton btAddProd;
    private javax.swing.JButton btAddVent;
    private javax.swing.JButton btConsClie;
    private javax.swing.JButton btConsProd;
    private javax.swing.JButton btConsVent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    private static BaseDatos bd;
    private static AddCliente addClie;
    private static ConsCliente consultar;
    private static AddProducto addProd;
    private static int opcion;
    private static AddVenta addVenta;
    
}
