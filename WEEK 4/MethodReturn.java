public class MethodReturn {
    static double nilaiTugas (int x) {
    // Tipe data harus sesuai!!
        double nilai = 0.2 * x;
        return nilai;
   }

    public static void main (String[] args) {
        //Cara 1
        System.out.println("Nilai Tugas = " +nilaiTugas(80));

        //Cara 2
        double nilai;
        nilai = nilaiTugas(80);
        System.out.println("Nilai Kamu = " +nilai);

        //Cara 3
        if (nilaiTugas(80) > 10) {
            System.out.println("Anda Lulus!!");
        }
        
        /* for(int i+0 ; i < nilaiTugas(80) ; i++) {

        } */
    }
}