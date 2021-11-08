abstract class Hewan2 {
    public abstract void suara();

    public void tidur() {
        System.out.println ("ZZZZ....");
    }
}

class Ayam2 extends Hewan2 {
    public void suara() {
        System.out.println ("Kukuruyukkkk....");
    }
}

class Abstrak1 {
    public static void main(String [] args) {
        
        Ayam2 ayam = new Ayam2();
        ayam.suara();
        ayam.tidur();
    }
}
