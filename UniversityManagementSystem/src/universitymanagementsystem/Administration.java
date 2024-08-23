package universitymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Administration extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;

    int selectedStudentID;
    int selectedFacultyID;

    public Administration() {
        initComponents();

        displayCourse();

        selectedStudentID = 0;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
            St = con.createStatement();
            Rs = St.executeQuery("select * from student_regtb");
            studentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }

        selectedFacultyID = 0;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
            St = con.createStatement();
            Rs = St.executeQuery("select * from faculty_regtb");
            facultyTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }
    }

    public void refresh() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
            St = con.createStatement();
            Rs = St.executeQuery("select * from student_regtb");
            studentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }

        studentTable.revalidate();
        studentTable.repaint();

    }

    public void F_refresh() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
            St = con.createStatement();
            Rs = St.executeQuery("select * from faculty_regtb");
            facultyTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }

        facultyTable.revalidate();
        facultyTable.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        coursesPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ProgramTb = new javax.swing.JTextField();
        p_codeTb = new javax.swing.JTextField();
        p_seatTb = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        courseAddBtn = new javax.swing.JButton();
        courseDelBtn = new javax.swing.JButton();
        subjectPanel = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        sub_courseTb = new javax.swing.JTextField();
        sub_subjectsTb = new javax.swing.JTextField();
        sub_subjectCodeTb = new javax.swing.JTextField();
        sub_yearSemTb = new javax.swing.JTextField();
        sub_theoryMarksTb = new javax.swing.JTextField();
        sub_practicalMarksTb = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        subjectDelBtn = new javax.swing.JButton();
        StudentPanel = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel32 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        studentTableDelBtn = new javax.swing.JButton();
        FacultyPanel = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        facultyTable = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        FacultyTableDelBtn = new javax.swing.JButton();
        noticePanel = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        noticeTb = new javax.swing.JTextField();
        noticeBtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jPanel3.setBackground(new java.awt.Color(153, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\man (1).png")); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\house.png")); // NOI18N
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Home");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\course.png")); // NOI18N
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Courses");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        jPanel14.setBackground(new java.awt.Color(255, 255, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\books.png")); // NOI18N
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Subjects");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\student.png")); // NOI18N
        jPanel15.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Students");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        jPanel16.setBackground(new java.awt.Color(255, 255, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\teacher.png")); // NOI18N
        jPanel16.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Faculties");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        jPanel18.setBackground(new java.awt.Color(255, 255, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\notice.png")); // NOI18N
        jPanel18.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Notice");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 10, 130, 30));

        jPanel19.setBackground(new java.awt.Color(255, 255, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\previous.png")); // NOI18N
        jPanel19.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel19.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("Back");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel19.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 10, 130, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 800));

        jPanel11.setBackground(new java.awt.Color(204, 0, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Welcome Administrator");
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1070, 90));

        homePanel.setBackground(new java.awt.Color(255, 204, 204));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 153, 153));

        jLabel20.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel20.setText("Home Page");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel20)
                .addContainerGap(865, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(25, 25, 25))
        );

        homePanel.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\courseBig.png")); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        homePanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\booksBig.png")); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        homePanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\studentBig.png")); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        homePanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\teacherBig.png")); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        homePanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\noticeBig.png")); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        homePanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        homePanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jPanel24.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        homePanel.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 1050, 30));

        jPanel25.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        homePanel.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1050, 20));

        jPanel26.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        homePanel.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1050, 20));

        jPanel27.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        homePanel.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1050, 20));

        jTabbedPane1.addTab("tab1", homePanel);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        jLabel21.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Courses");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel21)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel28.setText("Programs");

        jLabel29.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel29.setText("Program Code");

        jLabel30.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel30.setText("No. of Seat");

        ProgramTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ProgramTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramTbActionPerformed(evt);
            }
        });

        p_codeTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        p_seatTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        p_seatTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_seatTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgramTb)
                    .addComponent(p_codeTb)
                    .addComponent(p_seatTb))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgramTb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_codeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_seatTb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 296, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 690, 40));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 690, 30));

        jPanel8.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 690, 30));

        courseTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Programs", "Program Code", "Seat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(courseTable);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 530, 190));

        jPanel36.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 580, 90));

        jPanel37.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 580, 30));

        jPanel38.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 580, 30));

        courseAddBtn.setBackground(new java.awt.Color(204, 255, 204));
        courseAddBtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        courseAddBtn.setText("ADD");
        courseAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseAddBtnMouseClicked(evt);
            }
        });
        courseAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAddBtnActionPerformed(evt);
            }
        });
        courseAddBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                courseAddBtnKeyPressed(evt);
            }
        });
        jPanel4.add(courseAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 160, -1));

        courseDelBtn.setBackground(new java.awt.Color(204, 255, 204));
        courseDelBtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        courseDelBtn.setText("DELETE");
        courseDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseDelBtnActionPerformed(evt);
            }
        });
        jPanel4.add(courseDelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 160, -1));

        javax.swing.GroupLayout coursesPanelLayout = new javax.swing.GroupLayout(coursesPanel);
        coursesPanel.setLayout(coursesPanelLayout);
        coursesPanelLayout.setHorizontalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coursesPanelLayout.setVerticalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", coursesPanel);

        jPanel39.setBackground(new java.awt.Color(255, 204, 255));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(204, 0, 204));

        jPanel41.setBackground(new java.awt.Color(102, 0, 102));

        jLabel31.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 204));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Subjects");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(92, 92, 92))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel32.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 204));
        jLabel32.setText("Course");

        jLabel33.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 204));
        jLabel33.setText("Subjects");

        jLabel34.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 204));
        jLabel34.setText("Subject Code");

        jLabel35.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 204));
        jLabel35.setText("Year/Sem");

        jLabel36.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 204));
        jLabel36.setText("Theory Marks");

        jLabel37.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 204));
        jLabel37.setText("Practical Marks");

        sub_courseTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        sub_subjectsTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        sub_subjectCodeTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        sub_yearSemTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        sub_theoryMarksTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        sub_practicalMarksTb.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub_practicalMarksTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_subjectsTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(sub_courseTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(sub_subjectCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(sub_yearSemTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(sub_theoryMarksTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_courseTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_subjectsTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_subjectCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_yearSemTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_theoryMarksTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_practicalMarksTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 720));

        jPanel42.setBackground(new java.awt.Color(153, 0, 102));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 680, 110));

        jPanel43.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 680, 50));

        jPanel44.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 680, 30));

        jPanel45.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 680, 20));

        subjectTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Course", "Subjects", "Subject_Code", "YearSem", "Theory", "Practical"
            }
        ));
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(subjectTable);

        jPanel39.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 650, 270));

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel39.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 180, -1));

        subjectDelBtn.setBackground(new java.awt.Color(255, 204, 255));
        subjectDelBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        subjectDelBtn.setText("DELETE");
        subjectDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectDelBtnActionPerformed(evt);
            }
        });
        jPanel39.add(subjectDelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 180, -1));

        javax.swing.GroupLayout subjectPanelLayout = new javax.swing.GroupLayout(subjectPanel);
        subjectPanel.setLayout(subjectPanelLayout);
        subjectPanelLayout.setHorizontalGroup(
            subjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subjectPanelLayout.setVerticalGroup(
            subjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("tab3", subjectPanel);

        jPanel22.setBackground(new java.awt.Color(255, 204, 204));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentTable.setBackground(new java.awt.Color(255, 255, 204));
        studentTable.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Student ID", "Department", "Year/Semester", "Address", "Phone", "Gender", "Email", "Password", "Date of Birth"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        jPanel22.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1025, 490));

        jPanel32.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 682, 1050, -1));

        jPanel34.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1050, 30));

        jPanel33.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1050, 20));

        jPanel35.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1050, 20));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 170, -1));

        studentTableDelBtn.setBackground(new java.awt.Color(255, 102, 102));
        studentTableDelBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        studentTableDelBtn.setText("DELETE");
        studentTableDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTableDelBtnActionPerformed(evt);
            }
        });
        jPanel22.add(studentTableDelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 170, -1));

        javax.swing.GroupLayout StudentPanelLayout = new javax.swing.GroupLayout(StudentPanel);
        StudentPanel.setLayout(StudentPanelLayout);
        StudentPanelLayout.setHorizontalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StudentPanelLayout.setVerticalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", StudentPanel);

        jPanel23.setBackground(new java.awt.Color(204, 255, 204));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facultyTable.setBackground(new java.awt.Color(255, 255, 204));
        facultyTable.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        facultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Eamil", "Password", "Department", "Employee", "Gender", "Address", "Phone", "Course", "Date of Birth"
            }
        ));
        facultyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(facultyTable);

        jPanel23.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1025, 490));

        jPanel28.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 682, 1050, 40));

        jPanel29.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1050, 30));

        jPanel30.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1050, 20));

        jPanel31.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1050, 20));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, -1));

        FacultyTableDelBtn.setBackground(new java.awt.Color(153, 255, 153));
        FacultyTableDelBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        FacultyTableDelBtn.setText("DELETE");
        FacultyTableDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyTableDelBtnActionPerformed(evt);
            }
        });
        jPanel23.add(FacultyTableDelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 170, -1));

        javax.swing.GroupLayout FacultyPanelLayout = new javax.swing.GroupLayout(FacultyPanel);
        FacultyPanel.setLayout(FacultyPanelLayout);
        FacultyPanelLayout.setHorizontalGroup(
            FacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FacultyPanelLayout.setVerticalGroup(
            FacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", FacultyPanel);

        jPanel46.setBackground(new java.awt.Color(255, 255, 204));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel47.setBackground(new java.awt.Color(102, 102, 0));

        jLabel39.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 204));
        jLabel39.setText("NOTICE");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel39)
                .addContainerGap(956, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel39)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel46.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jPanel48.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel46.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 622, 1050, -1));

        jPanel49.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel46.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1050, 30));

        jPanel50.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel46.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1050, 30));

        jPanel51.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel46.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 30));

        jPanel52.setBackground(new java.awt.Color(255, 255, 153));
        jPanel52.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel38.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel38.setText("Notices");

        noticeTb.setFont(new java.awt.Font("French Script MT", 1, 28)); // NOI18N

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noticeTb)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(noticeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel46.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1050, 240));

        noticeBtn.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        noticeBtn.setText("APPLY");
        noticeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noticeBtnActionPerformed(evt);
            }
        });
        jPanel46.add(noticeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 220, 40));

        javax.swing.GroupLayout noticePanelLayout = new javax.swing.GroupLayout(noticePanel);
        noticePanel.setLayout(noticePanelLayout);
        noticePanelLayout.setHorizontalGroup(
            noticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        noticePanelLayout.setVerticalGroup(
            noticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", noticePanel);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", jPanel10);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 1050, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked

        Login login = new Login();
        login.show();

        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    private void FacultyTableDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyTableDelBtnActionPerformed

        if (selectedFacultyID == 0) {
            JOptionPane.showMessageDialog(this, "Select a Faculty Member");
        } else {

            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
                String Query = "Delete from faculty_regtb where EmployeeID =" + selectedFacultyID;
                Statement Del = con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Faculty Member Deleted");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

            F_refresh();
        }


    }//GEN-LAST:event_FacultyTableDelBtnActionPerformed


    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        int row = studentTable.getSelectedRow();
        System.out.println(row);
        Object obj = model.getValueAt(row, 1);
        System.out.println(obj);

        selectedStudentID = (int) obj;

    }//GEN-LAST:event_studentTableMouseClicked

    private void studentTableDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTableDelBtnActionPerformed

        if (selectedStudentID == 0) {
            JOptionPane.showMessageDialog(this, "Select a Student");
        } else {

            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
                String Query = "Delete from student_regtb where Student_ID =" + selectedStudentID;
                Statement Del = con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Student Deleted");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

            refresh();
        }

    }//GEN-LAST:event_studentTableDelBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login login = new Login();
        login.show();

        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed


    private void facultyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) facultyTable.getModel();
        int row = facultyTable.getSelectedRow();
        System.out.println(row);
        Object obj = model.getValueAt(row, 4);
        System.out.println(obj);

        selectedFacultyID = (int) obj;


    }//GEN-LAST:event_facultyTableMouseClicked

    private void ProgramTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgramTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProgramTbActionPerformed

    private void courseAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseAddBtnActionPerformed

    private void courseAddBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseAddBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseAddBtnKeyPressed

    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    Statement st = null;
    Statement st1 = null;

    private void displayCourse() {

        try {

            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
            st = Con.createStatement();
            rs = st.executeQuery("select * from course_tb");
            courseTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

        }
    }

    private void displaySubject() {

        try {

            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
            st = Con.createStatement();
            rs = st.executeQuery("select * from subject_tb");
            subjectTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

        }
    }

    int no = 0;

    private void countNo() {

        try {

            st1 = Con.createStatement();
            rs1 = st1.executeQuery("select max(No) from course_tb");
            rs1.next();
            no = rs1.getInt(1) + 1;

        } catch (Exception e) {

        }

    }
    
    private void sub_countNo() {

        try {

            st1 = Con.createStatement();
            rs1 = st1.executeQuery("select max(No) from subject_tb");
            rs1.next();
            no = rs1.getInt(1) + 1;

        } catch (Exception e) {

        }

    }
    
    private void notice_countNo() {

        try {

            st1 = Con.createStatement();
            rs1 = st1.executeQuery("select max(No) from notice_tb");
            rs1.next();
            no = rs1.getInt(1) + 1;

        } catch (Exception e) {

        }

    }

    private void clear() {
        ProgramTb.setText(null);
        p_codeTb.setText(null);
        p_seatTb.setText(null);

        sub_courseTb.setText(null);
        sub_subjectsTb.setText(null);
        sub_subjectCodeTb.setText(null);
        sub_yearSemTb.setText(null);
        sub_theoryMarksTb.setText(null);
        sub_practicalMarksTb.setText(null);
    }

    private void courseAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseAddBtnMouseClicked

        if (ProgramTb.getText().isEmpty() || p_codeTb.getText().isEmpty() || p_seatTb.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {

            try {

                countNo();

                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
                PreparedStatement Add = Con.prepareStatement("insert into course_tb values(?,?,?,?)");

                Add.setInt(1, no);
                Add.setString(2, ProgramTb.getText());
                Add.setString(3, p_codeTb.getText());
                Add.setString(4, p_seatTb.getText());

                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Course Added");
                Con.close();
                displayCourse();
                clear();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }


    }//GEN-LAST:event_courseAddBtnMouseClicked

    private void courseDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseDelBtnActionPerformed

        if (key == 0) {
            JOptionPane.showMessageDialog(this, "Select a course");
        } else {

            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
                String Query = "Delete from course_tb where No =" + key;
                Statement Del = con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Course Deleted");
                displayCourse();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

        }


    }//GEN-LAST:event_courseDelBtnActionPerformed

    int key = 0;
    private void courseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) courseTable.getModel();
        int row = courseTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(row, 0).toString());
        ProgramTb.setText(model.getValueAt(row, 1).toString());
        p_codeTb.setText(model.getValueAt(row, 2).toString());
        p_seatTb.setText(model.getValueAt(row, 3).toString());


    }//GEN-LAST:event_courseTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (sub_courseTb.getText().isEmpty() || sub_subjectsTb.getText().isEmpty() || sub_subjectCodeTb.getText().isEmpty() || sub_yearSemTb.getText().isEmpty() || sub_theoryMarksTb.getText().isEmpty() || sub_practicalMarksTb.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Missing Information");

        } else {

            try {
                
                sub_countNo();

                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
                PreparedStatement Add = Con.prepareStatement("insert into subject_tb values(?,?,?,?,?,?,?)");

                Add.setInt(1, no);
                Add.setString(2, sub_courseTb.getText());
                Add.setString(3, sub_subjectsTb.getText());
                Add.setString(4, sub_subjectCodeTb.getText());
                Add.setString(5, sub_yearSemTb.getText());
                Add.setString(6, sub_theoryMarksTb.getText());
                Add.setString(7, sub_practicalMarksTb.getText());

                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Subject Added");
                Con.close();
                displaySubject();
                clear();

            } catch (Exception e) {

            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectTableMouseClicked
        
        DefaultTableModel model = (DefaultTableModel) subjectTable.getModel();
        int row = subjectTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(row, 0).toString());
        sub_courseTb.setText(model.getValueAt(row, 1).toString());
        sub_subjectsTb.setText(model.getValueAt(row, 2).toString());
        sub_subjectCodeTb.setText(model.getValueAt(row, 3).toString());
        sub_yearSemTb.setText(model.getValueAt(row, 4).toString());
        sub_theoryMarksTb.setText(model.getValueAt(row, 5).toString());
        sub_practicalMarksTb.setText(model.getValueAt(row, 6).toString());
                      
        
    }//GEN-LAST:event_subjectTableMouseClicked

    private void subjectDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectDelBtnActionPerformed
        
        
        if (key == 0) {
            JOptionPane.showMessageDialog(this, "Select a Subject");
        } else {

            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
                String Query = "Delete from subject_tb where No =" + key;
                Statement Del = con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Subject Deleted");
                displaySubject();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

        }
        
        
    }//GEN-LAST:event_subjectDelBtnActionPerformed

    private void p_seatTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_seatTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_seatTbActionPerformed

    
    public void clearNotice(){
        noticeTb.setText(null);
    }
    
    
    private void noticeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noticeBtnActionPerformed
        
        if (noticeTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                
                notice_countNo();
                
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "");
                PreparedStatement Add = (PreparedStatement) con.prepareStatement("insert into notice_tb values(?,?)");
                
                Add.setInt(1, no);
                Add.setString(2, noticeTb.getText());
                
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Notice Added Successfully");
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

            clearNotice();
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_noticeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FacultyPanel;
    private javax.swing.JButton FacultyTableDelBtn;
    private javax.swing.JTextField ProgramTb;
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JButton courseAddBtn;
    private javax.swing.JButton courseDelBtn;
    private javax.swing.JTable courseTable;
    private javax.swing.JPanel coursesPanel;
    private javax.swing.JTable facultyTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton noticeBtn;
    private javax.swing.JPanel noticePanel;
    private javax.swing.JTextField noticeTb;
    private javax.swing.JTextField p_codeTb;
    private javax.swing.JTextField p_seatTb;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton studentTableDelBtn;
    private javax.swing.JTextField sub_courseTb;
    private javax.swing.JTextField sub_practicalMarksTb;
    private javax.swing.JTextField sub_subjectCodeTb;
    private javax.swing.JTextField sub_subjectsTb;
    private javax.swing.JTextField sub_theoryMarksTb;
    private javax.swing.JTextField sub_yearSemTb;
    private javax.swing.JButton subjectDelBtn;
    private javax.swing.JPanel subjectPanel;
    private javax.swing.JTable subjectTable;
    // End of variables declaration//GEN-END:variables
}
