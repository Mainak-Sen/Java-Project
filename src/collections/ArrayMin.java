package collections;

public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[][] = new int [3][3];
    a[0][0]=2;
    a[0][1]=4;
    a[0][2]=5;
    a[1][0]=3;
    a[1][1]=2;
    a[1][2]=10;
    a[2][0]=1;
    a[2][1]=2;
    a[2][2]=0;
    
    int min=a[0][0];
    int columnmin =0;
    
    
    for (int i=0;i<3;i++)
    {
    	for (int j=0;j<3;j++)
    	{
    		if(min>a[i][j])
    		{
    			min=a[i][j];
    			columnmin=j;
    			
    		}
    	}
    }
	
    System.out.println("The minimum number present in the array is:"+min);
    int max=a[0][columnmin];
    for (int k=0;k<3;k++)
    {
    	if(max<a[k][columnmin])
    	{
    		max=a[k][columnmin];
    	}
    }
    
    System.out.println("The maximum number in the same column is :"+max);
	}

}
