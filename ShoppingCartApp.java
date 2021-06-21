/**
 * Shopping Cart Application
 * Author: Lindokuhle Nini
 * Date: 21 June 2021
 */

import java.util.Scanner;

public class ShoppingCartApp {
    public static int menuChoice;
    public static double amountOwing;

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     
     System.out.println("*************************************");
     System.out.println("WELCOME! HAVE FUN SHOPPING");
     System.out.println("*************************************");
     menu();

      while (menuChoice != 6) {
            int choice;
            switch (menuChoice) {
                case 1 -> {
                    System.out.println("\nRegina Pizza\n");
                    System.out.println("Choose meal type: ");
                    System.out.println("1. Small Pizza R80");
                    System.out.println("2. Medium R110");
                    System.out.println("3. Large R135");
                    System.out.println("4. Back");
                    choice = scan.nextInt();

                    if (choice == 1) {
                        amountOwing = 80;
                    } else if (choice == 2) {
                        amountOwing = 110;
                    } else if (choice == 3) {
                        amountOwing = 135;
                    } else if (choice == 4) {
                        menu();
                    } else {
                        System.out.println("Invalid. Please try again");

                    }

		    System.out.println("Do you want toppings? ");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int input = scan.nextInt();

                    if (input == 1) {
                        amountOwing += addToppings();
                        System.out.println("Total = " + amountOwing + "\n");

                    } else if (input == 2) {
                        System.out.println("Total = " + amountOwing + "\n");
                    } else
                        System.out.println("Invalid selection");

                  checkout();
                }
                case 2 -> {
                    System.out.println("\nHawaiian Pizza\n");
                    System.out.println("Choose meal type: ");
                    System.out.println("1. Small R90");
                    System.out.println("2. Medium R120");
                    System.out.println("3. Large R145");
                    System.out.println("4. Back");
                    choice = scan.nextInt();

                    if (choice == 1) {
                        amountOwing = 90;
                    } else if (choice == 2) {
                        amountOwing = 120;
                    } else if (choice == 3) {
                        amountOwing = 145;
                    } else if (choice == 4) {
                        menu();
                    } else {
                        System.out.println("Invalid. Please try again");
                        choice = scan.nextInt();
                    }

		    System.out.println("Do you want toppings? ");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int input = scan.nextInt();

                    if (input == 1) {
                        amountOwing += addToppings();
                        System.out.println("Total = " + amountOwing + "\n");

                    } else if (input == 2) {
                        System.out.println("Total = " + amountOwing + "\n");
                    } else
                        System.out.println("Invalid selection");
  		  
                    checkout();
                }
                case 3 -> {
                    System.out.println("\nMediterranean Pizza\n");
                    System.out.println("Choose meal type: ");
                    System.out.println("1. Small R120");
                    System.out.println("2. Medium R150");
                    System.out.println("3. Large R175");
                    System.out.println("4. Back");
                    choice = scan.nextInt();

                    if (choice == 1) {
                        amountOwing += 120;
                    } else if (choice == 2) {
                        amountOwing += 150;
                    } else if (choice == 3) {
                        amountOwing += 175;
                    } else if (choice == 4) {
                        menu();
                    } else {
                        System.out.println("Invalid. Please try again");
                        choice = scan.nextInt();
                    }

		    System.out.println("Do you want toppings? ");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int input = scan.nextInt();

                    if (input == 1) {
                        amountOwing += addToppings();
                        System.out.println("Total = " + amountOwing + "\n");

                    } else if (input == 2) {
                        System.out.println("Total = " + amountOwing + "\n");
                    } else
                        System.out.println("Invalid selection");

		   checkout();
                }
                default -> {
                    System.out.println("Invalid selection. Please select another");
                    menuChoice = scan.nextInt();
                }
            }
        }
        System.out.println("\nTHANK YOU!\n");

    }

     public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select pizza: ");
        System.out.println("1. Regina Pizza");
        System.out.println("2. Hawaiian Pizza");
        System.out.println("3. Mediterranean Pizza");
        System.out.println("6. Cancel");
        menuChoice = scan.nextInt();

    }

    public static double addToppings() {

        Scanner scan = new Scanner(System.in);
        int choice;
        double amount = 0;

        System.out.println("Choose Toppings (Not more than 3): ");
        System.out.println("1. Cheddar Cheese R20.90");
        System.out.println("2. Mushrooms R25.90");
        System.out.println("3. Olives R25.90");
        System.out.println("4. Avocado R32.90");
        System.out.println("5. Pineapple R20.90");
        System.out.println("6. Done");

        int x = 0;
        while (x < 3) {
            choice = scan.nextInt();

            if (choice == 1) {
                amount += 20.90;
            } else if (choice == 2) {
                amount += 25.90;
            } else if (choice == 3) {
                amount += 25.90;
            } else if (choice == 4) {
                amount += 32.90;
            } else if (choice == 5) {
                amount += 20.90;
            } else if (choice == 6) {
                return amount;
            } else {
                System.out.println("You can only add up to 3 toppings");
            }
            x++;
        }

        return amount;
    }

     public static void checkout() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("1. Checkout ");
        System.out.println("2. Add more pizza ");
        int selection = scan.nextInt();
        if (selection == 1) {
            amountOwing += amountOwing;
            System.out.println("Total amount owing = " + amountOwing + "\n");
            menuChoice = 6;
        } else if (selection == 2) {
            menu();
        } else
            System.out.println("Invalid selection");
    }
}