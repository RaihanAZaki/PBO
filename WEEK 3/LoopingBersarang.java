public class LoopingBersarang {

    public static void main (String[] args){

        // Codingan Looping Bersarang

        for(int x = 0; x < 6; x++){
            for(int y = 0; y < 6; y++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int x = 0; x < 6; x++){
            for(int y = 0; y < 6; y++){
                System.out.print("* ");
                if(x == y){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int x = 0; x < 6; x++){
            for(int y = 0; y < 6; y++){
                System.out.print("* ");
                if ( (x+y) == 5){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int x = 0; x < 9; x++){
            for(int y = 0; y < 9; y++){
                System.out.print("* ");
                if (x == y){
                    break;
                } else if ( (x+y) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }

    }
}