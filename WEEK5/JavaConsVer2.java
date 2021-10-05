// Pertemuan 5.6 - Java Constructor
// Constructor Parameter
public class JavaConsVer2 {
    int x;
  
    public JavaConsVer2(int y) {
      x = y;
    }
  
    public static void main(String[] args) {
      JavaConsVer2 myObj = new JavaConsVer2(6);
      System.out.println(myObj.x);
    }
  }