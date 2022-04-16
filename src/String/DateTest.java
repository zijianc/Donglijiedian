package String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
public static void main(String[] args) throws ParseException {
	Date nowtime =new Date();
	System.out.println(nowtime);
	
	
	//Date->String
	SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	String a =sdf.format(nowtime);
	System.out.println(a);
	
	
	//String->Date
	
	String b ="2022/3/23 16:12";
	SimpleDateFormat sdf2= new SimpleDateFormat("yyyy/MM/dd HH:mm");
	Date d =sdf2.parse(b);
	System.out.println(d);
	long l =System.currentTimeMillis();
	System.out.println(l);
	
	
	
	Integer aa = 128;
	Integer bb= 128;
	System.out.println(aa==bb);
	
}
}
