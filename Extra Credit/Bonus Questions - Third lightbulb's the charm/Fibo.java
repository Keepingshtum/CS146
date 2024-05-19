// Enhanced Approach Using Memoization (Dynamic Programming).
// We can enhance the code by using memoization, which avoids recalculating Fibonacci numbers by storing the already computed values in an array.
// This approach is particularly beneficial for large values of n, improving the efficiency of the algorithm.
// The Time Complexity of this approach will be O(n).




public class Fibo {
    private static int fib(int[] arr, int n) {
        if (n <= 1) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = fib(arr, n - 1) + fib(arr, n - 2); // store result in memoization array
        return arr[n];
    }

    public static int fibonacci(int n) {
        int[] arr = new int[n + 1]; // initialize memoization array
        return fib(arr, n);
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(n + " is " + fibonacci(n));
    }
}
