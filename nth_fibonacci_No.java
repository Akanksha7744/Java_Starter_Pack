import java.util.*;

public class nth_fibonacci_No {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            // Recursively calculate Fibonacci numbers
            int num1 = fib(n - 1);
            int num2 = fib(n - 2);
            return num1 + num2;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + ": " + fib(n));
    }
}
