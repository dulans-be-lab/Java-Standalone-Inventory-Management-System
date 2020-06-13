/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.views;

import com.malintha_agency.controller.InvoiceController;
import com.malintha_agency.controller.SupplierController;
import com.malintha_agency.model.Invoice;
import com.malintha_agency.model.Supplier;
import com.malintha_agency.view.validation.Validation;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ZeeLot
 */
public class Stock_Invoice_Manager extends javax.swing.JPanel {

    private String suppliername;
    private String invoiceno;
    private String lorryno;
    private double subtotal;
    private double discount;
    private double netamount;
    private String issuedate;
    private String receivedate;

    private DateFormat df;
    private DefaultTableModel dtm;

    private int id = -1;
    private Supplier[] suppliers;

    /**
     * Creates new form Stock_InvoiceProduct_Manager
     */
    public Stock_Invoice_Manager() {
        initComponents();
        onLoad();
        jdc_sim_issuedate.setDate(new Date());
        jdc_sim_receivedate.setDate(new Date());
        tbl_sim_invoices.removeColumn(tbl_sim_invoices.getColumnModel().getColumn(8));
        viewSuppliers();
        AutoCompleteDecorator.decorate(cmb_sim_serchinvoiceno);
        AutoCompleteDecorator.decorate(cmb_sim_srchsuppliernames);
        AutoCompleteDecorator.decorate(cmb_sim_suppliers);
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
        lbl_sim_srchinvoiceno = new javax.swing.JLabel();
        btn_sim_search = new javax.swing.JLabel();
        lbl_sim_srchsuppliername = new javax.swing.JLabel();
        cmb_sim_srchsuppliernames = new javax.swing.JComboBox();
        cmb_sim_serchinvoiceno = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lbl_sim_suppliername = new javax.swing.JLabel();
        cmb_sim_suppliers = new javax.swing.JComboBox<>();
        txt_sim_invoiceno = new javax.swing.JTextField();
        jdc_sim_invoiceno = new javax.swing.JLabel();
        jdc_sim_lorryno = new javax.swing.JLabel();
        txt_sim_lorryno = new javax.swing.JTextField();
        jdc_sim_subtotal = new javax.swing.JLabel();
        txt_sim_subtotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sim_invoices = new javax.swing.JTable();
        btn_sim_remove = new javax.swing.JButton();
        btn_sim_clear = new javax.swing.JButton();
        btn_sim_save = new javax.swing.JButton();
        txt_sim_netamount = new javax.swing.JTextField();
        txt_sim_discount = new javax.swing.JTextField();
        jdc_sim_discount = new javax.swing.JLabel();
        jdc_sim_netamount = new javax.swing.JLabel();
        lbl_sim_issuedate = new javax.swing.JLabel();
        lbl_sim_receivedate = new javax.swing.JLabel();
        jdc_sim_issuedate = new com.toedter.calendar.JDateChooser();
        jdc_sim_receivedate = new com.toedter.calendar.JDateChooser();

        jPanel2.setBackground(new java.awt.Color(78, 44, 211));
        jPanel2.setMinimumSize(new java.awt.Dimension(802, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Find By");

        lbl_sim_srchinvoiceno.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_sim_srchinvoiceno.setForeground(new java.awt.Color(204, 204, 255));
        lbl_sim_srchinvoiceno.setText("Invoice No");

        btn_sim_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_sim_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malintha_agency/images/search 30x30.png"))); // NOI18N

        lbl_sim_srchsuppliername.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_sim_srchsuppliername.setForeground(new java.awt.Color(204, 204, 255));
        lbl_sim_srchsuppliername.setText("Supplier Name");

        cmb_sim_srchsuppliernames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_sim_srchsuppliernames.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_sim_srchsuppliernamesItemStateChanged(evt);
            }
        });

        cmb_sim_serchinvoiceno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_sim_serchinvoicenoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_sim_srchinvoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_sim_serchinvoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_sim_srchsuppliername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_sim_srchsuppliernames, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_sim_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btn_sim_search))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_sim_srchsuppliernames, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_sim_srchsuppliername)
                                .addComponent(lbl_sim_srchinvoiceno)
                                .addComponent(cmb_sim_serchinvoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );

        lbl_sim_suppliername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_sim_suppliername.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sim_suppliername.setText("Supplier Name");

        cmb_sim_suppliers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_sim_suppliers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Little Lion", "Chello" }));

        txt_sim_invoiceno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_sim_invoiceno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sim_invoicenoKeyReleased(evt);
            }
        });

        jdc_sim_invoiceno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jdc_sim_invoiceno.setForeground(new java.awt.Color(102, 102, 102));
        jdc_sim_invoiceno.setText("Invoice No");

        jdc_sim_lorryno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jdc_sim_lorryno.setForeground(new java.awt.Color(102, 102, 102));
        jdc_sim_lorryno.setText("Lorry No");

        txt_sim_lorryno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jdc_sim_subtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jdc_sim_subtotal.setForeground(new java.awt.Color(102, 102, 102));
        jdc_sim_subtotal.setText("Subtotal");

        txt_sim_subtotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_sim_subtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sim_subtotalKeyReleased(evt);
            }
        });

        tbl_sim_invoices.setForeground(new java.awt.Color(102, 102, 102));
        tbl_sim_invoices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Invoice No", "Lorry No", "Subtotal", "Discount", "Net Amount", "Issue Date", "Receive Date", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sim_invoices.setGridColor(new java.awt.Color(102, 153, 255));
        tbl_sim_invoices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sim_invoicesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sim_invoices);
        if (tbl_sim_invoices.getColumnModel().getColumnCount() > 0) {
            tbl_sim_invoices.getColumnModel().getColumn(0).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(1).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(2).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(3).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(4).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(5).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(6).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(7).setResizable(false);
            tbl_sim_invoices.getColumnModel().getColumn(8).setResizable(false);
        }

        btn_sim_remove.setText("Remove");
        btn_sim_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sim_removeMouseClicked(evt);
            }
        });
        btn_sim_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sim_removeActionPerformed(evt);
            }
        });

        btn_sim_clear.setText("Clear");
        btn_sim_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sim_clearMouseClicked(evt);
            }
        });

        btn_sim_save.setText("Save");
        btn_sim_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sim_saveMouseClicked(evt);
            }
        });
        btn_sim_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sim_saveActionPerformed(evt);
            }
        });

        txt_sim_netamount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_sim_netamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sim_netamountKeyReleased(evt);
            }
        });

        txt_sim_discount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_sim_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sim_discountKeyReleased(evt);
            }
        });

        jdc_sim_discount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jdc_sim_discount.setForeground(new java.awt.Color(102, 102, 102));
        jdc_sim_discount.setText("Discount");

        jdc_sim_netamount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jdc_sim_netamount.setForeground(new java.awt.Color(102, 102, 102));
        jdc_sim_netamount.setText("Net Amount");

        lbl_sim_issuedate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_sim_issuedate.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sim_issuedate.setText("Issue Date");

        lbl_sim_receivedate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_sim_receivedate.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sim_receivedate.setText("Receive Date");

        jdc_sim_issuedate.setDateFormatString("yyyy-MM-dd");

        jdc_sim_receivedate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc_sim_invoiceno)
                    .addComponent(lbl_sim_suppliername)
                    .addComponent(jdc_sim_lorryno)
                    .addComponent(jdc_sim_subtotal))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_sim_suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sim_invoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sim_lorryno, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sim_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_sim_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_sim_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_sim_save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc_sim_discount)
                            .addComponent(lbl_sim_receivedate)
                            .addComponent(lbl_sim_issuedate)
                            .addComponent(jdc_sim_netamount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sim_discount, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txt_sim_netamount, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jdc_sim_issuedate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdc_sim_receivedate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_sim_suppliername)
                            .addComponent(cmb_sim_suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdc_sim_discount)
                            .addComponent(txt_sim_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdc_sim_invoiceno)
                            .addComponent(txt_sim_invoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdc_sim_netamount)
                            .addComponent(txt_sim_netamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdc_sim_lorryno)
                            .addComponent(txt_sim_lorryno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sim_issuedate)))
                    .addComponent(jdc_sim_issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jdc_sim_subtotal)
                        .addComponent(txt_sim_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_sim_receivedate))
                    .addComponent(jdc_sim_receivedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sim_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sim_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sim_save, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(232, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_sim_invoicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sim_invoicesMouseClicked
        selectRowAndLoad();
    }//GEN-LAST:event_tbl_sim_invoicesMouseClicked

    private void btn_sim_removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sim_removeMouseClicked
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to Remove this Invoice", "Warning", 0);
        if (dialogResult == JOptionPane.YES_OPTION) {
            removeInvoice();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sim_removeMouseClicked

    private void btn_sim_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sim_clearMouseClicked
        setClearFields();
    }//GEN-LAST:event_btn_sim_clearMouseClicked

    private void btn_sim_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sim_saveMouseClicked
        if (isNotBlank()) {
            saveInvoice();
        }
    }//GEN-LAST:event_btn_sim_saveMouseClicked

    private void btn_sim_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sim_removeActionPerformed
        if (isNotBlank()) {
            removeInvoice();
        }
    }//GEN-LAST:event_btn_sim_removeActionPerformed

    private void txt_sim_subtotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sim_subtotalKeyReleased
        Validation.priceText(txt_sim_subtotal);
    }//GEN-LAST:event_txt_sim_subtotalKeyReleased

    private void txt_sim_discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sim_discountKeyReleased
        Validation.priceText(txt_sim_discount);
    }//GEN-LAST:event_txt_sim_discountKeyReleased

    private void cmb_sim_serchinvoicenoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_sim_serchinvoicenoItemStateChanged
        findinvoice();
    }//GEN-LAST:event_cmb_sim_serchinvoicenoItemStateChanged

    private void cmb_sim_srchsuppliernamesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_sim_srchsuppliernamesItemStateChanged
        LoadInvoicesToTable(cmb_sim_srchsuppliernames.getSelectedItem().toString());
        // System.err.println();
    }//GEN-LAST:event_cmb_sim_srchsuppliernamesItemStateChanged

    private void txt_sim_invoicenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sim_invoicenoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sim_invoicenoKeyReleased

    private void txt_sim_netamountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sim_netamountKeyReleased
        Validation.priceText(txt_sim_netamount);
    }//GEN-LAST:event_txt_sim_netamountKeyReleased

    private void btn_sim_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sim_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sim_saveActionPerformed

    private void viewSuppliers() {
        try {
            suppliers = SupplierController.viewSuppliers();
            cmb_sim_srchsuppliernames.removeAllItems();
            if (suppliers != null) {
                for (Supplier s : suppliers) {
                    if (s != null) {
                        cmb_sim_srchsuppliernames.addItem(s.getSuppliername());
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock_Supplier_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sim_clear;
    private javax.swing.JButton btn_sim_remove;
    private javax.swing.JButton btn_sim_save;
    private javax.swing.JLabel btn_sim_search;
    private javax.swing.JComboBox<String> cmb_sim_serchinvoiceno;
    private javax.swing.JComboBox cmb_sim_srchsuppliernames;
    private javax.swing.JComboBox<String> cmb_sim_suppliers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jdc_sim_discount;
    private javax.swing.JLabel jdc_sim_invoiceno;
    private com.toedter.calendar.JDateChooser jdc_sim_issuedate;
    private javax.swing.JLabel jdc_sim_lorryno;
    private javax.swing.JLabel jdc_sim_netamount;
    private com.toedter.calendar.JDateChooser jdc_sim_receivedate;
    private javax.swing.JLabel jdc_sim_subtotal;
    private javax.swing.JLabel lbl_sim_issuedate;
    private javax.swing.JLabel lbl_sim_receivedate;
    private javax.swing.JLabel lbl_sim_srchinvoiceno;
    private javax.swing.JLabel lbl_sim_srchsuppliername;
    private javax.swing.JLabel lbl_sim_suppliername;
    private javax.swing.JTable tbl_sim_invoices;
    private javax.swing.JTextField txt_sim_discount;
    private javax.swing.JTextField txt_sim_invoiceno;
    private javax.swing.JTextField txt_sim_lorryno;
    private javax.swing.JTextField txt_sim_netamount;
    private javax.swing.JTextField txt_sim_subtotal;
    // End of variables declaration//GEN-END:variables

    private void onLoad() {
        dtm = (DefaultTableModel) tbl_sim_invoices.getModel();
        LoadinvoiceNo();
        LoadSuppliersToCombo();
        LoadInvoicesToTable();

    }

    private void findinvoice() {
        if (cmb_sim_serchinvoiceno.getItemCount() > 0) {
            try {
                String invoiceno = cmb_sim_serchinvoiceno.getSelectedItem().toString();
                dtm.setRowCount(0);
                Invoice i = InvoiceController.findInvoiceByInvoiceNO(invoiceno);
                if (i != null) {
                    Supplier supplier = SupplierController.searchSupplierBYId(i.getSupid());
                    Object[] row = {supplier.getSuppliername(), i.getInvoiceno(), i.getLorryno(), i.getSubtotal(), i.getDiscount(), i.getNetamount(), i.getIssuedate(), i.getReceivedate(), i.getInvoiceid()};
                    dtm.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NullPointerException ex) {
                Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void saveInvoice() {

        if (isEmpty() && isValidate()) {
            try {
                System.out.println(receivedate + "/" + issuedate);
                Supplier[] supplier = new SupplierController().searchSupplierBYName(suppliername);
                Invoice invoice = new Invoice(supplier[0].getSupplierid(), invoiceno, lorryno, subtotal, discount, netamount, issuedate, receivedate);
                String msg = new InvoiceController().saveInvoice(invoice);
                if (msg.equals("ok")) {
                    LoadInvoicesToTable();
                    setClearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Database Failed", "Error", JOptionPane.ERROR_MESSAGE);
                }

//                System.out.println(msg);
            } catch (SQLException ex) {
                Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            JOptionPane.showMessageDialog(this, "Please check the fields again", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removeInvoice() {
        invoiceno = txt_sim_invoiceno.getText();
        if (!invoiceno.equals("")) {
            try {
                boolean isokay = InvoiceController.removeInvoice(invoiceno);
                if (isokay) {
                    LoadInvoicesToTable();
                    setClearFields();
                    JOptionPane.showMessageDialog(this, "Successfully removed invoice", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to remove invoice", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please check the invoice no field again", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private boolean isEmpty() {
        System.out.println(cmb_sim_suppliers.getItemCount() + " ");
        if (cmb_sim_suppliers.getItemCount() > 0) {
            suppliername = cmb_sim_suppliers.getSelectedItem().toString();
            invoiceno = txt_sim_invoiceno.getText();
            lorryno = txt_sim_lorryno.getText();
            subtotal = Double.parseDouble(txt_sim_subtotal.getText());
            discount = Double.parseDouble(txt_sim_discount.getText());
            netamount = Double.parseDouble(txt_sim_netamount.getText());
            // issuedate = jdc_sim_issuedate.getDate().toString();
            receivedate = df.format(jdc_sim_receivedate.getDate());
            issuedate = df.format(jdc_sim_issuedate.getDate());
            if (suppliername.equals("") && invoiceno.equals("") && lorryno.equals("") && issuedate.equals("") && receivedate.equals("")) {
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean isValidate() {

        return true;
    }

    private void LoadSuppliersToCombo() {
        try {
            Supplier[] suppliers = new SupplierController().viewSuppliers();
            if (suppliers != null) {
                df = new SimpleDateFormat("yyyy-MM-dd");
                cmb_sim_suppliers.removeAllItems();
                for (Supplier sup : suppliers) {
                    if (sup != null && !sup.getSuppliername().equals("")) {
                        cmb_sim_suppliers.addItem(sup.getSuppliername());
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LoadInvoicesToTable() {
        try {
            Invoice[] invoices = InvoiceController.viewInvoices();
            if (invoices != null) {
                dtm.setRowCount(0);
                for (Invoice i : invoices) {
                    Supplier supplier = SupplierController.searchSupplierBYId(i.getSupid());
                    Object[] row = {supplier.getSuppliername(), i.getInvoiceno(), i.getLorryno(), i.getSubtotal(), i.getDiscount(), i.getNetamount(), i.getIssuedate(), i.getReceivedate(), i.getInvoiceid()};
                    dtm.addRow(row);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LoadInvoicesToTable(String name) {
        try {
            Invoice[] invoices = InvoiceController.viewInvoices();
            if (invoices != null) {
                dtm.setRowCount(0);
                for (Invoice i : invoices) {
                    Supplier supplier = SupplierController.searchSupplierBYId(i.getSupid());
                    if (supplier.getSuppliername().equals(name)) {
                        Object[] row = {supplier.getSuppliername(), i.getInvoiceno(), i.getLorryno(), i.getSubtotal(), i.getDiscount(), i.getNetamount(), i.getIssuedate(), i.getReceivedate(), i.getInvoiceid()};
                        dtm.addRow(row);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setClearFields() {
        txt_sim_invoiceno.setText("");
        txt_sim_lorryno.setText("");
        txt_sim_subtotal.setText("0");
        txt_sim_discount.setText("0");
        txt_sim_netamount.setText("0");
        cmb_sim_suppliers.setSelectedIndex(0);
    }

    private void selectRowAndLoad() {
        int row = tbl_sim_invoices.getSelectedRow();
        if (row != -1) {

            cmb_sim_suppliers.setSelectedItem(dtm.getValueAt(row, 0).toString());
            txt_sim_invoiceno.setText(dtm.getValueAt(row, 1).toString());
            txt_sim_lorryno.setText(dtm.getValueAt(row, 2).toString());
            txt_sim_subtotal.setText(dtm.getValueAt(row, 3).toString());
            txt_sim_discount.setText(dtm.getValueAt(row, 4).toString());
            txt_sim_netamount.setText(dtm.getValueAt(row, 5).toString());
            id = (int) dtm.getValueAt(row, 8);
            System.out.println(id);
            //jdc_sim_issuedate
        }
    }

    private void LoadinvoiceNo() {
        try {
            Invoice[] invoices = InvoiceController.viewInvoices();
            cmb_sim_serchinvoiceno.removeAll();
            if (invoices != null) {
                for (Invoice i : invoices) {
                    if (i != null) {
                        cmb_sim_serchinvoiceno.addItem(i.getInvoiceno());
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(Stock_Invoice_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean isNotBlank() {
        return (!txt_sim_discount.getText().equals("") && !txt_sim_invoiceno.getText().equals("") && !txt_sim_lorryno.getText().equals("") && !txt_sim_netamount.getText().equals("") && !txt_sim_subtotal.getText().equals("") && !cmb_sim_srchsuppliernames.getSelectedItem().equals("") && !cmb_sim_suppliers.getSelectedItem().equals(""));
    }
}
