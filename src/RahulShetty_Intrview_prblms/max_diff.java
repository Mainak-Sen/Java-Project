package RahulShetty_Intrview_prblms;

public class max_diff {
	private static int max_diff(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
	{
			if((i+1)<a.length)
			{
				int b=Math.abs(a[i+1]-a[i]);
				if(b>max) {max=b;}
			}
	}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,200,15,184};
		System.out.println(max_diff(a));

	}

}
