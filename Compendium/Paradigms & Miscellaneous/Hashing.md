Hashing is the process of converting data into a (USUALLY) fixed length output. The most recognizable implementation is in data structures such as Hashmaps and Hashsets. 

Data is converted into **hash values** (or a **digest**) with a **hash function**. 

The most basic example of a hash function is the modulo function, can be as simple as num % k.
If you want 100 keys, you would simply set k to 100. 
1050 % 100 => 50

Ideal hash functions should be: 
- Efficiently computable
- Distribute keys uniformly
- Should minimize **hash collisions**

Collisions: 
- When two keys hash to the same index (say, 10 % 5 => 5 and 15 % 5 => 5)
- These end up cluttering our data structures (like hashmaps!)

### How to deal with hash collisions:
#### Linear probing: 
Traverse linearly until the first empty space. Say 10 % 5 => 5 but we have already placed 15 there. We will then traverse to 6 and see if it has something in it.
If not, we will put our 10 there instead. If it is, we will then travel to 7, then 8, etc. 


#### Quadratic probing: 
Similar to linear probing, consecutive collisions will lead to greater increments between probes.
Say our index in our data structure is equal to digest y = hash(x):
We will start at probing y. If that is full, we go to y + 1. If that is full, we go to y + 4, then y + 9, then y + 16, and so on. 
Doing quadratic probing causes less clustering (which is preferable for efficiency reasons)


#### Separate chaining: 
Use separate data structures to let multiple values store to the same index. 
Rather than storing y value at index i, you store a pointer to a structure such as a linkedlist that contains all the values that should be at that index. 
This means that values will be stored at the proper index EVERY time, but will increase memory overhead. 


#### Double hashing: 
Using a second hash function in order to decrease chances of a collision. 
Just run your value hash(x) through a second hash function (so it'd look like hash2(hash1(x))) so that you greatly decrease chances of collisions. 


### Why are hashmaps so important?
They are very efficient!
Inserting, deleting, and referencing (.get(x) method) from a Hashmap are all at Theta(1) time. 
This differs from structures such as arraylists where insertion and deletion can take Theta(n). 
