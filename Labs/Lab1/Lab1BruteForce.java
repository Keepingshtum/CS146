import java.util.Arrays;

public class lab1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        lab1 solution = new lab1();
        int[] nums = {9, 0, 11, 22};
        int target = 20;
        int[] result = solution.twoSum(nums, target);
      // The indices should add up to 2
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
