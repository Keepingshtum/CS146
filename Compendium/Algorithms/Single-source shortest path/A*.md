### **[This assumes you understand the Single-source shortest path problem and have a general understanding of Dijkstra's algorithm!! If you do not have these then please visit the compendium file regarding Dijkstra's in order to gain the necessary prerequisite understanding.]**

#### Intuition:
**Dijkstra's** relies on constant edge weights. 

What if edge weights aren't necessarily so cut and dry? 

Suppose you are trying to find the fastest way (as opposed to shortest distance) to get from your home to your university. 

You might now have to rely on calculations such as traffic, which can change based on time and even in real-time because of events such as crashes!

What to do? Use **A***!

#### A* Intution:
Add a **heuristic function** to edge weights in order to augment them to better fit the situation.
This essentially is a modification (general case) of Dijkstra's:
1. Acquire (calculate/approximate) heuristic
2. Do Dijktra's with heuristic applied to weights

#### Types of heuristics commonly used for A*:
1. Euclidean distance (direct distance between them)
2. Manhattan distance (sum of differences of x and y coordinates)
3. Arbitrary coin flip
4. Traffic on a road


- Heuristics are inefficient to compute and store, so they are often approximated
