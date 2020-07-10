package RahulShetty_Intrview_prblms;

import java.util.ArrayList;

public class Compare_Array {
	//presuming these two arrays will be of same length otherwise equivalent positions cant be compared  
	private static ArrayList<Integer>  give_matched_array(int[] a,int[] b) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,5,9,34,97,6,5};
		int[] b= {1,4,6,9,67,0,1,6};
		System.out.println(give_matched_array(a,b));
		

	}

}
