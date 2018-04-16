package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class battlesimulation {
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		File file = new File("src/support/battle2");
		sc = new Scanner(file);
		//sc = new Scanner(System.in);
		//Scoop first line
		String line = sc.nextLine();
		//Stringbuilder to append
		StringBuilder Line = new StringBuilder();
		//For loop with Just counter measures
		for(int x = 0; x<line.length();x++) {
			Line.append(counter(line.charAt(x)));
		}
		//System.out.println(Line.toString());
		//Add special function and return a String
		System.out.println(solve(Line,0,Line.length()-1));
		sc.close();
	}
	//Recusive function for special 
	private static String solve(StringBuilder line, int x, int z) {
		if(x==z) {
			// pull last char 
			return line.substring(x);
		}
		//Test combo
		if(test(line,x,x+3)) {
			//Combo and move forward 3 
			return "C" + solve(line,x+3,z);
		}else {
			//read line normal
			return line.charAt(x)+solve(line,x+1,z);
		}
	}

	//Test function
	private static boolean test(StringBuilder line, int x, int i) {
		try {
			//Spilt string of testing
			String v = line.substring(x, i);
			//Check for combo
			if(v.contains("S")&&v.contains("K")&& v.contains("H")) {
				return true;
			}
		}catch(StringIndexOutOfBoundsException e) {
			//Less than 3 char left
			return false;	
		}
		return false;		
	}
	//Switch to counter moves
	private static String counter(char c) {
		switch(c) {
			case'R':return "S";
			case'B':return "K";
			case'L':return "H"; 
			default:return null;
		}
	}
	//Robert Scott
}
