# Asymptotic Notation

## Intuitroduction
Different functions grow at different rates. 

We want to know how fast our functions grow in relation to certain inputs (such as the length of array in a sorting function).

Asymptotic notation gives us a model to use in order to compare the growth of two different functions in order to judge their behavior at large input numbers so that we may make wiser choices. 

## O()
- Big-O represents the upper bound of an algorithm's running time.
The proof in plaintext goes as follows:
The function f(n) = O(g(n)) if
- There exists constants c and n0 such that f(n) <= c*g(n) for all n >= n0
- (Usually for n >= 1)

This proof sounds complex but essentially it's saying that if we have a function f(n) that is equivalent to, say, 2n, 
g(n) must be a function where it can be greater than f(n) when multiplied by a certain constant. Essentially, the functions must be of the same order. 

If f(n) = 2n, g(n) is able to equal n, This is because if we multiply g(n) by constant 3, it will be greater than f(n) under our conditions of n >= 1. 

We do this in order to clean a function. If f(n) is the actual function and it's something like 4n^2 + 14n + 30, that's too messy to deal with. If we just say g(n) = n^2 then we can say that it fulfills the definition nicely (since at high values of n, something like 5n^2 will be greater than that big messy function anyways). 

In the end, n^2 is going to dominate the function anyways at high numbers so we're good to drop the 14n + 30. We really care about the growth of a function for very high values of n anyways (since that's when the difference between, say, n^2 and n * log n becomes important)

O(n) only represents this upper border, however, so for the previous example of 4n^2 + 14n + 30, we could realistically use n^3, n^4, n!, etc. We prefer not to, however, as we'd rather be as precise as possible. While it's technically *correct* that a function equal to 3n and a function equal to n^4 + 3n^2 both can have a O(n) = n!, it isn't necessarily *helpful*, since you can obviously narrow it down a little more to compare them more effectively.

## Ω()
- This is sorta the opposite of O(n)
- Big-Ω represents the lower bound of an algorithm's running time
- The proof goes as follows:
- The function f(n) = Ω(g(n)) if:
- There exists constants c and n0 such that c*g(n) <= f(n) for all n >= n0

This essentially is the same proof as O(n) except your new g(n) function must be possibly *less* than your f(n) depending on your constant c. 

If you have a function f(n) = 4n + 13, your g(n) could be n, since there exists a constant c you could multiply to n that would make it less than 4n + 13 (say, 1 or 2 or 3, or even a fraction!). 

Do note that for small numbers of n in some examples, this may not be true, but it would still be a correct way to represent f(n).

The point is that asymptotic notation really only kicks in for high numbers. 

As with O(), we could technically use a very conservative estimate and say that f(n) = 4n + 13 could be represented by Ω(1). This, again, would be technically not wrong! But, again, is not very helpful, since obviously there is an Ω(n) right there that represents it far better. 

An important question may have popped up in your mind! "Won't our notations be the same for Ω() and O() sometimes?"

An important answer is- yes! For our last example, 4n + 13 could be represented by O(n) *and* Ω(n). Since something like 5n > 4n + 13 is true for high values of n, and 3n < 4n + 13 for high values of n, our proof is fulfilled. 

So is there something greater we can do for functions where O() = Ω()? Yes!

## Θ()
- We'll run through the formal definition quick since you probably got the gist already:
- The function f(n) = Θ(g(n)) if:
- There exists constans c1, c2, and n0 such that c1 * g(n) <= f(n) <= c2 * g(n) for all n >= n0

Essentially the name of the game is to synthesize a function to represent f(n) that you can modulate with values c1 and c2 such that it can be lesser and greater than f(n). 

Take the example f(n) = 3n * log(4n) + 14. For large values of n, g(n) = n could work since log(n) increases at a slower rate than n so we can lop that off, then we could reason that if c1 = 1 and c2 = 10, then 1n <= 3n * log(4n) + 14 < 10n. 

Since our base function g(n) is still n, they are identical and of the same order when you boil it down. 

This is effectively the same as saying that if O() and Ω() both exist and are equivalent, then Θ() exists and is equal to them. For our above example, our reasoning can be essentially boiled down to the fact that we have created a function O(n) which has c2 = 10 and Ω(n) which has c1 = 1, and since they are both of g(n) = n, our Θ() is Θ(n)!

We prefer to use Θ() if possible since it is a very precise way to nail down a functions time. Imagine we had a function with time complexities O(n!) and Ω(n^2)! At large values of n, these are *very* different functions, so it's very hard to pinpoint its behavior (and thus compare it to other functions). 

In addition, a function with O(n^2) could possibly be ALSO represented as O(n) or even O(log(n)) if your function is in reality lesser than all of them! You don't know, since O(n^2) is *technically correct* to express a function that could also be expressed as O(1) (since it's an upper boundary). 

When you get a Θ(n * log(n)), that is *insurance* that your function is of order nlog(n). No larger (such as n^2), no smaller (such as n), otherwise the proof wouldn't work. 


## Best, worst, and average case
This is a more function-specific way of describing the behavior a function depending on what it actually does. 

Say we have a linear search method. Imagine the *best case* scenario of a linear search. You find the element on the first try!

What about the *worst* case? Well, since it's linear search, you'd go through the entire array and only find what you're looking for on the final try. 

The average case would most likely be somewhere in the middle. 

Well, now this is weird! The best case scales differently than the worst and average cases. While the best case would be the same (1 try) for an array of length 10 versus an array of length 10000, it wouldn't quite be the same for average or worst. Worst case would be 10 for an array of length 10, and 10000 for an array of length 10000. The average case would be 5 and 5000 respectively.

So they scale differently! In this case, we can express their time complexities differently! For the best case, we have O(1) = Ω(1), therefore, we have Θ(1). 

For the worst case, we can quite easily see that f(n) = n, so O(n) = Ω(n), therefore, we have Θ(n). 

The average case is a little more complicated. We could approximate this as f(n) = 1/2 * n. However, since c can be a fraction or a whole number, we can *still* have O(n) and Ω(n), therefore, we have Θ(n) as well. 

Even though average and worst cases will have markedly different times in practice, they are of the same order and scale in similar ways in relation to n, so our time complexities will be the same! Nobody ever said time complexity was perfect :P

Thus, we can have up to *9* time complexities to express one function. The O(), Ω(), and Θ() for the best, worst, and average case. Usually, however, this doesn't happen, since if we have a Θ() for a function we really dont need the O() or Ω() since it's kinda implied. 

## Final notes
Do note that we don't necessarily need to only deal in one variable or just with variable n. For example, many graph problems have time complexities that deal with the number of vertices and edges rather than the size of an array. 

In this situation, you may have time complexities that look a lot more like "O(E * log(E) + V * log(V)), where E and V denote the # of edges and vertices respectively. 
