package Shell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wheretolive {
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/whereto");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int number = Integer.parseInt(sc.nextLine());
			if(number==0)break;
			int xCord = 0;
			int yCord = 0;
			for(int x = 0;x<number;x++) {
				String line = sc.nextLine();
				String textStr[] = line.split("\\s+");
				xCord += Integer.parseInt(textStr[0]);
				yCord += Integer.parseInt(textStr[1]);
			}
			float newX = (float)xCord/number;
			float newY = (float)yCord/number;
			System.out.println((int) Math.round(newX) + " " + (int)Math.round(newY));
		}
		sc.close();
	}
	//Robert Scott
}
