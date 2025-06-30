import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewBarang {
    public static void tampilkanData() {
        try (Connection conn = DBConnection.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM view_barang");

            System.out.println("\n=== Data Barang ===");
            while (rs.next()) {
                System.out.println("Kode : " + rs.getString("kode"));
                System.out.println("Nama : " + rs.getString("nama"));
                System.out.println("Harga: " + rs.getInt("harga"));
                System.out.println("Stok : " + rs.getInt("stok"));
                System.out.println("Total Nilai: " + rs.getInt("total_nilai"));
                System.out.println("------------------------");
            }
        } catch (Exception e) {
            System.err.println("Gagal menampilkan data: " + e.getMessage());
        }
    }
}
