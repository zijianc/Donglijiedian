package donglijiedian;

public class Wrok06 {
public static void main(String []args){
	//求1000以内的完数
	
	//1.所有1000以内的数
	for(int i=1;i<=1000;i++){
	//	System.out.println(i);
	
		int sum=0;
		//找出因子
		for(int j=1;j<=i/2;j++){
			if(i%j==0){
				sum+=j;
			}
		}
		if(sum==i){
			System.out.println(i+"是完数");
		}
		
	}
	
	
}
}
