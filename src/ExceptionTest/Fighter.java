package ExceptionTest;

public class Fighter extends Weapon implements Moveable,Shootable{

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("战斗机攻击");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("战斗机移动");
	}

}
