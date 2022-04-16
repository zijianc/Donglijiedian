package donglijiedian03;

public class SuperTest01 {
	public static void main(String[] args) {
		Vip v = new Vip("陈子健", 100);
		// v.shopping();
		/*
		 * Customer c = new Vip(); Vip v1=(Vip)c; v1.shopping();
		 */
		v.doSome();
		System.out.println(v.id);
		System.out.println(v.name);

	}
}

class Customer {
	String name;// 陈子健
	int id;

	public Customer() {
		// super();
		// name=null;
	}

	public Customer(String name) {
		this.name = name;
	}

	public void doSome() {
		System.out.println(name);
	}
}

class Vip extends Customer {
	String name;// null

	public Vip() {
	}

	public Vip(String name, int id) {
		// super(name);
		// super();
		this.name = name;
		this.id = id;

	}

	/*
	 * public void shopping() { System.out.println(name + "在购物");
	 * System.out.println(this.name + "在购物"); System.out.println(super.name +
	 * "在购物"); }
	 */
	public void doSome() {
		System.out.println(super.name);
	}

}