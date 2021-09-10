import java.util.*;

public class TernaryOperator {

    public static void main (String[] args){


        // ternary operator

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputUser.nextInt();

        // variable x = ekspresi ? statement_true : statement_false

        x = (input == 6) ? (input*input) : (input/3);

//        jika memakai if
//        if (input==6){
//            x = input*input;
//        }else{
//            x = input/2;
//        }

        System.out.println("hasilnya " + x);

    }
}