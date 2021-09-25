public class WhileLoop {

    public static void main (String[] args){


//        while (kondisi) {
//            aksi
//        }

        int x = 5;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + x);

            if (x == 7){
                kondisi = false;
            }

            x++;
        }

        System.out.println("akhir program");

    }
}