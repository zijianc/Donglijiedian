package Link;

public class Link <E>{
	
	//ͷ�ڵ�
	Node head;
	//���
	//public void add(Object obj) 
	public void add(E obj){
		if(null==head){
			head =new Node(obj, null);
		}
		Node currentLast=findLast(head);
		currentLast.next=new Node(obj, null);
	}
	private Node findLast(Node n) {
		// TODO Auto-generated method stub
		if(null==n){
		return n;
		}
		return findLast(n.next);
	}
	//�Ƴ�
	public void remove(){
		
	}
	
	//����
	public void modify(){
		
	}
	
}
