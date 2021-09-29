/* WEEK 4
Contoh codingan pertama 
Membahas method */

public class Method1 {

    //Deklarasi method
    static void methodKu() {
    //Void adalah method yang tidak memiliki nilai kembali/return
    int i = 0;
    System.out.println ("Methodku Dipanggil");
    /* while (i < 5) {
        System.out.println(i + " "); //Perulangan
        i++;
    } */
    }

    public static void main (String[] args) { //Parameter args
        //Pemanggilan method static
        methodKu();
        methodKu();
        methodKu();

    }

}