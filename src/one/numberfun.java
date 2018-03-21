package one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class numberfun {

	public static void main(String[] args)  throws FileNotFoundException{
		Scanner sc = null;
		File file = new File("src/support/number");
		sc = new Scanner(file);
		int size = sc.nextInt();
		int a,b,c =0;
		for(int x = 0; x<size; x++) {
			a = sc.nextInt();b = sc.nextInt();c = sc.nextInt();
			if(Math.abs(a+b)==c)System.out.println("Possible");
			else if(Math.abs(a-b)==c)System.out.println("Possible");
			else if(Math.abs(a*b)==c)System.out.println("Possible");
			else if(Math.abs(a/b)==c)System.out.println("Possible");
			else System.out.println("Impossible");
		}
	
		sc.close();
	}
	// Robert Scott
}


//Robert Scott