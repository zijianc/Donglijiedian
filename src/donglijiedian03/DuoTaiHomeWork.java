package donglijiedian03;

public class DuoTaiHomeWork {
	public static void main(String[] args) {
		Master m = new Master();
		// Pet a =new Pet();
		Dog dog = new Dog();
		Yingwu yingwu = new Yingwu();
		Pet cat = new Cat();
		//Cat c = (Cat) cat;// ����ת��

		m.feed(cat);

		m.feed(new Dog());
		
	}
}

// ������
class Master {
	// ι������
	// boolean���͵ģ�������棬˵������ι������ͳ�
	public void feed(Pet p) {
//	Pet p =new Bird();		
		p.eat();
	}
}

// ������
class Pet {
	// ����Եķ���
	public void eat() {
		System.out.println("�����ڳ�");
	}
}

// ����
class Dog extends Pet {
	public void eat() {
		System.out.println("���ڳ�");
	}
}

// è��
class Cat extends Pet {
	public void eat() {
		System.out.println("è�ڳ�");
	}
}

// ������
class Yingwu extends Pet {
	public void eat() {
		System.out.println("�����ڳ�");
	}
}