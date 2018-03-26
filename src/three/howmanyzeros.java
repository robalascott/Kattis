package three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class howmanyzeros {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		File file = new File("src/support/zeros");
		sc = new Scanner(file);
		//sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			String[] v =s.split(" ");
			int start = Integer.parseInt(v[0]);
			int end = 0;
			try {
				end = Integer.parseInt(v[1]);
			}catch(NumberFormatException e) {
				System.out.println("failed");
				end = Integer.MAX_VALUE;
			}
			
			if(end==start && start==-1) {
				break;
			}
			System.out.println(solve(start,end));
		}
	
		sc.close();
	}
	
	public static int solve(int start,int end) {
		//Counter
		int count = 0;
		//Holder 
		char[] numArray;
		for(int x = start; x<=end;x++) {
			//Convert into char array 
			numArray = Integer.toString(x).toCharArray();
			for(int v = 0; v<numArray.length;v++) {
				System.out.println(" "+ x);
				if(numArray[v]=='0') {
					count++;
				}	
			}
		}
		return count;
	}
	//Robert Scott
}
