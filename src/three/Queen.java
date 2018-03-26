package three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Queen {
	public static int size =8;
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/queen2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		int[][]board= new int[size][size];
		for(int x = 0;x<size;x++) {
			String line = sc.nextLine();
			for(int v = 0;v<size;v++) {
				if(line.charAt(v)=='*') {
					board[x][v]=1;
				}
			}
		}
		//print(board);
		if(solve(board,0,0,0)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		sc.close();
	}
	
	private static boolean solve(int[][] board, int row, int col,int count) {
		//Break point
		if(row==board.length && col==board.length-1) {
			if(count==8)return true;
			return false;
		}
		//Move forward in the col and row
		if(row==board.length) {
			return solve(board,0,col+1,count);
		}
		//Test if and then if safe
		if(board[row][col]==1) {
			if(!test(board,row,col)) {
				//System.out.println(row + ":" + col);
				return false;
			}
			return solve(board,row+1,col,count+1);
		}
		//Else move forward in the row
		return solve(board,row+1,col,count);
	}

	private static boolean test(int[][] board, int row, int col) {
		 	int i, j;
	        // Check across the row
	        for (i = 0; i < board.length-1; i++) {
	        	if (board[row][i] == 1 && i!=col) {
	        		return false;
	        	}
	        }	
	        // Check down  the col  
	        for (i = 0; i < board.length-1; i++) {
	        	if (board[i][col] == 1 && i!=row) {
	        		return false;
	        	}
	        }	
	        
	 
	        // Check upper diagonal on left side
	        for (i=row, j=col; i>=0 && j>=0; i--, j--) {
	        	if (board[i][j] == 1 && i!=row && j!=col) {
	            	return false;
	            }
	        }    	
	                
	 
	        // Check lower diagonal on left side
	        for (i=row, j=col; j>=0 && i<board.length; i++, j--) {
	        	if (board[i][j] == 1 && i!=row && j!=col) {
	            	return false;
	            }
	        } 
	        return true;
	}
	//Print function for testing
	private static void print(int[][] board) {
		for(int x = 0;x<size;x++) {
			for(int v = 0;v<size;v++) {
				System.out.print(board[x][v]);
			}
			System.out.println("");
		}
		
	}
	//Robert Scott
}
