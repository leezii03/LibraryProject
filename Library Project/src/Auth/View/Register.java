package Auth.View;

import Component.AlertMessage;
import Database.DBConnector;
import Home.View.HomeScreen;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Register extends javax.swing.JFrame {

   
    public Register() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainScreen = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        AuthScreen = new javax.swing.JPanel();
        SignOut = new javax.swing.JPanel();
        SignUp_Head = new javax.swing.JLabel();
        LBInformSignUp = new javax.swing.JLabel();
        LBEmail2 = new javax.swing.JLabel();
        TXTEmail2 = new javax.swing.JTextField();
        LBPassword2 = new javax.swing.JLabel();
        TXTPassword2 = new javax.swing.JTextField();
        SignUpButton = new com.k33ptoo.components.KButton();
        GoToSignIn = new javax.swing.JLabel();
        LBCFPassword = new javax.swing.JLabel();
        TXTCFPassword = new javax.swing.JTextField();
        SignIn = new javax.swing.JPanel();
        LBWellcome = new javax.swing.JLabel();
        SignIn_Head1 = new javax.swing.JLabel();
        LBEmail = new javax.swing.JLabel();
        TXTEmail = new javax.swing.JTextField();
        LBPassword = new javax.swing.JLabel();
        TXTPassword = new javax.swing.JTextField();
        LogInButton = new com.k33ptoo.components.KButton();
        GoToSignUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        MainScreen.setBackground(new java.awt.Color(255, 255, 255));
        MainScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Library.jpg"))); // NOI18N
        MainScreen.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        AuthScreen.setBackground(new java.awt.Color(153, 255, 255));
        AuthScreen.setLayout(new java.awt.CardLayout());

        SignOut.setBackground(new java.awt.Color(255, 255, 255));
        SignOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUp_Head.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        SignUp_Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUp_Head.setText("SIGN UP");
        SignOut.add(SignUp_Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 60));

        LBInformSignUp.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBInformSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBInformSignUp.setText("Create New Account");
        SignOut.add(LBInformSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 650, 60));

        LBEmail2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBEmail2.setText("Email                     : ");
        LBEmail2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignOut.add(LBEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 60));

        TXTEmail2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TXTEmail2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignOut.add(TXTEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 320, 60));

        LBPassword2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBPassword2.setText("Password              : ");
        LBPassword2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignOut.add(LBPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 60));

        TXTPassword2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TXTPassword2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignOut.add(TXTPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 320, 60));

        SignUpButton.setBorder(null);
        SignUpButton.setText("SIGN UP");
        SignUpButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        SignUpButton.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        SignUpButton.setkBorderRadius(45);
        SignUpButton.setkEndColor(new java.awt.Color(51, 51, 255));
        SignUpButton.setkHoverColor(new java.awt.Color(51, 51, 255));
        SignUpButton.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        SignUpButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        SignUpButton.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        SignUpButton.setkIndicatorColor(new java.awt.Color(51, 51, 255));
        SignUpButton.setkPressedColor(new java.awt.Color(51, 51, 255));
        SignUpButton.setkSelectedColor(new java.awt.Color(51, 51, 255));
        SignUpButton.setkStartColor(new java.awt.Color(51, 51, 255));
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        SignOut.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        GoToSignIn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        GoToSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoToSignIn.setText("Already Has Account ?");
        GoToSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoToSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToSignInMouseClicked(evt);
            }
        });
        SignOut.add(GoToSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 260, 50));

        LBCFPassword.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBCFPassword.setText("CF-Password         : ");
        LBCFPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignOut.add(LBCFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, 60));

        TXTCFPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TXTCFPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignOut.add(TXTCFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 320, 60));

        AuthScreen.add(SignOut, "card3");

        SignIn.setBackground(new java.awt.Color(255, 255, 255));
        SignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBWellcome.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBWellcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBWellcome.setText("WellCome Back!");
        SignIn.add(LBWellcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 650, 60));

        SignIn_Head1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        SignIn_Head1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignIn_Head1.setText("SIGN IN ACCOUNT");
        SignIn.add(SignIn_Head1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 60));

        LBEmail.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBEmail.setText("Email                     : ");
        LBEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignIn.add(LBEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 60));

        TXTEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TXTEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignIn.add(TXTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 320, 60));

        LBPassword.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBPassword.setText("Password              : ");
        LBPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignIn.add(LBPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 60));

        TXTPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TXTPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignIn.add(TXTPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 320, 60));

        LogInButton.setBorder(null);
        LogInButton.setText("LOGIN");
        LogInButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        LogInButton.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        LogInButton.setkBorderRadius(45);
        LogInButton.setkEndColor(new java.awt.Color(51, 51, 255));
        LogInButton.setkHoverColor(new java.awt.Color(51, 51, 255));
        LogInButton.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        LogInButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        LogInButton.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        LogInButton.setkIndicatorColor(new java.awt.Color(51, 51, 255));
        LogInButton.setkPressedColor(new java.awt.Color(51, 51, 255));
        LogInButton.setkSelectedColor(new java.awt.Color(51, 51, 255));
        LogInButton.setkStartColor(new java.awt.Color(51, 51, 255));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        SignIn.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        GoToSignUp.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        GoToSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoToSignUp.setText("Create New Account ?");
        GoToSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoToSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToSignUpMouseClicked(evt);
            }
        });
        SignIn.add(GoToSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 260, 50));

        AuthScreen.add(SignIn, "card2");

        MainScreen.add(AuthScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 650, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GoToSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToSignInMouseClicked
        AuthScreen.removeAll();
        AuthScreen.add(SignIn);
        AuthScreen.repaint();
        AuthScreen.revalidate();
    }//GEN-LAST:event_GoToSignInMouseClicked

    private void GoToSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToSignUpMouseClicked
        AuthScreen.removeAll();
        AuthScreen.add(SignOut);
        AuthScreen.repaint();
        AuthScreen.revalidate();
    }//GEN-LAST:event_GoToSignUpMouseClicked

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        String email = TXTEmail2.getText();
            String password = TXTPassword2.getText();
            String cfpassword = TXTCFPassword.getText();

            if(!email.isEmpty() || !password.isEmpty() || !cfpassword.isEmpty()){
                if(password.equals(cfpassword)){
                    DBConnector connector = new DBConnector();

                    PreparedStatement ps ;
                    ResultSet rs ;
                    String sql = "SELECT `email` FROM `authantication` WHERE email = ?";
                    try {
                        ps = (PreparedStatement) connector.connector().prepareStatement(sql);
                        ps.setString(1, email);
                        rs = ps.executeQuery();
                        if(rs.next()){
                            AlertMessage.Error("Your Email is used");
                        }else{
                            String sql1 = "INSERT INTO `authantication`(`email`, `password`) VALUES (?,MD5(?))";
                            ps = (PreparedStatement) connector.connector().prepareStatement(sql1);
                            ps.setString(1 , email);
                            ps.setString(2, password);
                            int result = ps.executeUpdate();

                            if(result > 0){
                                AlertMessage.Success("Create Account Success");
                                new HomeScreen().setVisible(true);
                                dispose();
                            }else{
                                AlertMessage.Error("Can't Create Account");
                            }
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }else{
                    AlertMessage.Warning("Your Confirm Password is incorrect");
                }
            }else{
                AlertMessage.Warning("Please Enter You Data");
            }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        String email = TXTEmail.getText();
        String password = TXTPassword.getText();
        
        if(!email.isEmpty() && !password.isEmpty()){
            
            try {
                String sql = "SELECT `id` FROM `authantication` WHERE `email` = ? AND `password` = MD5(?)";
                DBConnector connector = new DBConnector();
                PreparedStatement ps;
                ResultSet rs ;
                
                ps = (PreparedStatement) connector.connector().prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2,password);
                
                rs = ps.executeQuery();
                
                if(rs.next()){
                    new HomeScreen().setVisible(true);
                    dispose();
                }else{
                    AlertMessage.Error("Your Account Not Found");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AuthScreen;
    private javax.swing.JLabel GoToSignIn;
    private javax.swing.JLabel GoToSignUp;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel LBCFPassword;
    private javax.swing.JLabel LBEmail;
    private javax.swing.JLabel LBEmail2;
    private javax.swing.JLabel LBInformSignUp;
    private javax.swing.JLabel LBPassword;
    private javax.swing.JLabel LBPassword2;
    private javax.swing.JLabel LBWellcome;
    private com.k33ptoo.components.KButton LogInButton;
    private javax.swing.JPanel MainScreen;
    private javax.swing.JPanel SignIn;
    private javax.swing.JLabel SignIn_Head1;
    private javax.swing.JPanel SignOut;
    private com.k33ptoo.components.KButton SignUpButton;
    private javax.swing.JLabel SignUp_Head;
    private javax.swing.JTextField TXTCFPassword;
    private javax.swing.JTextField TXTEmail;
    private javax.swing.JTextField TXTEmail2;
    private javax.swing.JTextField TXTPassword;
    private javax.swing.JTextField TXTPassword2;
    // End of variables declaration//GEN-END:variables
}
