//Kyle Button
//take meal total and add tax and tip.

package ICS4U;

import java.util.Scanner;

public class tipAndTax {
    public static void main(String[] args) {
        
        // get cost from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost of the meal");
        double mealCost = scanner.nextDouble();

        // adding tax and tip
        double mealTax = mealCost * 0.13;
        double mealTip = mealCost * 0.18;
        double mealTotal = mealCost + mealTax + mealTip;

        // show results to user
        System.out.printf("Total: %.2f\r\n", mealTotal);
        System.out.printf("Tax: %.2f\r\n", mealTax);
        System.out.printf("Tip: %.2f\r\n654363", mealTip);

        scanner.close();

    }

}