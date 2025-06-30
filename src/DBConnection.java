import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver JDBC
            String url = "jdbc:mysql://localhost:3306/toko"; // database toko
            String user = "root"; // username MySQL kamu
            String password = "salman123"; // GANTI sesuai password MySQL kamu
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.err.println("❌ Gagal koneksi: " + e.getMessage());
            return null;
        }
    }
}
