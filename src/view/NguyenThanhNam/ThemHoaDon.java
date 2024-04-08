/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.NguyenThanhNam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Nguoi;
import model.VatPham;
import model.NguyenThanhNam.HoaDon;
import model.NguyenThanhNam.TableVatPham;
import view.HomeFrm;

/**
 *
 * @author admin
 */
public class ThemHoaDon extends javax.swing.JDialog implements InforForm{
    private ArrayList<VatPham> dsVP = new ArrayList<>();
    private int dongChon = -1;
    private VatPham vp = new VatPham();
    private DefaultTableModel modelVP;

    /**
     * Creates new form ThemHoaDon
     */
    private HomeFrm home;
    public ThemHoaDon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (HomeFrm) parent;
        modelVP = (DefaultTableModel) tblVP.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jbtThem = new javax.swing.JButton();
        jbtHuy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVP = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtXoa = new javax.swing.JButton();
        jbtAdd = new javax.swing.JButton();
        jtfNVP = new javax.swing.JTextField();
        jtfNSL = new javax.swing.JTextField();
        jtfNDG = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNTKH = new javax.swing.JTextField();
        jtfNL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfNDC = new javax.swing.JTextField();
        jtfNSDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM HÓA ĐƠN");

        jbtThem.setText("Thêm");
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });
        jPanel4.add(jbtThem);

        jbtHuy.setText("Hủy");
        jbtHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyActionPerformed(evt);
            }
        });
        jPanel4.add(jbtHuy);

        tblVP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        tblVP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vật phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblVP.setFocusable(false);
        tblVP.setShowVerticalLines(true);
        tblVP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVP);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nhập vật phẩm:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nhập số lượng:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nhập đơn giá: ");

        jbtXoa.setText("Xóa");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        jbtAdd.setText("Thêm VP");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jtfNVP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfNSL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfNDG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNVP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jtfNSL, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jbtAdd)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtfNDG, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfNDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAdd)
                    .addComponent(jbtXoa))
                .addGap(35, 35, 35))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nhập tên khách hàng: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nhập ngày lập: ");

        jtfNTKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfNL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNL.setToolTipText("Nhập ngày dạng dd/MM/yyyy");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nhập địa chỉ: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nhập SĐT: ");

        jtfNDC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfNSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNDC, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNL, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfNTKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfNDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM HÓA ĐƠN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed
        String tenKH = jtfNTKH.getText();
        String diaChi = jtfNDC.getText();
        String SDT = jtfNSDT.getText();
        String ngayLap = jtfNL.getText().trim();
        boolean isOK = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (tenKH.length() == 0 || tenKH.matches("[^a-zA-Z]+")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập khách hàng hợp lệ");
            isOK = false;
        } else if (diaChi.length() == 0 || diaChi.matches("\\W+")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng địa chỉ hợp lệ");
            isOK = false;
        } else if (SDT.length() != 10 || !SDT.matches("\\d+")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập SĐT hợp lệ");
            isOK = false;
        } else if (dsVP.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ít nhất 1 vật phẩm");
            isOK = false;
        }  else if (ngayLap.length() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập ngày lập.");
            isOK = false;
        } else {
            try {
                LocalDate parsedDate = LocalDate.parse(ngayLap, formatter);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập ngày lập hợp lệ.");
                isOK = false;
            }
        }

        if (isOK) {
            Nguoi kh = new Nguoi(tenKH, diaChi, SDT);
            HoaDon hd = new HoaDon(kh, LocalDate.parse(jtfNL.getText(), formatter), dsVP);
            home.addHoaDon(hd);
            xoaForm();
            JOptionPane.showMessageDialog(null, "Thêm thành công hóa đơn.");
        }
    }//GEN-LAST:event_jbtThemActionPerformed

    private void jbtHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtHuyActionPerformed

    private void tblVPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVPMouseClicked
        dongChon = tblVP.getSelectedRow();
        if (dongChon != -1) {
            vp = dsVP.get(dongChon);
            jtfNVP.setText(vp.getTenVatPham());
            jtfNSL.setText(vp.getSoLuong()+"");
            jtfNDG.setText(vp.getDonGia()+"");
        }
    }//GEN-LAST:event_tblVPMouseClicked

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        dongChon = tblVP.getSelectedRow();
        if (dongChon != -1) {
            dsVP.remove(dongChon);
            xoaFormVP();
            loadTableVP();
        }
        else
        JOptionPane.showMessageDialog(this,
            "Chưa chọn dòng xóa","Thông báo", WIDTH);
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        String vp = jtfNVP.getText();
        String sl = jtfNSL.getText();
        String dg = jtfNDG.getText();
        boolean isOK = true;
        if (vp.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vật phẩm trống!");
            isOK = false;
        } else if (vp.matches("\\W+")) {
            JOptionPane.showMessageDialog(rootPane, "Tên vật phẩm không chứa ký tự đặc biệt!");
            isOK = false;
        } else if (sl.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng vật phẩm trống!");
            isOK = false;
        } else if (!sl.matches("\\d+")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập số lượng vật phẩm hợp lệ!");
            isOK = false;
        } else if (dg.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Đơn giá vật phẩm trống!");
            isOK = false;
        } else if (!dg.matches("\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đơn giá vật phẩm hợp lệ!");
            isOK = false;
        }

        if (isOK) {
            VatPham m = new VatPham(vp, Integer.parseInt(sl), Double.parseDouble(dg));
            dsVP.add(m);
            loadTableVP();
            xoaFormVP();
        }
    }//GEN-LAST:event_jbtAddActionPerformed

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
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            ThemHoaDon dialog = new ThemHoaDon(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtHuy;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JTextField jtfNDC;
    private javax.swing.JTextField jtfNDG;
    private javax.swing.JTextField jtfNL;
    private javax.swing.JTextField jtfNSDT;
    private javax.swing.JTextField jtfNSL;
    private javax.swing.JTextField jtfNTKH;
    private javax.swing.JTextField jtfNVP;
    private javax.swing.JTable tblVP;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void loadTableVP(){
        tblVP.setModel(new TableVatPham(dsVP));
    }
    
    @Override
    public void xoaFormVP() {
        jtfNVP.setText("");
        jtfNSL.setText("");
        jtfNDG.setText("");
    }

    @Override
    public void xoaForm() {
        jtfNTKH.setText("");
        jtfNDC.setText("");
        jtfNSDT.setText("");
        jtfNL.setText("");
        xoaFormVP();
        dsVP.clear();
        loadTableVP();
    }

    @Override
    public void SetForm() {
        
    }
}
