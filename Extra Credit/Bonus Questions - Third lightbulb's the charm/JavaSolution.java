public class JavaSolution {
    public static int fibonacci(int n) { // define fibonacci function
        if (n <= 1) { // base case
            return n;
        }
        int a = 0, b = 1; // initialize a, b
        for (int i = 2; i <= n; i++) { // loop from 2 to n
            int temp = a + b;
            a = b; // update a, b
            b = temp;
        }
        return b; // return nth Fibonacci
    }

    public static void main(String[] args) {
        int n = 5; // its gonna comopute the 5th fib #
        System.out.println(n + " is " + fibonacci(n));
    }
}

// time compexlity is 0(N)