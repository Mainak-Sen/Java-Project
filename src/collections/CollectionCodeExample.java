package collections;

import java.util.ArrayList;

public class CollectionCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {4,6,4,4,5,9,9,3,2,1,2,2};  //we have to print the unique numbers from this array 
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	
	for (int j=0;j<a.length;j++)
	{
		int count =0;
		if(!al.contains(a[j]))
		{
			al.add(a[j]);
			count++;
			for(int k=j+1;k<a.length;k++)
			{
				if(a[j]==a[k])
				{
					count++;	
				}
			}
		System.out.println(a[j] +":"+count);
		}
	}
	
	System.out.println(al);
	
	
	}
	
}
