
public class MethodCalling {

	public static void main(String[] args) {
	
		MethodCalling m=new MethodCalling();
		m.go();
		/*m.go1();
		m.go2();
		go3();*/

	} 
	
	public void go() { 
		
		System.out.println("This is inside Go Method");
		go1();
		
	}
	
public void go1() {
		
		System.out.println("This is inside Go1 Method");
		go2();
		
	}

public void go2() {
	
	System.out.println("This is inside Go2 Method");
	go3();
	
}

public  static void go3() {
	
	System.out.println("This is inside Go3 Method");


}



}
