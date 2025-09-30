package Day23;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

        int lebar;
        int panjang;
        double luas;
        
        System.out.print("masukkan lebar: ");
        lebar = input.nextInt();
        System.out.print("masukkan panjang: ");
        panjang = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah " + luas);
    
    }
    
}
