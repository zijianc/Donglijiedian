package Jiekou;

public class Test03 {
	public static void main(String[] args) {
		/*Menu chinese =new ChinaCooker();
		Menu west =new WestCooker();*/
		Customer c =new Customer(new ChinaCooker());
		//c.menu= chinese;
		c.order();
		
		
		Customer c2= new Customer(new WestCooker());
		c2.order();
		
	}
}

class Customer {
	Menu menu;

	public Customer() {
	}

	public Customer(Menu menu) {
		this.menu = menu;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public void order(){
		this.menu.fanqiechaodan();
		this.menu.yuxiangrousi();
	}
}

interface Menu {
	void fanqiechaodan();

	void yuxiangrousi();
}

class ChinaCooker implements Menu {
	public void fanqiechaodan() {
		System.out.println("chinese ∑¨«—≥¥µ∞");
	}

	public void yuxiangrousi() {
		System.out.println("chinese ”„œ„»‚Àø");
	}
}

class WestCooker implements Menu {
	public void fanqiechaodan() {
		System.out.println("west ∑¨«—≥¥µ∞");
	}

	public void yuxiangrousi() {
		System.out.println("west ”„œ„»‚Àø");
	}
}