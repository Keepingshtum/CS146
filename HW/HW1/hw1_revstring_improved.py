class hw1:
    def isPalindrome(self, s):
        s = [char.lower() for char in s if char.isalnum()]
        #makes a new list that filters out non-aplhanumeric characters and makes chatacters that are alphanumeric lowercase
        return s == s[::-1]

print(hw1().isPalindrome("bob"))
print(hw1().isPalindrome("1Mom1"))
print(hw1().isPalindrome("i am a palindrome"))
print(hw1().isPalindrome("111"))
print(hw1().isPalindrome(""))