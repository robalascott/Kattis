package two;


import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class metaprogramming {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/meta");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] keyValue = line.split(" ");
			if(keyValue[0].equals("define")) {
				map.put( keyValue[2],Integer.parseInt(keyValue[1])); 
			}else if(keyValue[0].equals("eval")) {
				System.out.println(function(keyValue,map));
			}
			
		}
			/**
		  Set<String> keys = map.keySet();
	        for(String key: keys){
	            System.out.println("Value of "+key+" is: "+map.get(key));
	        }
	        **/
		sc.close();
	}

	private static String function(String[] keyValue, HashMap<String, Integer> map) {
		try {
			int first = map.get(keyValue[1]);
			int second = map.get(keyValue[3]);
			if(keyValue[2].contains("<")) {
				if(first< second)return "true";
				return "false";
			}else if(keyValue[2].contains(">")) {
				if(first> second)return "true";
				return "false";
			}else if(keyValue[2].contains("=")) {
				if(first== second)return "true";
				return "false";
			}	
			return "undefined";
		}catch(Exception e){
			return "undefined";
		}
	}

}


//Robert Scott