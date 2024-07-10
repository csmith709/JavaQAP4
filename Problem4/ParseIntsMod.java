package Problem4;
import java.util.Scanner;

public class ParseIntsMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line with mixed integers and other values: ");
        String line = scanner.nextLine();

        // Create a scanner to parse the input line
        Scanner lineScanner = new Scanner(line);

        int sum = 0;

        while (lineScanner.hasNext()) {
            try {
                int num = Integer.parseInt(lineScanner.next());
                sum += num;
            } catch (NumberFormatException e) {
                // Skip non-integer tokens silently
            }
        }

        // Close scanners
        lineScanner.close();
        scanner.close();

        // Output the sum
        System.out.println("The sum of input is: " + sum);
    }
}

