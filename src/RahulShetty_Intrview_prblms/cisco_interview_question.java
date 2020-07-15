package RahulShetty_Intrview_prblms;

public class cisco_interview_question {
	static int min=Integer.MAX_VALUE;
	static int max=Integer.MIN_VALUE;
	private static int func(int[][] a) {
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[0].length;j++)
		{
			if(a[i][j]<min) {
			min=a[i][j];
			temp=j;
        		}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i][temp]>max) {max=a[i][temp];}
	}
	return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{10,2,8},{4,5,3},{0,8,1}};
		System.out.println(func(a));
		

	}

}
