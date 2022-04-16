package javatupdate;

public class AbstractTest03 {
	public static void main(String[] args) {
		Master m = new Master();
		Pet dog = new Dog();
		Pet cat = new Cat();
		m.feed(cat);
		m.feed(dog);

		/*
		 * Cannot instantiate the type Pet
		 * 
		 * Pet p =new Pet();
		 */

	}
}

class Master {

	// 方法
	public void feed(Pet p) {

		// 虽然Pet类不成创建对象，但其实这里用了多态
		// Pet dog =new Dog();
		// Pet cat =new Cat();
		p.eat();
	}
}

// 抽象类
abstract class Pet {
	// 吃方法
	public abstract void eat();
}

class Dog extends Pet {
	// 非抽象类继承抽象类，需要将抽象方法覆盖，实现
	public void eat() {
		System.out.println("狗吃狗粮");
	}
}

class Cat extends Pet {
	public void eat() {
		System.out.println("猫再吃猫粮");
	}
}