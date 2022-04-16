package ApiTest;

public class Test01 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.mysum(new Computable(){
			public int sum(int a, int b){
				return a+b;
			}
		}, 101, 200);
		
	}
}

	interface Computable {
		int sum(int a, int b);
	}

	// 不写匿名内部类的话，写要写一个实现类
	class shixian implements Computable {
		public int sum(int a, int b) {
			return a + b;
		}
	}

class Teacher {
	public void mysum(Computable c, int a, int b) {
		/*
		 * int result=c.sum(a, b); System.out.println(result);
		 */
		// 合并
		System.out.println(c.sum(a, b));
	}
}