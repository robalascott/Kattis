package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beekeeper {

	static char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/beekeeper2");
		//sc = new Scanner(file);
		 sc = new Scanner(System.in);
		//Count for first case
		int count = Integer.parseInt(sc.nextLine());
		while (true) {
			//Max number and answer
			int max = 0;
			String answer = null;
			//Scan and then solve
			for (int x = 0; x < count; x++) {
				String temp = sc.nextLine();
				int v = solve(temp, 0);
				if(v>=max) {
					max=v;
					answer=temp;
				}
			}
			//Answer and printout
			System.out.println(answer);
			//Scan and Exit point 
			count = Integer.parseInt(sc.nextLine());
			if(count==0)break;
		}
		sc.close();
	}

	//Solve function
	private static int solve(String list, int pos) {
		//Exit point
		if (pos >= list.length()-1 ) {
			return 0;
		}
		//For loop with check 
		for (int x = 0; x < vowels.length; x++) {
			if (list.charAt(pos) == vowels[x] && list.charAt(pos+1) == vowels[x]) {
				return solve(list, pos + 2) + 1;
			}
		}
		return solve(list, pos+1);
	}
	//Robert Scott
}
