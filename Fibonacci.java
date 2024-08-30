public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b);

        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
