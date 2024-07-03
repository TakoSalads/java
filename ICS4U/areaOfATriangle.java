package ICS4U;

import java.util.Scanner;

public class areaOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take base
        System.out.print("Enter the base of the Triangle \r\n");
        double base = scanner.nextDouble();

        //take height
        System.out.print("Enter the height of the Triangle \r\n");
        double height = scanner.nextDouble();

        //math
        double area = base * height / 2;
        
        //print results
        System.out.printf("The area of the Triangle is: %.2f", area);

        scanner.close();
    }

}
