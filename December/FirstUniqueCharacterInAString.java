/* First Unique Character in a String 

Given a string s , find the first non-repeating character in it and return its index. If it does not exist, return -1 . 

Example's: 

Input: s = "leetcode".
Output : 0

Input : "adcs"
Output : 0

Input : aabb
Output : -1

*/

import java.util.*;

public class FirstUniqueCharacterInAString{


	public static Integer solution(String s){
	
	HashMap<Character, Integer> map = new HashMap<>();

	for(int i = 0; i < s.length(); i++){
		
		char c = s.charAt(i);
	
		map.put(c, map.getOrDefault(c, 0) + 1);
	
		}

	for(int i = 0; i < s.length(); i++){
	
		if(map.get(s.charAt(i)) == 1){
			
			return i;
			}
		}
		return -1;	
	}


	public static void main(String args[]){

	
	String s = "teetcode";
			
	int result  = solution(s);

	System.out.println(result); 
	}
}

/*

Input : 

String s = "teetcode";

Output : 

4


TimeComplexity : O(n)
SpaceComplexity : O(n)
*/
