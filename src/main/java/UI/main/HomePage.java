/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.main;

import Core.ViewController;
import Core.ViewPanel;
import UI.banhang.TicketJFrame;
import UI.dangnhap.LoginJFrame1;
import UI.quanly.QLHoaDonJFrame;
import UI.quanly.QLNguoiDungJFrame;
import UI.quanly.QLPhimJFrame;
import UI.quanly.QLSuatChieuJFrame;
import UI.thongke.DoanhthuJFrame;
import UI.thongke.VeBanJFrame;

/**
 *
 * @author Quang Huy
 */
public class HomePage extends javax.swing.JFrame {
    public static boolean load;
    private QLPhimJFrame QLPhimJFrame = new QLPhimJFrame();
    private QLHoaDonJFrame QLHoaDonJFrame = new QLHoaDonJFrame();
    private QLNguoiDungJFrame QLNguoiDungJFrame = new QLNguoiDungJFrame();
    private QLSuatChieuJFrame QLSuatChieuJFrame = new QLSuatChieuJFrame();
    private TicketJFrame ticket = new TicketJFrame();
    private DoanhthuJFrame doanhthu = new DoanhthuJFrame();
    private VeBanJFrame veban = new VeBanJFrame();
    
    public static String pathFile = "C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\e-Projects2\\src\\main\\resoures\\image";    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
//        ViewController controller = new ViewController(jPanel2);
//        controller.setView(jpnQuanLy);
//        
//        List<ViewPanel> listItem = new ArrayList<>();
//        listItem.add(new ViewPanel("QuanLy", jpnQuanLy));
//        listItem.add(new ViewPanel("BanHang", jpnBanHang));
//        listItem.add(new ViewPanel("ThongKe", jpnThongKe));
//        controller.setEvent(listItem);
        load = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVe = new javax.swing.JButton();
        btnNguoiDung = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnSuatChieu = new javax.swing.JButton();
        btnPhim2 = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        btnVeBan = new javax.swing.JButton();
        btnCollapse3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOut = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 83, 104));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\Users-Name.png")); // NOI18N
        jLabel6.setText("User");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        btnVe.setBackground(new java.awt.Color(255, 102, 0));
        btnVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVe.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\tickets.png")); // NOI18N
        btnVe.setText("Vé");
        btnVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeActionPerformed(evt);
            }
        });

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

        btnPhim2.setBackground(new java.awt.Color(255, 102, 0));
        btnPhim2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPhim2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\film-reel.png")); // NOI18N
        btnPhim2.setText("Phim");
        btnPhim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhim2ActionPerformed(evt);
            }
        });

        btnDoanhThu.setBackground(new java.awt.Color(255, 102, 0));
        btnDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDoanhThu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\tickets.png")); // NOI18N
        btnDoanhThu.setText("Doanh Thu");
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });

        btnVeBan.setBackground(new java.awt.Color(255, 102, 0));
        btnVeBan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVeBan.setIcon(new javax.swing.ImageIcon("C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\project_ki2\\src\\main\\resoures\\icons\\tickets.png")); // NOI18N
        btnVeBan.setText("Vé Bán");
        btnVeBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeBanActionPerformed(evt);
            }
        });

        btnCollapse3.setBackground(new java.awt.Color(52, 83, 104));
        btnCollapse3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCollapse3.setForeground(new java.awt.Color(255, 255, 255));
        btnCollapse3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCollapse3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCollapse3.setOpaque(true);
        btnCollapse3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCollapse3MouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Thống Kê");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPhim2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuatChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(btnVe, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(296, 296, 296)))
                .addComponent(btnCollapse3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVeBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(83, 83, 83))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnVeBan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPhim2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuatChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVe, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(btnCollapse3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnOut.setBackground(new java.awt.Color(52, 83, 104));
        btnOut.setForeground(new java.awt.Color(255, 255, 255));
        btnOut.setText("Đăng Xuất");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOut)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeBanActionPerformed
        // TODO add your handling code here:
        veban.show();
    }//GEN-LAST:event_btnVeBanActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        // TODO add your handling code here:
        doanhthu.show();
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnPhim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhim2ActionPerformed
        // TODO add your handling code here:
        QLPhimJFrame.show();
    }//GEN-LAST:event_btnPhim2ActionPerformed

    private void btnSuatChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuatChieuActionPerformed
        // TODO add your handling code here:
        QLSuatChieuJFrame.show();
    }//GEN-LAST:event_btnSuatChieuActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        QLHoaDonJFrame.show();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiDungActionPerformed
        // TODO add your handling code here:
        QLNguoiDungJFrame.setVisible(true);
    }//GEN-LAST:event_btnNguoiDungActionPerformed

    private void btnVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeActionPerformed
        // TODO add your handling code here:\
        ticket.show();
    }//GEN-LAST:event_btnVeActionPerformed

    private void btnCollapse3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCollapse3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCollapse3MouseReleased

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        System.exit(0);
        new LoginJFrame1().setVisible(true);
    }//GEN-LAST:event_btnOutActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCollapse3;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnPhim2;
    private javax.swing.JButton btnSuatChieu;
    private javax.swing.JButton btnVe;
    private javax.swing.JButton btnVeBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
