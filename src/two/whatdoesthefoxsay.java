package two;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class whatdoesthefoxsay {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
		//File file = new File("src/support/fox");
		//sc = new Scanner(file);
		sc = new Scanner(System.in);
		List<String> value = new ArrayList<String>();
		int n = Integer.parseInt(sc.nextLine());
		for(int x = 0; x<n;x++) {
			String v = sc.nextLine();
			for (String p : v.split("\\s")) {
			      String[] keyValue = p.split(" ");
			      value.add(keyValue[0]);
			}
			while(sc.hasNextLine()) {
				String d = sc.nextLine(); 
				if(d.startsWith("what does the fox say?")) {
					for (String p :value) {
						System.out.print(p + " ");
					}
					System.out.println();
					break;
				}else {
					String[] keyValue = d.split(" ");
					if(keyValue[1].contains("goes")) {
						//System.out.println("-> " +keyValue[2]);
						value.removeAll(Collections.singleton(keyValue[2]));
					}
				}
			}
			value.clear();
		}	
		sc.close();
	}
 
}


//Robert Scott