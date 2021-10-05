// Pertemuan 5.6 - Java Constructor
// Constructor Parameter
public class JavaConsVer3 {
    int modelYear;
    String modelName;
  
    public JavaConsVer3(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      JavaConsVer3 myCar = new JavaConsVer3(1967, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }