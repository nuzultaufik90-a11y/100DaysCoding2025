package Day34;

public class Kombinasi {

    public static void main(String[] args) {
        int a = 10;     
        int b = 5;      
        
        // Operator aritmatika: penjumlahan (+)
        int hasil = a + b;
        
        // Operator penugasan: tambah sama dengan (+=)
        hasil += 2;  // hasil = hasil + 2
        
        // Operator logika: AND (&&)
        boolean kondisi = (hasil > 10) && (b < 10);
        
        
        System.out.println("Hasil akhir: " + hasil);
        System.out.println("Apakah kondisi benar? " + kondisi);
    }
}
