## Introduction
A set is a collection of elements with no duplicates. When you attempt to add an element that is already present, nothing will really happen. They are also unordered (in most cases) and unindexed.

Sets are most commonly implemented through either hashsets or treesets. Treesets maintain order, but are slower. They are usually a RB-Tree.

We will concern ourselves with hashsets as they are usually the more useful and used of the two. 

## Time Complexity
Basic operations (such as add, remove, and contains) are O(log n) on a treeset, but O(1) for a hashset. 

## Java Implementation
Instantiation: This is part of the Collections interface, so they are present in the java.util.Collection import

Instantiation a set goes like this: Set<Integer> s = new HashSet<>();

Methods: 

**add(e)** - adds e to set if not already present

**remove(e)** - removes element from set if present

**contains(e)** - returns whether the set contains this element

**equals(o)** - deep equality check

**isEmpty()** - returns whether this set is empty

**size()** - returns the number of elements in the set

## Python Implementation
Sets in Python are not restricted to one data type, but 0 and False are treated as the same element, as are 1 and True, so if you add "False" to a set that already has 0, it will *not* add.

Instantiation: Sets are instantiated with {}. 

myset = {} or myset = {"bingus", False, 1.5}

you can also do the set() constructor, so in the above example you would have set(("bingus", False, 1.5)) (double brackets are necessary)

Methods: 

len(<set>) - returns number of items in the set

add(e) - adds element e

remove(e) - discards element e

e in <set> - returns if element is in set

## Python Set Operators
Disclaimer: Basic set theory knowledge is VERY useful to properly understand what these operators are exactly getting at.

### Booleans: 

key in s - containment check

key not in s - non-containment check

s1 == s2 - s1 is equivalent to s2 

s1 != s2 - s1 is not equivalent to s2

s1 <= s2 - s1 is subset of s2

s1 < s2 - s1 is proper subset (subset and NOT equal) of s2


### Set Returns: 

s1 | s2 - union of s1 and s2

s1 & s2 - intersection of s1 and s2

s1 - s2 - set of elements in s1 but not s2

s1 ^ s2 - set of elements in s1 or s2 but not both (XOR)

