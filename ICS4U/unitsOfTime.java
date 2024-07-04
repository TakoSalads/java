package ICS4U;

import java.util.Scanner;

public class unitsOfTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take days
        System.out.print("Enter the amount of days: \r\n");
        int days = scanner.nextInt();

        //take hours
        System.out.print("Enter the amount of hours: \r\n");
        int hours = scanner.nextInt();

        //take minutes
        System.out.print("Enter the amount of minutes: \r\n");
        int minutes = scanner.nextInt();

        //take seconds
        System.out.print("Enter the amount of seconds: \r\n");
        int seconds = scanner.nextInt();

        //do some conversions
        int daystoseconds = days * 24 * 60 * 60;
        int hourstoseconds = hours * 60 * 60;
        int minutestoseconds = minutes * 60;
        int totalseconds = daystoseconds + hourstoseconds + minutestoseconds + seconds;

        //print results
        System.out.printf("Your total amount is: %d seconds", totalseconds);

        scanner.close();
    }
    
}
