package RahulShetty_Intrview_prblms;

public class NumberPyramid {
	private static void print_reverse_number_pyramid(int rows) {
		int count=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=rows-1-i;j>=0;j--)
			{
				count++;
				System.out.print(count+"\t");
			}
			System.out.println();
		}
	}
	private static void print_normal_number_pyramid(int rows) {
		int count=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				count=count+3;
				System.out.print(count+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print_reverse_number_pyramid(4);
		print_normal_number_pyramid(4);
	}

}
