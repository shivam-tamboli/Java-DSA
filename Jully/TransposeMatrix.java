import java.util.*;

public class TransposeMatrix{

	public static void main(String[] args){
	
	
	int[][] mat = {

	{1,2,3},
	{4,5,6},
	{7,8,9}
	
	};

	
	int rows = mat.length;
	int columns = mat[0].length;

	int[][] tran = new int[rows][columns];

	for(int i = 0; i < rows; i++){
		for(int j = 0; j < columns; j++){
			tran[j][i] = mat[i][j];
			}
		}

	System.out.println("Transpose matrix:");
	for(int i = 0; i < tran.length; i++){
		for(int j = 0; j < tran[0].length; j++){
			System.out.print(tran[i][j] + " ");
			}
			System.out.println();
		}
	}
}