import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        System.out.println("Welcome!");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinate 1: ");
        String coord1 = input.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2, coord1.length() - 1));

        System.out.println("Enter coordinate 2: ");
        String coord2 = input.nextLine();
        int x2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",") + 2, coord1.length() - 1));

        LinearEquation equation = new LinearEquation(x1,y1,x2,y2);
    }
}
