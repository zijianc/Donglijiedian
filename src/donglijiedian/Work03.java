package donglijiedian;

public class Work03 {
	public static void main(String[]args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("������һ����������");
		int num =s.nextInt();
		
		boolean prime = true;
		
	for(int i =2;i<num;i++){
		//System.out.println(i);
		if(num%i==0){
			//System.out.println("��������");
			prime =false;
			break;
		}
	}
		System.out.println(prime?"����":"��������");
	}
}
