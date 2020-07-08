package dataandtime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date");
		String user_input_date= sc.next();
		
		
		//Date d=new Date();
		//System.out.println(d);
		SimpleDateFormat sdf;
		try {
			sdf = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
			System.out.println(sdf.format(user_input_date));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		//System.out.println(d.toString());
		
	}

}
