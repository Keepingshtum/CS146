# Disclaimer
This is best read after you have a solid understanding of recurrence relations and time complexity. If you're not sure you do, consider reading those first. They should both be in this folder.

# Intuitroduction
These are essentially two sets of formulas to quickly calculate the time complexities of algorithms when it may not be completely clear.

The difficulty is usually just figuring out how to translate an algorithm into the T(N) configuration. Once you go from code -> formula, it's pretty easy to spit out the time complexity. 

# Master Theorem for 'decreasing functions'
This is for T(N) = a * T(N - b) + f(n). Essentially this is a function T(N) decreasing by b each pass-over with some other modulations shown here: 
- a, b > 0, f(n) = O(N^k) and k >= 0
If so, we collapse into 3 possibilities. If:
1. a < 1, then T(n) = O(n^k) or O(f(n)) (essentially, the a makes the T(N - b) too small and we default to f(n) as the largest function)
2. a = 1, then T(n) = O(n^(k+1)) or O(n * f(n))
3. a > 1, then T(n) = O(n^k * a^(n/b))
Don't ask me to explain the last two. My last name isn't Taylor. Or Gretsky for that matter...

# Master Theorem for Divide and Conquer algorithms
This is for a T(N) = a * T(N / b) + f(n) where a >= 1 and b > 1. When these conditions are fulfilled, we collapse into 3 situations: 
1. If f(n) = O(n^(logb(a) - e)) where e > 0, then T(n) = Θ(n^(logb(a)))
2. If f(n) = Θ(n^(logb(a)) * log^k(n)) where k >= 0, then T(n) = Θ(n^(logb(a)) * log^(k + 1)n)
3. If f(n) = Ω(n^(logb(a) + e)) where e > 0, then T(n) = Θ
With an addl condition for case 3: a * f(n / b) <= c * f(n), c > 1, n > n0

Again, I'm not really sure how to explain this. The contrast of case 1 and case 3 and how it affects the final answer is an excercise left to the reader to complete. Case 2 is left as an enigma for the reader to mull over. 

This might be a knowledge check on a coding interview, but otherwise is quite useless (esp since it's not going to be on the final for our final). 
