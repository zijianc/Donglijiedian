package Jiekou;

/*
	�ӿ��﷨
	�����η��� interface �ӿ���{}
	2.�ӿ�����ȫ����ģ��������ǰ����
	3.�ӿڿ��Զ�̳�
	4.�ӿ���ֻ���ɳ��󷽷��ͳ���
	5.�ӿ��е�Ԫ��ȫ��public���ε�
	6.�ӿ��еĳ��󷽷��� public abstract ����ʡ��
	7.�ӿ��ж��ǳ��󷽷������Բ����з�����
	
	//extends ��ǰ�� implements �ٺ�
*/
public class Test01 {
public static void main(String[] args) {
	
}
}
 interface A{}
 
 interface B extends A{}
 
 interface C extends A,B{
	 int sum (int a,int b);
	 
	 public static final int c=1;
	 //public static final ����ʡ��
	 double b=9.4;
 }
 class D implements C{
	public int sum (int a,int b){
		return a+b;
	}

 
 }
 