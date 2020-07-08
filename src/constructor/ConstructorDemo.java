package constructor;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("I am the default constructor");
	}
	
	public ConstructorDemo(int a,String b)
	{
		System.out.println("I am the parameterized  constructor");
	}
	
	public ConstructorDemo(int a,int  b)
	{
		System.out.println("I am the 2nd parameterized  constructor");
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor is a block of code which gets executed when an object of that class is created 
		//constructor is similar to method but it does not have a return type 
		//types of constructor : Default with no parameters  and parameterized constructors 
		
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cdc=new ConstructorDemo(5,4);
		ConstructorDemo cdv=new ConstructorDemo(3,"Mainak");

	}

}
