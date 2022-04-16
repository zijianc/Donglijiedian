package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
public static void main(String[] args) {
	Map<Integer, String> map =new HashMap<>();
	map.put(1, "³È×Ó");
	map.put(2, "³Â×Ó½¡");
	map.put(3, "Ïã½¶");
	map.put(4, "Î÷¹Ï");
	System.out.println(map.size());
	System.out.println(map.containsKey(1));
	//System.out.println(map.containsValue("³È×Ó"));
	String value =map.get(1);
	System.out.println(value);
	
	Collection<String>values= map.values();
	for(String i :values){
		System.out.println(i);
	}
}
}
