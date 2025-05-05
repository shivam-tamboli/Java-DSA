/*

Problem Statement: Remove All Occurrences of a Given Element from ArrayList.

input : 
list = [1, 2, 3, 4, 3, 5], value = 3

output:
[1, 2, 4, 5]


*/


import java.util.*;

class numlist{

	
	static ArrayList<Integer> list = new ArrayList<>();//Create a static array.

	static void addnum(int num){ //method add numbers into arraylist.
		list.add(num);
	}

	static void removeall(int value){ //method remove elements from the arraylist.
	Iterator<Integer> itr = list.iterator();
	while(itr.hasNext()){
	if(itr.next() == value){
	itr.remove();
			}
		}
	}

	static void printlist(){ //method prints the list.
	System.out.println("After removing the value from the arraylist : " + list);
	}


}

public class RemoveAllOccurrence{

	public static void main(String[] args){

	
	numlist.addnum(1);
	numlist.addnum(2);
	numlist.addnum(3);
	numlist.addnum(2);
	numlist.addnum(4);
	numlist.addnum(2);
	numlist.addnum(5);
	numlist.addnum(2);

	
	numlist.removeall(2);

	numlist.printlist();

	

	}
}

/*
Expected input will be: 
list = [1,2,3,2,4,2,5,2];

Expected output will be:
After removing the value from the arraylist : [1, 3, 4, 5]


*/