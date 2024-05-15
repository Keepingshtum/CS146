# Stack Abstract
A stack is a last in, first out (LIFO) data structure. This essentially means that when you pop an element, you're taking the most recently added element.

Think of this as a stack of papers. It's a little cumbersome to take papers from the bottom of the stack, so you'll just take them off the top and do whatever you want with them (and maybe place down new ones).

# Time Complexity of Basic Operations
Push: O(1) time and space

Pop: O(1) time and space

Peek: O(1) time and space

# Java Implementation
Instantiate Stack: You can implement a stack directly if you import java.util
Ex: Stack<Integer> stack = new Stack<>();

Add to stack: push(). 

Remove and retrieve top of stack: pop()

Peek stack head: peek() to retrieve the top of the stack but doesn't remove

Is empty: empty()

Search for where an object is: search(Object o). Will return a *1-indexed* (as opposed to 0-indexed position in structs like arrays) distance of the item closest to the top. Topmost item is at distance 1. 

This inherits a bunch of methods from the Vector class and you are free to look at the full list, but it's helpful to know that it has clear(), contains(), equals(), and toArray()

# Python Implementation
Stack functions are as follows: 
- empty(): returns if stack is empty
- size(): returns size of a stack
- top()/peek(): retrieves but does not remove top of stack
- push(x): inserts x on top of stack
- pop(): retrieves and removes top of stack

Implemented most easily through a list and just using the stack-specific methods. 
