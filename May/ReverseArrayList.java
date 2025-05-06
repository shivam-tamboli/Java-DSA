/*
Given an ArrayList of integers, reverse its elements in-place, meaning without using another list.
Example:
input : [60,70,80,90,100]

output : [100,90,80,70,60]
*/

import java.util.*;

class Arrayl{

	static ArrayList<Integer> list = new ArrayList<>();

	static void addlist(int num){
	list.add(num);
	}
	
	static void reverseall(){
		int i = 0; 
		int j = list.size() - 1;
		
		while(i < j){
		int temp = list.get(i);
		list.set(i , list.get(j));
		list.set(j, temp);

		i ++;
		j --;
		}
	}

	static void print(){
	System.out.println(list);
	}
}

public class ReverseArrayList{

	public static void main(String[] args){

	Arrayl.addlist(1);
	Arrayl.addlist(2);
	Arrayl.addlist(3);
	Arrayl.addlist(5);
	Arrayl.addlist(6);

	System.out.println("Before reversing:");
	Arrayl.print();
 

	Arrayl.reverseall();

	System.out.println("After reversing:");
	Arrayl.print();
	
	}
}

/*
Expected input will be:
[1,2,3,4,5,6]

Expected Output will be:

Before reversing:
[1, 2, 3, 5, 6]
After reversing:
[6, 5, 3, 2, 1]
*/