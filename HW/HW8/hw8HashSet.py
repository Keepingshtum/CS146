class hw8:
    def longestPalindrome(self, s):
        if not s: #if s is empty or None. Python, an empty string ("") is considered False
            return 0
        count = 0
        HS = set() #creation of hashset
        for char in s:
            if char in HS:
                #if the character is already in the hashset, remove the character and incremenet count
                HS.remove(char)
                count +=1
            else:
                HS.add(char)
        
        if HS:
            # If there are characters left in the set, we can use one as the center of the palindrome.
            # " if char_set: " checks whether the char_set is not empty.
            return count *2+1
        else:
            return count*2



#announced test cases
p1 = "abccccdd" #expeted output 7
p2 = "speediskey" #expected output 5
##end of announced test cases
p3 = "abccccdddz"
p4 = ""
print(hw8().longestPalindrome(p1))
print(hw8().longestPalindrome(p2))
print(hw8().longestPalindrome(p3))
print(hw8().longestPalindrome(p4))
