package javatupdate;

public class HomeWork4 {
	public static void main(String[] args) {
		Number n = new Number(10, 0);
		n.division();
		n.addition();

	}
}

class Number {
	private int num1;
	private int num2;

	public Number() {
	}

	public Number(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// 加法方法
	public void addition() {
		System.out.println("加法结果=" + (num1 + num2));
	}

	// 减法
	public void subtraction() {
		System.out.println("减法结果=" + (num1 - num2));
	}

	// 乘法
	public void multiplication() {
		System.out.println("乘法结果=" + (num1 * num2));
	}

	// 除法
	public void division() {
		if (num2 == 0) {
			System.out.println("除数不能为0");
			return;
		}
		System.out.println("除法结果=" + (num1 / num2));
	}
}