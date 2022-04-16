package donglijiedian;

public class IfTest02 {
public static void main(String[]args){	
	java.util.Scanner s =new java.util.Scanner(System.in);
	/*System.out.println("请输入性别，男为1，女为0");
	int sex = s.nextInt();
	System.out.println("请输入天气，1为雨天，0为晴天");
	int weather =s.nextInt();
	//雨天
	if(weather==0){
		//男	
		if(sex==1){
			System.out.println("打个黑伞");
		}else if(sex==0){
			System.out.println("打花伞");
		}
		//晴天
	}else if(weather==1){
		if(sex==1){
			System.out.println("去玩");
		}else if(sex==0){
			System.out.println("涂防晒霜");
		}
	}*//*
		for(;;){
			System.out.println("eternal");
		}*/
	int sum=0;
	for(int i=1;i<100;i+=2){
	//	System.out.println(i);
		sum+=i;
		System.out.println(sum);
	}
	//System.out.println(sum);
}
}
