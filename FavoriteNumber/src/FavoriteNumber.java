import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your favorite number: ");


        int favoriteNumber = scanner.nextInt();


        System.out.println("Your favorite number is: " + favoriteNumber);
        System.out.println("That's a great choice! We hope you have a wonderful day!");


        scanner.close();
    }
}
