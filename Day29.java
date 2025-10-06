package Day29;
import java.util.Scanner;
public class Day29 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka1: ");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka2: ");
        int angka2 = input.nextInt();
        
        boolean kurangdari = angka1 < angka2;
        boolean lebihdari = angka1 > angka2;
        
        
        System.out.println(angka1 + " < " + angka2 + " = " + kurangdari);
        System.out.println(angka1 + " > " + angka2 + " = " + lebihdari);   
    }
    
}
