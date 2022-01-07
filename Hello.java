import java.util.Date;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

public class Hello{
    public static void main(String[] args) {
        // String msg = "Hello world";
        // Date now = new Date();
        // System.out.println(now);


        // //interest problem
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Principal:");
        // int principal = scanner.nextInt();
        // System.out.println("Interest rate:");
        // Float rate = scanner.nextFloat();
        // System.out.println("Years:");
        // int years = scanner.nextInt();
        // double mortgage = principal * ((rate)*Math.pow((1+rate),years)/(Math.pow((1+rate),years)-1));
        // System.out.println("Your mortgage is: " +mortgage);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature:");
        float temperature = scanner.nextInt();

// if(temperature > 30){
//     System.out.println("It's a hot day");
//     System.out.println("Drink plenty of water");
// }
// else if(temperature<30 && temperature>20){
//     System.out.println("It's a nice day");
// }
// else{
//     System.out.println("It's cold");
// }
String name = "joan";
//switch
switch (name) {
    case "joan":
        System.out.println("must be you");
        break;
        case "wanini":
        System.out.println("");
        break;

    default:
        break;
}
    }
}