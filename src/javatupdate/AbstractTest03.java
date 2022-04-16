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

	// ����
	public void feed(Pet p) {

		// ��ȻPet�಻�ɴ������󣬵���ʵ�������˶�̬
		// Pet dog =new Dog();
		// Pet cat =new Cat();
		p.eat();
	}
}

// ������
abstract class Pet {
	// �Է���
	public abstract void eat();
}

class Dog extends Pet {
	// �ǳ�����̳г����࣬��Ҫ�����󷽷����ǣ�ʵ��
	public void eat() {
		System.out.println("���Թ���");
	}
}

class Cat extends Pet {
	public void eat() {
		System.out.println("è�ٳ�è��");
	}
}