package Day44;
import java.util.Scanner;
        
public class Day44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Predikat: A");
        } else if (nilai >= 75) {
            System.out.println("Predikat: B");
        } else if (nilai >= 60) {
            System.out.println("Predikat: C");
        } else if (nilai >= 45) {
            System.out.println("Predikat: D");
        } else if (nilai >= 0) {
            System.out.println("Predikat: E");
        } else {
            System.out.println("Nilai tidak valid!");
        }
    }
    
}
