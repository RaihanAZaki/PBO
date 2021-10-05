// class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class ConstructorYoutube {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Raihan","2020071037","Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Tom","1130021442","Psikologi");
        
        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

    }
}