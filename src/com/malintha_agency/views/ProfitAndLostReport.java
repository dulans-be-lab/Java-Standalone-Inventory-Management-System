/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.views;

import com.malintha_agency.controller.ReportController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JREmptyDataSource;
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
public class ProfitAndLostReport extends javax.swing.JPanel {

    private JasperReport jasperReport;
    private JasperPrint filledReport;
    private JRViewer jRViewer;
    private String f;
    private String t;

    /**
     * Creates new form ProfitAndLostReport
     */
    public ProfitAndLostReport() {
        initComponents();
//        onLoad();
        loadJasper();
    }

    private void loadJasper() {
        try {
            jasperReport = (JasperReport) JRLoader.loadObject(OrderDetailManager.class.getResourceAsStream("/com/malintha_agency/jasper/ProfitLost.jasper"));
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

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_paf_tpfs = new javax.swing.JLabel();
        lbl_palr_tpfd = new javax.swing.JLabel();
        lbl_palr_taodis = new javax.swing.JLabel();
        lbl_palr_taod = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_rm_viewreport = new javax.swing.JLabel();
        lbl_rm_viewreport2 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Total Amounts");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Total Payment for Suppliers");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Total Payments from Delivery");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Total Amount of Damages");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Total Amount of Discounts");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Total Income");

        lbl_paf_tpfs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_paf_tpfs.setForeground(new java.awt.Color(102, 102, 102));
        lbl_paf_tpfs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_paf_tpfs.setText("0.00");

        lbl_palr_tpfd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_palr_tpfd.setForeground(new java.awt.Color(102, 102, 102));
        lbl_palr_tpfd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_palr_tpfd.setText("0.00");

        lbl_palr_taodis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_palr_taodis.setForeground(new java.awt.Color(102, 102, 102));
        lbl_palr_taodis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_palr_taodis.setText("0.00");

        lbl_palr_taod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_palr_taod.setForeground(new java.awt.Color(102, 102, 102));
        lbl_palr_taod.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_palr_taod.setText("0.00");

        lblIncome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIncome.setForeground(new java.awt.Color(102, 102, 102));
        lblIncome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIncome.setText("0.00");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_rm_viewreport, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_rm_viewreport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbl_rm_viewreport2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_rm_viewreport2.setForeground(new java.awt.Color(102, 102, 102));
        lbl_rm_viewreport2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rm_viewreport2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malintha_agency/images/Print.png"))); // NOI18N
        lbl_rm_viewreport2.setText("Print");
        lbl_rm_viewreport2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_rm_viewreport2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_palr_taod, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_palr_taodis, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_paf_tpfs, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_palr_tpfd, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(lblIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_rm_viewreport2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(lbl_paf_tpfs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addComponent(lbl_palr_tpfd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addComponent(lbl_palr_taodis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_rm_viewreport2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_palr_taod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_rm_viewreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rm_viewreportMouseClicked
        onLoad();
    }//GEN-LAST:event_lbl_rm_viewreportMouseClicked

    private void lbl_rm_viewreport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rm_viewreport2MouseClicked
        try {
            HashMap<String, Object> data = new HashMap<>();
            data.put("Total Payment for Suppliers", lbl_paf_tpfs.getText());
            data.put("Total Payments from Delivery", lbl_palr_tpfd.getText());
            data.put("Total Amount of Damages", lbl_palr_taod.getText());
            data.put("Total Amount of Discounts", lbl_palr_taodis.getText());
            data.put("Total Income", lblIncome.getText());
            data.put("From Date", f);
            data.put("To Date", t);
            filledReport = JasperFillManager.fillReport(jasperReport, data, new JREmptyDataSource());
            jRViewer = new JRViewer(filledReport);
            jRViewer.setOpaque(true);
            jRViewer.setBackground(Color.WHITE);
            new JasperViewer(jRViewer);
            //PrintJasper.PrintReportToPrinter(filledReport);
        } catch (JRException ex) {
            Logger.getLogger(OrderDetailManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbl_rm_viewreport2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lbl_paf_tpfs;
    private javax.swing.JLabel lbl_palr_taod;
    private javax.swing.JLabel lbl_palr_taodis;
    private javax.swing.JLabel lbl_palr_tpfd;
    private javax.swing.JLabel lbl_rm_viewreport;
    private javax.swing.JLabel lbl_rm_viewreport2;
    // End of variables declaration//GEN-END:variables

    public void onLoad() {
        try {
            f = Report_Manager.firstdate;
            t = Report_Manager.seconddate;
            String companyname = Report_Manager.companyname;

            com.malintha_agency.model.ProfitAndLostReport pr = ReportController.getProfitAndLostReport(companyname, f, t);
            if (pr != null) {
                lbl_paf_tpfs.setText(Double.toString(pr.getTotalsupplierpayment()));
                lbl_palr_tpfd.setText(Double.toString(pr.getTotaldiliverypayment()));
                lbl_palr_taod.setText(Double.toString(pr.getTotaldamagepayment()));
                lbl_palr_taodis.setText(Double.toString(pr.getTotaldiscountpayment()));
                double income = Double.parseDouble(lbl_palr_tpfd.getText()) - (Double.parseDouble(lbl_paf_tpfs.getText()) + Double.parseDouble(lbl_palr_taod.getText()));
                lblIncome.setText(income + "");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfitAndLostReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfitAndLostReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}