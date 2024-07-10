package Problem4;
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter integers separated by spaces: ");
        String line = scanner.nextLine();
        // Create a new scanner to parse the input line
        Scanner lineScanner = new Scanner(line);

        int sum = 0;

        while (lineScanner.hasNext()) {
            try {
                int num = Integer.parseInt(lineScanner.next());
                sum += num;
            } catch (NumberFormatException e) {
                // Skip non-integers
            }
        }

        // Close the scanners
        lineScanner.close();
        scanner.close();

        // Output the sum
        System.out.println("The sum of the integers on the line is: " + sum);
    }
}
