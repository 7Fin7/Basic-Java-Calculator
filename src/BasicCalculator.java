import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("*** Basic Java Calculator ***");
        System.out.println("*****************************\n");

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int operation = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter first number: ");
            double num1 = Double.valueOf(scanner.nextLine());

            System.out.println("Enter second number: ");
            double num2 = Double.valueOf(scanner.nextLine());

            double result = switch (operation) {
                case 1 -> addNumbers(num1, num2);
                case 2 -> subtractNumbers(num1, num2);
                case 3 -> multiplyNumbers(num1, num2);
                case 4 -> divideNumbers(num1, num2);
                default -> {
                    System.out.println("Invalid input");
                    yield 0.0;
                }
            };

            System.out.println("Result: " + result + "\n");

            System.out.println("Do you want to perform another calculation?");
            System.out.println("yes/no");

            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the calculator!");
                break;
            } else if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Invalid input: ending program");
            }
        }
    }

    public static double addNumbers(double num1,double num2) {
        return num1 + num2;
    }

    public static double subtractNumbers(double num1,double num2) {
        return num1 - num2;
    }

    public static double multiplyNumbers(double num1,double num2) {
        return num1 * num2;
    }

    public static double divideNumbers(double num1,double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by 0");
            return 0.0;
        } else {
            return num1 / num2;
        }
    }
}
