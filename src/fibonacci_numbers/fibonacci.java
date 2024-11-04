package fibonacci_numbers;

public class fibonacci {
    public int fib(int n) {
        // SOLUTION 1

//        int[] fib = new int[n + 1];
//        fib[0] = 0;
//        fib[1] = 1;
//        for (int i = 2; i < n + 1; i++) {
//            fib[i] = fib[i - 1] + fib[i - 2];
//        }
//        return fib[n];


        // SOLUTION 2

//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        return fib(n - 1) + fib(n - 2);


        // solution 3
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int a = 0, b = 1, c = 1;
        for (int i = 0; i <= n - 3; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}
