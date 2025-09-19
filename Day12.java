public class Day12 {

    public static void main(String[] args) {
        String nama;
        int usia;
        double tinggi;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan nama : ");
        nama = input.nextLine();
        System.out.print("masukan usia : ");
        usia = input.nextInt();
        System.out.print("masukan tinggi : ");
        tinggi = input.nextDouble();
        
        System.out.println("\nbiodata mahasiswa :");
        System.out.println("Nama Lengkap : " + nama);
        System.out.printf("Usia : %d Tahun\n", usia);
        System.out.print("Tinggi Badan : " + tinggi);
        
    }
    
}
