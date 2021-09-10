import java.util.*;

public class SwitchCase {

    // switch case

    public static void main(String[] args){

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "Raihan":
                System.out.println("saya Raihan dan hadir bu!!!");
                break;
            case "Ilham":
                System.out.println("saya Ilham dan hadir Bos!!!!");
                break;
            case "Zaki":
                System.out.println("saya Zaki dan hadir pak!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }
        // output akan terpilih sesuai pilihan pada case

        System.out.println("selesai program");

    }

}