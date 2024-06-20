/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.interfaz;

import basedatos.SQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stock.Departamento;
import basedatos.CRUD;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.border.TitledBorder;
import stock.Producto;

public class AlmacenDIALOG extends javax.swing.JDialog {

    CRUD crud;
    List<Departamento> departamentos;
    ArrayList<Integer> idProducto;

    public AlmacenDIALOG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.crud = new CRUD();
        this.idProducto = new ArrayList();
        mostrarAlmacen();
        cargarDepartamentos();
        this.setLocationRelativeTo(null);
        btnBuscar.requestFocusInWindow();
        boxDepartamento.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        boxDepartamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Almacen = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Almacén"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Código producto:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre producto:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        boxDepartamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxDepartamentoMouseClicked(evt);
            }
        });
        boxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDepartamentoActionPerformed(evt);
            }
        });
        boxDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxDepartamentoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Departamento:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        Almacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Almacen);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Ver todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boxDepartamento.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void boxDepartamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxDepartamentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.requestFocus();
        }
    }//GEN-LAST:event_boxDepartamentoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.Almacen.getModel();
        String codigoBuscar = this.txtCodigo.getText();
        String nombreBuscar = this.txtNombre.getText();

        if (txtCodigo.isEnabled() && txtNombre.isEnabled() == false && boxDepartamento.isEnabled() == false) {
            modelo.setRowCount(0);
            buscarXCodigo(codigoBuscar);

        } else if (txtCodigo.isEnabled() == false && txtNombre.isEnabled() && boxDepartamento.isEnabled() == false) {
            modelo.setRowCount(0);
            buscarXNombre(nombreBuscar);
        } else if (txtCodigo.isEnabled() == false && txtNombre.isEnabled() == false && boxDepartamento.isEnabled()) {
            int indice = this.boxDepartamento.getSelectedIndex();
            int idDepBuscar = this.departamentos.get(indice).getId_departamento();
            modelo.setRowCount(0);
            buscarXDepartamento(String.valueOf(idDepBuscar));
            System.out.println("idDepBuscar = " + idDepBuscar);
        }

        txtCodigo.setEnabled(true);
        txtNombre.setEnabled(true);
        boxDepartamento.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked
        this.txtNombre.setEnabled(false);
        this.boxDepartamento.setEnabled(false);

        txtNombre.setText("");
        boxDepartamento.setSelectedIndex(-1);
    }//GEN-LAST:event_txtCodigoMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        this.txtCodigo.setEnabled(false);
        this.boxDepartamento.setEnabled(false);

        txtCodigo.setText("");
        boxDepartamento.setSelectedIndex(-1);

    }//GEN-LAST:event_txtNombreMouseClicked

    private void boxDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxDepartamentoMouseClicked
        this.txtCodigo.setEnabled(false);
        this.txtNombre.setEnabled(false);

        txtCodigo.setText("");
        txtNombre.setText("");
    }//GEN-LAST:event_boxDepartamentoMouseClicked

    private void boxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDepartamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.mostrarAlmacen();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlmacenDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlmacenDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlmacenDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlmacenDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlmacenDIALOG dialog = new AlmacenDIALOG(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Almacen;
    private javax.swing.JComboBox<String> boxDepartamento;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarDepartamentos() {
        this.boxDepartamento.removeAllItems();

        try {
            ResultSet rst = this.crud.seleccionar(SQL.seletTodosDepartamento());

            Departamento dep;

            this.departamentos = new ArrayList();

            while (rst.next()) {
                this.boxDepartamento.addItem(rst.getString(2));

                dep = new Departamento();

                dep.setId_departamento(rst.getInt(1));
                dep.setNombre(rst.getNString(2));

                this.departamentos.add(dep);

            }//cierra while

        } catch (SQLException e) {
            System.err.println("Error al cargar el departamento" + e.getMessage());
        }

    }

 

    private void mostrarAlmacen() {
        this.limpiarTabla();
        DefaultTableModel modelo = (DefaultTableModel) Almacen.getModel();
        modelo.addColumn("Cod producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Precio venta");
        modelo.addColumn("Fecha registro");
        modelo.addColumn("Folio factura");
        modelo.addColumn("Departamento");

        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectAlmacen());

            while (resultado.next()) {

                Object[] depAux = {resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getInt(5), resultado.getDate(6), resultado.getString(7), resultado.getString(8)};//Obtenemos el id y el nombre  
                modelo.addRow(depAux);
            }//cierre de while

            this.Almacen.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());

        }
    }

    private void limpiarTabla() {
        Almacen.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
    }

    private void buscarXCodigo(String codigoBuscar) {
        DefaultTableModel modelo = (DefaultTableModel) this.Almacen.getModel();
        //Producto productoAux;
        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectProductoCodigo(codigoBuscar));
            if (resultado.next()) {
                this.idProducto.add(resultado.getInt(1));

                Object[] auxiliar = {
                    resultado.getString(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(4),
                    resultado.getString(5),
                    resultado.getString(6),
                    resultado.getString(7),
                    resultado.getString(8)

                };//Fin del object
                modelo.addRow(auxiliar);
                this.Almacen.setModel(modelo);

            } else {
                JOptionPane.showMessageDialog(null, "No hay producto con ese codigo");
            }
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    private void buscarXNombre(String nombreBuscar) {
        DefaultTableModel modelo = (DefaultTableModel) this.Almacen.getModel();
        //Producto productoAux;
        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectProductoNombre(nombreBuscar));
            if (resultado.next()) {
             this.idProducto.add(resultado.getInt(1));   

                Object[] auxiliar = {
                    resultado.getString(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(4),
                    resultado.getString(5),
                    resultado.getString(6),
                    resultado.getString(7),
                    resultado.getString(8)

                };//Fin del object
                modelo.addRow(auxiliar);
                this.Almacen.setModel(modelo);

            } else {
                JOptionPane.showMessageDialog(null, "No hay producto con ese nombre");
            }
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    private void buscarXDepartamento(String departamentoBuscar) {
        DefaultTableModel modelo = (DefaultTableModel) this.Almacen.getModel();
        //Producto productoAux;

        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectProductoDepartamento(departamentoBuscar));
            if (resultado.next()) {
                this.idProducto.add(resultado.getInt(1));

                Object[] auxiliar = {
                    resultado.getString(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(4),
                    resultado.getString(5),
                    resultado.getString(6),
                    resultado.getString(7),
                    resultado.getString(8)

                };//Fin del object
                modelo.addRow(auxiliar);
                this.Almacen.setModel(modelo);

            } else {
                JOptionPane.showMessageDialog(null, "No hay producto con ese departamento");
            }
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

}//cierre de todo
