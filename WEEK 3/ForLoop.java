public class ForLoop {

    public static void main (String[] args){

//        for (inisialisasi; kondisi; step nilai){
//
//            aksi;
//
//        }


        System.out.println("ini adalah awal program");

        System.out.println("loop pertama");

        // Nilai x

        for(int x = 0; x <= 5 ; x++){

            System.out.println("for loop ke-" + x);

        }


        System.out.println("loop kedua");

        for(int x = 3; x < 7 ; x++){

            System.out.println("for loop ke-" + x);

        }

        System.out.println("loop ketiga");

        for(int x = 14; x >= 8 ; x--){

            System.out.println("for loop ke-" + x);

        }

        System.out.println("loop keempat");

        int x = 2;

        for(; x < 13 ;){

            System.out.println("for loop ke-" + x);
            x++;
        }

        System.out.println("ini adalah akhir program");

    }
}