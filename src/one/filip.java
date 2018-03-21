package one;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class filip {

	public static void main(String[] args)  throws FileNotFoundException{
		Scanner sc = null;
		//File file = new File("src/support/filip2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringBuilder first = new StringBuilder();
		first.append(line);
		first.reverse();
		String[] keyValue = first.toString().split(" ");
		int val = Integer.parseInt(keyValue[0]);
		int val1 = Integer.parseInt(keyValue[1]);
		if(val>val1)System.out.println(val);
		else System.out.println(val1);
		sc.close();		
	}

}


//Robert Scott