package one;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class bestrelayteam {

	 static class Person{
	        String name;
	        float first;
	        float second;
	        public float getFirst() {
				return first;
			}
			public void setFirst(float first) {
				this.first = first;
			}
			public float getSecond() {
				return second;
			}
			public void setSecond(float second) {
				this.second = second;
			}
			public String getName() {
	            return name;
	        }
	        public void setName(String name) {
	            this.name = name;
	        }
	       
	        Person(String n, float f, float s){
	            this.name = n;
	            this.first =f;
	            this.second =s;
	        }
	    
	    }
	
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = null;
	    //File file = new File("src/support/relay2");
	    //sc = new Scanner(file);
	    sc = new Scanner(System.in);
	    String line = sc.nextLine();
	    int size = Integer.parseInt(line);
	    List<Person> v = new ArrayList<Person>();
	    List<Person> v1 = new ArrayList<Person>();
	    for(int x = 0;x<size;x++) {
	    	line = sc.nextLine();
			String[] keyValue = line.split(" ");
			v.add(new Person(keyValue[0],Float.parseFloat(keyValue[1]),Float.parseFloat(keyValue[2])));
			v1.add(new Person(keyValue[0],Float.parseFloat(keyValue[1]),Float.parseFloat(keyValue[2])));
	    }
	    v.sort(Comparator.comparing(Person::getFirst));
	    v1.sort(Comparator.comparing(Person::getSecond));
	   // for(Person r:v1) {
	    //	System.out.println(r.name+ " " + r.first + " " + r.second);
	    //}
	    float sum=10000;
	    List<String> pos = new ArrayList<String>();
	    for(int x = 0;x<size;x++) {
	    	 List<String> pos1 = new ArrayList<String>();
	    	float temp=v.get(x).first;
	    	pos1.add(v.get(x).name);
	    
	    	int count = 0;
	    	 for(int b = 0;b<size;b++) {
	    		
	    		 if(!pos1.get(0).equals(v1.get(b).name) && count<3){
	    			 temp+=v1.get(b).second;
	    			 pos1.add(v1.get(b).name);
	    			 count++;
	    		 }
	    	 }
 		   
	    	 if(temp<sum && pos1.size()==4) {
	    		 sum=temp;
	    		 pos = pos1;
	    	 }
	    	 count=0;
	    }
	    System.out.println(sum);
	    for(String r:pos) {
	    	System.out.println(r);
	    }
	    sc.close();
	}
 
}


//Robert Scott