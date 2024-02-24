/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.CourseInstructorBUS;
import DAL.DatabaseConnect;
import com.mycompany.course.BLL.CourseBUS;
import com.mycompany.course.DTO.CourseDTO;
import com.mycompany.course.DTO.CourseInstructorDTO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class PanelCourse extends javax.swing.JPanel {

    /**
     * Creates new form PanelCourse
     */
    public PanelCourse() {
        initComponents();

        DatabaseConnect.connectDB();

        displayCourse();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdOnline);
        buttonGroup.add(rdOnsite);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        pnKhoaHoc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnAddCourse = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rdOnline = new javax.swing.JRadioButton();
        rdOnsite = new javax.swing.JRadioButton();

        pnKhoaHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "CourseID", "Title", "Credit", "DepartmentID", "Type"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        pnKhoaHoc.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1000, 290));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextField1.setText("Nhập thông tin tìm kiếm");

        jButton1.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnKhoaHoc.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1000, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnAddCourse.setText("Thêm Khóa Học");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa Khóa Học");

        jButton2.setText("Sửa Khóa Học");

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnKhoaHoc.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 850, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Loại Khóa Học"));

        rdOnline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdOnline.setText("Online");
        rdOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOnlineActionPerformed(evt);
            }
        });

        rdOnsite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdOnsite.setText("Onsite");
        rdOnsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOnsiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rdOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(rdOnsite, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdOnsite))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnKhoaHoc.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 310, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        if (rdOnline.isSelected()) {
            DialogOnlineCourse onlineCourse = new DialogOnlineCourse();
            onlineCourse.setVisible(true);
            rdOnsite.setSelected(false); // Đảm bảo chỉ có một RadioButton được chọn
        } else if (rdOnsite.isSelected()) {
            DiaglogOnsiteCourse onsiteCourse = new DiaglogOnsiteCourse();
            onsiteCourse.setVisible(true);
            rdOnline.setSelected(false); // Đảm bảo chỉ có một RadioButton được chọn
        }   
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void rdOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOnlineActionPerformed
        // Xử lý sự kiện khi RadioButton rdOnline được chọn
        displayOnlineCourses();
    }//GEN-LAST:event_rdOnlineActionPerformed
    
    private void displayOnlineCourses() {
        // Gọi hàm để lấy và hiển thị danh sách khóa học online từ cơ sở dữ liệu
        List<CourseDTO> onlineCourses = CourseBUS.getOnlineCourse();

        // Cập nhật dữ liệu trong bảng jTable2 để hiển thị danh sách khóa học online
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        int stt = 1;
        for (CourseDTO onlineCourse : onlineCourses) {
            Object[] row = {
                stt++,
                onlineCourse.getCourseID(),
                onlineCourse.getTitle(),
                onlineCourse.getCredits(),
                onlineCourse.getDepartmentID(),
                "Online" // Đặt giá trị cố định cho cột Type vì đây là danh sách khóa học online
            };
            model.addRow(row);
        }
    }

    
    private void rdOnsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOnsiteActionPerformed
        /// Xử lý sự kiện khi RadioButton rdOnsite được chọn
        displayOnsiteCourses();
    }//GEN-LAST:event_rdOnsiteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        displayCourse();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void displayOnsiteCourses() {
        // Gọi hàm để lấy và hiển thị danh sách khóa học online từ cơ sở dữ liệu
        List<CourseDTO> onsiteCourses = CourseBUS.getOnsiteCourse();

        // Cập nhật dữ liệu trong bảng jTable2 để hiển thị danh sách khóa học online
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        int stt = 1;
        for (CourseDTO onsiteCourse : onsiteCourses) {
            Object[] row = {
                stt++,
                onsiteCourse.getCourseID(),
                onsiteCourse.getTitle(),
                onsiteCourse.getCredits(),
                onsiteCourse.getDepartmentID(),
                "Onsite" // Đặt giá trị cố định cho cột Type vì đây là danh sách khóa học online
            };
            model.addRow(row);
        }
    }

    
    private void displayCourse() {
        List<CourseDTO> course = CourseBUS.getAllCourse();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        int stt = 1;
        for (CourseDTO Course : course) {
            Object[] row = {
                stt++,
                Course.getCourseID(),
                Course.getTitle(),
                Course.getCredits(),
                Course.getDepartmentID(),
                CourseBUS.getTypebyID(Course.getCourseID())

            };
            model.addRow(row);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnKhoaHoc;
    private javax.swing.JRadioButton rdOnline;
    private javax.swing.JRadioButton rdOnsite;
    // End of variables declaration//GEN-END:variables
}
