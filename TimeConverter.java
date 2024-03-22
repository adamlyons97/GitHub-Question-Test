import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + hours + " hours and " + minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}
