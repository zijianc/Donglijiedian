package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
public static void main(String[] args) {
	Map<Integer, String> map =new HashMap<>();
	map.put(1, "����");
	map.put(2, "���ӽ�");
	map.put(3, "�㽶");
	map.put(4, "����");
	System.out.println(map.size());
	System.out.println(map.containsKey(1));
	//System.out.println(map.containsValue("����"));
	String value =map.get(1);
	System.out.println(value);
	
	Collection<String>values= map.values();
	for(String i :values){
		System.out.println(i);
	}
}
}
