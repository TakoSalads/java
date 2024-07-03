//Kyle Button
//speed = distance / time converter

package ICS4U;

import java.util.Scanner;

public class speedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take distance
        System.out.print("Enter your distance travelled in KM: \r\n");
        double distance = scanner.nextDouble();

        //take time
        System.out.print("Enter your time travelled in hours: \r\n");
        double time = scanner.nextDouble();

        //do speed conversion
        double speed = distance / time;
        
        //output
        System.out.printf("Your speed was: %.2f KM/h", speed);
        
        scanner.close();

    }
}
