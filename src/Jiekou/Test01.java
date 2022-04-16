package Jiekou;

/*
	接口语法
	【修饰符】 interface 接口名{}
	2.接口是完全抽象的，抽象类是半抽象
	3.接口可以多继承
	4.接口中只能由抽象方法和常量
	5.接口中的元素全是public修饰的
	6.接口中的抽象方法的 public abstract 可以省略
	7.接口中都是抽象方法，所以不能有方法体
	
	//extends 在前， implements 再后
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
	 //public static final 可以省略
	 double b=9.4;
 }
 class D implements C{
	public int sum (int a,int b){
		return a+b;
	}

 
 }
 