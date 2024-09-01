package CircleSingelList;

public class Node <object>{
	private object data;
	Node next;
	public Node(object data) {
	this.data=data;
	}
	public object getData() {
		return data;
	}
	public void setData(object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	

}
