package homeWork2104;
import java.util.Scanner;

public class NumberParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to a number: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);

            System.out.println("Success! The converted number is: " + number);
        } catch (ArithmeticException e) {
            System.out.println("Error: '" + input + "' is not a valid integer.");
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
