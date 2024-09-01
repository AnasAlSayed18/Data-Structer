package StackeList;


public class Node {
	Node next;
	Object data;

	public Node (Object key) {
		this.data=key;
	}
	@Override
	public String toString() {
		return  String.valueOf(data);
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
