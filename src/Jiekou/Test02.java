package Jiekou;

public class Test02 {
	public static void main(String[] args) {
		Flyable f1 = new Cat();
		f1.fly();
		Animal a =new Cat();
		a.move();
		
		Cat c =(Cat)a;
		c.special();
	
		
		
	}
}

class Animal {
	public void move() {
		System.out.println();
	}
}

interface Flyable {
	void fly();
	
}

class Cat extends Animal implements Flyable {

	public void move(){
		System.out.println("猫在走猫步");
	}
	@Override
	public void fly() {
		System.out.println("我是一只飞猫");

	}
	
	public void special(){
		System.out.println("这是cat的特殊方法，需要向下转型");
	}

}