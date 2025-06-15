/*
NeetCode - Top K Frequent Elements

Problem:
Given an integer array nums and an integer k, return the k most frequent elements.

The test cases are generated such that the answer is always unique.
You may return the output in any order.

Example:
Input: nums = [7,7], k = 1
Output: [7]

*/

import java.util.*;

public class TopKFrequentElementsOp {

    /**
     * Time Complexity: O(n log n)
     * - O(n) to count frequencies
     * - O(n log n) to sort the frequency map entries
     * 
     * Space Complexity: O(n)
     * - HashMap stores up to n elements
     * - Additional space for list and result array
     */
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert map to list of entries for sorting
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());

        // Step 3: Sort entries by frequency in descending order
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Extract the top K keys from sorted entries
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));  // Expected Output: [3, 2]
    }
}
