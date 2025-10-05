package Day28;
import java.util.Scanner;
public class Day28 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka1: ");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka2: ");
        int angka2 = input.nextInt();
        
        
        System.out.println("nilai perbandingan (==)) : "+ (angka1==angka2));
        System.out.println("nilai perbandingan (!=)) : "+ (angka1!=angka2));
    }
    
}
