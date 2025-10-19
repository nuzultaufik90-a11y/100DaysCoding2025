package Day42;
import  java.util.Scanner;
public class Day42{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        double potongan, gajiBersih;

        if (gajiPokok >= 5000000) {
            potongan = 0.1 * gajiPokok; 
        } else if (gajiPokok >= 3000000) {
            potongan = 0.05 * gajiPokok; 
        } else {
            potongan = 0.02 * gajiPokok; 
        }

        gajiBersih = gajiPokok - potongan;

        System.out.println("Potongan gaji: " + potongan);
        System.out.println("Gaji bersih yang diterima: " + gajiBersih);
    }
}

