package Day53;
import java.util.Scanner;


public class Day53 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU MASAKAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.print("Pilih menu (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam. Harga: Rp12.000");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1-5.");
        }
    }
    
}
