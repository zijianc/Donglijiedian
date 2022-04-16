package donglijiedian02;

public class AccountTest {
	public static void main(String[] args) {
		// 1.�����˻�
		Account a = new Account("1000", 2000, 0.0123);
		
		//�����˿�
		Customer b =new Customer("Jane smith",a);
		/* 2.���
		a.deposite(100);
		a.withdraw(960);
		a.withdraw(2000);
*/
		b.getAct().deposite(100);
		b.getAct().withdraw(960);
		b.getAct().withdraw(2000);
	}
}

// �˿���
class Customer {
	private String name;
	private Account act;

	// �޲ι���
	public Customer() {
	}

	// �вι���
	public Customer(String name, Account act) {
		this.name = name;
		this.act = act;
	}

	// set��get����
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

// �˻���
class Account {
	// �˻�
	private String id;
	// ���
	private double balance;
	// ������
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

	// ����f
	public void withdraw(double money) {
		// ȡǮ�����߸÷�����ȡ������Ǯ
		// Ǯ����
		if (money > this.getBalance()) {
			System.out.println("���㣬ȡǮʧ��");
			return;
		}
		// ����һ����˵��Ǯ��
		// balance-=money;
		this.setBalance(this.getBalance() - money);
		System.out.println("�ɹ�ȡ��:" + money);
	}

	// ����
	public void deposite(double money) {
		// balance+=money;
		this.setBalance(this.getBalance() + money);
		System.out.println("�ɹ����:" + money);
	}
}
