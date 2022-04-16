package donglijiedian;

public class IfTest {
public static void main(String []args){
	
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.println("请输入成绩");
	double grade = s.nextDouble();
	
	//分类
	String level = "优";
	if(grade>100||grade<0){
		System.out.println("无效成绩");
		return;
	}else if(grade<60){
		level = "不及格";
	}else if(grade<70){
		level = "及格";
	}else if(grade<90){
		level = "良";
	}
	System.out.println(level);

	
}
}
