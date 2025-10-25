package Day48;
import java.util.Scanner;

public class Day48 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double angka1,angka2,hasil;
        System.out.print("Masukkan angka1: ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan angka2: ");
        angka2 = input.nextDouble();
        System.out.print("Masukkan operator: ");
        char opera = input.next().charAt(0);
        
        switch(opera){
            case ('+'):
                hasil = angka1 + angka2;
                System.out.println("hasil "+ hasil);
                break;
            case ('-'):    
                hasil = angka1 - angka2;
                System.out.println("hasil "+ hasil);
                break;
            case ('*'):
                hasil = angka1 * angka2;
                System.out.println("hasil "+ hasil);
                break;
            case ('/'):    
                hasil = angka1 / angka2;
                System.out.println("hasil "+ hasil);
                break;
            case ('%'):
                hasil = angka1 % angka2;
                System.out.println("hasil "+ hasil);
                break;
        }
        
    }
    
}
