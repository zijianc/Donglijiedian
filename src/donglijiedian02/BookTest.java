package donglijiedian02;

public class BookTest {
public static void main(String[] args){
	Book b = new Book("����",2000);
	b.detail();
	Book b2 = new Book();
	b2.detail();
}
}
class Book{
	
	//����
	private String name;
	//ҳ��
	private int num;
	
	public Book(){
		/*name= "δ֪�鼮";
		num=0;*/
		this("δ֪�鼮",0);
	}
	
	public Book(String name,int num){
		this.name=name;
		if(num<200){
			System.out.println("ҳ����������200");
			num=200;
		}else{
		this.num=num;
		}
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNum(int num){
		if(num<200){
			
			System.out.println("ҳ����������200");
			num=200;
			return ;
		}
		
		this.num=num;
	}
	public int getNum(){
		return num;
	}
	public void detail(){
		System.out.println("���ҳ��"+num+"---"+"�������"+name);
	}
	
}

