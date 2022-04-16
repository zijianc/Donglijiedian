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
	// 弹奏方法
	//多态Instrument i = 。。。。
	public void play(Instrument i) {
		i.makeSound();
	}
}

abstract class Instrument {
	public abstract void makeSound();
}

class ErHu extends Instrument {
	public void makeSound() {
		System.out.println("二泉映月正在演奏");
	}
}

class Piano extends Instrument {
	public void makeSound() {
		System.out.println("菊次郎的夏天正在演奏");
	}
}

class Violin extends Instrument {
	public void makeSound() {
		System.out.println("小提琴正在演奏");
	}
}