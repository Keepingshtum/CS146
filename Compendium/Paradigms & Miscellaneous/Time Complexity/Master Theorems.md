Master's Theorem can be used to derive the asymptotic recurrence relation of an algorithm. The theorem takes the form of:
T(n) = aT(n/b) + f(n).
Note:
  * a >= 1 is the number of subproblems
  * b > 1 is the amount of times the subproblems are divided
  * f(n) is the cost of running the algorithm outside of recursion

There are three cases to apply the master's theorem to, they are listed as follows:

Case 1: 
If f(n) = O(n^c) where c < log_b a:
  * The solution is T(n) = theta(n^log_b a)

Case 2:
If f(n) = theta(n^log_b a):
  * The solution is T(n) = theta(n^log_b a logn).

Case 3:
If f(n) = Ω(n^c) where c > log_b a, and a*f(n/b) <= k*f(n) for k < 1:
  * The solution is T(n) = theta(f(n)).


