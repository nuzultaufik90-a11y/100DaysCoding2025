package Day25;

public class Day25 {

   
    public static void main(String[] args) {
        int x = 77;
        x++;
        System.out.println("Setelah increment (++): " + x);
        x--;
        System.out.println("setelah decrement (--): " + x);
        
        // pre-incre dan pre-decre
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Pre-decrement (--x): " + (--x));
        
        // post-incre dan post-decre
        System.out.println("Post-increment (x++): " + (x++)); 
        System.out.println("Nilai setelah post-increment: " + x);
        System.out.println("Post-decrement (x--): " + (x--)); 
        System.out.println("Nilai setelah post-decrement: " + x);
    }
    
}
