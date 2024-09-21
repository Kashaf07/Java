import java.util.Scanner;

//input 2 numbers and display arithmetic calculation as manu driven program
public class ArithmeticMenu
 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1, num2, choice;
            double result;
            // Iput two numbers
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
            // Display menu
            do {
                System.out.println("\nChoose an arithmetic operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1: // Addition
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2: // Subtraction
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3: // Multiplication
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4: // Division
                        if (num2 != 0) {
                            result = (double) num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 5: // Exit
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } while (choice != 5);
        }
    }
}