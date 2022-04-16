package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListTest01 {
public static void main(String[] args) {
	List a =new ArrayList();
	List a1 =new ArrayList(100);
	
	Collection c =new HashSet();
	c.add(100);
	c.add(200);
	c.add(300);
	c.add(100);
	
	List a2 =new ArrayList(c);
	List<Animal> a3 =new ArrayList<>();
	Animal cat =new Cat();
	a3.add(cat);
	Iterator<Animal> it=a3.iterator();
	for (int i = 0; i < a2.size(); i++) {
		System.out.println(a2.get(i));
	}
}
}
class Animal{
	public void move(){
		System.out.println("ÒÆ¶¯");
	}
}
class Cat extends Animal{
	
}