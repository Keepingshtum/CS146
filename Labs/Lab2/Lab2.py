from numpy import sort
def are_anagrams(s, t):
    if sorted(s) == sorted(t):
        print("Anagrams")
    else:
        print("Not anagrams")

are_anagrams("fried", "fired")
