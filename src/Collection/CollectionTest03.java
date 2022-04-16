package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
public static void main(String[] args) {
	Collection c =new ArrayList();
	c.add(1);
	c.add(2);
	c.add(3);
	Iterator it=c.iterator();
	
	while(it.hasNext()){
		Object obj = it.next();
//		if(obj instanceof Integer){
//			System.out.println("Integer¿‡–Õ");
//		}
		System.out.println(obj);
	}
	
	
	Collection c2 =new HashSet();
	c2.add(200);
	c2.add(1000);
	c2.add(100);
	c2.add(150);
	c2.add(150);
	c2.add(1);
	c2.add(3);
	c2.add(4);
	Iterator i=c2.iterator();
	while(i.hasNext()){
		Object o2 =i.next();
		System.out.println(o2);
		
		
		
		
	}
	
	
}
}
