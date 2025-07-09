/*

 LeetCode : Majority Element

 Description

 Given an array nums of size n, return the majority element.

 The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


Example:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/

import java.util.*;

public class MajorityElement{

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(1)
	*/

	public static int isMajority(int[] nums){

	//track how many votes current candidate gets.
	int count = 0;
	
	//stores the potential answer.
	int candidate = 0;

	//iterate.
	for(int num : nums){

		//counts becomes 0.
		if(count == 0){

		//current num will be the candidate.
		candidate = num;
			}

	//if current num same as candidate increment, if not decrement.
	count += (num == candidate) ? 1 : -1;
		}

	return candidate;
	}


	public static void main(String[] args){
	
	int[] nums = {3,2,2};

	int result = isMajority(nums);

	System.out.println(result);//Expected Output : 2	

	}
}