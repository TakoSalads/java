package ICS4U;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take digits
        System.out.print("Enter four digits to be added: \r\n");
        int digits = scanner.nextInt();

        //seperate whole number into idividual numbers
        int one = digits % 10;
        int ten = (digits / 10) % 10;
        int hundred = (digits / 100) % 10;
        int thousand = (digits / 1000) % 10;

        //add them up
        int sum = thousand + hundred + ten + one;

        //print!
        System.out.printf("%d + %d + %d + %d = %d", thousand, hundred, ten, one, sum);

        scanner.close();

    }
}
