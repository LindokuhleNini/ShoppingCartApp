/**
 * Shopping Cart Application
 * Author: Lindokuhle Nini
 * Date: 21 June 2021
 */

import java.util.Scanner;

public class ShoppingCartApp {
    public static int menuChoice;

    public static void main(String[] args) {

     System.out.println("*************************************");
     System.out.println("WELCOME! HAVE FUN SHOPPING");
     System.out.println("*************************************");
     menu();

    }

     public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select pizza: ");
        System.out.println("1. Regina Pizza");
        System.out.println("2. Hawaiian Pizza");
        System.out.println("3. Mediterranean Pizza");
        System.out.println("6. Cancel");
        //menuChoice = scan.nextInt();

    }
}