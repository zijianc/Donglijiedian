package donglijiedian02;

public class Method02 {
	public static void main(String[]args){
	//��дһ���������������n�Ľ׳ˣ���5�Ľ׳���5*4*3*2*1��
	//1.����¼�룬����һ������
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("������һ������");
		int num=s.nextInt();
		int result=Method02.mul(num);
		System.out.println("������Ľ׳���"+result);
	
}
	public static int mul(int x){
		int result=1;
		for(int i=x;i>1;i--){
			result*=i;
		}
		return result;
	}



}
