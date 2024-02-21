package Home.View;

import java.awt.Component;
import Auth.View.Register;
import Component.AlertMessage;
import Component.ScrollPanelItems;
import Home.Controller.LibraryController;
import Home.Model.LibraryModel;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class HomeScreen extends javax.swing.JFrame {
    
    LibraryController controller = new LibraryController();
    
    String name1 ;
    String gender1 ;
    String bookname1 ;
    String contact1 ;
    String loandate1 ;
    String duedate1 ;
    String image1 ;

    public HomeScreen() {
        initComponents();
        viewGuess();
    }
    // for view guess in scroll panel homescreen
    public void viewGuess(){
        ScrollPanel.removeAll();
        ScrollPanel.setLayout(new GridLayout(controller.getData().size() % 1 , 5));
        controller.getData().forEach((guess) ->{
            ScrollPanelItems items = new ScrollPanelItems(guess);
            ScrollPanel.add(items);
            ScrollPanel.repaint();
            ScrollPanel.revalidate();
        });
    }
    // for get data from database to show at table in searchscreen there no use any more
    public void getData(){
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        controller.getData().forEach((LM) ->{
            Object[] row = {
                LM.getId(),
                LM.getName(),
                LM.getGender(),
                LM.getBookname(),
                LM.getContact(),
                LM.getLoandate(),
                LM.getDuedate(),
                LM.getImage(),
            };
            model.addRow(row);
        });
    }
    // for clear data when already add
    public void clear(){
        TXTName.setText("");
        MaleButton.setSelected(false);
        FemaleButton.setSelected(false);
        TXTBookName.setText("");
        TXTContact.setText("");
        TXTImage.setText("");
        buttonGroup1.clearSelection();
        LBImage.setIcon(null);
    }
    
    public void gotoScreen(Component screen) {
        MainScreen.removeAll();
        MainScreen.add(screen);
        MainScreen.repaint();
        MainScreen.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BackGround = new javax.swing.JPanel();
        DashBoard = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SignOutButton = new com.k33ptoo.components.KButton();
        HomeButton = new com.k33ptoo.components.KButton();
        SearchButton = new com.k33ptoo.components.KButton();
        ReportButton = new com.k33ptoo.components.KButton();
        MainScreen = new javax.swing.JPanel();
        HomeScreen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScrollPanel = new javax.swing.JPanel();
        LBName = new javax.swing.JLabel();
        TXTName = new javax.swing.JTextField();
        LBGender = new javax.swing.JLabel();
        FemaleButton = new javax.swing.JRadioButton();
        MaleButton = new javax.swing.JRadioButton();
        TXTGender = new javax.swing.JTextField();
        TXTBookName = new javax.swing.JTextField();
        LBBookName = new javax.swing.JLabel();
        LBLoanDate = new javax.swing.JLabel();
        LBContact1 = new javax.swing.JLabel();
        TXTLoanDate = new com.toedter.calendar.JDateChooser();
        LBImage = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ButtonChooseImage = new javax.swing.JButton();
        LBDueDate = new javax.swing.JLabel();
        TXTDueDate = new com.toedter.calendar.JDateChooser();
        TXTContact = new javax.swing.JTextField();
        TXTImage = new javax.swing.JTextField();
        SearchScreen = new javax.swing.JPanel();
        TXTSearch = new javax.swing.JTextField();
        LBName1 = new javax.swing.JLabel();
        TXTUDName = new javax.swing.JTextField();
        LBGender1 = new javax.swing.JLabel();
        FemaleUDButton = new javax.swing.JRadioButton();
        MaleUDButton = new javax.swing.JRadioButton();
        TXTGender1 = new javax.swing.JTextField();
        TXTUDBookName = new javax.swing.JTextField();
        LBBookName1 = new javax.swing.JLabel();
        LBLoanDate1 = new javax.swing.JLabel();
        LBContact2 = new javax.swing.JLabel();
        TXTUDLoanDate = new com.toedter.calendar.JDateChooser();
        LBUDImage = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        ButtonChooseImage1 = new javax.swing.JButton();
        LBDueDate1 = new javax.swing.JLabel();
        TXTUDDueDate = new com.toedter.calendar.JDateChooser();
        DeleteButton = new javax.swing.JButton();
        TXTUDContact = new javax.swing.JTextField();
        TXTUDImage = new javax.swing.JTextField();
        TXTUDId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ButtonSearch = new javax.swing.JButton();
        MenuScreen = new javax.swing.JPanel();
        printreport = new com.k33ptoo.components.KButton();
        iconbackground = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashBoard.setBackground(new java.awt.Color(255, 255, 255));
        DashBoard.setPreferredSize(new java.awt.Dimension(250, 500));
        DashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Admin.jpg"))); // NOI18N
        DashBoard.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 150));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");
        DashBoard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 30));

        SignOutButton.setBorder(null);
        SignOutButton.setText("SIGN OUT");
        SignOutButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        SignOutButton.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        SignOutButton.setkBorderRadius(45);
        SignOutButton.setkEndColor(new java.awt.Color(51, 51, 255));
        SignOutButton.setkHoverColor(new java.awt.Color(51, 51, 255));
        SignOutButton.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        SignOutButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        SignOutButton.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        SignOutButton.setkIndicatorColor(new java.awt.Color(51, 51, 255));
        SignOutButton.setkPressedColor(new java.awt.Color(51, 51, 255));
        SignOutButton.setkSelectedColor(new java.awt.Color(51, 51, 255));
        SignOutButton.setkStartColor(new java.awt.Color(51, 51, 255));
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });
        DashBoard.add(SignOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 50));

        HomeButton.setBorder(null);
        HomeButton.setText("Home");
        HomeButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        HomeButton.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        HomeButton.setkBorderRadius(45);
        HomeButton.setkEndColor(new java.awt.Color(51, 51, 255));
        HomeButton.setkHoverColor(new java.awt.Color(51, 51, 255));
        HomeButton.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        HomeButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        HomeButton.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        HomeButton.setkIndicatorColor(new java.awt.Color(51, 51, 255));
        HomeButton.setkPressedColor(new java.awt.Color(51, 51, 255));
        HomeButton.setkSelectedColor(new java.awt.Color(51, 51, 255));
        HomeButton.setkStartColor(new java.awt.Color(51, 51, 255));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        DashBoard.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 50));

        SearchButton.setBorder(null);
        SearchButton.setText("Search");
        SearchButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        SearchButton.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        SearchButton.setkBorderRadius(45);
        SearchButton.setkEndColor(new java.awt.Color(51, 51, 255));
        SearchButton.setkHoverColor(new java.awt.Color(51, 51, 255));
        SearchButton.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        SearchButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        SearchButton.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        SearchButton.setkIndicatorColor(new java.awt.Color(51, 51, 255));
        SearchButton.setkPressedColor(new java.awt.Color(51, 51, 255));
        SearchButton.setkSelectedColor(new java.awt.Color(51, 51, 255));
        SearchButton.setkStartColor(new java.awt.Color(51, 51, 255));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        DashBoard.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 50));

        ReportButton.setBorder(null);
        ReportButton.setText("Report");
        ReportButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ReportButton.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        ReportButton.setkBorderRadius(45);
        ReportButton.setkEndColor(new java.awt.Color(51, 51, 255));
        ReportButton.setkHoverColor(new java.awt.Color(51, 51, 255));
        ReportButton.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        ReportButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ReportButton.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        ReportButton.setkIndicatorColor(new java.awt.Color(51, 51, 255));
        ReportButton.setkPressedColor(new java.awt.Color(51, 51, 255));
        ReportButton.setkSelectedColor(new java.awt.Color(51, 51, 255));
        ReportButton.setkStartColor(new java.awt.Color(51, 51, 255));
        ReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportButtonActionPerformed(evt);
            }
        });
        DashBoard.add(ReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 50));

        BackGround.add(DashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        MainScreen.setBackground(new java.awt.Color(255, 255, 255));
        MainScreen.setLayout(new java.awt.CardLayout());

        HomeScreen.setBackground(new java.awt.Color(255, 255, 255));
        HomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Guess Information");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        ScrollPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ScrollPanelLayout = new javax.swing.GroupLayout(ScrollPanel);
        ScrollPanel.setLayout(ScrollPanelLayout);
        ScrollPanelLayout.setHorizontalGroup(
            ScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        ScrollPanelLayout.setVerticalGroup(
            ScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ScrollPanel);

        HomeScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 200));

        LBName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBName.setText("Name           :");
        LBName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(LBName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 90, 40));

        TXTName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TXTName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(TXTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 40));

        LBGender.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBGender.setText("Gender         :");
        LBGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(LBGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 90, 40));

        FemaleButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FemaleButton);
        FemaleButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FemaleButton.setText("Female");
        FemaleButton.setBorder(null);
        HomeScreen.add(FemaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        MaleButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(MaleButton);
        MaleButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        MaleButton.setText("Male");
        MaleButton.setBorder(null);
        HomeScreen.add(MaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        TXTGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(TXTGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 170, 40));

        TXTBookName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TXTBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(TXTBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 170, 40));

        LBBookName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBBookName.setText("Book Name :");
        LBBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(LBBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 90, 40));

        LBLoanDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBLoanDate.setText("Loan Date    :");
        LBLoanDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(LBLoanDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, 40));

        LBContact1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBContact1.setText("Contact        :");
        LBContact1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(LBContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 90, 40));

        TXTLoanDate.setBackground(new java.awt.Color(255, 255, 255));
        TXTLoanDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(TXTLoanDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 140, 40));

        LBImage.setBackground(new java.awt.Color(255, 255, 255));
        LBImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HomeScreen.add(LBImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 130, 160));

        AddButton.setBackground(new java.awt.Color(51, 51, 255));
        AddButton.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.setBorder(null);
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        HomeScreen.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 130, 40));

        ButtonChooseImage.setBackground(new java.awt.Color(51, 51, 255));
        ButtonChooseImage.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        ButtonChooseImage.setForeground(new java.awt.Color(255, 255, 255));
        ButtonChooseImage.setText("Browse");
        ButtonChooseImage.setBorder(null);
        ButtonChooseImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChooseImageActionPerformed(evt);
            }
        });
        HomeScreen.add(ButtonChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 130, 40));

        LBDueDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBDueDate.setText("Due Date     :");
        LBDueDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(LBDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 90, 40));

        TXTDueDate.setBackground(new java.awt.Color(255, 255, 255));
        TXTDueDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(TXTDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 40));

        TXTContact.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TXTContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(TXTContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 170, 40));

        TXTImage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TXTImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HomeScreen.add(TXTImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 0, 40));

        MainScreen.add(HomeScreen, "card2");

        SearchScreen.setBackground(new java.awt.Color(255, 255, 255));
        SearchScreen.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SearchScreenComponentShown(evt);
            }
        });
        SearchScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchScreen.add(TXTSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 530, 40));

        LBName1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBName1.setText("Name           :");
        LBName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(LBName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 90, 40));

        TXTUDName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TXTUDName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(TXTUDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 40));

        LBGender1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBGender1.setText("Gender         :");
        LBGender1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(LBGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 90, 40));

        buttonGroup1.add(FemaleUDButton);
        FemaleUDButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FemaleUDButton.setText("Female");
        FemaleUDButton.setBorder(null);
        SearchScreen.add(FemaleUDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        buttonGroup1.add(MaleUDButton);
        MaleUDButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        MaleUDButton.setText("Male");
        MaleUDButton.setBorder(null);
        SearchScreen.add(MaleUDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        TXTGender1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(TXTGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 170, 40));

        TXTUDBookName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TXTUDBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(TXTUDBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 170, 40));

        LBBookName1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBBookName1.setText("Book Name :");
        LBBookName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(LBBookName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 90, 40));

        LBLoanDate1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBLoanDate1.setText("Loan Date    :");
        LBLoanDate1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(LBLoanDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, 40));

        LBContact2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBContact2.setText("Contact        :");
        LBContact2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(LBContact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 90, 40));

        TXTUDLoanDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        TXTUDLoanDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SearchScreen.add(TXTUDLoanDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 140, 40));

        LBUDImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchScreen.add(LBUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 130, 160));

        UpdateButton.setBackground(new java.awt.Color(51, 51, 255));
        UpdateButton.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButton.setText("Update");
        UpdateButton.setBorder(null);
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        SearchScreen.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 130, 40));

        ButtonChooseImage1.setBackground(new java.awt.Color(51, 51, 255));
        ButtonChooseImage1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        ButtonChooseImage1.setForeground(new java.awt.Color(255, 255, 255));
        ButtonChooseImage1.setText("Browse");
        ButtonChooseImage1.setBorder(null);
        ButtonChooseImage1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchScreen.add(ButtonChooseImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 130, 40));

        LBDueDate1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBDueDate1.setText("Due Date     :");
        LBDueDate1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(LBDueDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 90, 40));

        TXTUDDueDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        TXTUDDueDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SearchScreen.add(TXTUDDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 40));

        DeleteButton.setBackground(new java.awt.Color(51, 51, 255));
        DeleteButton.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(null);
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        SearchScreen.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 130, 40));

        TXTUDContact.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TXTUDContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(TXTUDContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 170, 40));

        TXTUDImage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TXTUDImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(TXTUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 0, 40));

        TXTUDId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TXTUDId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SearchScreen.add(TXTUDId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 0, 40));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Book Name", "Contact", "Loan Date", "Due Date", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Table);

        SearchScreen.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 650, 190));

        ButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        ButtonSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        SearchScreen.add(ButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 5, 50, 40));

        MainScreen.add(SearchScreen, "card3");

        MenuScreen.setBackground(new java.awt.Color(255, 255, 255));
        MenuScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printreport.setBorder(null);
        printreport.setText("Print Report");
        printreport.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        printreport.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        printreport.setkBorderRadius(45);
        printreport.setkEndColor(new java.awt.Color(51, 51, 255));
        printreport.setkHoverColor(new java.awt.Color(51, 51, 255));
        printreport.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        printreport.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        printreport.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        printreport.setkIndicatorColor(new java.awt.Color(51, 51, 255));
        printreport.setkPressedColor(new java.awt.Color(51, 51, 255));
        printreport.setkSelectedColor(new java.awt.Color(51, 51, 255));
        printreport.setkStartColor(new java.awt.Color(51, 51, 255));
        printreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreportActionPerformed(evt);
            }
        });
        MenuScreen.add(printreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 200, 50));

        iconbackground.setBackground(new java.awt.Color(255, 255, 255));
        iconbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/newjeans.png"))); // NOI18N
        iconbackground.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        MenuScreen.add(iconbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        MainScreen.add(MenuScreen, "card4");

        BackGround.add(MainScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 650, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        gotoScreen(HomeScreen);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        gotoScreen(SearchScreen);
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportButtonActionPerformed
        gotoScreen(MenuScreen);
    }//GEN-LAST:event_ReportButtonActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        new Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_SignOutButtonActionPerformed

    
    // for add image
    private void ButtonChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChooseImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(LBImage.getWidth(), LBImage.getHeight(),Image.SCALE_SMOOTH);
        LBImage.setIcon(new ImageIcon(image));
        TXTImage.setText(filename);
    }//GEN-LAST:event_ButtonChooseImageActionPerformed

    // for add data to database and also show in scrollpanel in homescreen
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String name = TXTName.getText();
        String gender = MaleButton.isSelected() ? "Male" : FemaleButton.isSelected() ? "Female" : "Other";
        String bookname = TXTBookName.getText();
        String contact = TXTContact.getText();
        String image = TXTImage.getText();
        
        SimpleDateFormat df = new SimpleDateFormat(TXTLoanDate.getDateFormatString());
        String loandate = df.format(TXTLoanDate.getDate());
        
        SimpleDateFormat df1 = new SimpleDateFormat(TXTDueDate.getDateFormatString());
        String duedate = df1.format(TXTDueDate.getDate());
        
        if(!name.isEmpty() && !gender.isEmpty() && !bookname.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !loandate.isEmpty() && !duedate.isEmpty()){
            
            controller.addGuessToDB(new LibraryModel(0 , name, gender, bookname, contact, loandate, duedate, image));
            viewGuess();
            clear();
        }else{
            AlertMessage.Warning("Please Enter All Field");
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String id = TXTUDId.getText();
        String name = TXTUDName.getText();
        String gender = MaleUDButton.isSelected() ? "Male" : FemaleUDButton.isSelected() ? "Female" : "Other";
        String bookname = TXTUDBookName.getText();
        String contact = TXTUDContact.getText();
        String image = TXTUDImage.getText();
        
        SimpleDateFormat df = new SimpleDateFormat(TXTUDLoanDate.getDateFormatString());
        String date = null ;
        if(TXTUDLoanDate.getDate() != null){
            date = df.format(TXTUDLoanDate.getDate());
        }else{
            date = df.format(TXTUDLoanDate.getDate());
        }
        
        SimpleDateFormat df1 = new SimpleDateFormat(TXTUDDueDate.getDateFormatString());
        String date1 = null ;
        if(TXTUDDueDate.getDate() != null){
            date1 = df1.format(TXTUDDueDate.getDate());
        }else{ 
            date1 = df1.format(TXTUDDueDate.getDate());
        }
        
        if(!name.isEmpty() && !gender.isEmpty() && !bookname.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !date.isEmpty() && !date1.isEmpty()){
            if(!name.equals(name1) || !gender.equalsIgnoreCase(gender1) || !bookname.equalsIgnoreCase(bookname1) || !contact.equals(contact1) || !image.equals(image1) || !date.equals(loandate1) || !date1.equals(duedate1)){
                // update data
                int id1 = Integer.parseInt(id);
                controller.updateGuessToDB(new LibraryModel(id1 , name , gender , bookname , contact , date , date1 , image));
                getData();
            }else{
                AlertMessage.Error("Please Update Information");
            }
        }else{
            AlertMessage.Error("Please Select Data To Update");
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String id1 = TXTUDId.getText();
        if(!id1.isEmpty()){
            int id = Integer.parseInt(id1);
            controller.deleteGuess(id);
            getData();
        }else{
            AlertMessage.Error("Please Select Data for Delete");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int row = Table.getSelectedRow();
            TXTUDId.setText(model.getValueAt(row, 0).toString());
            TXTUDName.setText(model.getValueAt(row, 1).toString());
            
            if(model.getValueAt(row, 2).toString().equalsIgnoreCase("Male")){
                MaleUDButton.setSelected(true);
            }else{
                FemaleUDButton.setSelected(true);
            }
            
            TXTUDBookName.setText(model.getValueAt(row, 3).toString());
            TXTUDContact.setText(model.getValueAt(row, 4).toString());
            
            TXTUDImage.setText(model.getValueAt(row, 7).toString());
            ImageIcon icon = new ImageIcon(TXTUDImage.getText());
            Image image = icon.getImage().getScaledInstance(LBImage.getWidth(), LBImage.getHeight(), Image.SCALE_SMOOTH);
            LBUDImage.setIcon(new ImageIcon(image));
            
            
            try {
                Date loandate;
                SimpleDateFormat df = new SimpleDateFormat(TXTUDLoanDate.getDateFormatString());
                loandate = df.parse(model.getValueAt(row, 5).toString());
                TXTUDLoanDate.setDate(loandate);
                
                Date duedate;
            SimpleDateFormat df1 = new SimpleDateFormat(TXTUDDueDate.getDateFormatString());
            duedate = df1.parse(model.getValueAt(row, 6).toString());
            TXTUDDueDate.setDate(duedate);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            name1 = model.getValueAt(row, 1).toString();
            
            if(model.getValueAt(row, 2).toString().equalsIgnoreCase("Male")){
                gender1 = "Male";
            }else{
                gender1 = "Female";
            }
            
            bookname1 = model.getValueAt(row, 3).toString();
            contact1 = model.getValueAt(row, 4).toString();
            image1 = model.getValueAt(row, 5).toString();
            
            SimpleDateFormat df = new SimpleDateFormat(TXTUDLoanDate.getDateFormatString());
            loandate1 = df.format(TXTUDLoanDate.getDate());
            
            SimpleDateFormat df1 = new SimpleDateFormat(TXTUDDueDate.getDateFormatString());
            duedate1 = df1.format(TXTUDDueDate.getDate());
    }//GEN-LAST:event_TableMouseClicked

    
    // for get data from database to show at table in searchscreen
    private void SearchScreenComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SearchScreenComponentShown
        ArrayList<LibraryModel> list=new ArrayList();
        LibraryController obj=new LibraryController();
        list=(ArrayList<LibraryModel>) obj.getData();
        
        DefaultTableModel model= (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        for(int i=0;i<list.size();i++){
            Object data[]={list.get(i).getId(),
                            list.get(i).getName(),
                            list.get(i).getGender(),
                            list.get(i).getBookname(),
                            list.get(i).getContact(),
                            list.get(i).getLoandate(),
                            list.get(i).getDuedate(),
                            list.get(i).getImage(),
            };
            model.addRow(data);
        }
    }//GEN-LAST:event_SearchScreenComponentShown

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        String SearchTerm = TXTSearch.getText().trim();
        if(!SearchTerm.isEmpty()){
            filterData(SearchTerm);
            
            TXTSearch.setText("");
        }else{
            getData();
        }
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void printreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printreportActionPerformed
        int totalguess = controller.getTotalEmp();
        int totalmale = controller.getTotalMale();
        int totalfemale = controller.getTotalFemale();
        
        HashMap<String , Object> data = new HashMap<>();
        data.put("totalguess", totalguess);
        data.put("totalmale", totalmale);
        data.put("totalfemale", totalfemale);
        
        
        try {
            JasperReport report = JasperCompileManager.compileReport("src/Home/View/reportlibrary.jrxml");
            JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(controller.getData());
            JasperPrint print = JasperFillManager.fillReport(report, data , source);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_printreportActionPerformed

    
    private void filterData(String SearchTerm){
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        
        controller.getData().stream()
                .filter(LM -> LM.getName().toLowerCase().contains(SearchTerm.toLowerCase()))
                .forEach(LM -> {
                    Object[] row = {
                        LM.getId(),
                        LM.getName(),
                        LM.getGender(),
                        LM.getBookname(),
                        LM.getContact(),
                        LM.getLoandate(),
                        LM.getDuedate(),
                        LM.getImage(),  
                    };
                    model.addRow(row);
                });
    }
    
    public static void main(String args[]) {
        new Theme.Themes("light");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton ButtonChooseImage;
    private javax.swing.JButton ButtonChooseImage1;
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JPanel DashBoard;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.JRadioButton FemaleUDButton;
    private com.k33ptoo.components.KButton HomeButton;
    private javax.swing.JPanel HomeScreen;
    private javax.swing.JLabel LBBookName;
    private javax.swing.JLabel LBBookName1;
    private javax.swing.JLabel LBContact1;
    private javax.swing.JLabel LBContact2;
    private javax.swing.JLabel LBDueDate;
    private javax.swing.JLabel LBDueDate1;
    private javax.swing.JLabel LBGender;
    private javax.swing.JLabel LBGender1;
    private javax.swing.JLabel LBImage;
    private javax.swing.JLabel LBLoanDate;
    private javax.swing.JLabel LBLoanDate1;
    private javax.swing.JLabel LBName;
    private javax.swing.JLabel LBName1;
    private javax.swing.JLabel LBUDImage;
    private javax.swing.JPanel MainScreen;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JRadioButton MaleUDButton;
    private javax.swing.JPanel MenuScreen;
    private com.k33ptoo.components.KButton ReportButton;
    private javax.swing.JPanel ScrollPanel;
    private com.k33ptoo.components.KButton SearchButton;
    private javax.swing.JPanel SearchScreen;
    private com.k33ptoo.components.KButton SignOutButton;
    private javax.swing.JTextField TXTBookName;
    private javax.swing.JTextField TXTContact;
    private com.toedter.calendar.JDateChooser TXTDueDate;
    private javax.swing.JTextField TXTGender;
    private javax.swing.JTextField TXTGender1;
    private javax.swing.JTextField TXTImage;
    private com.toedter.calendar.JDateChooser TXTLoanDate;
    private javax.swing.JTextField TXTName;
    private javax.swing.JTextField TXTSearch;
    private javax.swing.JTextField TXTUDBookName;
    private javax.swing.JTextField TXTUDContact;
    private com.toedter.calendar.JDateChooser TXTUDDueDate;
    private javax.swing.JTextField TXTUDId;
    private javax.swing.JTextField TXTUDImage;
    private com.toedter.calendar.JDateChooser TXTUDLoanDate;
    private javax.swing.JTextField TXTUDName;
    private javax.swing.JTable Table;
    private javax.swing.JButton UpdateButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel iconbackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.k33ptoo.components.KButton printreport;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
