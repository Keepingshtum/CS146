
// Using memoization (Dynamic Programming)
def fibonacci(n):
    arr = [0] * (n + 1)  # Initialize memoization array
    return fib(arr, n)

def fib(arr, n):
    if n <= 1:
        return n
    if arr[n] != 0:
        return arr[n]
    arr[n] = fib(arr, n - 1) + fib(arr, n - 2)  # Store result in memoization array
    return arr[n]

n = 25
print(f"{n} is {fibonacci(n)}")

#Time complexirty is O(n)
