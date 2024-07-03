//Kyle Button
//convert length and width in feet to acres.

package ICS4U;

import java.util.Scanner;

public class areaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //take length
        System.out.print("Enter the length of your field using feet: \r\n");
        double lFeet = scanner.nextDouble();
        
        //take width
        System.out.print("Enter the width of your field using feet: \r\n");
        double wFeet = scanner.nextDouble();

        //get the area and convert to acres
        double areaFeet = lFeet * wFeet;
        double areaAcres = areaFeet / 43560;
        
        //print results
        System.out.printf("The area of the field is: %.2f acres", areaAcres);

        scanner.close();
    }
    
}
