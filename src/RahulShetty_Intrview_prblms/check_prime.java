package RahulShetty_Intrview_prblms;

public class check_prime {
	private static void check_prime(int n)
	{
		if(n==1)
		{
			System.out.println("1 is neither prime nor composite number");
		}
		else
		{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {count++;}
		}
		if(count>2) {System.out.println("The number is not prime");}
		else {System.out.println("The number is prime");}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check_prime(133);
	}

}
