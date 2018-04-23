package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Bank {
	//INCOMPLETED
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		sc = new Scanner(System.in);
		//File file = new File("src/support/bank3");
		//sc = new Scanner(file);
		// Scoop the first number of people and max time left
		int number = sc.nextInt();
		int time = sc.nextInt();
		// Place holder for the queue
		int queue[] = new int[time+1];
		// Final MaxValue;
		int maxValue = 0;
		for (int x = 0; x < number; x++) {
			int value = sc.nextInt();
			int wait = sc.nextInt();
			// If value is greater
			if (wait < time) {
				if (queue[wait] < value) {
					// Change maxValue
					maxValue -= queue[wait];
					// Replace Object
					queue[wait] = value;
					maxValue += value;
				}
			}

		}
		System.out.println(maxValue);
		sc.close();
	}
	// Robert Scott
}
