package basics;

public class FibonnaciApp {
    public static void main(String[] args) {
        // Fibonacci number is defined by the sum of the 2 previous Fibonacci numbers
        // Fibonacci number sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = fib(1) + fib(0) = 1 + 0 = 1
        // fib(3) = fib(2) + fib(1) = 1 + 1 = 2
        // fib(4) = fib(3) + fib(2) = 2 + 1 = 3
        // fib(5) = fib(4) + fib(3) = 3 + 2 = 5
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }
}
