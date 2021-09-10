public class Aritmatika {
    public static void main(String[] args) {

        //operasi aritmatika
        int x = 13;
        int y = 5;
        int hasil;

        //1. Penjumlahan
        hasil = x + y;
        System.out.println (+ x + " + " + y + " = " + hasil);

        //2. Pengurangan
        hasil = x - y;
        System.out.printf ("%d - %d = %d\n", x, y, hasil );

        //3. Perkalian
        hasil = x * y;
        System.out.printf ("%d * %d = %d\n", x, y, hasil );

        //4. Pembagian
        hasil = x / y;
        System.out.printf ("%d / %d = %d\n", x, y, hasil );

        //Float
        float a = 6;
        float b = 5;
        float hasilfloat = a/b;
        System.out.println (+ a + " / " + b + " = " + hasilfloat);
        

        //5. Modulus (sisa pembagian)
        hasil = x % y;
        System.out.printf ("%d %% %d = %d\n", x, y, hasil );


}
}