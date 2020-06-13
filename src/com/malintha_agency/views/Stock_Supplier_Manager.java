/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.views;

import com.malintha_agency.controller.SupplierController;
import com.malintha_agency.model.Supplier;
import com.malintha_agency.view.validation.Validation;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ZeeLot
 */
public class Stock_Supplier_Manager extends javax.swing.JPanel {

    private String companyname;
    private String address;
    private String email;
    private String contact;
    private DefaultTableModel dtm;

    private int id = -1;

    /**
     * Creates new form Stock_InvoiceProduct_Manager
     */
    public Stock_Supplier_Manager() {
        initComponents();
        onLoad();
        tbl_sm_suppliers.removeColumn(tbl_sm_suppliers.getColumnModel().getColumn(4));
        AutoCompleteDecorator.decorate(cmb_sm_srchcompanyname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_sm_srchcompanyname = new javax.swing.JLabel();
        cmb_sm_srchcompanyname = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        lbl_sm_companyname = new javax.swing.JLabel();
        txt_sm_companyname = new javax.swing.JTextField();
        lbl_sm_address = new javax.swing.JLabel();
        txt_sm_address = new javax.swing.JTextField();
        lbl_sm_contact = new javax.swing.JLabel();
        lbl_sm_email = new javax.swing.JLabel();
        txt_sm_email = new javax.swing.JTextField();
        txt_sm_contact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sm_suppliers = new javax.swing.JTable();
        btn_sm_remove = new javax.swing.JButton();
        btn_sm_save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(78, 44, 211));
        jPanel2.setPreferredSize(new java.awt.Dimension(802, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Find By");

        lbl_sm_srchcompanyname.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_sm_srchcompanyname.setForeground(new java.awt.Color(204, 204, 255));
        lbl_sm_srchcompanyname.setText("Company Name");

        cmb_sm_srchcompanyname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_sm_srchcompanyname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_sm_srchcompanynameItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbl_sm_srchcompanyname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_sm_srchcompanyname, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sm_srchcompanyname)
                    .addComponent(cmb_sm_srchcompanyname))
                .addContainerGap())
        );

        lbl_sm_companyname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_sm_companyname.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sm_companyname.setText("Company Name");

        lbl_sm_address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_sm_address.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sm_address.setText("Address");

        txt_sm_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sm_addressActionPerformed(evt);
            }
        });

        lbl_sm_contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_sm_contact.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sm_contact.setText("Contact");

        lbl_sm_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_sm_email.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sm_email.setText("E-mail");

        txt_sm_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sm_emailKeyReleased(evt);
            }
        });

        txt_sm_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sm_contactKeyReleased(evt);
            }
        });

        tbl_sm_suppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Address", "Email", "Contact", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sm_suppliers.setGridColor(new java.awt.Color(102, 153, 255));
        tbl_sm_suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sm_suppliersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sm_suppliers);
        if (tbl_sm_suppliers.getColumnModel().getColumnCount() > 0) {
            tbl_sm_suppliers.getColumnModel().getColumn(0).setResizable(false);
            tbl_sm_suppliers.getColumnModel().getColumn(1).setResizable(false);
            tbl_sm_suppliers.getColumnModel().getColumn(2).setResizable(false);
            tbl_sm_suppliers.getColumnModel().getColumn(3).setResizable(false);
            tbl_sm_suppliers.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_sm_remove.setText("Remove");
        btn_sm_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sm_removeActionPerformed(evt);
            }
        });

        btn_sm_save.setText("Save");
        btn_sm_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sm_saveMouseClicked(evt);
            }
        });
        btn_sm_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sm_saveActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_sm_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sm_save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sm_companyname)
                            .addComponent(lbl_sm_address))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sm_address, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txt_sm_companyname))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_sm_email, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_sm_email, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_sm_contact)
                                .addGap(32, 32, 32)
                                .addComponent(txt_sm_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sm_companyname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sm_companyname, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sm_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbl_sm_address))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_sm_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_sm_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sm_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbl_sm_contact)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sm_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_sm_save, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sm_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sm_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sm_addressActionPerformed

    private void btn_sm_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sm_saveMouseClicked
        saveSupplier();
    }//GEN-LAST:event_btn_sm_saveMouseClicked

    private void btn_sm_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sm_saveActionPerformed
        if (isNotBlank()) {
            saveSupplier();
        }
    }//GEN-LAST:event_btn_sm_saveActionPerformed

    private void tbl_sm_suppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sm_suppliersMouseClicked
        select();
    }//GEN-LAST:event_tbl_sm_suppliersMouseClicked

    private void btn_sm_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sm_removeActionPerformed
        if (isNotBlank()) {
            remove();
        }
    }//GEN-LAST:event_btn_sm_removeActionPerformed

    private void cmb_sm_srchcompanynameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_sm_srchcompanynameItemStateChanged
        findbySupplierName();
    }//GEN-LAST:event_cmb_sm_srchcompanynameItemStateChanged

    private void txt_sm_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sm_emailKeyReleased
        Validation.emailValidate(txt_sm_email);
    }//GEN-LAST:event_txt_sm_emailKeyReleased

    private void txt_sm_contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sm_contactKeyReleased
        Validation.validatePhoneNumber(txt_sm_contact);
    }//GEN-LAST:event_txt_sm_contactKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sm_remove;
    private javax.swing.JButton btn_sm_save;
    private javax.swing.JComboBox cmb_sm_srchcompanyname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_sm_address;
    private javax.swing.JLabel lbl_sm_companyname;
    private javax.swing.JLabel lbl_sm_contact;
    private javax.swing.JLabel lbl_sm_email;
    private javax.swing.JLabel lbl_sm_srchcompanyname;
    private javax.swing.JTable tbl_sm_suppliers;
    private javax.swing.JTextField txt_sm_address;
    private javax.swing.JTextField txt_sm_companyname;
    private javax.swing.JTextField txt_sm_contact;
    private javax.swing.JTextField txt_sm_email;
    // End of variables declaration//GEN-END:variables

    private void onLoad() {
        dtm = (DefaultTableModel) tbl_sm_suppliers.getModel();
        onLoadSuppliers();
        LoadCombo();
    }

    public void LoadCombo() {
        try {
            Supplier[] suppliers = SupplierController.viewSuppliers();

            if (suppliers != null) {
                for (Supplier s : suppliers) {
                    if (s != null) {
                        cmb_sm_srchcompanyname.addItem(s.getSuppliername());
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void onLoadSuppliers() {
        try {
            Supplier[] suppliers = SupplierController.viewSuppliers();
            dtm.setRowCount(0);
            if (suppliers != null) {
                for (Supplier s : suppliers) {
                    if (s != null) {
                        Object[] row = {s.getSuppliername(), s.getAddress(), s.getEmail(), s.getContactno(), s.getSupplierid()};
                        dtm.addRow(row);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveSupplier() {

        if (isEmpty()) {
            try {
                //companyname, address, email, contact

                Supplier supplier = new Supplier();
                if (id != -1) {
                    supplier.setSupplierid(id);
                }
                supplier.setSuppliername(companyname);
                supplier.setEmail(email);
                supplier.setAddress(address);
                supplier.setContactno(contact);

                //supplier
                boolean isok = new SupplierController().saveSupplier(supplier);
                if (isok) {
                    id = -1;
                    clear();
                    onLoadSuppliers();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }

    private boolean isEmpty() {

        companyname = txt_sm_companyname.getText();
        address = txt_sm_address.getText();
        email = txt_sm_email.getText();
        contact = txt_sm_contact.getText();

        if (companyname.equals("") && address.equals("") && email.equals("")) {
            return false;
        }
        return true;
    }

    private void select() {
        int row = tbl_sm_suppliers.getSelectedRow();
        if (row != -1) {
            id = (int) dtm.getValueAt(row, 4);
            txt_sm_companyname.setText(dtm.getValueAt(row, 0).toString());
            txt_sm_address.setText(dtm.getValueAt(row, 1).toString());
            txt_sm_email.setText(dtm.getValueAt(row, 2).toString());
            txt_sm_contact.setText(dtm.getValueAt(row, 3).toString());
        }

    }

    private void remove() {
        if (id != -1) {
            try {
                boolean isok = SupplierController.removeSupplier(id);
                if (isok) {
                    onLoadSuppliers();
                    clear();
                    JOptionPane.showMessageDialog(this, "Successfully removed supplier", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to remove supplier", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void clear() {
        txt_sm_companyname.setText("");
        txt_sm_address.setText("");
        txt_sm_contact.setText("");
        txt_sm_email.setText("");

    }

    private void findbySupplierName() {

        if (cmb_sm_srchcompanyname.getItemCount() > 0) {
            try {
                String company = cmb_sm_srchcompanyname.getSelectedItem().toString();
                Supplier[] suppliers = SupplierController.searchSupplierBYName(company);
                dtm.setRowCount(0);
                if (suppliers != null) {
                    for (Supplier s : suppliers) {
                        if (s != null) {
                            Object[] row = {s.getSuppliername(), s.getAddress(), s.getEmail(), s.getContactno(), s.getSupplierid()};
                            dtm.addRow(row);
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private boolean isNotBlank() {
        return (!txt_sm_address.getText().equals("") && !txt_sm_companyname.getText().equals("") && !txt_sm_contact.getText().equals("") && !txt_sm_email.getText().equals(""));
    }

}
