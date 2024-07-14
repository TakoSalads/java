package ICS4U;

import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take input
        System.out.print("Enter your letter: \r\n");
        // swapping letters to lowercase because it's easier
        String preletter = scanner.next().toLowerCase();

        char letter = preletter.charAt(0); 

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.print("Your letter is a vowel");
        }
        else if (letter == 'y') {
            System.out.print("Your letter is sometimes a vowel");
        }
        else {
            System.out.print("Your letter is a consonant");

        }
        scanner.close();
    }
}
