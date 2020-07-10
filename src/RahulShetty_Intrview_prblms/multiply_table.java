package RahulShetty_Intrview_prblms;

public class multiply_table {
	private static void mul_table(int num) {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=num;
			System.out.print(num+" X "+i+" = "+sum);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiplication table without using multiply operator
		mul_table(5);

	}

}
