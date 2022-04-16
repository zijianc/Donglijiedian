package Enum2;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(divide(10, 2)==result.SUCCESS?"³É¹¦":"Ê§°Ü");
		
	}
	public static result divide(int a, int b){
		try {
			int c =a/b;
			return result.SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			return result.FAIL;
		}
	}
	
	
}
enum result{
	SUCCESS,FAIL
}