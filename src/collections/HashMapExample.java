package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(01, "Mumbai");
		hm.put(05, "Kolkata");
		hm.put(02, "Luknow");
		hm.put(03, "Delhi");
		hm.put(null, null);
		//System.out.println(hm);
		
		Set sn=hm.entrySet();
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
