package Problem4;
import java.util.Scanner;
import java.util.HashMap;

public class ParseIntsAlternate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line with mixed integers and other values: ");
        String line = scanner.nextLine();

        // Create a scanner to parse the input line
        Scanner lineScanner = new Scanner(line);

        //Hashmap to store counts of different items
        HashMap<String, Integer> counts = new HashMap<>();

        while (lineScanner.hasNext()) {
            try {
                int num = Integer.parseInt(lineScanner.next());
                //check item token
                if (lineScanner.hasNext()) {
                    String item = lineScanner.next().toLowerCase();
                    counts.put(item, counts.getOrDefault(item, 0) + num);
                }
            } catch (NumberFormatException e){
                // Skip non-integer tokens silently
                lineScanner.next();
            }
        }

        //close scanners
        lineScanner.close();
        scanner.close();

        // Output the counts
        System.out.print("The line contains: ");
        boolean first = true;
        for (String key : counts.keySet()) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(counts.get(key) + " " + key);
            first = false;
        }
        System.out.println(".");
    }
}
