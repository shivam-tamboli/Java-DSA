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


public class ContainsDuplicateBF{

public static void main(String[] args){

					
int[] nums = {1,2,3,3};//input

boolean duplicate = false;//flag.

for(int i = 0; i < nums.length; i++){//outloop for iterating into array.
	for(int j = i + 1; j < nums.length; j++){//comparing with other elements in array. why j = i + 1; because i it shouldn't compare with itself.
		if(nums[i] == nums[j]){//while comparing if find duplicate.
			duplicate = true;//change the flag.
			break;//break the inner loop.
				}
			}
		if (duplicate) break;//if not find duplicate flag will remain the same.
			}
	System.out.println(duplicate);//at last print the flag.
	}

}

/*
Expected Input will be:
int[] nums = {1,2,3,3}

Expected Output will be:
true
*/