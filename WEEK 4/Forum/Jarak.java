import java.util.Scanner;

public class Jarak{

    static int rumusjarak(int kecepatan, int waktu){
        int total;
        total  = kecepatan * waktu;
        return total;
    }

    public static void main(String[] args) {
        
        int kecepatan,waktu;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai kecepatan (km/jam) : ");
        kecepatan = input.nextInt();
        System.out.println("Masukan nilai waktu (jam) : ");
        waktu = input.nextInt();
        System.out.println ("Diketahui kecepatan = " + kecepatan + "km/jam" + " dan waktunya = " + waktu + "jam" + " , maka jarak tempuhnya adalah = " + rumusjarak(kecepatan,waktu) + "km");
    }
}
