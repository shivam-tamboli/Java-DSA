/*

NeetCode

Valid Palindrome

Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true

*/


import java.util.*;

public class ValidPalindrome{

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(1)
	*/


	public static boolean isValidPalindrome(String s){

	s = s.toLowerCase();

	int left = 0;

 	int right = s.length() - 1;

	while(left < right){
		
		while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
		left++;
		}
		
		while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
		right++;
		}

		if(s.charAt(left) != s.charAt(right)){
			return false;	
		}
		left++;
		right--;
	}

	return true;
}

	

public static void main(String[] args){

	String s = "wasitacaroracatisaw";

	boolean result = isValidPalindrome(s);

	System.out.println(result);//Expected Output : true

	}
}