/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Raffy
 */
public class Daftar extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/healminder";
    static final String DB_USER = "healminder";
    static final String DB_PASS = "pbo";
    public Daftar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        daftar = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mingcute_left-fill.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Daftar");

        jLabel2.setText("Email");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Component 2.png"))); // NOI18N
        daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarMouseClicked(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(back)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(daftar)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(email)
                    .addComponent(username)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(daftar)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Login login = new Login();
        login.setLocationRelativeTo(null);
        // Make the Medicine frame visible
        login.setVisible(true);
        // Close the current Login frame
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseClicked
        String enteredEmail = email.getText().trim();
        String enteredUsername = username.getText().trim();
        String enteredPassword = new String(password.getPassword());

        // Check if any of the fields is empty
        if (enteredEmail.isEmpty() || enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            // Display an error message if any of the fields is empty
            JOptionPane.showMessageDialog(this, "Email, username, dan password harus terisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Continue with the registration logic

            // Register the user in the database
            if (registerUser(enteredEmail, enteredUsername, enteredPassword)) {
                // Registration successful

                // Get the user ID after registration
                int userID = getUserID(enteredUsername);


                // Close the current Daftar frame
                this.dispose();
            } else {
                // Registration failed
                JOptionPane.showMessageDialog(this, "Registrasi gagal. Mohon coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_daftarMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private boolean registerUser(String email, String username, String password) {
    // Perform the actual registration logic and insert data into the user table
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
        // Membuat koneksi ke database
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

        // Menjalankan query untuk insert data ke dalam tabel user
        String query = "INSERT INTO user (email, username, password) VALUES (?, ?, ?)";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, password);

        // Menjalankan pernyataan SQL
        int rowsAffected = preparedStatement.executeUpdate();

        // Jika data berhasil dimasukkan, mengembalikan true
        if (rowsAffected > 0) {
            // Open the Login page after successful registration
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);

            // Close the current Daftar frame
            this.dispose();

            return true;
        }

    } catch (SQLException e) {
        e.printStackTrace();
        // Handle error
        JOptionPane.showMessageDialog(this, "Error while registering user.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Menutup semua sumber daya yang digunakan
        try {
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Jika terjadi kesalahan, mengembalikan nilai false
    return false;
}

    
    private int getUserID(String username) {
    // Get the user ID based on the username
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        // Membuat koneksi ke database
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

        // Menjalankan query untuk mendapatkan ID user berdasarkan username
        String query = "SELECT id_user FROM user WHERE username = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);

        // Menjalankan pernyataan SQL
        resultSet = preparedStatement.executeQuery();

        // Jika ada hasil dari query, mengembalikan ID user
        if (resultSet.next()) {
            return resultSet.getInt("id_user");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        // Handle error
        JOptionPane.showMessageDialog(this, "Error while getting user ID.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Menutup semua sumber daya yang digunakan
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Jika terjadi kesalahan, mengembalikan nilai -1
    return -1;
}

    
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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Daftar daftarFrame = new Daftar();
                daftarFrame.pack();
                daftarFrame.setLocationRelativeTo(null);
                daftarFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel daftar;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}