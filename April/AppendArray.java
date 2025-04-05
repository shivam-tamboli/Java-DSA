//Appending into an array.

/*
Expected input will be:
 	
	int arr[] = {1,2,3,4,5};

*/


import java.util.*;

public class AppendArray{

	public static void main(String[] args){

	//create an array.
	int arr[] = {1,2,3,4,5};

	//create another array +1 size of previous array.
	int array[] = new int[arr.length + 1];

	System.out.println("Before appending an array:"+ Arrays.toString(arr));


	//copying the array from previous array to new array.
	for(int i = 0; i < arr.length; i++){
		array[i] = arr[i];
		}
//after copying, 1 space left in an array.


	// now we can append into an array.
	array[5] = 6;

	System.out.println("After appending into an array:" + Arrays.toString(array));
	}
}

/*
Expected output will be:

	Before appending an array:[1, 2, 3, 4, 5]
	After appending into an array:[1, 2, 3, 4, 5, 6]

*/