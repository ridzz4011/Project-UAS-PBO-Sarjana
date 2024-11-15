package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection konek;

    public static Connection konek() throws SQLException, ClassNotFoundException {
        try {
            if (konek == null) {
                Class.forName(JDBC_DRIVER);
                konek = DriverManager.getConnection("jdbc:mysql://localhost/remindme!", "root", "");
                System.out.println("Koneksi Berhasil");
            }
            return konek;
        } catch (SQLException e) {
            System.err.println("Error: Koneksi Tidak Berhasil" + e.getMessage());
            throw e;
        }
    }
    
}
