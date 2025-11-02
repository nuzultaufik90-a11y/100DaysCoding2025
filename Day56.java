package Day56;

import java.util.Scanner;


public class Day56 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka;
        
        do{
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
            System.out.println("Anda memasukkan angka: "+ angka);
        }while (angka != 0);
        System.out.println("program selesai ");
                
            
    }
    
}
