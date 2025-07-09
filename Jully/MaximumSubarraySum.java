/*
*AlgoZenith - Maximum Subarray Sum 

Description

Write a program to find the contiguous subarray with a non-zero length that has the largest sum and print the sum.

Input Format
The first line contains T, the number of test cases.
For each test case, at first, the size of the array N is given and the next line contains the N space-separated integers.

Output Format
Print the sum of the maximum subarray.

Example:

Input:

1

5

3
-3
7
-2
1


Output:

7

*/

import java.util.*;

public class MaximumSubarraySum{

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(1)
	*/

	public static int maxsubarraysum(int[] arr){

	//count cur sum.
	int currentSum = 0;

	//count max sum
	int maxSum = Integer.MIN_VALUE;

	//iterate.
	for(int num : arr){

	// 0 + 4
	currentSum += num;

	// 4 = 0 , 4
	maxSum = Math.max(maxSum, currentSum);
	
	//if current sum if less then 0.
	if(currentSum < 0){
		//reset it.
		currentSum = 0;
			}
		}
	//return maxSum.
	return maxSum;
	}	



	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int T = sc.nextInt();
	sc.nextLine();

	for(int i = 0; i < T; i++){
	
	int N = sc.nextInt();

	int[] arr = new int[N];

	for(int j = 0; j < N; j++){
	
	arr[j] = sc.nextInt();
			}
	System.out.print(maxsubarraysum(arr));	
		}
	}
}