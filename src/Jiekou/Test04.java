package Jiekou;

public class Test04 {
	public static void main(String[] args) {
		InsertDrawer mouse = new Mouse();
		InsertDrawer keyboard = new Keyboard();
		InsertDrawer printer = new Printer();

		Laptop a =new Laptop("��Ϊ",mouse);
		a.insertBody();
		
		Laptop b =new Laptop("��Ϊ",new Keyboard());
		b.insertBody();
	}
}

class Laptop {
	private String brand;
	private InsertDrawer insertDrawer;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String brand, InsertDrawer insertDrawer) {
		this.brand = brand;
		this.insertDrawer = insertDrawer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void insertBody() {
		this.insertDrawer.insert();
	}

	public InsertDrawer getInsertDrawer() {
		return insertDrawer;
	}

	public void setInsertDrawer(InsertDrawer insertDrawer) {
		this.insertDrawer = insertDrawer;
	}
}

interface InsertDrawer {

	void insert();
}

class Mouse implements InsertDrawer {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("����Ѿ�����");
	}

}

class Keyboard implements InsertDrawer {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("���̽���");
	}

}

class Printer implements InsertDrawer {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ������");
	}

}
