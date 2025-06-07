/*
NeetCode

Valid Anagram

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example :

Input : s = "eat" t = "ate";
Output : true

Input : s = "cake" t = "bake";
Output = false

*/


import java.util.*;

public class ValidAnagramBF{

public static boolean Anagram(String s, String t){
	
	if(s.length()  != t.length()){//first we will check the length of both Strings.
		return false;//if not equals return flase.
	}

	char[] a = s.toCharArray();//convert it into character arrays. ex 'r','a','c','e',........
	char[] b = t.toCharArray();//convert it into character arrays......

	Arrays.sort(a);//sort both character array.
	Arrays.sort(b);//sort both character array.
	
	return Arrays.equals(a, b);//compare both arrays.
}




public static void main(String[] args){

	String s = "racecar";
	String t = "carrace";

	boolean result = Anagram(s, t);
	System.out.println(result);	
	}
}


/*
Expected Input will be:
	String s = "racecar";
	String t = "carrace";

Expected Output will be:
true

*/





