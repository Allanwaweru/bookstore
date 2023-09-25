import java.util.Scanner;

public class GetCreative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer input and manipulation
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        int intResult = intValue * 2;
        System.out.println("You entered: " + intValue);
        System.out.println("Doubled value: " + intResult);

        // Floating-point input and manipulation
        System.out.print("Enter a floating-point number: ");
        double doubleValue = scanner.nextDouble();
        double doubleResult = doubleValue / 2;
        System.out.println("You entered: " + doubleValue);
        System.out.println("Half of the value: " + doubleResult);

        // Character input and manipulation
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        char charResult = (char) (charValue + 1);
        System.out.println("You entered: " + charValue);
        System.out.println("Next character: " + charResult);

        // Boolean input and manipulation
        System.out.print("Enter a boolean (true or false): ");
        boolean boolValue = scanner.nextBoolean();
        boolean boolResult = !boolValue;
        System.out.println("You entered: " + boolValue);
        System.out.println("Negation: " + boolResult);

        // String input and manipulation
        System.out.print("Enter a string: ");
        String stringValue = scanner.next();
        String stringResult = stringValue.toUpperCase();
        System.out.println("You entered: " + stringValue);
        System.out.println("Uppercase: " + stringResult);


        scanner.close();
    }
}
