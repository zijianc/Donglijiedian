package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//深入contains 方法
public class CollectionTest04 {
public static void main(String[] args) {
	List c =new ArrayList();
	Collections.synchronizedList(c);
	User u1 =new User("陈子健");
	User u2 =new User("陈子健");
	c.add(u1);
	System.out.println(c.contains(u2));//false
	System.out.println(c.remove(u2));
}
}
class User{
	String name;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name) {
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
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
