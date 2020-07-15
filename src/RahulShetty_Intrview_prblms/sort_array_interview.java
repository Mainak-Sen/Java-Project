package RahulShetty_Intrview_prblms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sort_array_interview {
	
	 private static Object[] sort_array(String[] a) {
			HashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
			HashMap<String,Integer> sorted_hm=new LinkedHashMap<String,Integer>();
			for(int i=0;i<a.length;i++)
			{
				hm.put(a[i].split(":")[0],Integer.valueOf(a[i].split(":")[1]));
			}
		    List<Map.Entry<String,Integer>> l=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		    Collections.sort(l,new Comparator<Map.Entry<String,Integer>>(){

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return o1.getValue().compareTo(o2.getValue());
				}});
		    for(Map.Entry<String,Integer> each :l)
		    {
		    	sorted_hm.put(each.getKey(),each.getValue());
		    }
		    ArrayList<String> al=new ArrayList<String>();
		
		    	for(Entry<String, Integer> each: sorted_hm.entrySet() )
		    	{
		    		al.add(each.getKey()+":"+each.getValue().toString());
		    	}
		
		    	Object[] sorted_array=al.toArray();
		    	return sorted_array;
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a= {"test1:08","test2:01","test3:10","test4:02","test5:07"};
		for(Object s:sort_array(a))
		{
			System.out.print(s+" ");
		}
	}

}
