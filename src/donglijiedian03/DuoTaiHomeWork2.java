package donglijiedian03;

public class DuoTaiHomeWork2 {
	public static void main(String[] args) {
		Musician m = new Musician();
		ErHu erhu =new ErHu();
		Piano p= new Piano();
		Violin v =new Violin();
	
		
		m.play(p);
		m.play(v);
		m.play(erhu);
		
	}
}

class Musician {
	// ���෽��
	//��̬Instrument i = ��������
	public void play(Instrument i) {
		i.makeSound();
	}
}

abstract class Instrument {
	public abstract void makeSound();
}

class ErHu extends Instrument {
	public void makeSound() {
		System.out.println("��Ȫӳ����������");
	}
}

class Piano extends Instrument {
	public void makeSound() {
		System.out.println("�մ��ɵ�������������");
	}
}

class Violin extends Instrument {
	public void makeSound() {
		System.out.println("С������������");
	}
}