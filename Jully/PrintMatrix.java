import java.util.*;

public class PrintMatrix{

	/*
	*Time Complexity : O(n^2)
	*Space Complexity : O(1)
	*/


	public static void main(String[] args){
		
	int[][] matrix = {
	
		{1,2,3},
		{4,5,6},
		{7,8,9}
	
		};
	
	System.out.println("Matrix:");

	//this loop for row.
	for(int i = 0; i < matrix.length; i++){

		//this loop for column.
		for(int j = 0; j < matrix[0].length; j++){

			//print rows.
			System.out.print(matrix[i][j] + " ");
			}	
			System.out.println();
		}
	}
}