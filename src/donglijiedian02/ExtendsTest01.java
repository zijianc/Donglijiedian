package donglijiedian02;

public class ExtendsTest01 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("Ã¨");
		c.doSome();
	}
}

class Animal {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doSome() {
		System.out.println(this.getName() + "ÕıÔÚÅÜ²½");
	}
}

class Cat extends Animal {

}