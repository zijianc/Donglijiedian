package String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest02 {
public static void main(String[] args) {
	Date nowtime =new Date();
	SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	String time1=sdf.format(nowtime);
	System.out.println(time1);
	
	Date time2 =new Date(System.currentTimeMillis()-24*60*60*1000);
	//String b=sdf.format(time2);
	System.out.println(sdf.format(time2));
}
}
