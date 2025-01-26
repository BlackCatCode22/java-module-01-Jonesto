import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scanner.next();

        System.out.print("Enter a verb: ");
        String verb = scanner.next();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.next();

        System.out.print("Enter a place: ");
        String place = scanner.next();

        System.out.print("Enter a food: ");
        String food = scanner.next();

        String story = "One day, I went to " + place + " and saw a very " + adjective +" " + noun + ". It was trying to " +
                 verb + " while eating " + food + "! I couldn’t believe my eyes, so I took a picture and shared it with my friends. ";

        System.out.println("Here is your Mad Libs story:");
        System.out.println(story);

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
