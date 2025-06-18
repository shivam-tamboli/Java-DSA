/*
LeetCode : Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

*/


import java.util.*;

public class MoveZeroes {

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(1)
	*/

    public static void moveZeroes(int[] nums) {

	//initialize pointer.
        int slow = 0;

	//initialize pointer.
        for (int fast = 0; fast < nums.length; fast++) {
	
		//if f pointer meets to non-zero value.
            if (nums[fast] != 0) {
		
		//copy the unique element in s pointer.
                nums[slow] = nums[fast];

		//add the unique elements.
                slow++;
            }
        }

	//run till nums length.
        while (slow < nums.length) {

		//after unique no. fill with 0.
            nums[slow] = 0;
            slow++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums); 

        System.out.print("nums = { ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);        // Expected Output :  { 1, 3, 12, 0, 0 }
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}
