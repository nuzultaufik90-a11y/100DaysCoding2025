package Day63;
import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        int nilai = 1;
        for (int i = 1; i <= N; i++) {
            nilai *= i;
            
        }
            System.out.println("jumlah dari 1 sampai " + N + " adalah: " + nilai );
            
    }
}
