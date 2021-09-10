import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        int a;
        int t;
        double hasil;
        Scanner inputan = new Scanner (System.in);
        System.out.print ("Masukkan alas = ");
        a = inputan.nextInt();
        System.out.print ("Masukkan tinggi = ");
        t = inputan.nextInt();

        /* 
        Total Nilai
        */
        hasil = 0.5 * a * t;

        System.out.println ("Nilai x = " +a);
        System.out.println ("Nilai y = " +t);
        System.out.println ("Luas 0.5 * " + a + " + " + t + " = " + hasil + " cm2");
    }
}