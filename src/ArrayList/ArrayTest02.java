package ArrayList;

public class ArrayTest02 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("�������û��������룬���� ���ӽ� 123");
			return;
		}
		String username = args[0];
		String password = args[1];
		if("���ӽ�".equals(username)&&"123".equals(password)){
			System.out.println("��ӭ"+username+"����");
		}else{
			System.out.println("�û������������");
		}
	}
}
