import java.util.Scanner;

public class MencariJarakFisika{
    static int jarak (int kecepatan, int waktu){

        float total;
        total = kecepatan * waktu;

    }
    public static void main(String[] args){
        int kecepatan, waktu;
        Scanner inputan = new Scanner(System.in);
        System.out.print ("Masukan Nilai Kecepatan (km/jam) = ");
        kecepatan = inputan.nextInt();
        System.out.print ("Masukan Nilai Waktu (jam) = ");
        waktu = inputan.nextInt();
        System.out.print("\n");
        System.out.println ("Diketahui kecepatan = " + kecepatan + "km/jam" + " dan waktunya = " + waktu + "jam" + " , maka");
        System.out.println ("jarak tempuhnya = " + jarak(kecepatan,waktu) + "km");
    }
}

 
