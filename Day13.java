package evaluasi;
import java.util.Scanner;

public class evaluasi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan harga per barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan diskon (%): ");
        int diskon = input.nextInt();

        // Perhitungan
        double totalSebelum = jumlah * harga;
        double potongan = totalSebelum * diskon / 100.0;
        double totalBayar = totalSebelum - potongan;

        // Output hasil
        System.out.printf("\nDetail Belanja Pelanggan:\n");
        System.out.printf("Nama Pelanggan : %s\n", nama);
        System.out.printf("Jumlah Barang  : %d\n", jumlah);
        System.out.printf("Harga Satuan   : Rp%.2f\n", harga);
        System.out.printf("Total Sebelum  : Rp%.2f\n", totalSebelum);
        System.out.printf("Diskon (%d%%)   : Rp%.2f\n", diskon, potongan);
        System.out.printf("Total Bayar    : Rp%.2f\n", totalBayar);

        
    }
}

