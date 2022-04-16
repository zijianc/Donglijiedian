package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest02 {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("你好");
	l.add("世界");
	
	Iterator<String>it= l.iterator();
	while(it.hasNext()){
//		it.next().concat("添加的");
		System.out.println(it.next().concat("=====添加的"));
	}
	
}
}
