//Kyle Button
//06/07/24
//Purpose: To create a program which will display the nursery rhyme row, row, row your boat.

//using github with my ICU so it's needed for me!
package ICS4U;

public class NurseryRhyme {
    //needed to run program
    public static void main(String[] args) {
        //call the methods
        line1and2();
        line3();
        line4();

        line1and2();
    }
    
    //Method for first & second verse (repeats together)
    public static void line1and2() {
        System.out.println("\nRow, row, row your boat. ");
        System.out.println("Gently down the stream. ");
    }
    //Method for third verse
    public static void line3() {
        System.out.println("Merrily, merrily, merrliy, merrliy ");
    }
    //Method for fourth verse
    public static void line4() {
        System.out.println("Life is but a dream! \n");
    }
}
