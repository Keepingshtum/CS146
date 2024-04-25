class Week3:
    def fibonacci(self, n):   # Define the fibonacci function
        if n <= 1:           # Base case
            return n
        a, b = 0, 1          # Initialize a, b
        for _ in range(2, n + 1):  # Loop from 2 to n
            a, b = b, a + b   # Update a, b
        return b             # Return nth Fibonacci

# Time complexity is O(N)
