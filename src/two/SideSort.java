package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class SideSort {
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/*");
		//sc = new Scanner(file);
		//sc = new Scanner(System.in);
		//String line = "oTs";
		String line = "nwi";
		System.out.println(solve(line));
		
		
		//sc.close();
	}
	//Robert Scott

	private static String solve(String line) {
		

		PriorityQueue<Character> Upper = new PriorityQueue<Character>();
		PriorityQueue<Character> Lower = new PriorityQueue<Character>();
		for(int x  = 0; x<line.length();x++) {
			 if(Character.isUpperCase(line.charAt(x))) {
		          	Upper.add(line.charAt(x));
		     }else {
		    		Lower.add(line.charAt(x));
		     }
		}
		StringBuilder b = new StringBuilder();
		System.out.println(Upper.size() + " " + Lower.size());
		while(!Lower.isEmpty()) {
			//if((Upper.peek()+32)>=Lower.peek()) {
			//	b.append(Upper.poll());
			//}else {
				b.append(Lower.poll());
				System.out.println(Upper.size() + " " + Lower.size());
			//}
		}
	
		
		return b.toString();
	}
}
