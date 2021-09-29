public class MethodVoid {

    public static void main (String[] args){

        // void itu artinya hampa

        System.out.println(test());

        fungsiVoid("Hallo");
        selamatPagi("Raihan");
        selamatPagi("Zaki");

    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
        
    }


    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (10.0f)
    private static float test(){
        return 10.0f;
    }
}