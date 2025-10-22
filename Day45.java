package Day45;
import java.util.Scanner;


public class Day45 {

    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        
        switch(pilihan){
        
        case 1 :
        System.out.println("Anda memilih paket ISC ");
        break;
        case 2 :
        System.out.println("Anda memilih paket 1 ");
        break;
        case 3 :
        System.out.println("Anda memilih paket 2 ");    
        break;
        case 4 :
        System.out.println("Anda memilih paket 3 ");    
        break;
            
        }
    }
    
}
