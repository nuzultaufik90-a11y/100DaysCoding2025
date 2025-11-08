package Day62;
import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
            
        }
            System.out.println("jumlah dari 1 sampai " + N + " adalah: " + sum );
            
    }
}
