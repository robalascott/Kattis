package three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class countingstars {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/stars2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		//Case Counter
		int caseCounter = 1;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			//System.out.println(line);
			String[] holder = line.split("\\s");
			//Spilt sizes 
			int row = Integer.parseInt(holder[0]);
			int col = Integer.parseInt(holder[1]);
			//Create board
			int[][] board = getStars(sc, row, col);
			// print(board);
			System.out.println("Case " + caseCounter + ": " + solve(board, 0, 0));
			//print(board);
			//increase case counter
			caseCounter++;
		}
		sc.close();
	}

	private static int solve(int[][] board, int row, int col) {
		//Counter number of Islands  
		int count = 1;
		for (int x = 0; x < board.length; x++) {
			for (int v = 0; v < board[0].length; v++) {
				if(board[x][v]==Integer.MAX_VALUE) {
					miniSolve(board,x,v,count);
					count++;
				}
			}
		}
		return count-1;
	}
	//Walk about function for all linked areas
	private static void miniSolve(int[][] board, int row, int col,int count) {
		if(row>=0 && col>=0 && row<board.length && col <board[0].length) {
			//System.out.println(row + "row2 " + col);
			if(board[row][col]==Integer.MAX_VALUE) {
				board[row][col]=count;
				miniSolve(board,row+1,col,count);
				miniSolve(board,row-1,col,count);
				miniSolve(board,row,col-1,count);
				miniSolve(board,row,col+1,count);
			}
		}
		
	}
	//Create and convert Stars to Integer with Max value
	private static int[][] getStars(Scanner sc, int row, int col) {
		int[][] board = new int[row][col];
		for (int x = 0; x < row; x++) {
			String line = sc.nextLine();
			for (int v = 0; v < col; v++) {
				if (line.charAt(v) == '-') {
					board[x][v] = Integer.MAX_VALUE;
				}
			}
		}
		return board;
	}

	// Print function for testing
	private static void print(int[][] board) {
		for (int x = 0; x < board.length; x++) {
			for (int v = 0; v < board[0].length; v++) {
				System.out.print(board[x][v] + " ");
			}
			System.out.println("");
		}

	}
	//Robert Scott
}
