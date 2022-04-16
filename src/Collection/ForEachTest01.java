package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ForEachTest01 {
public static void main(String[] args) {
	int[] arr={2,70,30,40};
	Arrays.sort(arr);
	List<Integer> list =new ArrayList<>();
	list.add(100);
	list.add(200);
	list.add(150);
	list.add(50);
	Collections.sort(list);
	Collections.reverse(list);
	/*Iterator<Integer> it= list.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}*/
	for(Integer i :list){
		System.out.println(i);
	}
	
	System.out.println("===================");
	//‘ˆ«øfor—≠ª∑
	for(int data : arr){
		System.out.println(data);
	}
}
}
