/*
 Problem Statement:
Given an array of integers, print every alternate element starting from index 0.
*/

/*
Expected input will be:
arr[] = {10,20,30,40,50,60};
*/

import java.util.*;

public class PrintAlternate{

	public static void main(String[] args){

	//create an array.
	int arr[] = {10,20,30,40,50,60};

	//traversing in an array.
	for(int i = 0; i < arr.length; i++){
		if( i  % 2 == 0){// print even indices.
			System.out.println(arr[i] + " ");//printing indices.
			}
		}	
	}
} 

/*
Expected output will be:
10 
30 
50 
*/