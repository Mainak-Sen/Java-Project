package RahulShetty_Intrview_prblms;

public class reverse_number {
	//reversing a number using recursion 
	static String s="";
	private static String reverse_number(int number)
	{
		if(number<10) {s=s+String.valueOf(number);}
		else {
			s=s+String.valueOf(number%10);
			reverse_number(number/10);
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123;
		System.out.println(reverse_number(number));

	}

}
