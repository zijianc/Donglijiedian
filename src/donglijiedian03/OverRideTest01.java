package donglijiedian03;

public class OverRideTest01 {
	public static void main(String[] args) {
	/*	People p1 =new People("����");
		p1.speak();
		
		Chinese p2 =new Chinese();
		p2.setName("���ӽ�");
		p2.speak();
		
		American p3 =new American();
		p3.setName("logan");
		p3.speak();*/
		
		People p1 = new Chinese();
		p1.setName("���ӽ�");
		p1.speak();
		
	}
}

class People {
	// ����
	private String name;

	// ����
	public People() {
	}

	public People(String name) {
		this.name = name;
	}

	// set��get
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println(name + "��˵��");
	}
}

class Chinese extends People {
	public void speak(){
		System.out.println(this.getName()+"��˵����");
	}
}
class American extends People{
	public void speak(){
		System.out.println(this.getName()+"is speaking");
	}
}