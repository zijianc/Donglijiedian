package donglijiedian02;

public class Recursion {
	public static void main(String[]args){
		int i=sum(1);
		System.out.println(i);
	}
	
	public static int sum(int i){
		if(i==1){
			return 1;
		}
		return i+sum(i-1);
		//µ±i=2£¬ return 2+sum(1);
		//      =return 2+1
	}
	
	
}
