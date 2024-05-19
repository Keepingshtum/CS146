Function longestPalindrome(s):
    If s is empty:
        Return 0

    Initialize count as 0
    Initialize an empty set HS

    For each character char in s:
        If char is in HS:
            Remove char from HS
            Increment count by 1
        Else:
            Add char to HS

    If HS is not empty:
        Return count * 2 + 1
    Else:
        Return count * 2