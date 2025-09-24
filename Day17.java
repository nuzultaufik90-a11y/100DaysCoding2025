package day17;
import java.util.Scanner;
public class Day17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan angka: ");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka: ");
        int angka2 = input.nextInt();
        
        System.out.println("hasil sisa bagi: "+ (angka1%angka2));
        
        
    }
    
}
