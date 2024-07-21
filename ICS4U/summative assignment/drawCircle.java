//Kyle Button
//18/21/24
//Purpose: Demenstration
//Objective: take user input and contructs a circle object with coordinates, and a radius.
//Then allows the user to change the positioning of the circle.

import java.util.Scanner;

public class drawCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take x coord
        System.out.print("Enter the 'X' coordinate: \n");
        int x = scanner.nextInt();

        //take y coord
        System.out.print("Enter the 'Y' coordinate: \n");
        int y = scanner.nextInt();

        //take radius
        System.out.print("Enter the radius of your circle: \n");
        double radius = scanner.nextDouble();

        //take circle movement -
        System.out.print("Where would you like to move the X value: ");
        int m1 = scanner.nextInt();

        //take circle movement - Y
        System.out.print("Where would you like to move the Y value: ");
        int m2 = scanner.nextInt();

        //creating instances
        Shape shape = new Shape(x, y);
        //calls shape constructer through super(x, y)
        Circle circle = new Circle(x, y, radius);

        //running methods
        shape.draw();
        shape.moveCircle(m1, m2);
        circle.draw();

        //printing area
        System.out.print("\nArea of the circle: " + circle.getArea());

        //finishing touches!
        scanner.close();
    }
}