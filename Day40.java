package Day40;
import java.util.Scanner;
public class Day40{

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, hasil;
        System.out.print("Masukkan angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka 2: ");
        angka2 = input.nextInt();
        System.out.print("Masukkan Operator: ");
        char operator = input.next().charAt(0);
 
        if (operator == '+'){
            hasil = angka1 + angka2;
            System.out.println("hasil: "+ hasil);
        }
        else if (operator == '-'){
            hasil = angka1 - angka2;
            System.out.println("hasil: "+ hasil);
        }
        else if (operator == '*'){
            hasil = angka1 * angka2;
            System.out.println("hasil: "+ hasil);
        }
        else if (operator == '/'){
            hasil = angka1 / angka2;
            System.out.println("hasil: "+ hasil);
        }
        else{
            System.out.println("operator tidak ada ");
        }
        
    }
    
    
}
