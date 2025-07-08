/*
LeetCode - Contains Duplicate

Description

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example : 

Input : nums = {6,74,1,6}

Output : true
*/

import java.util.*;

public class  ContainsDuplicate{

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(n)
	*/
	public static boolean isDuplicate(int[] nums){
	
	//create hashset.
	HashSet<Integer> map = new HashSet<>();

	//add numbers into map.
	for(int num : nums){
		//if map contains the number already.
		if(map.contains(num)){
			//it means duplicate element exist.
			return true;
			}
		//if not add the number into the hashset.
		map.add(num);
		}	
	//return flase.
	return false;
	}

	public static void main(String[] args){

	int[] nums = {1,2,3,1};

	boolean result = isDuplicate(nums);

	System.out.println(result);// Expected Output : true
	
	}
}