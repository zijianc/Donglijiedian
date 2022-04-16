package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//map的两种遍历方式
public class MapTest02 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "鼠标");
		map.put(2, "键盘");
		map.put(3, "手机");
		map.put(4, "仙人掌");

		// keySet()
		Set<Integer> keys = map.keySet();
		// 迭代器
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("============");
		// foreach
		for (Integer i : keys) {
			System.out.println(i + "=" + map.get(i));
		}

		System.out.println("--------------");
		
		
		// 第二种方法
		// entrySet()
		// 转换成set
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		// 遍历
		Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
		while (it2.hasNext()) {
			// it2的next其实就是一个节点
			Map.Entry<Integer, String> node = it2.next();
			Integer key=node.getKey();
			String value =node.getValue();
			System.out.println(key+"="+value);
		}
		System.out.println("++++++++++");
		for(Map.Entry<Integer, String> node :set){
			System.out.println(node.getKey()+"="+node.getValue());
		}
		

	}

}
