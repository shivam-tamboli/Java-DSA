import java.util.*;

public class TwoSumOP {

    public static int[] isTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();//create a hashmap.

        for (int i = 0; i < nums.length; i++) {//iterate.
            int difference = target - nums[i]; //diff value.

            if (map.containsKey(difference)) {//if map contians diff value.
                return new int[]{map.get(difference), i};//return the diff index and the i of nums.
            }

            map.put(nums[i], i); // store current number and index
        }

        return new int[]{-1, -1}; // If not found (shouldn't happen per constraints)
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int target = 7;

        int[] result = isTwoSum(nums, target); 

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
