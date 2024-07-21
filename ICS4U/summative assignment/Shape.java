//Kyle Button
//18/07/24
//Purpose: Super class

public class Shape {
    protected int x, y;


    //initalizing x and y / constructor
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }


    //"Moving the circle"
    public void moveCircle(int x2, int y2) {
        this.x = x + x2;
        this.y = y + y2;
        System.out.print("Moving circle to (" + x + ", " + y + ") \n");
    }
    
    //gets overridden in subclass 
    public double getArea() {
        return 0.0;
    }
}

