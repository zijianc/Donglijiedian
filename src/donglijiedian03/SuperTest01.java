package donglijiedian03;

public class SuperTest01 {
	public static void main(String[] args) {
		Vip v = new Vip("���ӽ�", 100);
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
	String name;// ���ӽ�
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
	 * public void shopping() { System.out.println(name + "�ڹ���");
	 * System.out.println(this.name + "�ڹ���"); System.out.println(super.name +
	 * "�ڹ���"); }
	 */
	public void doSome() {
		System.out.println(super.name);
	}

}