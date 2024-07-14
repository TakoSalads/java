//Kyle Button
//07/11/24
//Purpose: The purpose of my program is to a length from the user and print the
//Arithmetic sequence from a start of 2 with a common difference of 3 and the sum of the sequence.


package ICS4U;

import java.util.Scanner;

public class arithmeticSequence {
    public static void main(String[] args) {
        //open scanner
        Scanner scanner = new Scanner(System.in);

        //take term number from user
        System.out.print("Enter the term number: \n");
        int n = scanner.nextInt(); // term number

        //varibles
        int a = 2; //Starting number
        int d = 3; //Common difference

        //run method with parameters
        int sum = Calculations(a, d, n);

        //print sum lastly
        System.out.println("\nSum: " + sum);

        //close scanner
        scanner.close();
    }
    
    private static int Calculations(int a, int d, int n) {
        //if term number == 1, print base case
        if (n == 1) {
            System.out.print(a);
            return a; //Base case
        }
        else {
            // recursive case
            int currentTerm = a + (n - 1) * d; // Calculate the current term
            int sumBefore = Calculations(a, d, n -1); // Recursively calculate the sum of the previous terms
            int total = currentTerm + sumBefore; // Add them together    

            //print current term once for every term number
            System.out.print(" "+ currentTerm);

            return total;
        }
    }
}
