
package Day30;
import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka1: ");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka2: ");
        int angka2 = input.nextInt();
        
        boolean lebihdarisamadengan = angka1 >= angka2;
        boolean kurangdarisamadengan = angka1 <= angka2;
        
        
        System.out.println(angka1 + " <= " + angka2 + " = " + lebihdarisamadengan);
        System.out.println(angka1 + " >= " + angka2 + " = " + kurangdarisamadengan);
    }
}
