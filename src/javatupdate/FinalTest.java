package javatupdate;

public class FinalTest {
	public static void main(String[] args) {
		
		A a = new A(10,20);
		System.out.println(a.i);
	
		

	}

}

class A {
	 static int i =1;
     int a ;
     int b;
	public A() {

	}

	public A(int a,int b) {
	this.a=a;
	this.b=b;
	
	}
}