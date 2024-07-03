package ICS4U;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take change
        System.out.print("Enter the change amount in cents: ");
        int change = scanner.nextInt();

        //choose change denominations
        int toonie = change / 200;
        change %= 200;

        int loonie = change / 100;
        change %= 100;

        int quarter = change / 25;
        change %= 25;

        int dime = change / 10;
        change %= 10;

        int nickel = change / 5;
        change %= 5;

        int penny = change / 1;
        change %= 1;

        System.out.printf("Toonies: %d%n", toonie);
        System.out.printf("Loonies: %d%n", loonie);
        System.out.printf("Quarters: %d%n", quarter);
        System.out.printf("Dimes: %d%n", dime);
        System.out.printf("Nickels: %d%n", nickel);
        System.out.printf("Pennies: %d%n", penny);

        scanner.close();

    }
    
}
