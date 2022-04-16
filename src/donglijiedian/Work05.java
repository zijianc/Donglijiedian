package donglijiedian;

public class Work05 {
public static void main(String[]args){
	//设置第n天完成
/*	int n =1000000;
	double sum =0;
	for(int i=1;i<n;i++){
		sum+=2.5;
		if(i%5==0){
			sum-=6;
		}
		if(sum>=100){
			n=i;
			break;
		}
	}
	System.out.println(n);*/
	
	//初始的钱
	double money =0;
	int day =0;
	
	while(money<100){
		day++;
		money+=2.5;
		if(day%5==0){
			money-=6;
		}
//		/*if(money>=100){
//			break;*/
//		}	
	}
	System.out.println(day);
	
}
}
