public class MethodParamter1 {

    static void methodKu (String namaDepan, String namaTengah, String namaBelakang) { 
    //"nama" merupakan parameter
        String nama = " " + namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println("Selamat Datang" + nama);
    // Argumen harus sesuai dengan jumlah Parameter
    }
    public static void main (String[] args) {
        //Pemanggilan method dg argument
        methodKu("Raihan","Ashil","Zaki"); // Raihan adalah argument
    }
}