import java.util.Scanner;

public class LatihanInputUser {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner inputan = new Scanner (System.in);
        System.out.print ("Masukkan nilai x = ");
        x = inputan.nextInt();
        System.out.print ("Masukkan nilai y = ");
        y = inputan.nextInt();

        /* 
        Total Nilai
        */
        int total = x + y;

        System.out.println ("Nilai x = " +x);
        System.out.println ("Nilai y = " +y);
        System.out.println ("Total = " +total);
    }
}