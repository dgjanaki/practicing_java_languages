import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit=in.nextLine();

        // switch(fruit){
        //     case "Mango" :
        //         System.out.println("state fruit");
        //           break;
        //      case "apple" :
        //         System.out.println("away from the doctor");
        //           break;
        //     case "grapes" :
        //         System.out.println("small fruits");
        //           break;

        //     default:
        //         System.out.println("invlid fruit name");

        switch (fruit) {
            case "Mango"->System.out.println("state fruit");
            case "apple"->System.out.println("strong fruit");
            default->System.out.println("invalid input");
                 
         
        }

            
        }
    }

    


