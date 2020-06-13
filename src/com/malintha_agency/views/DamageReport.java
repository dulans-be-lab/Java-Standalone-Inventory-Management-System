/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.views;

import com.malintha_agency.controller.ReportController;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Dell
 */
public class DamageReport extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private double fullpayment = 0;
    private JasperReport jasperReport;
    private JasperPrint filledReport;
    private JRViewer jRViewer;
    private String f;
    private String t;

    /**
     * Creates new form ProfitAndLostReport
     */
    public DamageReport() {
        initComponents();
        dtm = (DefaultTableModel) tbl_dr_drt.getModel();
        loadJasper();
    }

    private void loadJasper() {
        try {
            jasperReport = (JasperReport) JRLoader.loadObject(OrderDetailManager.class.getResourceAsStream("/com/malintha_agency/jasper/DamageReport.jasper"));
        } catch (JRException ex) {
            Logger.getLogger(OrderDetailManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dr_drt = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        lbl_dr_tmof = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_rm_viewreport = new javax.swing.JLabel();
        lbl_rm_viewreport1 = new javax.swing.JLabel();

        tbl_dr_drt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop Name", "Return Qty", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_dr_drt);
        if (tbl_dr_drt.getColumnModel().getColumnCount() > 0) {
            tbl_dr_drt.getColumnModel().getColumn(0).setResizable(false);
            tbl_dr_drt.getColumnModel().getColumn(1).setResizable(false);
            tbl_dr_drt.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Total Amount of Damages");

        lbl_dr_tmof.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dr_tmof.setForeground(new java.awt.Color(102, 102, 102));
        lbl_dr_tmof.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_dr_tmof.setText("0.00");

        jPanel1.setOpaque(false);

        lbl_rm_viewreport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_rm_viewreport.setForeground(new java.awt.Color(102, 102, 102));
        lbl_rm_viewreport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rm_viewreport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malintha_agency/images/view.png"))); // NOI18N
        lbl_rm_viewreport.setText(" View Report");
        lbl_rm_viewreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_rm_viewreportMouseClicked(evt);
            }
        });

        lbl_rm_viewreport1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_rm_viewreport1.setForeground(new java.awt.Color(102, 102, 102));
        lbl_rm_viewreport1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rm_viewreport1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malintha_agency/images/Print.png"))); // NOI18N
        lbl_rm_viewreport1.setText("Print");
        lbl_rm_viewreport1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_rm_viewreport1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_rm_viewreport, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_rm_viewreport1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_rm_viewreport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_rm_viewreport1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_dr_tmof, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(lbl_dr_tmof, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_rm_viewreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rm_viewreportMouseClicked
        getDamageReport();
    }//GEN-LAST:event_lbl_rm_viewreportMouseClicked

    private void lbl_rm_viewreport1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rm_viewreport1MouseClicked
        try {
            HashMap<String, Object> data = new HashMap<>();
            data.put("Total Amount of Damages", lbl_dr_tmof.getText());
            data.put("From Date", f);
            data.put("To Date", t);
            filledReport = JasperFillManager.fillReport(jasperReport, data, new JRTableModelDataSource(dtm));
            jRViewer = new JRViewer(filledReport);
            jRViewer.setOpaque(true);
            jRViewer.setBackground(Color.WHITE);
            new JasperViewer(jRViewer);
            //PrintJasper.PrintReportToPrinter(filledReport);
        } catch (JRException ex) {
            Logger.getLogger(OrderDetailManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbl_rm_viewreport1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_dr_tmof;
    private javax.swing.JLabel lbl_rm_viewreport;
    private javax.swing.JLabel lbl_rm_viewreport1;
    private javax.swing.JTable tbl_dr_drt;
    // End of variables declaration//GEN-END:variables

    private void getDamageReport() {

        f = Report_Manager.firstdate;
        t = Report_Manager.seconddate;
        fullpayment = 0;
        String companyname = Report_Manager.companyname;
        if (f != null && t != null && companyname != null) {
            if (!f.equals("") && !t.equals("") && !companyname.equals("")) {
                try {
                    com.malintha_agency.model.DamageReports[] damagereports = ReportController.getDamageReport(companyname, f, t);
                    dtm.setRowCount(0);
                    lbl_dr_tmof.setText("0.00");
                    if (damagereports != null) {
                        for (com.malintha_agency.model.DamageReports d : damagereports) {
                            if (d != null) {
                                Object[] row = {d.getShopname(), d.getReturnqty() + "", d.getTotalprice() + ""};
                                fullpayment += d.getTotalprice();
                                dtm.addRow(row);
                            }
                        }
                        lbl_dr_tmof.setText(Double.toString(fullpayment));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SupplierReport.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SupplierReport.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
