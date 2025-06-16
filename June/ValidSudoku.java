/*

NeetCode : Valid Sudoku

ou are given a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:

Each row must contain the digits 1-9 without duplicates.
Each column must contain the digits 1-9 without duplicates.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
Return true if the Sudoku board is valid, otherwise return false

Note: A board does not need to be full or be solvable to be valid.

Example : 

Input: board = 

[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","1",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

Output: false

*/


import java.util.*;

	public class ValidSudoku{

	/*
	*Time Complexity : O(1)
	*Space Complexity : O(1)
	*/

		public static boolean isvalidSudoku(char[][] board){
		
			//track rows, k - (0to8), value - seen in row.
			Map<Integer, Set<Character>> rows = new HashMap<>();

			//track colums, k - (0to8), value - seen in row.
			Map<Integer, Set<Character>> cols = new HashMap<>();

			//tracks the coordination of square, [1,1].
			Map<String, Set<Character>> square = new HashMap<>();

			//iterate in sudoku.
			for(int r = 0; r < 9; r++){
				for(int c = 0; c < 9; c++){
					
					//take the current char.
					char current = board[r][c];

					//skip dot it's null.
					if(current == '.') continue;

					//identify 3*3 square matrix.
					String squareKey = (r / 3) + "," + (c / 3);

					//track if current not seen in  [r,c,sq] create new sets.
					if(
						rows.computeIfAbsent(r, k -> new HashSet<>()).contains(current)||
						cols.computeIfAbsent(c, k -> new HashSet<>()).contains(current)||
						square.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(current)
					){
					//if exists return.
					return false;
					}
	
					//now confirm digit doesn't repeat, then add current.
					rows.get(r).add(current);
					cols.get(c).add(current);
					square.get(squareKey).add(current);	
							
				}		
			}
	
			return true;
		}


	public static void main(String[] args){

	ValidSudoku validator = new ValidSudoku();

	char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

	boolean result = validator.isvalidSudoku(board);
	System.out.println("Is the Sudoku board valid? " + result);//Expected output : Is the Sudoku board valid? true

	}

}