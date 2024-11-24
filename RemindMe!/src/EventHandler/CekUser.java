/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author farid
 */
public class CekUser {
    // Method to fetch user details based on the username
    public static int fetchUserId(Connection conn, String username, javax.swing.JLabel namaLabel) {
        String getID = "SELECT idPengguna, namaPengguna FROM pengguna WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(getID)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            // Check if user exists
            if (rs.next()) {
                int userID = rs.getInt("idPengguna"); // Get the user ID
                String namaLengkap = rs.getString("namaPengguna"); // Get the user's full name
                namaLabel.setText(namaLengkap); // Set the label to show the full name
                return userID; // Return the user ID
            } else {
                // Show error if the user is not found
                JOptionPane.showMessageDialog(null, "ID Pengguna Tidak ditemukan", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                return -1; // Return -1 to indicate user not found
            }
        } catch (Exception e) {
            ErrorHandler.eHandler(e, "Gagal mendapatkan User ID."); // Use your custom error handler here
            return -1; // Return -1 in case of error
        }
    }
}
