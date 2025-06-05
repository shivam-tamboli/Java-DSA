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
	
	public static void main(String[] args){

	int[] nums = {1,2,3,3};//an array.
	
	HashSet<Integer> seen = new HashSet<>();//create a set that doesn't allow duplicates.

	boolean duplicate = false;//create a flag.

	for(int num : nums){                       //iterating in an array.
		if(seen.contains(num)){             //if num repeates in set.
			duplicate = true;             //change the flag.
			break;                       	//break the loop.
			}					//if their is no duplicate.
		seen.add(num);				//add the number in set.
		}
	System.out.println(duplicate);		//print the flag.
	}
}

/*

Expected Input will be:
int[] nums = {1,2,3,3};

Expected Output will be:
true

*/