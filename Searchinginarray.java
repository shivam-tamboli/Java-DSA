/*
Problem Statement:
Given an array of integers and a key, write a program to search for the key in the array.
If the key is found, return its index; otherwise, return -1.

Example:
	Input:
	arr[] = {10,20,30,40,50}
	key = 30
	
	Output :
		2

	Input:
	arr[] = {12,55,21,67,32}
	key= 32	
	
	Output:
	4
*/

/*
Approch:
Firstly we will treverse in the array,
then we will put the condition if arr[i] == key, means while treversing if we get the key value in array then we will return the index of the key value in array,
otherwise if we dont get the key value then we will return the -1.

*/

import java.util.*;

public class Searchinginarray{

public static int searchele(int arr[], int key){

//traverse in arr to find the key value.
for(int i = 0; i < arr.length; i++){
	if(arr[i] == key){ //if in array we find the value of key.
			return i; //then return the index of the key value.
		}

	}
		return -1; //if not found then return -1;
}


public static void main(String[] args){

int arr[] = {1,2,3,4,5};
int key = 4;
int index = searchele(arr,key); //store method in a variable.


if(index == -1){ // if index is -1 then, print this statement.
	System.out.println("Element was not present in array:");
	}
	else{ //else print the index of the value.
		System.out.println("Element found in array at " + index + "index");
		}
	}
}


/*
Input will be:
	int arr[] = {1,2,3,4,5};
	int key = 4;

Output will be:
	Element found in array at 3index
	*/