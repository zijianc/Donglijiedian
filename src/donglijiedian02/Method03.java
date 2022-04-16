package donglijiedian02;

public class Method03 {
	public static void main(String[]args){
		//输出大于某个正整数的最小质数
	print(4);
			
	}
	//打印方法
		public static void print(int num){
		while(!isZhiShu(++num)){
		/*	if(isZhiShu(++num)){
				System.out.println(num);
				break;
		
			}*/
			
		}
		System.out.println(num);
		}
		
	
	
	
	//判断是不是质数
		public static boolean isZhiShu(int num){
			for(int i=2;i<num;i++){
				if(num%i==0){
					return false;
				}
			}
			return true;
			
		}
			
			
		
}
