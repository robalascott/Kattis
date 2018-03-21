package one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class keytocrypto {

	public static void main(String[] args) throws FileNotFoundException {
		int offset = 65;
		Scanner sc = null;
		File file = new File("src/support/key");
		sc = new Scanner(file);
		String key = sc.nextLine();
		String encrypt = sc.nextLine();
		int length = key.length();
		for(int x = 0; x<length; x++) {
			int v = key.charAt(x)-encrypt.charAt(x);
			System.out.println(v + " " +key.charAt(x) + " " + encrypt.charAt(x) );
			System.out.println(v + " " +key + " " + encrypt );
			if(x + 3 < length) {
				char b = (char) Math.abs(v+offset);
				System.out.println(v + " " + b);
				encrypt+=b;
			}
			System.out.println(encrypt);
		}
		sc.close();
	}
 
}


//Robert Scott