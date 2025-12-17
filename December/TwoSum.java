/*

Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Examples: 

nums = [2,6,1,8]

target = 9

[2,3]

nums = [3,2,6,9,6,1,4]

target = 10

[3,5]

*/

import java.util.*;

public class TwoSum{


	public static int[] solution(int nums[], int target){

	
	HashMap<Integer, Integer> map = new HashMap<>();

	for(int i = 0; i < nums.length; i++){					

		int current = nums[i];							

		int needed = target - current;

		if(map.containsKey(needed)){
		
			return new int[] {map.get(needed), i};
			
			}
		map.put(current, i);
		}

		return new int[] {-1, -1};
	}


	public static void main(String[] args){


	int nums[] = {2,7,11,15};

	int target = 9;

	int result[]  = solution( nums, target);

	System.out.println("[" + result[0] + ", " +  result[1] + "]");
	}
}

/*

int nums[] = {2,7,11,15};

	int target = 9;

Output : 

[0, 1]


Time Complexity : O(n)
Space complexity : O(1)
*/