//Kyle Button
//take imperial system mesurements and convert to metric.

package ICS4U;

import java.util.Scanner;

public class heightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take height in feet
        System.out.print("Enter the feet you'd like to convert: ");
        double feetHeight = scanner.nextDouble();

        System.out.print("Enter the inches you'd like to convert: ");
        double inchesHeight = scanner.nextDouble();

        //conversions
        double feetToInches = feetHeight * 12;
        double centiHeight = (inchesHeight + feetToInches) * 2.54;

        System.out.printf("Your Height is: %.2f centimeteres", centiHeight);
        
        scanner.close();

    }
}
