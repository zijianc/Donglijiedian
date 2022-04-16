package ArrayList;

public class ArrayTest04 {
public static void main(String[] args) {
	Object[] obj ={new Object(),new Object(),new Object()};
	
	Object[] newObj=new Object[5];
	
	System.arraycopy(obj, 0, newObj, 2, obj.length);
	
	for (int i = 0; i < newObj.length; i++) {
		System.out.println(newObj[i]);
	}
	
}
}
