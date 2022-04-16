package donglijiedian;

public class Work04 {
public static void main(String[]args){
	
	java.util.Scanner s=new java.util.Scanner(System.in);
	System.out.println("请输入一个正整数");
	int num= s.nextInt();
	
	for(int i =1;i<=num;i++){
		//System.out.println(i);
	//空格数
	for(int k=1;k<=num-i;k++){
		System.out.print(" ");
	}
	//*数
	for(int j=1;j<=i*2-1;j++){
		System.out.print("*");
	}
	System.out.println();
	}
}
}
