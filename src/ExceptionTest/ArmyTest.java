package ExceptionTest;

public class ArmyTest {
public static void main(String[] args) {
	Army a =new Army(3);
	//´´½¨ÎäÆ÷
	Weapon tank =new Tank();
	Weapon tank2 =new Tank();
	Fighter fighter=new Fighter();
	Gaoshepao gaoshepao =new Gaoshepao();
	
	try {
		a.addWeapon(tank);
		a.addWeapon(gaoshepao);
		a.addWeapon(fighter);
		//a.addWeapon(tank2);
	} catch (OverflowException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
	}
	a.attAckall();
	a.allMove();
	
}

}
