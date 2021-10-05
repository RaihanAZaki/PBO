// Pertemuan 5.6 - Java Constructor

public class JavaConsVer1 {

    int a;
  
    // Ini adalah constructor untuk class JavaCons
    public JavaConsVer1() {
      a = 5; // Set the initial value for the class atribute a
    }
  
    public static void main(String[] args) {
      JavaConsVer1 myObj = new JavaConsVer1(); // Membuat object dari class JavaCons (akan otomatis memanggil constructornya)
      System.out.println(myObj.a); // Print nilai dari a
    }
  }