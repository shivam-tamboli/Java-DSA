
/*
Inserting an element at the specific location in an array.
*/

/*
Expected input will be:

	arr[] = {1,2,3,4,5};
	
*/

import java.util.*;

public class InsertInArray{

	public static void main(String[] args){

	int arr[] = {1,2,3,4,5};

	int array[] = new int[arr.length + 1];

	int position = 1;
	
	int addElement = 10;

	System.out.println("Before inserting an element into an array:" + Arrays.toString(arr));

	for(int i = 0; i < position; i++){
		array[i] = arr[i];
		}

	array[position] = addElement;

	for(int i = position; i < arr.length; i ++){
		array[i + 1] = arr[i];

	}

	System.out.println("After inserting an element into an array:" + Arrays.toString(array));
	}
}

/*

Expected output will be:

	Before inserting an element into an array:[1, 2, 3, 4, 5]
	After inserting an element into an array:[1, 10, 2, 3, 4, 5]

*/