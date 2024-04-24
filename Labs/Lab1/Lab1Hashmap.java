import java.util.HashMap;
public class TargetSums {
    public static int[] targetSums(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int findNum = target - num;
            if (numMap.containsKey(findNum)) {
                return new int[] { numMap.get(findNum), i };
            }
            numMap.put(num, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {9, 0, 11, 22};
        int target = 20;
        int[] result = targetSums(nums, target);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No numbers could be added up to target.");
        }
    }
}
