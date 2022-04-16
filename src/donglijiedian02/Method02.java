package donglijiedian02;

public class Method02 {
	public static void main(String[]args){
	//编写一个方法，求出整数n的阶乘，如5的阶乘是5*4*3*2*1；
	//1.键盘录入，接受一个整数
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("请输入一个整数");
		int num=s.nextInt();
		int result=Method02.mul(num);
		System.out.println("这个数的阶乘是"+result);
	
}
	public static int mul(int x){
		int result=1;
		for(int i=x;i>1;i--){
			result*=i;
		}
		return result;
	}



}
