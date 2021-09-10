import java.util.Scanner;

public class Waktu {
    public static void main(String[] args) {
        int detik, menit;
        double jam;
        Scanner inputan = new Scanner (System.in);
        System.out.print ("Masukkan Jam = ");
        jam = inputan.nextDouble();
        System.out.print ("Masukkan Menit = ");
        menit = inputan.nextInt();
        System.out.print ("Masukkan Detik = ");
        detik = inputan.nextInt();

        System.out.println ("Jam = " +jam + "\nMenit = " + menit + "\nDetik = " +detik );

        /* 
        Hasil Konversi
        */
        
        System.out.println ("Hasil dikonversi ke detik = " + (jam*60*60 + menit*60 + detik*1));
    }
}