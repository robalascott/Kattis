package three;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Textencryption {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/*");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		String value = "CTU Open P";
		//String value = "CTU Open Programming Contest";
		int hop = 2;	
		value = replace(value);
		value = shift(value,hop);
	
		//incomplete
		
		
		System.out.println(value);
		
		sc.close();
	}

	public static String replace(String s) {
		return s.replaceAll("\\s+","").toUpperCase();
	}
	
	public static String shift(String str, int shift)
    {
        // Convert String to a char array
        char[] arr = str.toCharArray();
        int pos = 0;
       
        for(int i = 0; i < arr.length; i++)
        {
        	if((i*shift)>=str.length()-1) {
        		pos = 
        		arr[pos]= str.charAt(i);
        	}else {
        		arr[(i*shift)]= str.charAt(i);
        		pos=i;
        	}   
        }
        // return the new String
        return String.valueOf(arr);
    }
}
