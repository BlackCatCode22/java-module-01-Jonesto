public class VarsAndMath {
    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 35;
        double pi = 3.14159;
        boolean isJavaFun = true;


        int sum = num1 + num2;
        int difference = num2 - num1;
        int product = num1 * num2;
        double division = (double) num2 / num1; 


        String message = "Is learning Java fun? " + isJavaFun;
        String arithmeticResults = "Sum: " + sum + ", Difference: " + difference +
                ", Product: " + product + ", Division: " + division;


        System.out.println("Hello, Java!");
        System.out.println("Value of pi: " + pi);
        System.out.println(message);
        System.out.println(arithmeticResults);
    }
}
