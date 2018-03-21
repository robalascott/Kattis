package one;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/fizzbuzz2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		int f = sc.nextInt();
		int b = sc.nextInt();
		int len = sc.nextInt();
		for(int x =1;x<=len;x++) {
			if(x%f==0 &&x%b==0)System.out.println("FizzBuzz");
			else if(x%f==0)System.out.println("Fizz");
			else if(x%b==0)System.out.println("Buzz");
			else System.out.println(x);
		}
		sc.close();
	}

}


//Robert Scott