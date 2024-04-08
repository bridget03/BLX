/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.TrinhHaiNam;

import java.awt.Color;
import java.awt.Cursor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Nguoi;
import model.Xe;
import model.TrinhHaiNam.BaoHiemXeMay;
import view.HomeFrm;

/**
 *
 * @author pc
 */
public class SuaBaoHiem extends javax.swing.JDialog {

    /**
     * Creates new form SuaBaoHiem
     */
    private HomeFrm home;

    public SuaBaoHiem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (HomeFrm) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSuaBienSo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbSuaLoaiXe = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnHuyBo = new javax.swing.JButton();
        txtSuaNBD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSuaChuXe = new javax.swing.JTextField();
        txtSuaSoNam = new javax.swing.JTextField();
        lbMaBH = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSuaBH = new javax.swing.JButton();
        jlbMaBH = new javax.swing.JLabel();
        txtSuaMBH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Biển số :");

        cbbSuaLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dưới 50cc", "Trên 50cc", "Mô tô 3 bánh" }));

        jLabel5.setText("Ngày bắt đầu :");

        jLabel8.setText("SỬA THÔNG TIN BẢO HIỂM ");

        jLabel6.setText("Số năm");

        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        jLabel2.setText("Chủ xe :");

        txtSuaChuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaChuXeActionPerformed(evt);
            }
        });

        txtSuaSoNam.setToolTipText("Nhập ngày: dd/mm/yyyy");
        txtSuaSoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaSoNamActionPerformed(evt);
            }
        });

        lbMaBH.setText("Mã bảo hiểm:");

        jLabel3.setText("Loại xe :");

        btnSuaBH.setText("Sửa");
        btnSuaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaBHActionPerformed(evt);
            }
        });

        txtSuaMBH.setOpaque(true);
        txtSuaMBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaMBHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnSuaBH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuyBo)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtSuaBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSuaChuXe)
                                    .addComponent(cbbSuaLoaiXe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lbMaBH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSuaMBH, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSuaNBD, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtSuaSoNam))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbMaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbMaBH)
                    .addComponent(txtSuaMBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuaChuXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtSuaNBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbSuaLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSuaSoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSuaBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaBH)
                    .addComponent(btnHuyBo))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSuaChuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaChuXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuaChuXeActionPerformed

    private void txtSuaSoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaSoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuaSoNamActionPerformed

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void btnSuaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaBHActionPerformed

        String maBH = txtSuaMBH.getText();
        String chuXe = txtSuaChuXe.getText();
        String loaiXe = cbbSuaLoaiXe.getSelectedItem().toString();
        String bienSo = txtSuaBienSo.getText();
        LocalDate ngayBD = null;
        LocalDate ngayKT = null;
        int soNam = 0;
        double phiBH = 0;
        boolean isOK = true;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            ngayBD = LocalDate.parse(txtSuaNBD.getText(), formatter);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ngay nhap vao khong hop le");
            isOK = false;
        }

        try {
            soNam = Integer.parseInt(txtSuaSoNam.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "So nam phai la so nguyen");
            isOK = false;
        }

        if (chuXe.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Tên chủ xe không được để trống ");
            isOK = false;
        }
        if (bienSo.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Biển số xe không được để trống ");
            isOK = false;
        }
        if (ngayBD == null) {
            JOptionPane.showMessageDialog(rootPane, "Ngày bắt đầu không được để trống ");
            isOK = false;
        }

        if (isOK) {
            Nguoi a = new Nguoi(chuXe);
            Xe xe1 = new Xe(bienSo, loaiXe, a);
            BaoHiemXeMay bh = new BaoHiemXeMay(xe1, ngayBD, soNam, maBH);
            home.suaBH(bh);
            JOptionPane.showMessageDialog(rootPane, "Sua thanh cong");
            this.dispose();
        }
    }//GEN-LAST:event_btnSuaBHActionPerformed

    private void txtSuaMBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaMBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuaMBHActionPerformed

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
            java.util.logging.Logger.getLogger(SuaBaoHiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaBaoHiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaBaoHiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaBaoHiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaBaoHiem dialog = new SuaBaoHiem(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnSuaBH;
    private javax.swing.JComboBox<String> cbbSuaLoaiXe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlbMaBH;
    private javax.swing.JLabel lbMaBH;
    private javax.swing.JTextField txtSuaBienSo;
    private javax.swing.JTextField txtSuaChuXe;
    private javax.swing.JTextField txtSuaMBH;
    private javax.swing.JTextField txtSuaNBD;
    private javax.swing.JTextField txtSuaSoNam;
    // End of variables declaration//GEN-END:variables


    public void setEditDataBaoHiem(BaoHiemXeMay x) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtSuaMBH.setText(x.getMaBH());
        txtSuaMBH.setEditable(false);
        txtSuaMBH.setBorder(null);
        txtSuaMBH.setBackground(null);
        txtSuaMBH.setForeground(Color.BLACK);
        txtSuaMBH.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        txtSuaMBH.setCaretColor(txtSuaMBH.getBackground());

        txtSuaChuXe.setText(x.getXe().getChuSoHuu().getHoTen());
        txtSuaBienSo.setText(x.getXe().getBienSoXe());
        cbbSuaLoaiXe.setSelectedItem(x.getXe().getLoaiXe());
        txtSuaNBD.setText(x.getNgayBatDau().format(dateFormatter));
        txtSuaSoNam.setText(String.valueOf(x.getSoNam()));
    }

}
