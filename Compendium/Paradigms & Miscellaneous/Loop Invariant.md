# Intuitroduction
It might be helpful to imagine an algorithm as a *process*. Sort of as a function in math, if that tickles your fancy. You put something in, something happens inside, and you get something outside of it. The function tells you what will happen to your input and so you can then reliably know what inputs will lead to what outputs.

Algorithms are sorta functions that happen again and again until you get a desired output. 

# Loop Invariant
A loop invariant is a condition that is true at the beginning and end of every iteration of a loop.

I like to think of this as the algoritm needing the data to be in a certain configuration for the algorithm to modify it properly, so this order can be messed up within the loop but it must be returned to form by the end.

For example, a sorting algorithm like insertion sort has the loop invariant: at the start of each iteration, the subarray A[0, i - 1] i sorted. 

This speaks to the consistency of algorithm, and being able to prove a loop invariant allows you to generalize what an algorithm does, allowing you to prove its correctness. 

If you can prove insertion sort follows that loop invariant, then you can prove that for any arbitrary i, it will be sorted, and so as long as i increases, it will sort. 

## Proofs by induction refresher
Hopefully MATH 42 is coming back to you when I say that. If not, let me give you a quick rundown on the intuition for induction.

Imagine you want to prove to someone you could climb any ladder of unspecified length. Essentially, that you were able to climb every ladder, no matter how long! You don't have to climb a bunch of ladders to prove this (and after all, it's possible there exists a ladder you cannot climb but simply didn't show). 

A foolproof way to prove this is by induction! Imagine you could prove you could climb the first rung (thus moving from the "grounded" state to the "ladder" state), and then prove for any arbitrary rung (rung i), you could move to the next rung (rung i + 1). If you do this, you could prove you can climb a 2 rung ladder, a 10 rung ladder, or a practically infinite ladder!

This is because all rungs are created equal. Moving from rung 1 to rung 2 is the exact same process as moving from rung 914832 to 914833, and so on. So if you could prove you could move from one rung to the next independent of any specific factors regarding the rung itself (like it being extra slippery), or simply prove that they're all identical, you can prove you can climb any sized ladder.

Of course, common sense says that you'd die of starvation or thirst, if not exhaustion, but in our magical algorithm land we don't have to worry about factors like this because they don't exist. The algorithm hides nothing, the machine is immortal, even in death I serve the Omnissiah, so on and so forth. 
