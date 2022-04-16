package javatupdate;

public class Day16Work01 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setSize(20);
		v.setSpeed(100);
		v.speedUp(100);
		System.out.println("速度："+v.getSpeed()+","+"体积："+v.getSize());
	}
}

class Vehicle {
	private int speed;
	private int size;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	//无参构造
	public Vehicle() {
	}

	public Vehicle(int speed, int size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	// 移动方法
	public void move() {
		System.out.println("移动方法开始");
	}

	// 加速
	public void speedUp(int i) {
		//this.speed+=i;
		this.setSpeed(this.getSpeed()+i);

	}

	// 减速
	public void speedDown(int i) {
		//this.speed-=i;
		this.setSpeed(this.getSpeed()-i);
	}
}