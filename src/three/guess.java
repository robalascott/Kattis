package three;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class guess {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		sc = new Scanner(System.in);

		int value = makePow(9);

		for (int x = 8; x >= -1; x--) {
			System.out.println(value);
			String name = sc.nextLine();
			if (name.contains("correct")) {
				System.exit(0);
			}
			if (name.contains("lower")) {
				if (x == 0)
					value--;
				else
					value -= makePow(x);
			} else {
				if (x == 0)
					value++;
				else
					value += makePow(x);
			}

		}
		System.exit(0);
		sc.close();
	}

	public static int makePow(int v) {
		return (int) Math.pow(2, v);
	}

}

// Robert Scott