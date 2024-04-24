import math


class HW8:
    def longestPalindrome(self, s):
        totalRange = list(range(ord('a'), ord('z') + 1)) + list(range(ord('A'), ord('Z') + 1))
        charDict = {}
        for i in range(len(totalRange)):
            charDict[chr(totalRange[i])] = i
        print(charDict)
        charCounts = [0] * len(totalRange)
        for i in s:
            if i in charDict.keys():
                charCounts[charDict[i]] += 1
        print(charCounts)
        output = ""
        hasSingle = False
        for i in range(len(charCounts)):
            pairCount = charCounts[i]//2
            output = chr(totalRange[i]) * pairCount + output + chr(totalRange[i]) * pairCount
            if not hasSingle and charCounts[i]%2 == 1:
                middle_index = len(output) // 2
                output = output[:middle_index] + chr(totalRange[i]) + output[middle_index:]
                hasSingle = True
        print(output)
        return len(output)
#accession for gene protein RNA
hw8 = HW8()
print(hw8.longestPalindrome("speediskey"))