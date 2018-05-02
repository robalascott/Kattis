package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mastermind {
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/mastermind2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		//Scoop first line
		String line = sc.nextLine();
		//Spilt first line
		String textStr[] = line.split("\\s+");
		//Assign line to arrays 
		int size = Integer.parseInt(textStr[0]);
		char[] first = new char[size];
		char[] second = new char[size];
		//Place holder for right
		int r = 0;
		//Read in line and solve right values
		for(int x = 0;x<size;x++) {
			if(textStr[1].charAt(x) == textStr[2].charAt(x)) {
				r++;
			}else {
				//Put into arrays
				first[x]=textStr[1].charAt(x);
				second[x]=textStr[2].charAt(x);
			}
		}
		//Answer and get matches
		System.out.println(r+" "+solve(first,second));
		sc.close();
	}
	//Robert Scott

	private static int solve(char[] first, char[] second) {
		//Placeholder
		int v = 0;
		for(int x = 0;x<first.length;x++) {
			//Check if null
			if(first[x]!='\u0000') {
				for(int y = 0;y<second.length;y++) {
					//Match and remove
					if(first[x]==second[y]) {
						v++;
						second[y]='\u0000';
						break;
					}
				}
			}
		}
		return v;
	}
}
 