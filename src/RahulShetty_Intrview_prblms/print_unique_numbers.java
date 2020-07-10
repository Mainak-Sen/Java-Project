package RahulShetty_Intrview_prblms;

import java.util.ArrayList;

public class print_unique_numbers {
	
	private static void print_unique_nos(int[] a) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int b: a)
		{
			if(!al.contains(b))
			{
				al.add(b);
			}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,4,6,4,5,3,8,90,85,90,1,57};
		print_unique_nos(a);
	}

}
