package nestedforloops;

public class NestedForLoops {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int k=3;
		for(int i=0;i<3;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
			System.out.print(k+"\t");
			k=k+3;
			}
		System.out.println();
		}
		/*for(int i=5;i<8;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=8;i<10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print(10);*/
	}

}
