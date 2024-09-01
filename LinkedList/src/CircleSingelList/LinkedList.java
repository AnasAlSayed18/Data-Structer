package CircleSingelList;

public class LinkedList {
	Node first,last;
	static int count=-1;


	public void printList() {
		Node temp = first;
		for(int i=0;i<count;i++) {
			System.out.print(temp.getData()+" "); 

			temp=temp.next;

		}
		System.out.println(temp.getData()+" "); 

	}

	public Object getFirst() {
		if(first==null) {
			return null;
		}else {
			return  first.getData();
		}

	}

	public Object getLast() {
		if(last==null) {
			return null;
		}else {
			return  last.getData();
		}
	}



	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if(first==null) {
			first=last=newNode;
			last.next=first;
		}else {
			newNode.next = first;
			first=newNode;
			last.next=first;
		}
		count++;
	}
	public boolean removeByData(Object data) {

		if(count<0 ) {
			return false;
		}
		else if(((Object)first.getData()).equals(data)) {
			return removeFirst();
		}
		else if(((Object)last.getData()).equals(data)) {
			return removeLast();
		}

		else {
			Node ptr = first;
			for(int i=0; i<count-1;i++) {
				if(((Object)ptr.getData()).equals(data)){
					return remove(i);
				}else
					ptr=ptr.next;
			}
		}
		return false;
	}
	public boolean remove(int index) {

		if(count<0 || index>count) {
			return false;
		}
		else if(index==0 ||count==0) {
			return removeFirst();
		}
		else if(index==count) {
			return removeLast();
		}

		else {
			Node ptr = first;
			for(int i=0; i<index-1;i++) {
				ptr=ptr.next;
			}
			Node temp = ptr.next;

			ptr.next=temp.next;
			temp.next=null;
			count--;

		}
		return true;
	}
	public boolean removeFirst() {

		if(count<0) {
			return false;
		}
		else if(count==0) {
			first=last=null;
		}else {
			Node temp = first;
			first = first.next;
			temp.next=null;
			last.next=first;
		}
		count--;
		return true;
	}
	public boolean removeLast() {

		if(count<0) {
			return false;
		}
		else if(count==0) {
			first=last=null;
		}else {
			Node ptr = first;
			for(int i=0; i<count-1;i++) {
				ptr=ptr.next;
			}
			ptr.next=null;
			last=ptr;
			last.next=first;
		}
		count--;
		return true;
	}

	public void addLast(Object data) {
		Node newNode = new Node(data);
		if(last==null) {
			first=last=newNode;
			last.next=first;
		}else {
			last.next = newNode;
			last=newNode;
			last.next=first;
		}
		count++;
	}

	public void add(Object data,int index) {
		Node newNode = new Node(data);
		if(count<0) {
			addFirst(data);
		}else if(index>count){
			addLast(data);
		}
		else{
			Node temp = first;
			for(int i=0;i<count-1;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
			count++;

		}
	}


}
