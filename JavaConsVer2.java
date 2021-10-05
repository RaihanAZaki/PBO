// Pertemuan 5.6 - Java Constructor
// Constructor Parameter
public class JavaConsVer2 {
    int a;
  
    public JavaConsVer2(int b) {
      a = b;
    }
  
    public static void main(String[] args) {
      JavaConsVer2 myObj = new JavaConsVer2(5);
      System.out.println(myObj.a);
    }
  }