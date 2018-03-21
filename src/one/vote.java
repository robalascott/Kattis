package one;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class vote {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/vote");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for(int x = 0;x<tests;x++) {
			int num =  sc.nextInt();
			int total=0,max=0,pos=0,count=0;
			for(int v = 0;v<num;v++) {
				int newValue = sc.nextInt();
				total+=newValue;
				if(max<newValue) {
					max = newValue;
					pos = v+1;
					count=0;
				}else if(max==newValue) {
					count++;
				}
			}
			//System.out.println(max + " " + max*2 +" " + total + " "+ pos);
			if(count!=0) {
				System.out.println("no winner");
			}else if(max*2>total) {
				System.out.println("majority winner " + pos);
			}else {
				System.out.println("minority winner " + pos);
			}
			total=max=pos=count=0;
		}
		sc.close();
	}
	
}

// Robert Scott