package donglijiedian;

public class Work02 {
public static void main(String[]args){
	
	java.util.Scanner s= new java.util.Scanner(System.in);
	System.out.println("������һ������");
	int i=s.nextInt();
	int mul=1;
	for(;i>0;i--){
		//System.out.println(i);
		mul*=i;
	}
	System.out.println(mul);
}

}
