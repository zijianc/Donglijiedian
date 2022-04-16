package donglijiedian02;

public class ZhangfuQizi {
	public static void main(String[]args){
	Husband x= new Husband("³Â×Ó½¡","1","2000",null);
	Wife w =new Wife("ÃÀÅ®","1","2000",x);
	x.wife=w;
	System.out.println(w.husband.name);
	System.out.println(x.wife.name);
	}
}
class Husband{
	String name;
	String id;
	String birth;
	Wife wife;
	public Husband(){
		
	}
	public Husband(String name,String id,String birth,Wife wife){
	this.name=name;
	this.id=id;
	this.birth=birth;
	this.wife=wife;
	}
}

class Wife{
	String name;
	String id;
	String birth;
	Husband husband;
	
	public Wife(){}
	public Wife(String name,String id,String birth,Husband husband){
		this.name=name;
		this.id=id;
		this.birth=birth;
		this.husband=husband;
		}
	
}