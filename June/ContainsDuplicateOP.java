/*
NeetCode

Contains Duplicate

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Input : nums = {1,2,3,4};
Output : flase.


Input : nums = {4,5,6,1,1};
Output = true.
*/




import java.util.*;

public class ContainsDuplicateOP{

	public static boolean hasDuplicate(int[] nums){
	
	HashSet<Integer> seen = new HashSet<>();
	
	for(int num : nums){
	if(seen.contains(num)){
		return true;
		//break;
			}
	seen.add(num);
		}
	return false;
	
	}
	
	
	
	public static void main(String[] args){

	int[] nums = {1,2,3,3};//an array.

	boolean result = hasDuplicate(nums);
	
	System.out.println(result);
	
	
	}
}

/*

Expected Input will be:
int[] nums = {1,2,3,3};

Expected Output will be:
true

*/