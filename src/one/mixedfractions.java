package one;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class mixedfractions {

	public static void main(String[] args)throws FileNotFoundException {
	// TODO Auto-generated method stub
		Scanner sc = null;
		//File file = new File("src/support/mixed");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		while(true) {
			int v = sc.nextInt();
			int v1 = sc.nextInt();
			if(v1 == 0 &&  v==0)break;
			System.out.println(v/v1 +" " + v%v1+"  / " + v1);
		}
		sc.close();
	}
 
}


//Robert Scott