def palindrome(s):
    lower = s.lower()
    newStr = ""
    for i in lower:
        if i.isdigit() or i.isalpha():
            newStr += i
    if len(newStr) <= 1:
        return True
    right = 0
    left = len(newStr) - 1 - right
    while right != left:
        if newStr[right] != newStr[left]:
            return False
        right += 1
        left = len(newStr) - 1 - right
    return True

if __name__ == "__main__":
    print(palindrome("nurses run"))
