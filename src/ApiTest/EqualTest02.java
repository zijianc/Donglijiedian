package ApiTest;

public class EqualTest02 {
	public static void main(String[] args) {
		Student a =new Student(11,"³Â×Ó½¡");
		Student b =new Student(11,"³Â×Ó½¡");
		System.out.println(a.equals(b));
		Student c =new Student(12,"³Â×Ó½¡");
		System.out.println(a.equals(c));
		
		String aa =new String("1");
		String bb =new String("1");
		System.out.println(aa.equals(bb));
		
	}
}

class Student {
	private int id;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return "ÐÕÃû"+name+"Ñ§ºÅ"+id;
	}
	public boolean equals(Object obj){
		if(obj==null)return false;
		if(!(obj instanceof Student)) return false;		
		else if(this==obj)return true;
		Student temp=(Student)obj;
		if(this.id==temp.id&&this.name.equals(temp.name)){
			return true;
		}
		return false;
	}
	
}