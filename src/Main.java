import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float roomLength = 0;
        float roomWidth = 0;
        float roomArea = 0;
        float roomPerimeter = 0;


        Scanner scnr = new Scanner(System.in);
        boolean stop = false;

        while(stop == false) {

        System.out.println("Welcome to Grand Circus' Room Detail Generator!");

        System.out.println("Enter Length: ");
        roomLength = scnr.nextFloat();

        System.out.println("Enter Width: ");
        roomWidth = scnr.nextFloat();

        roomArea = roomLength * roomWidth;
        System.out.println("Area: " + roomArea);

        roomPerimeter = ((roomLength * 2) + (roomWidth * 2));
        System.out.println("Perimeter: " + roomPerimeter);

        System.out.println("Continue? (yes/no): ");
        String s = scnr.next();


        if (s.equals("n") || s.equals("no")) {          // equals instead of ==  because it is looking for the same value instead of the same references
            stop = true;
        }

        }



    }
}
