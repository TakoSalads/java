//Kyle Button
//18/21/24
//Purpose: subclass

//circle inherits all public and protected members from shape (x, y, radius)
public class Circle extends Shape {
    private double radius;


    public Circle(int x, int y, double radius) {
        //calls from shape and initalizes radius
        super(x, y);
        this.radius = radius;

    }

    //calls m1 and m2 from drawCircle.java to update the final position
    public void draw(int m1, int m2) {
        System.out.print("Drawing circle with radius " + radius + " at (" + m1 + ", " + m2 + ")");
    }

    //does area calculation!
    public double getArea() {
        return Math.PI * radius * radius;
    }


}