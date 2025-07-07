/*

AlgoZenith : Anagrams-Standard

Description

Given two strings S and T, check if string S is an anagram of string T. Strings contain lowercase characters only.

An anagram of a string is another string that contains the same characters, only the order of characters can be different.


Input Format

The first line contains an integer T', the number of test cases. (1 ≤ T' ≤ 100000)

The next two lines of each test case contain a string. 1 ≤ |S|,|T| ≤ 10^5.

Sum of |S|+|T| across all test cases ≤ 10^7.


Output Format

Print ‘Y’ if string S is an anagram of string T. Otherwise print ‘N’.

Example :

Input : 

1

abcd
uytr



Output :

1

abcd
uytr

N

*/

import java.util.*;

public class Anagrams{

	/*
	*Time Complexity : O(n log n)
	* - Sorting both strings of length n -> O(n log n)
	* - Comparison and conversion -> O(n)
	* - Total per test case : O(n log n)


	*Space Complexity : O(n)
	* - Two characters arrays of length n -> O(n) 
	*/

	public static char isAnagram(String s, String t){
	
	
	//if s is not equal to t, return false.
	if(s.length() != t.length()){
		return 'N';
	}

	//convert strings to character.
	char[] a = s.toCharArray();
	
	char[] b = t.toCharArray();

	//sort the arrays.
	Arrays.sort(a);
	Arrays.sort(b);

	//if a and b are equals to each other return y. if not return n.
	if(Arrays.equals(a, b)){
		return 'Y';
		}	
		else{
		return 'N';
		}
	}

	public static void main(String[] args){

	//initialize object of scanner.
	Scanner sc = new Scanner(System.in);

	//stores how many test cases we have to do.
	int T = sc.nextInt();
	sc.nextLine();

	//run till t.
	for(int i = 0; i < T; i++){
		String s = sc.nextLine().trim();
		String t = sc.nextLine().trim();
		System.out.println(isAnagram(s, t)); 
		}
	}
}