## P-Class Problems
A "P-Class" problem is a problem that is solvable in polynomial time. 

Sorting can be in O(nlogn) or O(n+k) time, single-source SP can be in terms of edges and vertices, etc. 

Even if it takes a while, say O(2^n) it's *still* polynomial time.

Some problems take a long while to solve. You may be able to brute force them or check if the solution is correct quite quickly, but actually coming up with a real solution isn't really feasible.

These ones that we don't quite know (yet?) are called

## NP-Class Problems
NP standing for Nondeterministic Polynomial.

They are still polynomial time, but you don't *know* what the solution is. 

You can think of all problems being NP, but P-class problems are a subset that we know. As we learn solutions to new problems, problems move into the P subset. 

## NP Complete and Reductions
This moving is called reduction. You can think of this relationship between P and NP being:

If we know a way to take a problem we don't know the solution of and transform it into a problem we do know the solution of and apply that algorithm, turning it into a solvable NP problem.

This process moves us to NP Complete Problems. NP Complete problems are NP and every other problem in NP can be reduced to this problem. 

Most NP problems are NP-complete, but we haven't really figured out how to reduce an NP problem to a P problem.

## Breaking down the sets
Think of the set of all problemss as a big NP set. There is a large subset of these that are NP complete, as well as a separate subset which are P. 

If we were to prove that the set of all problems that are P are also NP, then P = NP, and thus all problems are NP-complete.

This would mean that any current problem would be able to be converted into a problem we already have the solution for, we can do things like crack encryption easily or prove previously unsolvable theorems (as long as these algorithms are practical in terms of time complexity).
