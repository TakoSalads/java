//Kyle Button
//finding first occurence of number in set array

package ICS4U;

import java.util.Scanner;

public class linearSearch { 
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //take number
        System.out.print("Enter your interger: ");
        int value = scanner.nextInt();

        //creating array and using function
        int[] array = {9,7,6,2,3,4,1,8,5};
        int index = linearSearchFunction(array, value);

        //check if the number exists then print results
        if(index != -1) {
            System.out.print("First occurrence of " + value + " is found at position: " + index);
        }
        else {
            System.out.print(value + "is not in the index");
        }

        scanner.close();
    }
    //bro codes function
    private static int linearSearchFunction(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
