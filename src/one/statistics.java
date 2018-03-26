package one;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class statistics {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/statist");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		int count = 1;
		while(sc.hasNext()) {
			int size = sc.nextInt();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for(int x = 0; x<size;x++) {
				int sum = sc.nextInt();
				if(sum>max)max=sum;
				if(sum<min)min=sum;
			}
			System.out.println("Case "+  count+": " + min + " " + max  + " " + (max-min));
			count++;
		}
		
		sc.close();
	}

}
