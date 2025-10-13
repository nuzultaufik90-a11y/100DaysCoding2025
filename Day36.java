package Day36;
import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 60) {
            System.out.println("Anda lulus ujian.");

            if (nilai >= 90) {
                System.out.println("Nilai Anda: A (Sangat Baik)");
            } else if (nilai >= 75) {
                System.out.println("Nilai Anda: B (Baik)");
            } else {
                System.out.println("Nilai Anda: C (Cukup)");
            }

        } else {
            System.out.println("Anda tidak lulus ujian.");
            if (nilai >= 50) {
                System.out.println("Nilai Anda: D (Hampir Lulus)");
            } else {
                System.out.println("Nilai Anda: E (Gagal)");
            }
        }
    }
    
}
