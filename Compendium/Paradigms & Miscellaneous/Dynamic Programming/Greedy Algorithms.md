# Disclaimer
This is building off the idea of Dynamic Programming. It is generally advised to go over that file first if you're not sure you're comfortable with the concept of DP problems.

# Intuitroduction
Say we had US denomination coins (1c, 5c, 10c, 25c, 50c, $1), and wanted to make change for 40c with as few coins as possible. 

We could do this with a 25c coin, a 10c coin, and a 5c coin. While this may seem second nature to you, your brain is actually performing a greedy algorithm approach!

We pick the largest coin value that isn't bigger than the amount we have left to make up until we're left with no coins!

The cool thing is that US coin denominations allow this approach to work every time, so we don't have to think too hard!

Off-track, but big shoutouts to the bookstore cashier in Sunshine City in Ikebukuro, Tokyo who took my fistful of coins from me and turned them into perfect denominations so I didn't need to lug around a bunch of small coins. I don't think I ever hit an arigatogozaimasu + slight bow combo so hard before then or ever since.

Back on track, lets imagine a slight modification to this problem. Imagine we could no longer use the 5c coin!

Now, in order to make 40c with our current method, we'd choose a 25c coin, followed by a 10c coin, followed by 5 1c coins. This is 7 coins!

If we took a less direct approach, we could do 4 10c coins, thus giving us 4 coins total instead of 25. 

Therein lies the caveat of the greedy approach! Choosing the largest denomination each each step ends up not being the most optimal solution. Instead, the optimal solution relies in taking steps that aren't obviously optimal at first. 

# Greedy Approach
The greedy approach seeks to reach an optimal solution through optimally solving a subproblem. However, in many cases, the optimal subsolution will not optimally solve the problem. 

Do note that a greedy approach should still reach *a* solution, it just may not be optimal! 

Imagine a pathfinding algorithm for a robot that works on choosing whichever direction gets you closest to your destination. This may work well at first, but once you reach an obstacle between the robot and the destination, you'll have to take a weird route hugging the obstacle until you pass it instead of the optimal solution of thinking ahead a little and not bumping into it. 

# Greedy Proofs
The tradeoff with greedy algorithms is that while they are *very* easy to implement, they are *very* hard to prove correct. 

As with the robot and coin example, there are tons of things that can go wrong, so you must be very careful with how you prove it. This ain't you momma's loop invariant! 

There are essentially two ways to prove a greedy algorithm: 
1. Bottom-up: Prove that optimal solutions to subproblems lead to optimal solutions of the total problem
2. Top-down: Prove that the optimal solution will always be reached by a greedy algorithm
