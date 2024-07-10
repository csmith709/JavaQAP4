package Problem4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParteIntsPet {
    public static void main(String[] args){
        //get inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter counts of cats and dogs (ex: 1cat, 2dog):");
        String input = scanner.nextLine();

        //count cats and dogs
        int totalCats = countAnimals(input, "cat");
        int totalDogs = countAnimals(input, "dog");

        //show results
        System.out.println("I have " + totalCats + " cats and " + totalDogs + " dogs.");

        scanner.close();
    }

    public static int countAnimals(String input, String animal){
        //create pattern
        int totalCount = 0;
        Pattern pattern = Pattern.compile("(\\d+)" + animal);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            String countStr = matcher.group(1);
            int count = Integer.parseInt(countStr);
            totalCount += count;
        }

        return totalCount;
    }
}
