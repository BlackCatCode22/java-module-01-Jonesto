import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);


        int unicodeValue = (int) character;


        String type;
        if (Character.isLetter(character)) {
            type = "Letter";
        } else if (Character.isDigit(character)) {
            type = "Digit";
        } else {
            type = "Special Character";
        }


        System.out.println("Unicode Value: " + unicodeValue);
        System.out.println("Type: " + type);


        scanner.close();
    }
}
