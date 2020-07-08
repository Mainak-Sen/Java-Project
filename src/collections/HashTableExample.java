package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		ht.put(01, "Mumbai");
		ht.put(05, "Kolkata");
		ht.put(02, "Luknow");
		ht.put(03, "Delhi");
		//ht.put(null, null);
		//System.out.println(hm);
		
	
		
		Set sn=ht.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext())
		{

			System.out.println(it.next());
			//Map.Entry<Integer, String> mp =(Entry<Integer, String>)it.next();
			//System.out.println(mp.getKey());
			//System.out.println(mp.getValue());
		}
	}

}
