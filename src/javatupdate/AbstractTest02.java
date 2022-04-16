package javatupdate;

public class AbstractTest02 {
	public static void main(String[] args) {
		/*Animal cat =new Cat();
		cat.move();*/
		
		Animal bird =new Bird();
		bird.move();
		
		final int i;
		System.out.println(i=100);
	}
}

abstract class Animal {
	public abstract void move();
}

class Bird extends Animal{
	public  void move(){
		System.out.println("鸟儿在飞翔");
	}
}
/*class Cat extends Animal{
	public  void move(){
		System.out.println("猫在走猫步");
	}
}*/