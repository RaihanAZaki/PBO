// Pertemuan 5.6 - Java Constructor

public class JavaConsVer1 {

    // - Constructor adalah sebuah method special yang digunakan untuk menginisialisasi object
    // - Constructor akan otomatis terpanggil pada saat kita membuat object dari class tersebut
    // - Constructor dapat digunakan untuk memberikan atau meng-set initial value dari attribut object tersebut
  
    int x;
  
    // Ini adalah constructor untuk class JavaCons
    public JavaConsVer1() {
      x = 10; // Set the initial value for the class atribute x
    }
  
    public static void main(String[] args) {
      JavaConsVer1 myObj = new JavaConsVer1(); // Membuat object dari class JavaCons (akan otomatis memanggil constructornya)
      System.out.println(myObj.x); // Print nilai dari x
    }
  }