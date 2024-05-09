class PythonSolution:
    def fibonacci(n):   # define the fibonacci function
     if n <= 1:      # base case
        return n
        a, b = 0, 1     # initialize a, b
    for _ in range(2, n + 1):  # loop from 2 to n
        a, b = b, a + b  # update a, b
     return b        # return nth Fibonacci


#time compexlity is 0(N)