/*

NeetCode

Two Sum

Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]

Input: nums = [4,5,6], target = 10

Output: [0,2]

*/



import java.util.*;

public class TwoSumBF{

public static int[] TwoSum(int[] nums, int target){//method return int value.

for(int i = 0; i < nums.length; i++){          //outer loop for iterate in an array one by one.
	for(int j = i + 1; j < nums.length; j++){ //inner loop for comparing one value to other values.
		if(nums[i] + nums[j] == target){	 //if i and j sum will be the target value.
			return new int[]{i, j};         //in return create a new array,  and add the indices that makes the target.
			//System.out.println("[" + i + " , " + j + "]");    //simple way to print the indices.
			}
		}	
	}
	return new int[]{-1, -1};//if no pair found return an array.
}



public static void main(String[] args){

int[] nums = {3,6,5,4};

int target = 7;
 
int[] result = TwoSum(nums, target);

System.out.println("[" + result[0] + ", " + result[1] + "]");//print the indices. 
	}
}


/*
Expected Input will be:

int[] nums = {3,6,5,4};

int target = 7;


Expected Output will be:
[0, 3]

*/
