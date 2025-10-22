package Day46;
import java.util.Scanner;


public class Day46 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU WARUNG ZUL ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Sate Ayam");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam. Harga: Rp12.000");
                break;
            case 3:
                System.out.println("Anda memilih Bakso. Harga: Rp20.000");
                break;
            case 4:
                System.out.println("Anda memilih Sate Ayam. Harga: Rp18.000");
                break;
            case 5:
                System.out.println("Terima kasih! Program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1-5.");
        }
    }
    
}
