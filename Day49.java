package Day49;
import java.util.Scanner;

public class Day49 {


    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();
        
        String keterangan = (nilai >= 75) ? "Lulus" : "Tidak Lulus";

        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Keterangan: " + keterangan);   
    }
    
}
 
