package day16;
import java.util.Scanner;
public class Day16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan angka: ");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka: ");
        int angka2 = input.nextInt();
        
        System.out.println("hasil perkalian: "+ (angka1*angka2));
        System.out.println("hasil pembagian: "+ (angka1/angka2));
        
    }
    
}
