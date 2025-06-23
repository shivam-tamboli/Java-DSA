/*
NeetCode : Two Integer Sum II

Problem Statement

Given an array of integers numbers that is sorted in non-decreasing order.

Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.

There will always be exactly one valid solution.

Your solution must use O(1) additional space.

Input: numbers = [1,2,3,4], target = 3

Output: [1,2]

*/


import java.util.*;

public class TwoIntegerSumII{

	/*
	*Time Complexity : O(n)
	*Space Complexity : 0(1)
	*/

	public static int[] twoSum(int[] nums, int target){
	
	//initialize pointer.
	int left = 0;

	
	//initialize pointer.
	int right = nums.length - 1;


	//runs until we find the pair.
	while(left < right){
	
	
		//cal the sum of pointers.
		int sum = nums[left] + nums[right];

			//sum and target are equal return their indices with +1, 
			if(sum == target){
				return new int[]{left + 1, right + 1};
			}
				else if(sum < target){
				left++;		
				}
				else{
				right--;
				}
			}	
		return new int[]{-1 , -1};	
	}
	
	public static void main(String[] args){

	int[] nums = {1,2,3,4};

	int target = 3;

	int[] result = twoSum(nums, target);

	System.out.println("[" + result[0] + ", " + result[1] + "]"); //Expected Output : [1, 2]
	}
}