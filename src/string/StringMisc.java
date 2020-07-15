package string;

public class StringMisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="Hello";
		String c="Jello";
		String d="Hello";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a==c);
		System.out.println(b==d);
		
		String s1=new String("Hello");
		String s2=s1;
		System.out.println(s2);
		
		//String s2=new String("Hello");
		//System.out.println(s1==s2);
		/*
		 * s1.concat("World"); System.out.println(s1); //StringBuffer class can be used
		 * to make strings mutable .Its thread safe and synchronized whereas
		 * StringBuilder class is not thread-safe and its not synchronized. //Above
		 * mentioned is the only difference between StringBuffer and StringBuilder
		 * StringBuffer sb = new StringBuffer("HelloWorld"); sb.append("I am Mainak");
		 * System.out.println(sb); sb.insert(10," "); System.out.println(sb);
		 * System.out.println(sb.lastIndexOf("m")); sb.reverse();
		 * System.out.println(sb); sb.replace(5,10, ""); System.out.println(sb);
		 */
		
	}

}
