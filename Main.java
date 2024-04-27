import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Quit");
            System.out.print("Choose an operation: ");

            // Get user choice
            int choice = scanner.nextInt();

            // Perform the chosen operation
            switch (choice) {
                case 1:
                    doAddition(scanner);
                    break;
                case 2:
                    doSubtraction(scanner);
                    break;
                case 3:
                    doMultiplication(scanner);
                    break;
                case 4:
                    doDivision(scanner);
                    break;
                case 5:
                    doSquareRoot(scanner);
                    break;
                case 6:
                    doExponentiation(scanner);
                    break;
                case 7:
                    System.out.println("Exiting the calculator.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void doAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void doSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void doMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void doDivision(Scanner scanner) {
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Division by zero");
        } else {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }
    }

    private static void doSquareRoot(Scanner scanner) {
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number");
        } else {
            double result = Math.sqrt(number);
            System.out.println("Result: " + result);
        }
    }

    private static void doExponentiation(Scanner scanner) {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
}
