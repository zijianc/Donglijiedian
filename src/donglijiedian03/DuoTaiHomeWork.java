package donglijiedian03;

public class DuoTaiHomeWork {
	public static void main(String[] args) {
		Master m = new Master();
		// Pet a =new Pet();
		Dog dog = new Dog();
		Yingwu yingwu = new Yingwu();
		Pet cat = new Cat();
		//Cat c = (Cat) cat;// 向下转型

		m.feed(cat);

		m.feed(new Dog());
		
	}
}

// 主人类
class Master {
	// 喂养方法
	// boolean类型的，如果是真，说明可以喂，宠物就吃
	public void feed(Pet p) {
//	Pet p =new Bird();		
		p.eat();
	}
}

// 宠物类
class Pet {
	// 宠物吃的方法
	public void eat() {
		System.out.println("宠物在吃");
	}
}

// 狗类
class Dog extends Pet {
	public void eat() {
		System.out.println("狗在吃");
	}
}

// 猫类
class Cat extends Pet {
	public void eat() {
		System.out.println("猫在吃");
	}
}

// 鹦鹉类
class Yingwu extends Pet {
	public void eat() {
		System.out.println("鹦鹉在吃");
	}
}