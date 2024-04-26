import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            System.exit(1);
        }

        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    public static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }
}
