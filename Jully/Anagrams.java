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
	*Time Complexity : O(n)
	*Space Complexity : O(1)	 
	*/

	public static char isAnagram(String s, String t){

		//if s is not equal to t return N.
		if(s.length() !=  t.length()){
			return 'N';
			}

		//create a map stores freq of String.
		HashMap<Character, Integer> map1 = new HashMap<>();

		HashMap<Character, Integer> map2 = new HashMap<>();


		//stores characters into maps.
		for(char c : s.toCharArray()){
			map1.put(c, map1.getOrDefault(c , 0) + 1);
			}

		for(char c : t.toCharArray()){
			map2.put(c, map2.getOrDefault(c , 0) + 1);
			}
			
		//compare if same return Y, if not return N.
		if(map1.equals(map2)){
			return 'Y';
			}else{
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