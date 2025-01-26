import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();


        System.out.println("Hello, " + name + "! It's nice to meet you.");


        scanner.close();
    }
}
