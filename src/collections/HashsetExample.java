package collections;

import java.util.HashSet;
import java.util.Iterator;

//it does not accept duplicate values 
// it does not guarantee any specific sequence in which the elements will be pushed or retrieved ,it occurs in a random manner without any specific order .

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("US");
		hs.add("UK");
		hs.add("China");
		hs.add("India");
		hs.add("Australia");
		//System.out.println(hs);
		
		//How to iterate through objects poresent in hashset 
		Iterator<String> i=hs.iterator();
		//System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
