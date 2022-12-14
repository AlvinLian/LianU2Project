import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        System.out.println("Welcome!");

        Scanner input = new Scanner(System.in);

        // first coordinate
        System.out.print("Enter coordinate 1: ");
        String coord1 = input.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2, coord1.length() - 1));

        // second coordinate
        System.out.print("Enter coordinate 2: ");
        String coord2 = input.nextLine();
        int x2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",") + 2, coord2.length() - 1));

        System.out.println();

        // check if the points are on a vertical line and prints it. If not, then all the info about the points are printed.
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
        } else {
            LinearEquation obj = new LinearEquation(x1,y1,x2,y2);
            System.out.println(obj.lineInfo());

            System.out.println();

            System.out.print("Enter a value for x: ");
            double xValue = input.nextDouble();
            String pointOnLine = obj.coordinateForX(xValue);
            System.out.println();
            System.out.println("The point on the line is: " + pointOnLine);
        }
    }
}