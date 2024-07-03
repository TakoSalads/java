package ICS4U;

import java.util.Scanner;

public class bottleDeposits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take big bottles
        System.out.print("Enter how many bottles < 1L: \r\n");
        int bigBottle = scanner.nextInt();

        System.out.print("Enter how many bottles > 1L: \r\n");
        int smallBottle = scanner.nextInt();

        double bigMoney = bigBottle * 0.25;
        double smallMoney = smallBottle * 0.10;

        System.out.printf("From big bottles you made: %.2f \n", bigMoney);
        System.out.printf("From small bottles you made: %.2f \n", smallMoney);

        scanner.close();

    }
    
}
