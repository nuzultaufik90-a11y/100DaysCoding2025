package Day24;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        double phi;
        
        System.out.print("masukkan jari jari: ");
       double jari = input.nextDouble();
       
       phi = 3.14;

        System.out.println("Luas lingkaran adalah " + (phi * jari*jari));
    }
    
}
