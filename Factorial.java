public class Factorial {
    // Question: Write a recursive method to calculate the factorial of a given number.
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorial (number));
    }
}
