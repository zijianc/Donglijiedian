package donglijiedian02;

public class BookTest {
public static void main(String[] args){
	Book b = new Book("好书",2000);
	b.detail();
	Book b2 = new Book();
	b2.detail();
}
}
class Book{
	
	//名称
	private String name;
	//页数
	private int num;
	
	public Book(){
		/*name= "未知书籍";
		num=0;*/
		this("未知书籍",0);
	}
	
	public Book(String name,int num){
		this.name=name;
		if(num<200){
			System.out.println("页数不能少于200");
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
			
			System.out.println("页数不能少于200");
			num=200;
			return ;
		}
		
		this.num=num;
	}
	public int getNum(){
		return num;
	}
	public void detail(){
		System.out.println("书的页数"+num+"---"+"书的名称"+name);
	}
	
}

