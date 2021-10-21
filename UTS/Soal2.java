import java.util.Scanner;
import java.util.InputMismatchException;
class Soal2 {

    private static float berat, tinggi,BMI;   

    Scanner angka = new Scanner(System.in);
    public float Perhitungan() {
        System.out.print("Masukan Berat : ");
        this.berat = angka.nextFloat();
        System.out.print("Masukan Tinggi : ");
        this.tinggi = angka.nextFloat();

        BMI = berat / (tinggi * tinggi);
        System.out.println("Total BMI : " + BMI);
            if ((BMI >= 18.5) && (BMI <= 22.9)) {
                System.out.println("Berat Badan Ideal! ");
                System.out.println ("Pertahankan!!");
                
            } else if (BMI >= 22.9) {
                System.out.println ("Berat Badan Overweight!");
                System.out.println ("Yuk! Segera Turunkan Berat Badanmu");
            
            } else if (BMI <= 18.5) {
                System.out.println ("Berat Badan Underweight!");
                System.out.println ("Yuk! Segera Tingkatkan Berat Badanmu");
            
            } else {
                System.out.println ("ERROR!!");
            }
            return BMI;
        }


    public static void main(String[] args) {
        Soal2 jawaban = new Soal2();
        jawaban.Perhitungan();
    }
}