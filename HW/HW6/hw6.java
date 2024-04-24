package hw6;
import java.util.*;

public class hw6 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Your code here
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while (i < n-2){
            if (i >0&&nums[i] == nums[i - 1]){
                i++;
                continue;
            }

            int left = i+1;
            int right = n-1;
            while (left < right){
                if (left > i + 1 && nums[left] == nums[left - 1]){
                    left ++;
                    continue;
                }
                if (right < n - 1 && nums[right] == nums[right + 1]){
                    right--;
                    continue;
                }

                int total = nums[i] + nums[left] + nums[right];
                //System.out.println(nums[i] + " " + nums[left] + " " + nums[right] + " " + total);
                if (total < 0){
                    left++;
                } else if (total > 0) {
                    right--;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    //System.out.println("here");
                    left++;
                }
            }
            i++;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1};
        int[] arr2 = {-5,0,5,10,-10,0};

        List<List<Integer>> o = threeSum(arr);
        System.out.println(o);
        o = threeSum(arr2);
        System.out.println(o);
    }
}
