package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//���ڼ��ϵ���/����
public class CollectionTest02 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("��");
		c.add(2);
		c.add(3.14);
		Iterator i = c.iterator();
		/*
		 * boolean hasNext() �������Ԫ�ؿ��Ե������򷵻� true�� E next() ���ص�������һ��Ԫ�ء� 
		 * void remove() �ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ��������
		 */
		while(i.hasNext()){
			
			//Object z=i.next();
			System.out.println(i.next());
		}
	}
}
