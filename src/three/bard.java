package three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bard {

	
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/bard2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		// number of Villages;
		int nrV = sc.nextInt();
		// number of evenings
		int nrE = sc.nextInt();
		//Matrix of nrV/nrE
		boolean[][]table = new boolean[nrV+1][nrE+1]; 
		//Song Counter
		int song = 0;
		for(int x = 0;x<nrE;x++) {
			//Number of Villages that evening
			int Villager = sc.nextInt();
			// Temp holder for Villages that evening
			int[]holder = new int[Villager]; 
			for(int v = 0;v<Villager;v++) {
				//Scan in Villages
				holder[v]= sc.nextInt();
			}
			//Sort for easy links
			Arrays.sort(holder);
			//Test for new song
			if(holder[0]==1) {
				song++;
				solveAdd(table,holder,song);
			}else {
				solveNoBard(table,holder,song);
			}
			
		}
		
	//	printTable(table);
		printTableSol(table,song);
		sc.close();
	}
	//No bard for that night
	private static void solveNoBard(boolean[][] table, int[] holder, int song) {
		for(int x = 1;x<=song;x++) {
			if(find(table,holder,x)) {
				solveAdd(table,holder,x);
			};
		}
		
		
	}
	//Find those that know different songs
	private static boolean find(boolean[][] table, int[] holder, int song) {
		for(int x = 0;x<holder.length;x++) {
			if(table[holder[x]][song]==true) {
				return true;
			}
		}
		
		return false;
	}
	//Add that nights villager
	private static void solveAdd(boolean[][] sort,int[]holder,int song) {
		for(int v = 0;v<holder.length;v++) {
			sort[holder[v]][song]=true;
		}
		
	}

	public static void printTable(boolean[][] sort) {
		System.out.println("Ev-------->");
		for(int x = 1;x <sort.length;x++) {
			for(int y = 1;y <sort[0].length;y++) {
				System.out.print(sort[x][y]+ " ");
			}
			System.out.println();
		}
	}
	//Print Solutions
	public static void printTableSol(boolean[][] sort,int songs) {
		for(int x = 1;x <sort.length;x++) {
			for(int y = 1;y <=songs;y++) {
				if(!sort[x][y]) {
					break;
				}else if(y==songs) {
					System.out.println(x);
				}
			}
		}
	}
}
