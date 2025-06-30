import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Insert Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // buang newline agar tidak skip input

            switch (pilihan) {
                case 1:
                    InsertBarang.insertData();
                    break;
                case 2:
                    ViewBarang.tampilkanData();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
