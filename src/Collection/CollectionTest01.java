package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
public static void main(String[] args) {
	Collection c =new ArrayList();
	c.add(1200);
	c.add(3.14);
	c.add(new Student());
	//c.clear();
	int size =c.size();
	System.out.println(size);
	Object[] o=c.toArray();
	for (int i = 0; i < o.length; i++) {
		System.out.println(o[i]);
	}
	
	
}
}
class Student{
	
}
