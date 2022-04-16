package donglijiedian02;

public class Recursion02 {
	public static void main(String[]args){
		int a=times(4);
		System.out.println(a);
	}
	
	public static int times(int i){
		if(i==1){
			return 1;
		}
		return i*=times(i-1);
	}
	
}
