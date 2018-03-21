package one;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Judgingmoose {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
	    //File file = new File("src/support/jud");
	   // sc = new Scanner(file);
	    sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    int r = sc.nextInt();
	    if(l <= 0 && r<=0) {
	    	System.out.println("Not a moose");
	    }
	    else if(l<r) {
	    	System.out.println("Odd "+r*2);
	    }else if(l>r) {
	    	System.out.println("Odd "+l*2);
	    }else if(l==r) {
	    	System.out.println("Even "+l*2);
	    }
	    sc.close();
	}

}


//Robert Scott