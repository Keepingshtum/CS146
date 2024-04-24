import java.util.Arrays;

public class lab1 {
    public int[] targetSum (int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        // Iterate while left < right
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                // aka, if solution is found
                return new int[] {left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        // case where no two numbers can be found to add up to target
        return new int[0];
    }

    public static void main(String[] args) {
        lab1 targetSum = new lab1();
        int[] nums = {9, 0, 11, 22};
        int target = 20;
        int[] result = targetSum.targetSum(nums, target);
        if (result.length == 2) {
            System.out.println("The index of the two numbers that add up to target are: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No sufficient solution found.");
        }
    }
}
