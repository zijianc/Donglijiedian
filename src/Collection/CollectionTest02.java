package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//关于集合迭代/遍历
public class CollectionTest02 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("你");
		c.add(2);
		c.add(3.14);
		Iterator i = c.iterator();
		/*
		 * boolean hasNext() 如果仍有元素可以迭代，则返回 true。 E next() 返回迭代的下一个元素。 
		 * void remove() 从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
		 */
		while(i.hasNext()){
			
			//Object z=i.next();
			System.out.println(i.next());
		}
	}
}
