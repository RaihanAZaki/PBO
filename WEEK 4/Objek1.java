public class Objek1 {
    public void pesan(String nama){
        System.out.println(nama + "Selamat Datang di OOP Java");
    }

    static void test(){
        System.out.println("Test Aja");
    }

    public static void main(String[] args){
        Objek1 obj1 = new Objek1();
        Objek1 obj2 = new Objek1();
        obj1.pesan("Hendi ");
        obj2.pesan("Romie ");
    }
}