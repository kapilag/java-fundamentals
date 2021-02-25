package loops;

import java.util.Scanner;

public class PartySuggestionForLoop {

    //Take input as number of guest like 10
    // 1 medium serves 2 divide input to 2 and loop through the same asking for pizza toppings

    public static void main(String[] args){
        System.out.println("Throwing party? Worry not will help you plan, How many guest you expect");
        Scanner scanner = new Scanner(System.in);
        int expectedGuest = scanner.nextInt();

        int mediumPizza = expectedGuest/2 + 1;
        System.out.println("We recommend you order "+mediumPizza+" medium pizza, Please select topping");
        for(int i=0;i<mediumPizza;i++){
            System.out.println("Add Topping for pizza "+i);
            scanner.next();
        }

        System.out.println("Thanks for ordering, your "+mediumPizza+" will reach you shortly");
    }
}
