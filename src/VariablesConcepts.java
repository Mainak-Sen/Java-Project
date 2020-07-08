
public class VariablesConcepts {
	
	String name;
	String address;
	static String city="Pune";
	static int i=0;
	int j=0;
	
	//static variables are shared across all objects/instances created for that particular class no matter how many objects are created .Its a class variable . Its a single stand-alone copy of the variable .
	//whereas instance variable are solely dependent on the instantiated objects of that class .Copies of instance variables are created according to the number of objects instantiated .
	
	VariablesConcepts(String name,String address)
	{
		this.name=name;
		this.address=address;
		i++;
		j++;
		System.out.println(name+" "+address+" "+city+" "+i+" "+j);
	}
	//Static methods accept static variables only.
	public static void getdata()
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesConcepts vc1 = new VariablesConcepts("Mainak","Pimple Saudagar");
		VariablesConcepts vc2 = new VariablesConcepts("Nilanjana","Aundh");
		//Static methods are class methods ,they do not require object instantiation to be called ,they can be called via classname.methodname directly
		VariablesConcepts.getdata();
		//non static methods are mandatory to be called post object creation only 
		//static methods are not dependent on objects hence they cannot be accessed via object creation 
		//static blocks are used to initialize the declared static variables to optimize the code 
	

	}

}
