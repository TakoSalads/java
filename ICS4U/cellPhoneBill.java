package ICS4U;

import java.util.Scanner;

public class cellPhoneBill {
    public static void main(String[] args) {
        double baseValue = 15.00;
        double emergValue = 0.44;
        double addiMess = 0.15;
        double addiMin = 0.25;
        double addmins = 0;
        double addtext = 0;
        double pretax = 0;
        double tax = 0.13;
        double pretotal = 0;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many texts sent this month \r\n");
        int textSpent = scanner.nextInt();

        System.out.print("Enter the amount of minutes used this month. \r\n");
        int minSpent = scanner.nextInt();

        if (textSpent > 50) {
            addtext = (textSpent - 50) * addiMess;

        }
        if (minSpent > 50) {
            addmins = (minSpent - 50) * addiMin;
        }

        pretax = baseValue + emergValue + addtext + addmins;

        pretotal = pretax * tax;

        total = pretotal + pretax;
        
        scanner.close();

        System.out.print("Phone Bill  \r\n");
        System.out.printf("Base Charge: %.2f  \r\n", baseValue);
        System.out.printf("Emergency Fee: %.2f \r\n", emergValue);
        if (addtext > 0) {
            System.out.printf("Additonal Message Charge: %.2f  \r\n", addtext);
        }
        if (addmins > 0) {
            System.out.printf("Additonal Minutes Charge: %.2f  \r\n", addmins);
        }
        System.out.printf("Tax: %.2f  \r\n", pretotal);
        System.out.printf("Total Amount: %.2f  \r\n", total); 
    }
    
}
