package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//map�����ֱ�����ʽ
public class MapTest02 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "���");
		map.put(2, "����");
		map.put(3, "�ֻ�");
		map.put(4, "������");

		// keySet()
		Set<Integer> keys = map.keySet();
		// ������
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
		
		
		// �ڶ��ַ���
		// entrySet()
		// ת����set
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		// ����
		Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
		while (it2.hasNext()) {
			// it2��next��ʵ����һ���ڵ�
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
