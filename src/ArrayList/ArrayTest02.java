package ArrayList;

public class ArrayTest02 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("请输入用户名和密码，例如 陈子健 123");
			return;
		}
		String username = args[0];
		String password = args[1];
		if("陈子健".equals(username)&&"123".equals(password)){
			System.out.println("欢迎"+username+"回来");
		}else{
			System.out.println("用户名或密码错误");
		}
	}
}
