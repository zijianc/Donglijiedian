package Link;

public class Link <E>{
	
	//头节点
	Node head;
	//添加
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
	//移除
	public void remove(){
		
	}
	
	//调整
	public void modify(){
		
	}
	
}
