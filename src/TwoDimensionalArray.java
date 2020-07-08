
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		/*Object a[][]=new Object [2][2];
		
		a[0][0]='m';
		a[0][1]=20;
		a[1][0]="I love my mom ";
		a[1][1]=true;
		 
		
		for (Object i[] :a)
		{
			for (Object j: i)
			{
				System.out.print(j+"             ");
			}
			
		System.out.println();
		}
		
		
Object b[][]= {{10,20},{30,40},{50,60},{'a','b'},{"me","mom"}};
		
		 	
		for (Object i[] :b)
		{
			for (Object k: i)
			{
				System.out.print(k+"   ");
			}
			
		System.out.println();
		}*/
	//code to print minimum number in a given matrix	
		int a[][]= {{2,3,4},{5,1,7},{8,1,2}};
		int min = a[0][0];
		int mincolumn=0;
		int max=0;
		
		for (int i=0;i<3;i++) 
		{
			for (int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincolumn=j;
				}
			}
		}
		
		System.out.println("The minimum number in the matrix is :"+min);
		System.out.println(a.length);
		for (int m=0;m<a.length;m++)
		{
			if(a[m][mincolumn]>max)
			{
				max=a[m][mincolumn];
			}
		}
		System.out.println("The maximum number in the column where minimum number is present is :"+max);

		
		//code to print maximum number in a given matrix	
				/*int a[][]= {{2,3,4},{5,6,7},{8,1,2}};
				int max = a[0][0];
				
				for (int i=0;i<3;i++) 
				{
					for (int j=0;j<3;j++)
					{
						if(a[i][j]>max)
						{
							max=a[i][j];
						}
					}
				}
				System.out.println("The maximum number in the matrix is :"+max);*/


	}

}
