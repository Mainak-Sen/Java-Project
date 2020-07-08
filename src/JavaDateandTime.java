import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaDateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d= new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("MMM/yyyy,EEE");
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.HOUR));
		

	}

}
