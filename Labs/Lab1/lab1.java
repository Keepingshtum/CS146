import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class lab1 {
    private static int[] findPair(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i); 
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = {99, 0, 1, 10};
        int t = 99;

        int[] o = findPair(arr, t);

        System.out.println(o[0] + ", " + o[1]);
    }
}