package donglijiedian02;

public class Method03 {
	public static void main(String[]args){
		//�������ĳ������������С����
	print(4);
			
	}
	//��ӡ����
		public static void print(int num){
		while(!isZhiShu(++num)){
		/*	if(isZhiShu(++num)){
				System.out.println(num);
				break;
		
			}*/
			
		}
		System.out.println(num);
		}
		
	
	
	
	//�ж��ǲ�������
		public static boolean isZhiShu(int num){
			for(int i=2;i<num;i++){
				if(num%i==0){
					return false;
				}
			}
			return true;
			
		}
			
			
		
}
