package Problem3;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] count = new int[26];
        Scanner scanner = new Scanner(System.in);


        //get word
        System.out.print("Enter a single word (letters only): ");
        String word = scanner.nextLine();

        //covert to upper case
        word = word.toUpperCase();

        //count frequency of each letter
        for (int i=0; i<word.length(); i++) {
            try {
                count[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                //check for invalid characters
                char invalidChar = word.charAt(i);
                System.out.println("Invalid character: " + invalidChar);
            }
        }
        //print
        System.out.println();
        for (int i=0; i<count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char)('A' + i) + ": " + count[i]);
            }
        }
    }
}
