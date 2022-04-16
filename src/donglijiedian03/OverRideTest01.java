package donglijiedian03;

public class OverRideTest01 {
	public static void main(String[] args) {
	/*	People p1 =new People("人类");
		p1.speak();
		
		Chinese p2 =new Chinese();
		p2.setName("陈子健");
		p2.speak();
		
		American p3 =new American();
		p3.setName("logan");
		p3.speak();*/
		
		People p1 = new Chinese();
		p1.setName("陈子健");
		p1.speak();
		
	}
}

class People {
	// 属性
	private String name;

	// 构造
	public People() {
	}

	public People(String name) {
		this.name = name;
	}

	// set和get
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println(name + "在说话");
	}
}

class Chinese extends People {
	public void speak(){
		System.out.println(this.getName()+"在说中文");
	}
}
class American extends People{
	public void speak(){
		System.out.println(this.getName()+"is speaking");
	}
}