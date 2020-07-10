package RahulShetty_Intrview_prblms;

public class min_max_in_multiArray {
	private static int print_max(int[][] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]>max) {max=a[i][j];}
			}
		}
		return max;
		
	}
	private static int print_min(int[][] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]<min) {min=a[i][j];}
			}
		}
		return min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,4,9},{51,0,-90},{9,10,1}};
		System.out.println(print_max(a));
		System.out.println( print_min(a));

	}

}
