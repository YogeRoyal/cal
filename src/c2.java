import java.util.Scanner;

public class c2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Input operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Input second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform calculation based on operator
            double result = calculate(num1, operator, num2);

            // Display the result
            if (Double.isNaN(result)) {
                System.out.println("Error: Invalid operator or division by zero");
            } else {
                System.out.println("Result: " + result);
            }

            // Close the scanner
            scanner.close();
        }

        // Method to perform calculation
        private static double calculate(double num1, char operator, double num2) {
            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        return Double.NaN; // Indicates an error (NaN stands for "Not a Number")
                    }
                default:
                    return Double.NaN; // Indicates an error
            }
        }
}

