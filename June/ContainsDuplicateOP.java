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

	public static boolean hasDuplicate(int[] nums){//create a method boolean type.
	
	HashSet<Integer> seen = new HashSet<>();//create a HashSet.
	
	for(int num : nums){//Iterate in an array.
	if(seen.contains(num)){//if number occurs again.
		return true;//return true.
		//break;
			}
	seen.add(num);//if not then add it into a HashSet.
		}
	return false;//not found return flase.
	
	}
	
	
	
	public static void main(String[] args){

	int[] nums = {1,2,3,3};//an array.

	boolean result = hasDuplicate(nums);//create var and call method inside var with parameters.
	
	System.out.println(result);//print the var
	
	
	}
}

/*

Expected Input will be:
int[] nums = {1,2,3,3};

Expected Output will be:
true

*/