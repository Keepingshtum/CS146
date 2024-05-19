# Dictionary/Hashmap Abstract
These go by two different names depending on which language you're in. Technically, the correct term in Java is *map*, it's just that hashmaps are such common implementations of them to the point where it's become ubiquitious.

Essentially what Hmaps are key-value pairs. A key allows you to access a value specific to it. Keys must be unique, but values do not have to be. These can be used to track certain values. For example, you could track a count of occurrences of numbers in an array by mapping the keys as the numbers and values as occurrences.

# Java Implementation
Instantiation:
- Technically there are other maps like TreeMaps, but those are less relevant. Hashmaps are instantiated as follows (with java.util imported):

  HashMap<String, Integer> map = new HashMap<>();

Relevant methods: 
containsKey(key) - Returns true if map contains mapping for this key

containsValue(val) - Returns true if this maps one or more keys to this value

get(key) - Returns value of this key

put(key, value) - associates value with key

remove(key) - remove mapping for this key

remove(key, value) - remove entry for only if mapped to this value

keySet() - returns a set of the keys in this map

values() - returns Collection of values in this map

# Python Implementation
In Python, dictionaries are denoted by curly braces. To instantiate one, you will do: 

d = {}, or d = dict()

Relevant methods: 

get(key) - returns value of specified key

update(key, value) - updates dictionary with specific kv pair

items() - returns list of tuples for each pair

keys() - returns list of keys

values() - returns list of values

pop(key) - removes this key and its value
