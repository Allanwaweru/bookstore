import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt the user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        //difference between the two numbers
        int difference = Math.abs(num1 - num2);

        // Check if the difference is less than 200
        if (difference < 200) {
            System.out.println("Difference is less than 200");
            return;
        }

        // initializing variables for summing
        int evenBy4Sum = 0;
        int evenBy8Sum = 0;
        int notEvenNotDivBy5Sum = 0;

        // using a for loop to sum up numbers
        for (int i = num1; i <= num2; i++) {
            switch (i % 2) {
                case 0: // Even number
                    if (i % 4 == 0) {
                        evenBy4Sum += i;
                    }
                    if (i % 8 == 0) {
                        evenBy8Sum += i;
                    }
                    break;
                case 1: // Odd number
                    if (i % 5 != 0) {
                        notEvenNotDivBy5Sum += i;
                    }
                    break;
            }
        }

        // Using a while loop to display sums
        int iteration = 1;
        while (iteration <= 3) {
            switch (iteration) {
                case 1:
                    System.out.println("Sum of even numbers divisible by 4: " + evenBy4Sum);
                    break;
                case 2:
                    System.out.println("Sum of even numbers divisible by 8: " + evenBy8Sum);
                    break;
                case 3:
                    System.out.println("Sum of not even numbers not divisible by 5: " + notEvenNotDivBy5Sum);
                    break;
            }
            iteration++;
        }

        //do-while loop
        do {
            scanner.close();
        } while (false);
    }
}
