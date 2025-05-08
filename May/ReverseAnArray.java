/*
You are given an array of integers arr[]. Your task is to reverse the given array.

Note: Modify the array in place.

Example:
input: [1,2,3,4,5,6]
output: [6,5,4,3,2,1]

Input: arr = [4, 5, 2]
Output: [2, 5, 4]

Input: arr = [1]
Output: [1]
*/

import java.util.*;

public class ReverseAnArray{

	public static void main(String[] args){
	
	int[] arr = {10,20,30,40,50};

		int i = 0;
		int j = arr.length - 1;

		while(i < j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		i++;
		j--;
		}	

		System.out.println("After reversing an array:" + Arrays.toString(arr));
	}
}
/*

Expected input will be:
int[] arr = {10,20,30,40,50};

Expected output will be:
After reversing an array:[50, 40, 30, 20, 10]

*/