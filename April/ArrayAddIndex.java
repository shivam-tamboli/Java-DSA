
//Inserting an element at the specific index of an array.


/*
Expected input will be:

int arr[] = {1,2,3,4,5};

*/

import java.util.*;

public class ArrayAddIndex{

	public static void main(String[] args){

	//create an array.
	int arr[] = {1,2,3,4,5};

	//insert element at the specific index 
	arr[2] = 4;

	//printing array after updating.
	System.out.println("After updating the indexes" + Arrays.toString(arr));

	}
}

/*

Expected output will be :

After updating the indexes[1, 2, 4, 4, 5]


*/
 