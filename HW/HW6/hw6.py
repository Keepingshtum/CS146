from typing import List

class HW6:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        #Your code here
        sList = sorted(nums.copy())

        result = []
        n = len(sList)
        i = 0
        while i < n - 2:
            if i > 0 and sList[i] == sList[i - 1]:
                i += 1
                continue

            left = i + 1
            right = n - 1

            while left < right:
                if left > i + 1 and sList[left] == sList[left - 1]:
                    left += 1
                    continue

                if right < n - 1 and sList[right] == sList[right + 1]:
                    right -= 1
                    continue

                total = sList[i] + sList[left] + sList[right]
                if total < 0:
                    left += 1
                elif total > 0:
                    right -= 1
                else:
                    result.append([sList[i], sList[left], sList[right]])
                    left += 1
            i += 1
        return result

hw6 = HW6()
print(hw6.threeSum([0, 1, 1]))
print(hw6.threeSum([-5,0,5,10,-10,0]))