package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class wordsfornumbers {
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/words4number2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(solve(line));
		}
		
		//sc = new Scanner(System.in);
		sc.close();
	}
	//Solve line by line method
	private static String solve(String line) {
		//Divide text 
		String textStr[] = line.split("\\s+");
		//StringBuilder for rebuild
		StringBuilder st = new StringBuilder();
		for(int x = 0; x<textStr.length;x++) {
			if(textStr[x].length()<=2 && textStr[x].length()>=1) {
				try {
					int value = Integer.parseInt(textStr[x]);
					if(value <=20 && value>=0 || value%10==0) {
						textStr[x] = toText(value);
					}else {
						textStr[x] = toText(value/10 *10)+"-"+toText(value%10);
					}
					
				}catch(NumberFormatException e) {
					//do nothing it's not a number
				}
			}
			//Rebuild list
			st.append(textStr[x]+" ");
		}
		
		return st.toString();
	}
	
	//Dirty Switch function for numbers to text
	private static String toText(int value) {
		
		switch(value){
		 case 0: return "zero";	
		 case 1: return "one";	
		 case 2: return "two";	
		 case 3: return "three";	
		 case 4: return "four";	
		 case 5: return "five";	
		 case 6: return "six";	
		 case 7: return "seven";	
		 case 8: return "eight";	
		 case 9: return "nine";
		 case 10: return "ten";	
		 case 11: return "eleven";		
		 case 12: return "twelve";	
		 case 13: return "thirteen";	
		 case 14: return "fourteen";	
		 case 15: return "fifteen";	
		 case 16: return "sixteen";	
		 case 17: return "seventeen";	
		 case 18: return "eighteen";	
		 case 19: return "nineteen";	
		 case 20: return "twenty";	
		 case 30: return "thirty";	
		 case 40: return "forty";
		 case 50: return "fifty";
		 case 60: return "sixty";	
		 case 70: return "seventy";
		 case 80: return "eighty";
		 case 90: return "ninety";
		}
		return null;
		
	}
	//Robert Scott
}
