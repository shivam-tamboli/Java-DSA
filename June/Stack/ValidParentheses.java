/*

NeetCode : Valid Parentheses

Problem Statement 

You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.

Open brackets are closed in the correct order.

Every close bracket has a corresponding open bracket of the same type.

Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true


*/


import java.util.*;

public class ValidParentheses{

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(n)
	*/

	public static boolean validParentheses(String s){

	//create a empty stack.
	Stack<Character> stack = new Stack<>();

	//string to character every brackets.
	for(char c : s.toCharArray()){

		//if char encountered opening brackets.
		if(c == '(' || c == '[' || c == '{'){

			//add them into stack.
			stack.push(c);
				}

				else{
			
				//if stack is empty, we encountered closing bracket it means it is not valid.
				if(stack.isEmpty()){
				return false;
					}

				//assign top to pop().
				char top = stack.pop();
		
				//if all conditions satisfy, stack will be empty.
				if((c == ')' && top != '(' ||
				c == ']' && top != '[' ||
				c == '}' && top != '{' )){

				//if any condition fails.
					return false;
				}
			}
		}
	//empty stack return true.
	return stack.isEmpty();
	}


	public static void main(String[] args){
	
	String s = "([{}])";

	boolean result = validParentheses(s);

	System.out.println(result);//Expected Output : true

	
	}
}