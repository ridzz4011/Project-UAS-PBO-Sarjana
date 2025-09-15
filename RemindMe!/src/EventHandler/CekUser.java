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
    public static int fetchUserId(Connection conn, String username, javax.swing.JLabel namaLabel) {
        String getID = "SELECT idPengguna, namaPengguna FROM pengguna WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(getID)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int userID = rs.getInt("idPengguna"); // Ambil idPengguna dari db
                String namaLengkap = rs.getString("namaPengguna");
                namaLabel.setText(namaLengkap); // Set nama label di pojok kanan atas
                return userID;
            } else {
                JOptionPane.showMessageDialog(null, "ID Pengguna Tidak ditemukan", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                return -1; // Return -1 untuk mengindikasikan kalau user tidak ditemukan
            }
        } catch (Exception e) {
            ErrorHandler.eHandler(e, "Gagal mendapatkan User ID.");
            return -1; // Return -1 jika error
        }
    }
}
