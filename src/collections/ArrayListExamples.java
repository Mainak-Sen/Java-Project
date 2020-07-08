package collections;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		ArrayList<String> a =new ArrayList<String>();
		//ArrayList<String> b =new ArrayList<String>();
		a.add("Java");
		a.add("Tutorial");
		a.add("Mainak");
		a.add("Sen");
		System.out.println(a);
		System.out.println(a.lastIndexOf("Java"));
		a.add(1,"Collections");
		System.out.println(a);
	}

}
