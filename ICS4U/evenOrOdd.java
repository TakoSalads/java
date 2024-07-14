package ICS4U;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        //take interger
        System.out.print("Enter your interger \r\n");
        int oddoreven = scanner.nextInt();

        //check if its even or odd
        if (oddoreven % 2 == 0)
            System.out.print("The interger is even");
        else
            System.out.print("The interger is odd");

        scanner.close();


    }
    
}
