package Day35;
import java.util.Scanner;
public class Day35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("total belanja: ");
         double total = input.nextDouble();
        
         if (total >= 100000) {
         System.out.println("mendapatkan diskon 10% ");
           double diskon = 10 * total / 100;  
           total -= diskon;
        }
         else{
             System.out.println("tidak dapat diskon ");
         }
         
         System.out.println("total akhir: "+ total);
       }
    }
    

