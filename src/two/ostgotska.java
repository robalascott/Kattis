package two;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ostgotska {
	final static String[] answer = {"dae ae ju traeligt va","haer talar vi rikssvenska"};
	final static String text = "ae";
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/ost2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		String[] key = sc.nextLine().split(" ");
		float count=0;
		for(int x = 0;x<key.length;x++) {
			if(key[x].contains(text))count++;
		}
		if(count/(float)key.length>=0.4) {
			System.out.println(answer[0]);
		}else {
			System.out.println(answer[1]);
		}
		sc.close();
	}

}


//Robert Scott