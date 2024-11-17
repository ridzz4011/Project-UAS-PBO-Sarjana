package SistemFunction;

import DatabaseConnection.DBConnection;
import MainPackage.mainMenu;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tugas {
    private int idTugas;
    private int idPengguna;
    private String namaTugas;
    private String deskripsi;
    private LocalDate deadlineTugas;
    private String namaMatkul;
    private int prioritas;
    
    public Tugas(int idTugas, int idPengguna, String namaTugas, String deskripsi, LocalDate deadlineTugas, String namaMatkul) {
        this.idTugas = idTugas;
        this.idPengguna = idPengguna;
        this.namaTugas = namaTugas;
        this.deskripsi = deskripsi;
        this.deadlineTugas = deadlineTugas;
        this.namaMatkul = namaMatkul;
        this.prioritas = 0; // Default prioritas adalah 0
    }
    
    // Getter dan Setter
    public int getIdTugas() {
        return idTugas;
    }
    
    public int getIdPengguna() {
        return idPengguna;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public LocalDate getDeadlineTugas() {
        return deadlineTugas;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(int prioritas) {
        this.prioritas = prioritas;
    }
    
    public void tambah_Tugas() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO tugas (IdPengguna, namaTugas, deskripsi, namaMatkul) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.konek()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, getIdPengguna());
            pstmt.setString(2, getNamaTugas());
            pstmt.setString(3, getDeskripsi());
            pstmt.setString(4, getNamaMatkul());
            pstmt.executeUpdate();
        }
    }
    
    public void hapus_Tugas() throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM tugas WHERE IdTugas = ?";
        try (Connection conn = DBConnection.konek()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, getIdTugas());
            pstmt.executeUpdate();
        }
    }
    
    public void updatePanelTask() {
        mainMenu task = mainMenu.panelTask;
        
        task.removeAll();
        
        
    }
}
