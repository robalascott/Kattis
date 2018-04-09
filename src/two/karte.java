package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class karte {
	final static int suits = 4;
	final static int deck = 14;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/karte4");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		// Place holder for deck info
		boolean matrix[][] = new boolean[suits][deck];
		// Scoop for first line
		String line = sc.nextLine();
		for (int x = 0; x < line.length(); x += 3) {
			//System.out.println(line.substring(x, x + 3));
			if (!placement(matrix, line.charAt(x), Integer.parseInt(line.substring(x + 1, x + 3)))) {
				System.out.println("GRESKA");
				matrix[0][0]=true;
				break;
			};
		}

		//printit(matrix);
		if(!matrix[0][0]) {
			printSolution(matrix);
		}

		sc.close();

	}

	// Printing function for testing
	private static void printit(boolean[][] matrix) {
		for (int x = 0; x < 4; x++) {
			System.out.println(Arrays.toString(matrix[x]));
		}

	}

	// Check for an empty slot else return false
	public static boolean placement(boolean[][] m, char suit, int value) {
		if(value<0 || value>13) {
			return false;
		}
		if (suit == 'P' && !m[0][value]) {
			m[0][value] = true;
			return true;
		} else if (suit == 'K' && !m[1][value]) {
			m[1][value] = true;
			return true;
		} else if (suit == 'H' && !m[2][value]) {
			m[2][value] = true;
			return true;
		} else if (suit == 'T' && !m[3][value]) {
			m[3][value] = true;
			return true;
		}
		return false;
	}

	// Printing function for testing
	private static void printSolution(boolean[][] matrix) {
		int counter = 0;
		for (int x = 0; x < 4; x++) {
			for (int y = 1; y <= 13; y++) {
				if (matrix[x][y])counter++;
			}
			System.out.print((13-counter) + " ");
			counter=0;
		}

	}
	// Robert Scott
}
