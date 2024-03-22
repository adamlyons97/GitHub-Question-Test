import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, base, area;

        System.out.print("Base: "); // Prompt for base
        base = input.nextDouble();

        System.out.print("Height: "); // Prompt for height
        height = input.nextDouble();

        area = 0.5 * base * height; // Calculate area

        System.out.println("Area is: " + area);

        input.close(); // Close the scanner
    }
}
