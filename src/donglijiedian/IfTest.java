package donglijiedian;

public class IfTest {
public static void main(String []args){
	
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.println("������ɼ�");
	double grade = s.nextDouble();
	
	//����
	String level = "��";
	if(grade>100||grade<0){
		System.out.println("��Ч�ɼ�");
		return;
	}else if(grade<60){
		level = "������";
	}else if(grade<70){
		level = "����";
	}else if(grade<90){
		level = "��";
	}
	System.out.println(level);

	
}
}
