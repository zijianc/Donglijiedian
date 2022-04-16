package ExceptionTest;

public class ExceptionTest1 {
public static void main(String[] args) {
	Userserve user =new Userserve();
	try {
		user.register("陈子健", 123);
	} catch (IllegalNameException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
class Userserve{
	
	public void register(String name, int password) throws IllegalNameException{
		if(null==name||name.length()<6||name.length()>14){
			throw new IllegalNameException("用户名不合法");
		}
		System.out.println("欢迎["+name+"]");
	}
	
	
	
}