package Day39;
import java.util.Scanner;
public class Day39 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int pilihan;
        
        System.out.println("=== MENU MASAKAN === ");
        System.out.println("1. Nasi Goreng ");
        System.out.println("2. Mie Ayam ");
        System.out.println("3. Bakso ");
        System.out.println("4. Ayam Geprek ");
        System.out.println("5. Keluar ");
        System.out.print("Masukkan Pilihan Anda dari (1-5): ");
        pilihan = input.nextInt();
        
        if(pilihan == 1){
            System.out.println("Anda Memilih Nasi Goreng ");
            System.out.println("Harganya Adalah Rp15.000 ");
        }
        else if(pilihan == 2){
            System.out.println("Anda Memilih Mie Ayam ");
            System.out.println("Harganya Adalah Rp18.000 ");
        }
        else if(pilihan == 3){
            System.out.println("Anda Memilih Bakso ");
            System.out.println("Harganya Adalah Rp10.000 ");
        }
        else if(pilihan == 4){
            System.out.println("Anda Memilih Ayam Geprek ");
            System.out.println("Harganya Adalah Rp20.000 ");
        }
        else if(pilihan == 5){
            System.out.println("Terima Kasih ");
        }
        else if (pilihan < 1 || pilihan > 5){
            System.out.println("Pesanan anda Tidak Ada ");
        }
    }
    
    
}

  
    

