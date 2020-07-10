package RahulShetty_Intrview_prblms;

public class Print_reverse_pyramid {
	private static void print_reverse_pyramid(int rows)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
			  if(j<(rows-i-1))
			  {
				  System.out.print(" ");
			  }
			  else
			  {
				 System.out.print("*");
			  }
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_reverse_pyramid(5);

	}

}
