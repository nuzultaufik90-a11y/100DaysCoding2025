package Day60;

public class Day60 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
      
        System.out.println("Angka dari "+ N + " ke 1" + ":"); 
        for (int i = N; i >= 1; i--) {
            if(i %2==1){
            System.out.print(i + " ");
            
        }
                
        }

        System.out.println(); 

       System.out.println("Angka dari "+ N + " ke 1" + ":"); 
        for (int i = N; i >= 1; i--) {
            if(i %2==0){
            System.out.print(i + " ");
                
            }
                
            
        }

    }
}


