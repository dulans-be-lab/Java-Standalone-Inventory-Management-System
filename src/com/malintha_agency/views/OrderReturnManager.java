/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.views;

import com.malintha_agency.controller.OrderDetailController;
import com.malintha_agency.controller.OrderPaymentController;
import com.malintha_agency.controller.OrderRetunControler;
import com.malintha_agency.controller.ProductController;
import com.malintha_agency.model.OrderDTO;
import com.malintha_agency.model.Order_Detail;
import com.malintha_agency.model.Order_ReturnDTO;
import com.malintha_agency.model.PaymentDTO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZeeLot
 */
public class OrderReturnManager extends javax.swing.JPanel {

    private static OrderReturnManager orderReturn;
    private DefaultTableModel mdlOrderDeatils;
    private DefaultTableModel mdlOrderReturnDeatils;
    private String id;

    /**
     * Creates new form OrderReturnManager
     */
    public OrderReturnManager() {
        initComponents();
        setVisible(true);
        cldDate.setDate(new Date());
        mdlOrderDeatils = (DefaultTableModel) tblOrderDetails.getModel();
        mdlOrderReturnDeatils = (DefaultTableModel) tblReturn.getModel();
        tblOrderDetails.removeColumn(tblOrderDetails.getColumnModel().getColumn(5));
        tblReturn.removeColumn(tblReturn.getColumnModel().getColumn(4));
        id = OrderDetailManager.getInstance().getOrderId();
        setOrderId(id);
    }

//    public static OrderReturn getInstance() {
//        if (orderReturn == null) {
//            orderReturn = new OrderReturn();
//        }
//        return orderReturn;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturn = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        spnQty = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        cldDate = new com.toedter.calendar.JDateChooser();
        btnRemove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblDuePayment = new javax.swing.JLabel();

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Unit Price", "Discount", "Qty", "Total", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrderDetails);
        if (tblOrderDetails.getColumnModel().getColumnCount() > 0) {
            tblOrderDetails.getColumnModel().getColumn(0).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(1).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(2).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(3).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(4).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(5).setResizable(false);
        }

        tblReturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Qty", "Reason", "Date", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReturn);
        if (tblReturn.getColumnModel().getColumnCount() > 0) {
            tblReturn.getColumnModel().getColumn(0).setResizable(false);
            tblReturn.getColumnModel().getColumn(1).setResizable(false);
            tblReturn.getColumnModel().getColumn(2).setResizable(false);
            tblReturn.getColumnModel().getColumn(3).setResizable(false);
            tblReturn.getColumnModel().getColumn(4).setResizable(false);
        }

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Qty");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Reason");

        txtReason.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReasonActionPerformed(evt);
            }
        });

        spnQty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        spnQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Date");

        cldDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cldDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cldDatePropertyChange(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(78, 44, 211));
        jPanel2.setForeground(new java.awt.Color(78, 44, 211));
        jPanel2.setMaximumSize(new java.awt.Dimension(810, 98));
        jPanel2.setMinimumSize(new java.awt.Dimension(810, 98));
        jPanel2.setPreferredSize(new java.awt.Dimension(810, 98));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Order ID");

        lblOrderId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setText("Total Payment");

        lblPayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPayment.setForeground(new java.awt.Color(204, 255, 255));
        lblPayment.setText("0.0");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16.setText("Due Payment");

        lblDuePayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDuePayment.setForeground(new java.awt.Color(204, 255, 255));
        lblDuePayment.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel15)
                .addGap(23, 23, 23)
                .addComponent(lblPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(21, 21, 21)
                .addComponent(lblDuePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(lblPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(lblDuePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(16, 16, 16)
                        .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel18)
                        .addGap(22, 22, 22)
                        .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addGap(9, 9, 9)
                        .addComponent(cldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderDetailsMouseClicked
        if (tblOrderDetails.getSelectedRow() > -1) {

        }
    }//GEN-LAST:event_tblOrderDetailsMouseClicked

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (tblOrderDetails.getSelectedRow() > -1 && isNotBlank()) {
            if (Integer.parseInt(tblOrderDetails.getValueAt(tblOrderDetails.getSelectedRow(), 3).toString()) >= Integer.parseInt(spnQty.getValue().toString())) {
                try {
                    Order_ReturnDTO returnDTO = new Order_ReturnDTO();
                    returnDTO.setProid(ProductController.getProductIdViaOrderDetailId(tblOrderDetails.getModel().getValueAt(tblOrderDetails.getSelectedRow(), 5).toString()).getPid());
                    returnDTO.setOrder_detailid(tblOrderDetails.getModel().getValueAt(tblOrderDetails.getSelectedRow(), 5).toString());
                    returnDTO.setOrder_id(lblOrderId.getText());
                    returnDTO.setDate(new SimpleDateFormat("yyyy-MM-dd").format(cldDate.getDate()));
                    returnDTO.setQty(Integer.parseInt(spnQty.getValue().toString()));
                    returnDTO.setReason(txtReason.getText());
                    boolean addOrderReturn = OrderRetunControler.addOrderReturn(returnDTO);
                    if (addOrderReturn) {
                        loadOrderDetailsViaOrderId();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Quantity has been exceeded");
            }
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReasonActionPerformed

    private void cldDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cldDatePropertyChange

    }//GEN-LAST:event_cldDatePropertyChange

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (tblReturn.getSelectedRow() > -1) {
            try {
                Order_ReturnDTO returnDTO = new Order_ReturnDTO();
                returnDTO.setProid(Integer.parseInt(tblReturn.getModel().getValueAt(tblReturn.getSelectedRow(), 4).toString()));
                returnDTO.setOrder_id(lblOrderId.getText());
                returnDTO.setQty(Integer.parseInt(tblReturn.getValueAt(tblReturn.getSelectedRow(), 1).toString()));
                boolean removeOrderReturn = OrderRetunControler.removeOrderReturn(returnDTO);
                if (removeOrderReturn) {
                    loadOrderDetailsViaOrderId();
                }
            } catch (SQLException ex) {
                Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed
    private void setOrderId(String id) {
        lblOrderId.setText(id);
        loadOrderDetailsViaOrderId();
    }

    private void loadOrderDetailsViaOrderId() {
        try {
            ArrayList<Order_Detail> orderDetails = OrderDetailController.getOrderDetails(lblOrderId.getText());
            mdlOrderDeatils.setRowCount(0);
            for (Order_Detail orderDetail : orderDetails) {
                double total = 0;
                if (orderDetail.getQty() == 0) {
                    total = 0;
                } else {
                    total = orderDetail.getPayment() * orderDetail.getQty() - orderDetail.getDiscount();
                }

                Object[] ob = {orderDetail.getProductName(), orderDetail.getPayment(), orderDetail.getDiscount(), orderDetail.getQty(), total, orderDetail.getOrder_detailid()};
                mdlOrderDeatils.addRow(ob);
            }
            mdlOrderReturnDeatils.setRowCount(0);
            ArrayList<Order_ReturnDTO> orderReturnDetails = OrderRetunControler.getOrderReturnDetails(lblOrderId.getText());
            for (Order_ReturnDTO orderReturnDetail : orderReturnDetails) {
                Object[] ob = {orderReturnDetail.getProductName(), orderReturnDetail.getQty(), orderReturnDetail.getReason(), orderReturnDetail.getDate(), orderReturnDetail.getProid()};
                mdlOrderReturnDeatils.addRow(ob);
            }
            loadOrderPayment();
        } catch (SQLException ex) {
            Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadOrderPayment() {
        try {
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setOrderid(lblOrderId.getText());
            PaymentDTO m = OrderPaymentController.getOrderPaidAmount(orderDTO);
            calculateTotal();
            lblDuePayment.setText((Double.parseDouble(lblPayment.getText()) - m.getPayment()) + "");
        } catch (SQLException ex) {
            Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderReturnManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*Calculate total credits and fee, then set to text fields*/
    private void calculateTotal() {
        double fee = 0;
        for (int i = 0; i < tblOrderDetails.getRowCount(); i++) {
            fee += Double.parseDouble(tblOrderDetails.getValueAt(i, 4).toString());
        }
        lblPayment.setText(fee + "");
    }
    
    private boolean isNotBlank() {
        return (!txtReason.getText().equals(""));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReturn;
    private com.toedter.calendar.JDateChooser cldDate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDuePayment;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JTable tblReturn;
    private javax.swing.JTextField txtReason;
    // End of variables declaration//GEN-END:variables
}
