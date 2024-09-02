package LinkedQueue;

public class QNode {
	QNode next;
	Object data;

	public QNode (Object key) {
		this.data=key;
	}
	@Override
	public String toString() {
		return  String.valueOf(data);
	}

	public QNode getNext() {
		return next;
	}
	public void setNext(QNode next) {
		this.next = next;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
