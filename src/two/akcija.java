package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class akcija {
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/akcija2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		//Number of Books
		int value = sc.nextInt();
		//PlaceHolder for final Values
		int sum = 0;
		//Placeholder for small list --> Heavy overhead
		List<Integer> list = new ArrayList<Integer>();
		
		for(int x = 1;x<value+1;x++) {
			list.add(sc.nextInt());
		}
		// Sort lowest first
		Collections.sort(list);
		// Reverse 
		Collections.reverse(list);
		for(int x = 0;x<value;x++) {
			//Every third book is blocked
			if((x+1)%3!=0) {
				sum += list.get(x);
			}
		}
		//Print it
		System.out.println(sum);
		sc.close();
	}
	//Robert Scott
}
