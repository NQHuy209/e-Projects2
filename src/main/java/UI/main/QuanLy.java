/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.main;

import UI.quanly.QLHoaDonJFrame;
import UI.quanly.QLKhachHangJFrame;
import UI.quanly.QLPhimJFrame;
import UI.quanly.QLSuatChieuJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Quang Huy
 */
public class QuanLy extends javax.swing.JPanel {
    private QLPhimJFrame QLPhimJFrame = new QLPhimJFrame();
    private QLHoaDonJFrame QLHoaDonJFrame = new QLHoaDonJFrame();
    private QLKhachHangJFrame QLKhachHangJFrame = new QLKhachHangJFrame();
    private QLSuatChieuJFrame QLSuatChieuJFrame = new QLSuatChieuJFrame();
    /**
     * Creates new form QuanLy
     */
    public QuanLy() {
        initComponents();
        btnNguoiDung.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNguoiDung = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnSuatChieu = new javax.swing.JButton();
        btnPhim = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 480));

        btnNguoiDung.setBackground(new java.awt.Color(255, 102, 102));
        btnNguoiDung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNguoiDung.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\employee.png")); // NOI18N
        btnNguoiDung.setText("Người dùng");
        btnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiDungActionPerformed(evt);
            }
        });

        btnHoaDon.setBackground(new java.awt.Color(255, 255, 204));
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHoaDon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\payment.png")); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnSuatChieu.setBackground(new java.awt.Color(0, 102, 102));
        btnSuatChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSuatChieu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\clapperboard.png")); // NOI18N
        btnSuatChieu.setText("Suất chiếu");
        btnSuatChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuatChieuActionPerformed(evt);
            }
        });

        btnPhim.setBackground(new java.awt.Color(255, 102, 0));
        btnPhim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPhim.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\film-reel.png")); // NOI18N
        btnPhim.setText("Phim");
        btnPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuatChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPhim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuatChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiDungActionPerformed
        // TODO add your handling code here:
        QLKhachHangJFrame.setVisible(true);
    }//GEN-LAST:event_btnNguoiDungActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        QLHoaDonJFrame.show();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnSuatChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuatChieuActionPerformed
        // TODO add your handling code here:
        QLSuatChieuJFrame.show();
    }//GEN-LAST:event_btnSuatChieuActionPerformed

    private void btnPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhimActionPerformed
        // TODO add your handling code here:
        QLPhimJFrame.show();
    }//GEN-LAST:event_btnPhimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnPhim;
    private javax.swing.JButton btnSuatChieu;
    // End of variables declaration//GEN-END:variables
}
