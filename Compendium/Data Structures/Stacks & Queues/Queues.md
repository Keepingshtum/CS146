# Queue Abstract
Queues are a linear data structure that store items in a liner First In First Out (FIFO) manner. This means that the most recently added item is removed last, and the oldest item is removed first. 

It emulates, say, a line to checkout at the grocery store. You join the back of the line and wait until it's your turn. 

# Time Complexity of Basic Operations
Enqueue: O(1) time and space

Dequeue: O(1) time and space

Peek: O(1) time and space

Since this isn't a indexed data structure, you can't access an arbitrary element or the size of the queue at O(1). These will usually be O(n) operations. 

# Java Implementation
Instantiate Queue: Queues are an interface, so you must instantiate it through something else. Usually a LinkedList or ArrayDeque. Don't forget to import java.util
Ex: Queue<Integer> queue = new LinkedList<>();

Add to queue: offer() inserts if possible, returns a boolean reflecting whether it was able to or not. add() does the same but throws an exception if no space available. Advised to use offer() unless you know what you're doing.

Remove queue head: poll() removes something if possible, returns a boolean reflecting whether or not it was able to. Remove() will do the same but throws an exception if no space available. As above, advised to use poll().

Peek queue head: peek() retrieves the front of queue or returns null if none is available. element() does the same but throws an exception if none available.

This also inherits some Collection methods, like clear(), contains(), equals(), size(), isEmpty(), toArray(), etc.

# Python Implementation
A queue can be implemented a few ways, examples are as follows: 
1. List: queue = []
   - Your methods are append() to queue and pop() to dequeue
2. import deque from collections: q = deque()
   - Your methods are append() to queue and popleft() to dequeue
3. import Queue from queue:
   - Your methods are put() to queue and get() to dequeue.
If memory serves me right, these are all compatible with methods such as empty(), full(), etc.
