package donglijiedian;

public class Wrok06 {
public static void main(String []args){
	//��1000���ڵ�����
	
	//1.����1000���ڵ���
	for(int i=1;i<=1000;i++){
	//	System.out.println(i);
	
		int sum=0;
		//�ҳ�����
		for(int j=1;j<=i/2;j++){
			if(i%j==0){
				sum+=j;
			}
		}
		if(sum==i){
			System.out.println(i+"������");
		}
		
	}
	
	
}
}
