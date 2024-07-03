//Kyle Button
//take input for intial investment and diplay compound intrest rates for three years

package ICS4U;

import java.util.Scanner;

public class compoundInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take intial investment
        System.out.print("How much would you like to invest? \r\n");
        double intinvest = scanner.nextDouble();

        double yearone = intinvest * 1.04;
        double yeartwo = yearone * 1.04;
        double yearthree = yeartwo * 1.04;

        System.out.printf("Inital investment: %.2f \r\n" , intinvest);
        System.out.printf("Year one: %.2f \r\n", yearone);
        System.out.printf("Year two: %.2f \r\n", yeartwo);
        System.out.printf("Year Three: %.2f \r\n", yearthree);

        scanner.close();
    }
}
