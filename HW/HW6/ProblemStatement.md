Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

This time, your problem has additional details:

Constraints:

The solution set must not contain duplicate triplets.
The order of the output and the order of the triplets does not matter.
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 

Function definition for Java: 

    public List<List<Integer>> threeSum(int[] nums) {

       // Your code here

    }
Function definition for Python:
def threeSum(self, nums: List[int]) -> List[List[int]]:

  #Your code here
Announced Test Cases:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Input: nums = [-5,0,5,10,-10,0] 
Output: [[-10,0,10],[-5,0,5]] 
Explanation: There are two possible combinations of triplets that satisfy: (-5,0,5) and (-10,0,10).
Hint: There are 3 well-known ways to solve this problem!

Hint 2: This problem should remind you of another homework problem that you hopefully have already solved. 

Hint 3: This problem might benefit from the algorithms we have recently discussed in class!