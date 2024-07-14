package ICS4U;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many digits! \n");
        int n = scanner.nextInt();

        int array[] = new int[n];

        System.out.println("Enter the digits!");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        bubbleSort(array);

        for(int i : array) {
            System.out.print(i);


        scanner.close();
        }
    }
    
    public static void bubbleSort(int array[]) {

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array [j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }


            }
        }
}   }
