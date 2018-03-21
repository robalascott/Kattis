package two;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class simonsays {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		sc = new Scanner(System.in);
		String sizetext = sc.nextLine();
		int size = Integer.parseInt(sizetext); 
		for(int x = 0;x<size;x++) {
			String n = sc.nextLine();
			if(n.startsWith("Simon says")) {
				System.out.println(n.substring(11));
			}
		}
		sc.close();
	}
}
