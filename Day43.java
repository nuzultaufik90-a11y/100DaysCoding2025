package Day43;
import  java.util.Scanner;
public class Day43 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah nilai kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println(angka + " adalah nilai kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println(angka + " adalah nilai kelipatan 5");
        } else {
            System.out.println(angka + " bukan kelipatan 3 atau 5");
        }
    }
}

