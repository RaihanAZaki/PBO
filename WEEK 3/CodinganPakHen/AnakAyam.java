/*
Anak ayam turun 10 pergi satu tinggal 9
Anak ayam turun 9 pergi satu tinggal 8
Anak ayam turun 8 pergi satu tinggal 7
Anak ayam turun 7 pergi satu tinggal 6
Anak ayam turun 6 pergi satu tinggal 5
Anak ayam turun 5 pergi satu tinggal 4
Anak ayam turun 4 pergi satu tinggal 3
Anak ayam turun 3 pergi satu tinggal 2
Anak ayam turun 2 pergi satu tinggal 1
Anak ayam turun 1 pergi satu tinggal 0
*/

public class AnakAyam{

    public static void main(String[] args) {
        
        int ayam = 10;
        boolean kondisi = true;

        
        do{
            
            System.out.println("Anak Ayam turun " +ayam+ " pergi satu tinggal " + (ayam-1));
            ayam--;
            
            if (ayam == 1){
                kondisi = false;
            }

        }while (kondisi);
        
        /* 
        for (ayam = 10; ayam >= 1; ayam--){

            System.out.println("Anak Ayam turun " +ayam+ " pergi satu tinggal " + (ayam-1));
        }*/

        /*
        while (ayam > 0){
            
            System.out.println("Anak Ayam turun " +ayam+ " pergi satu tinggal " + (ayam-1));
            i--;
        }*/

        System.out.println("Anak Ayam turun " +ayam+ " pergi satu tinggal induknya");
    }
}