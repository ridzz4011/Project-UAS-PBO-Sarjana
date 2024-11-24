/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author farid
 */
public class CekTugas {
    public static int fetchIdTugas (Connection conn, String namaTugas) {
        String getTugas = "SELECT idTugas FROM tugas WHERE namaTugas = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(getTugas)) {
            pstmt.setString(1, namaTugas.trim());
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                int IDTugas = rs.getInt("idTugas");
                return IDTugas;
            } else {
                JOptionPane.showMessageDialog(null, "Tugas tidak ditemukan!", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
        } catch (SQLException e) {
            ErrorHandler.eHandler(e, "Gagal terhubung ke database!");
            return -1;
        }
    }
}
