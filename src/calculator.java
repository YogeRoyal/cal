import java.util.Scanner;

public class calculator {
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
        double result = 0;

        if (operator == '+')
        {
            result = num1 + num2;
        }
         else if (operator == '-')
         {
             result = num1 - num2;
         }
         else if (operator == '*')
         {
             result = num1 * num2;
        }
         else if (operator == '/')
         {
              if (num2 != 0)
              {
                result = num1 / num2;
        }
              else
              {
            System.out.println("Error: Cannot divide by zero");
            // Exit the program
            System.exit(1);
        }
    }
         else
         {
        System.out.println("Error: Invalid operator");
        // Exit the program
             // java system exit() method takes status code as an argument if status(-1)
             //then it  indicates unsuccessful termination
        System.exit(1);
    }

    // Display the result
        System.out.println("Result: " + result);

    // Close the scanner
        scanner.close();
}

    }

