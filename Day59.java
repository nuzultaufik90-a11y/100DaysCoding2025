
package Day59;

import java.util.Scanner;

public class Day59 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
      
        System.out.println("Angka dari 1 ke " + N + ":");
        for (int i = 1; i <= N; i++) {
            if(i %2==1){
            System.out.print(i + " ");
                
            }
        }

        System.out.println(); 

       System.out.println("Angka dari 1 ke " + N + ":");
        for (int i = 1; i <= N; i++) {
            if(i %2==0){
            System.out.print(i + " ");
                
            }
        }

    }
}


