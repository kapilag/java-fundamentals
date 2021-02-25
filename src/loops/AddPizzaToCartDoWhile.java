package loops;

import java.util.Scanner;

public class AddPizzaToCartDoWhile {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter size of the pizza");
            String pizzaSize = scanner.next();

            System.out.println("Enter Toppings");
            String toppings = scanner.next();

            System.out.println("You have ordered "+ pizzaSize + "with toppings "+ toppings);

            System.out.println("Would you like to add another one");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();
    }
}
