package ExceptionTest;

public class Army {
	private Weapon[] weapons;
	private int index;
	public Army() {
		// TODO Auto-generated constructor stub
	}

	public Army(int count) {
		weapons = new Weapon[count];
		index =-1;
	}
	
	public void addWeapon(Weapon w)throws OverflowException{
		if(index<weapons.length){
			weapons[++index]=w;
			return;
		}
		
		throw new OverflowException("Êý×éÒÑÂú");
			
	}
	
	public void attAckall(){
		for (int i = 0; i < weapons.length; i++) {
			if(weapons[i]instanceof Shootable){
				Shootable shootable =(Shootable) weapons[i];
				shootable.shoot();
			}
		}
	}
	
	public void allMove(){
		for (int i = 0; i < weapons.length; i++) {
			if(weapons[i] instanceof Moveable){
				Moveable moveable=(Moveable)weapons[i];
				moveable.move();
			}
		}
		
	}
}
