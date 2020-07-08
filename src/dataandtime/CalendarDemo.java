package dataandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		Date d=new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("M//d//YYYY hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
	}

	

}
