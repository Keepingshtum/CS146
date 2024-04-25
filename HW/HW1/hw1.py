import math
def palindrome(s):
    for i in range(math.floor(len(s)/2)):
        if s[i] != s[len(s) - i - 1]:
            return False
    return True

print(palindrome("bass ssab"))