package two;


import java.util.Scanner;

public class Bus {

	public static void main(String[] args) throws Exception {
			//number of test case
			int T = 0;
			//Number of stops
			int k = 0;	
		//	File file = new File("src/support/bus1");
			Scanner sc = null;
		//	sc = new Scanner(file);
			sc = new Scanner(System.in);
			T = sc.nextInt();

			for(int x = 0 ; x<T;x++) {
				k = sc.nextInt(); 
				System.out.println(solve(k));
			}
			
			sc.close();
	}
	
	public static int solve(int k1) {	
		if(k1>=1 && k1<=30) {
			return 1 +(k1*2) ;
		}
		return 0;
	}
	//Robert Scott
}
