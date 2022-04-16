package ArrayList;

public class StackTest01 {
	public static void main(String[] args) {
		Mystack m =new Mystack();
		for (int i = 0; i < 10; i++) {
			
			m.push(new Object());
		}
		System.out.println("====================================");
		for (int i = 0; i < 11; i++) {
			m.pop();
		}
	}
}

class Mystack {

	private Object[] obj;
	private int index;

	public Mystack() {
		this.index = -1;
		this.obj = new Object[10];
		// TODO Auto-generated constructor stub
	}

	public Object[] getObj() {
		return obj;
	}

	public void setObj(Object[] obj) {
		this.obj = obj;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void push(Object addobj) {
		if (index >= obj.length - 1) {
			System.out.println("ջ����");
			return;
		}
		index++;
		obj[index] = addobj;
		System.out.println("ѹջԪ��" + addobj + "�ɹ���ջָ֡��" + index);
	}
	public void pop(){
		if(index<=0){
			System.out.println("��ջ�޷���ջ");
			return;
		}
		System.out.print("��ջԪ��"+obj[index]+"�ɹ�");
		obj[index]=null;
		index--;
		System.out.println("ջָ֡��"+index);
	}

}