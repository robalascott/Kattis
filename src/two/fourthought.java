package two;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class fourthought {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/*");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		String[] temp = new String[3];
		solve(0,4,9,temp);
		solve(0,4,0,temp);
		solve(0,4,7,temp);
		solve(0,4,11,temp);
		solve(0,4,24,temp);
		sc.close();
	}

	public static boolean solve(int pos,int sum,int target, String[] s) {
		
		if(pos==3) {
			if(sum==target) {
				System.out.println("solve ----->" + target + " " + Arrays.toString(s));
				return true;
			}
			return false;
		}
		
		if(solve(pos+1,sum-4,target,s));
		if(solve(pos+1,sum-4,target,s));
		if(solve(pos+1,sum*4,target,s));
		if(solve(pos+1,sum/4,target,s));
		return false;

	}
}
