package three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Scrollingsign {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		File file = new File("src/support/signs");
		sc = new Scanner(file);
		int caseNr = Integer.parseInt(sc.nextLine());
		for (int x = 0; x < caseNr; x++) {
			String info = sc.nextLine();
			String[] parts = info.split(" ");
			int length = Integer.parseInt(parts[0]);
			int type = Integer.parseInt(parts[1]);
			String[] m = new String[type];
			for (int v = 0; v < type; v++) {
				m[v] = sc.nextLine();
			}
			System.out.println(Arrays.toString(m));
			//solve(length, type, m);
			for(int b =1;b<m.length;b++) {
				String temp = solve(m[b-1],m[b]);
				m[b]=temp;
			}
			System.out.println(m[m.length-1]);
		}

		// sc = new Scanner(System.in);
		sc.close();
	}



	private static String solve(String one, String two) {
		StringBuilder str = new StringBuilder();
		for (int v = 0; v < one.length(); v++) {
			if (one.charAt(v) == two.charAt(0)) {
				str.insert(v, two);
				break;
			}
			str.append(one.charAt(v));
		}
		return str.toString();
	}
			
	
}
