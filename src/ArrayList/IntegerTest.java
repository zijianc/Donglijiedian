package ArrayList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IntegerTest {
public static void main(String[] args) {
	//int -> String
	String a = 10+"";
	//String ->int
	int i=Integer.parseInt(a);
	//int -> Integer
	Integer c =i;
	//Integer -> int 
	i=c;
	
	//Integer->String
	String b = String.valueOf(c);
	//String->Integer
	Integer d =Integer.valueOf(b);
	
	 
	 //------------------------
	 Date date = new Date();
	 System.out.println(date);
	 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	 //String nowtimer =sdf.format(nowTime);
	 String nowtime =sdf.format(date);
	 System.out.println(nowtime);
	 
}
}
