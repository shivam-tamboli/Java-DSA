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

public class VaildAnagramOP{

public static boolean isAnagram(String s, String t){

if(s.length() != t.length()){//check the length of both strings.
return false;
}

HashMap<Character, Integer> map1 = new HashMap<>();//create HashMap for s str.
HashMap<Character, Integer> map2 = new HashMap<>();//create HashMap for t str.

for(char c : s.toCharArray()){//split into characters.
map1.put(c, map1.getOrDefault(c, 0) + 1);//if char exist in map +1 if not then freq will be 1.
	}
for(char c : t.toCharArray()){//split into characters.
map2.put(c, map2.getOrDefault(c, 0) + 1);//if char exist in map +1 if not then freq will be 1.
	}

return map1.equals(map2);//compare both maps.
}


public static void main(String[] args){

String s = "Cake";
String t = "bake";

boolean result = isAnagram(s, t);
System.out.println(result);

	}
}


/*
Expected input will be:

String s = "Cake";
String t = "bake";


Expected Output will be:
false
*/