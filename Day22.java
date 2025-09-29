package Day22;
import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        int sisi;
        double luas;
        
        System.out.print("Isi panjang sisi persegi: ");
        sisi = input.nextInt();

        luas = sisi * sisi;

        System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luas);
    


    }
    
}
