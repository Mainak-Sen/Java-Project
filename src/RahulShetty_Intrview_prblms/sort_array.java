package RahulShetty_Intrview_prblms;

public class sort_array {
	private static void print_sorted_array(int[] a) {
		//bubble sort approach
		int temp=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;//counting the number of swaps in an iteration
					
				}
			}
			if(count==0) {break;}//if no swaps occur in a particular iteration,we are breaking the loop,as its already sorted
			                     //we need not go for any further iteration
		}
		
		System.out.println("Printing the array in ascending order:");
		System.out.println();
		for(int each: a )
		{
			System.out.print(each+" ");
		}
		System.out.println();
		System.out.println("Printing the array in descending order:");
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {67,54,98,0,56,2,4,8,95,56};
		print_sorted_array(a);

	}

}
