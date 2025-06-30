import java.sql.*;
import java.util.Scanner;

public class InsertBarang {
    public static void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kode: ");
        String kode = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Harga: ");
        int harga = scanner.nextInt();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();

        try (Connection conn = DBConnection.getConnection()) {
            CallableStatement stmt = conn.prepareCall("{CALL insert_barang(?, ?, ?, ?)}");
            stmt.setString(1, kode);
            stmt.setString(2, nama);
            stmt.setInt(3, harga);
            stmt.setInt(4, stok);

            stmt.execute();
            System.out.println("Data berhasil diinsert.");
        } catch (SQLException e) {
            System.err.println("Gagal insert data: " + e.getMessage());
        }
    }
}
