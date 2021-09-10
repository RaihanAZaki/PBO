public class Unary {

    public static void main(String[] args) {

        // unary = operasi yang dilakukan pada suatu variable

        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka,+angka);
        System.out.printf("unary '+', %d menjadi %d\n",angka,-angka);

        // unary decrement dan increment

        int angka2 = 18;
        angka2++;
        //angka2++;
        System.out.println("Nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("Nilai dengan '--' menjadi = " + angka3);

        int a = 8;
        /*Prefix
        a++;
        ++a;
        */
        System.out.printf("Nilai dengan '++' prefix menjadi = %d\n", ++a);
        //Postfix
        int b = 9;
        System.out.printf("Nilai dengan '++' postfix menjadi = %d\n", a++);
        System.out.printf("Nilai hasil dari postfix menjadi = %d\n", a);

        // unary boolean dengan ! untuk negasi 

        boolean raihan = true;
        System.out.println("Nilai boolean = " + raihan);
        System.out.println("Nilai boolean = " + !raihan);
    }
}