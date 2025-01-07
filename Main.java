import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean lacIntol = false;
        boolean membership = false;
        String custName = "";
        double budget = 0.00;
        String userInput = "";
        double price = 00.00;
        Customer customer = new Customer();

        //ESTABLISHES NAME PARAMETER BASED OFF USER INPUT
        System.out.print("Welcome to the cafe!");
        System.out.println(" What is your name? ");
        custName = s.nextLine();

        //ESTABLISHES LACTOSE INTOLERANT PARAMETER BASED OFF USER INPUT
        System.out.print("\nAre you lactose intolerant? \nyes or no: ");
        userInput = s.nextLine();
        if (userInput.equals("yes")) {
            lacIntol = true;
        } else {
            lacIntol = false;
        }

        //ESTABLISHES MEMBERSHIP PARAMETER BASED OFF USER INPUT
        System.out.print("\nWould you like to purchase a membership to this cafe for a low low price of $1000 per month? \nYour loyalty is appreciated. \nyes or no: ");
        userInput = s.nextLine();
        if (userInput.equals("yes") && lacIntol) {
            membership = false;
            System.out.println("\nOh...you're lactose intolerant? Apologies, our membership is only available to those who have become tolerant.");
        } else if (userInput.equals("yes")) {
            membership = true;
        } else if (userInput.equals("no")) {
            membership = false;
        }

        //ESTABLISHES LUCK-BASED BUDGET PARAMETER BASED OFF USER INPUT THROUGH RANDOMIZATION
        System.out.println("\nThink fast: heads or tails?");
        userInput = s.nextLine();
        int randomNum = (int) (Math.random() * 2) + 1;
        if (randomNum == 1) {
            budget = 0.01;
        } else {
            budget = 10000.00;
        }
        System.out.println("+ $" + budget + " to inventory\n");

        //ESTABLISHES CUSTOMER OBJECTS WITH DIFFERENT CHARACTERISTICS BASED OFF PREVIOUS INPUT

        if (lacIntol == true) {
            customer = new Milk(custName, budget, lacIntol);
        } else if (membership == true) {
            customer = new Member(custName, budget, membership);
        } else if (lacIntol == false && membership == false) {
            customer = new Customer(custName, budget);
        }
        customer.printData();


        //ESTABLISHING PRICE VARIABLE, INTERACTIVE ORDER WITH USER
        System.out.println("\nWould you like a bagel with an espresso?");
        userInput = s.nextLine();
        if (userInput.equals("yes")) {
            price = 12.00;
        } else if (userInput.equals("no")) {
            System.out.println("\nWould you like a muffin with hot chocolate?");
            userInput = s.nextLine();
            if (userInput.equals("yes")) {
                price = 15.00;
            } else if (userInput.equals("no")) {
                System.out.println("\nWould you like a coffee with a sandwich.");
                userInput = s.nextLine();
                if (userInput.equals("yes")) {
                    price = 17.00;
                } else if (userInput.equals("no")) {
                    price = -1.00;
                }
            }
        }

        System.out.println("\nYour total is...$" + price);

            if (price < 1) {
                System.out.println("\n" + customer.pickyEaterEnding());
            } else if (budget < price) {
                System.out.println("\n" + customer.badEnding());
            } else if (budget > price)
                System.out.println("\n" + customer.goodEnding());
        }

    }
