package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		
		try
		{
			
			
			int array[]= new int[5];
			System.out.println(array[7]);
			
			int k =a/b;
			System.out.println(k);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("We have caught the  arithmetic error/exception");
		}
		catch(IndexOutOfBoundsException t)
		{
			System.out.println("We have caught the  index out of bound exception");
		}
		
		catch(Exception e)
		{
			System.out.println("We have caught the error/exception");
		}
		finally
		{
			System.out.println("Close the browser ");
		}
		
	}

}
