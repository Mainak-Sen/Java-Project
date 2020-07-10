package RahulShetty_Intrview_prblms;

import java.util.HashMap;
import java.util.Map.Entry;

public class count_each_char_occurence {
	private static void count_occurences(String input){
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char c: input.toCharArray())
		{
			if(!Character.isWhitespace(c))
			{
				hm.put(c,hm.getOrDefault(c,0)+1);
			}
		}
		for(Entry<Character,Integer> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="sushmita";
		count_occurences(input);

	}

}
