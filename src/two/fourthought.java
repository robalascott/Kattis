package two;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class fourthought {
	//---> incomplete
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/*");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		String[] temp = new String[3];
		System.out.println(solve(0,4,9,temp));
		System.out.println(solve(0,4,0,temp));
		System.out.println(solve(0,4,7,temp));
		System.out.println(solve(0,4,11,temp));
		System.out.println(solve(0,4,24,temp));
		sc.close();
	}

	public static String[] solve(int pos,int sum,int target, String[] s) {
		
		if(pos==3) {
			if(sum==target) {
				System.out.println("solve ----->" + target + " " + Arrays.toString(s));
				return s;
			}
			return null;
		}
		s[pos]="+";
		solve(pos+1,4+sum,target,s);
		s[pos]="-";
		solve(pos+1,4-sum,target,s);
		s[pos]="*";
		solve(pos+1,4*sum,target,s);
		if(sum!=0) {
			s[pos]="/";
			solve(pos+1,(4/sum),target,s);	
		}
		
		return null;

	}
}
