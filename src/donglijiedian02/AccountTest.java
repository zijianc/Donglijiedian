package donglijiedian02;

public class AccountTest {
	public static void main(String[] args) {
		// 1.创建账户
		Account a = new Account("1000", 2000, 0.0123);
		
		//创建顾客
		Customer b =new Customer("Jane smith",a);
		/* 2.存款
		a.deposite(100);
		a.withdraw(960);
		a.withdraw(2000);
*/
		b.getAct().deposite(100);
		b.getAct().withdraw(960);
		b.getAct().withdraw(2000);
	}
}

// 顾客类
class Customer {
	private String name;
	private Account act;

	// 无参构造
	public Customer() {
	}

	// 有参构造
	public Customer(String name, Account act) {
		this.name = name;
		this.act = act;
	}

	// set和get方法
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAct(Account act) {
		this.act = act;
	}

	public Account getAct() {
		return act;
	}
}

// 账户类
class Account {
	// 账户
	private String id;
	// 余额
	private double balance;
	// 年利率
	private double annualinterestrate;

	public Account() {
	}

	public Account(String id, double balance, double annualinterestrate) {
		this.id = id;
		this.balance = balance;
		this.annualinterestrate = annualinterestrate;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setAnnualinterestrate(double annualinterestrate) {
		this.annualinterestrate = annualinterestrate;
	}

	public double getAnnualinterestrate() {
		return annualinterestrate;
	}

	// 存款方法f
	public void withdraw(double money) {
		// 取钱，告诉该方法，取出多少钱
		// 钱不够
		if (money > this.getBalance()) {
			System.out.println("余额不足，取钱失败");
			return;
		}
		// 到这一步，说明钱够
		// balance-=money;
		this.setBalance(this.getBalance() - money);
		System.out.println("成功取款:" + money);
	}

	// 存款方法
	public void deposite(double money) {
		// balance+=money;
		this.setBalance(this.getBalance() + money);
		System.out.println("成功存款:" + money);
	}
}
