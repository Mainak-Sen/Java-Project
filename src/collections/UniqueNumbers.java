package collections;

import java.util.ArrayList;

public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programs to print unique numbers in an array  and also to print how many times each number is present in the array 
		int a[]= {4,5,4,3,4,4,3,9,6,7,8,2,3,5,1};
		ArrayList<Integer> al= new ArrayList<Integer>();
		for (int i: a)
		{
			al.add(i);
		}
		System.out.println(al);
		for (int j=0;j<al.size();j++)
		{   
			//int counter=1;
			for (int k=j+1;k<al.size();k++)
			{   
				if(al.get(j)==al.get(k))
				{
					al.remove(k);
					//counter++;
					
				}
			}
		//System.out.println(al.get(j)+":"+counter);
		}
		
		System.out.println(al);
	}

}
