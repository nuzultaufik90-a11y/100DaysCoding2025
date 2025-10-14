package Day37;
import java.util.Scanner;
public class Day37 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan bilangan: ");
        int bilangan = input.nextInt();
        
        if(bilangan %2 == 0){
            System.out.println("bilangan genap ");
        }
        else{
            System.out.println("bilangan ganjil ");
        }
    }
    
    
}
