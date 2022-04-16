package ArrayList;

public class ArrayTest03 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();

		Animal[] animals = { a1, a2 };
		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		System.out.println("===============================");
		Animal[] aa = { new Cat(), new Bird() };
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] instanceof Bird) {
				Bird b = (Bird) aa[i];
				b.sing();
			} else if (aa[i] instanceof Cat) {
				Cat c = (Cat) aa[i];
				c.catMouse();
			}
		}
		System.out.println("=================================");

		Animal[] aaa = new Animal[2];
		aaa[0] = new Cat();
		aaa[1] = new Bird();
		aaa[0].move();
		aaa[1].move();
		
		
	}
}

class Animal {
	public void move() {
		System.out.println("animal move");
	}
}

class Cat extends Animal {
	public void move() {
		System.out.println("Ã¨ÔÚÅÜ");
	}

	public void catMouse() {
		System.out.println("Ã¨×¥ÀÏÊó");
	}
}

class Bird extends Animal {
	public void move() {
		System.out.println("ÄñÔÚ·É");
	}

	public void sing() {
		System.out.println("ÄñÔÚ³ª¸è");
	}
}