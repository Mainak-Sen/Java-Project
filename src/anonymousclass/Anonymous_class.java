package anonymousclass;

public class Anonymous_class {
    static int var=1;
    SuperClass s=new SuperClass(1,"Arjun") {
		int age=4;	
		public final void anonymous_method1() {
			System.out.println("This is an anonymous method 1");
			
			
		}
		public void super_method_1() {
			
			System.out.println("This is anonymous version of super Method 1");
		
		}
		
		};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Anonymous_class a=new Anonymous_class();
	System.out.println(a.s);
		
	/*System.out.println(s.getClass().getName());
	s.super_method_1();
	System.out.println(s.name);
	System.out.println(s.age);*/
	

	
	

	}

}
