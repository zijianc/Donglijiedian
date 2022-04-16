package Map;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MapTest03 {
public static void main(String[] args) {
	Student a =new Student("³Â×Ó½¡");
	Student b =new Student("³Â×Ó½¡");
	System.out.println(a.equals(b));
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
	//Set<Student> students=new HashSet<>();
	TreeSet<Student> students =new TreeSet<>(new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	});
	students.add(a);
	students.add(b);
	System.out.println(students.size());
	
}
}

class Student {
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	

	
	

}