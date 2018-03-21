package three;


import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class judging {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/jud2");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		HashMap <String,Integer> dom = new HashMap<>();
		HashMap <String,Integer> kattis = new HashMap<>();
		for(int x = 0;x<count;x++) {
			String name = sc.nextLine();
			if(dom.containsKey(name)) {
				dom.computeIfPresent(name, (k, v) -> v + 1);
			}else {
				dom.put(name, 1);
			}
		}
		for(int x = 0;x<count;x++) {
			String name = sc.nextLine();
			if(kattis.containsKey(name)) {
				kattis.computeIfPresent(name, (k, v) -> v + 1);
			}else {
				kattis.put(name, 1);
			}
		}
		
	/*	
		for (Map.Entry<String, Integer> entry : dom.entrySet()) {
		   System.out.println(entry.getValue()+ "" + entry.getKey());
		}
	*/
		int x  = 0;
		for (Map.Entry<String, Integer> entry : kattis.entrySet()) {
			try {
				x += Math.min(entry.getValue(),dom.get(entry.getKey())); 
			}catch(NullPointerException e) {
				// do nothing
			}  
		}
		System.out.println(x);
		sc.close();
	}
 
}


//Robert Scott