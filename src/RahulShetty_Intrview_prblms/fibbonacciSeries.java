package RahulShetty_Intrview_prblms;

public class fibbonacciSeries {
	//fibonacci series by recursion
	private static int print_fibbonacci(int index) {
     int a=0,b=1,c;
     if(index==0)
     {
    	 return a;
     }
     else if(index==1)
     {
    	 return b;
     }
     else
     {
    	 for(int i=2;i<=index;i++)
    	 {
    		 c=a+b;
    		 a=b;
    		 b=c;
    	 }
    	 return b;
     }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * //fibbonacci series by swapping two variables int a=0; int b=1; int temp1=0;
		 * int temp2=0; System.out.print(a+" "); for(int i=0;i<10;i++) {
		 * System.out.print(b+" "); temp1=b; temp2=a; a=temp1; b=temp2+temp1;
		 * 
		 * }
		 */
		System.out.println(print_fibbonacci(9));
		//print first 10 numbers of fibonacci series
		for(int i=0;i<10;i++)
		{
			System.out.print(print_fibbonacci(i)+" ");
		}
	}

}
