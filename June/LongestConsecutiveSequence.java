/*
NeetCode : Longest Consecutive Sequence

Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [0,3,2,5,4,6,1,1]

Output: 7

*/


import java.util.*;

public class LongestConsecutiveSequence {

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(n)
	*/

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> map = new HashSet<>();

        for (int num : nums) {
            map.add(num);
        }

	//cont longest sequence.
        int longest = 0;

        for (int num : map) {
            // Only start counting when this is the beginning of a sequence.
            if (!map.contains(num - 1)) {
	
		//start making sequence.
                int length = 1;
	
		//run till it can make the sequence.
                while (map.contains(num + length)) {
                    length++;
                }
		//find which one is longest sequence.
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {2, 20, 4, 10, 3, 4, 5};

        int result = longestConsecutive(nums);

        System.out.println(result); //Expected Output: 4 (sequence: 2,3,4,5)
    }
}
