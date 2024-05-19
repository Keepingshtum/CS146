## Intuitroduction
A lot of times we solve problems that will end up solving the same subproblem multiple times. These are called overlapping subproblems.

For example, when we do the fibonacci sequence recursively, we end up calculating the fibonacci of 1 and 2, etc. 

This ends up taking way more time than we need, as the standard fibo recursion solution is of O(2^n) time.

What we can try to do is solve these subproblems once, store the answers, and retrieve them later in order to speed up computation. This will create faster algorithms, but may take up more space.

## Memoization 
When we're solving the fibonacci of n = 10, for example, we could store the result of fibonacci of n = 1 the first time we do it, then later when we call it we instead just retrieve it from an array or other data structure instead of calculating it. 

This means that we don't have to manually solve fibonacci of n = 4 a bunch of times when we're solving fibonacci of n = 10. We can just retrieve it in O(1) time. 

This storing of answers the first time we solve them and retrieving them instead of solving them later is called *memoization*.

This is more of a "top down" approach, solving it as normal but just storing past answers to grab later. Often you memoize by retrofitting simpler algorithms that end up repeating work needlessly.

## Tabulation
This may sound similar to memoization but bear with we here. 

Instead of solving fibonacci and storing answers as we solve them the first time, we instead solve it bottom up. If we want to solve fibonacci of n = 10, we first solve fibonacci of n = 0, then n = 1, then n = 2, etc, and we slowly put it together. 

This is more of a "bottom up" approach, solving simpler parts of the problem first so we can build up to an optimal solution (although we may end up doing some unecessary work). These are often built from the ground up, and require more forethough about the structure of the problem compared to the "oh just save a past answer" approach of memoization. It's more intentional and structured.

## Final notes

Tabulation is a little harder to code and can end up doing wasted calculations, but it creates a solid substructure to find the optimal solution.

In addition, DP relies on "optimal substructure". This essentially assumes that the most optimal solution is created by optimal sub-solutions, and thus we can find our optimal solution by splitting our problem into optimal sub-problems. 

I like to think of DP problems as ones that require you to remember past answers to go back to them, like a branching tree of choices. 

We store past answers in order to easily go back to them rather than brute forcing all combinations until we find a good one.
