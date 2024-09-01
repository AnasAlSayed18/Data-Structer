package singlLinkedList;



public class LinkedList {
	 Node first;
	Node last;
	static int count=-1;

	public void rd(Node f,Node temp) {
		
		if(f.next==null) {
			return;
		}
		
if(temp.next==null) {
	
	return;
}
		
			
			if(f.getData().equals(temp.next.getData())) {
				
				temp.next = temp.next.next;
				rd(f,temp);


			}else {
				temp = temp.next;
				
			}
			

		
		rd(f.next,f.next);
		
	}
	public int max(Node max ,	Node temp  ) {
	
	if(temp.next==null)
	{
		return (int) max.getData();
	}
			
		
		if(((int)max.getData())<((int)temp.getData())) {
			max=temp;
		}
		
		
		return max( max , temp.next);

}

	public void max() {
		
		Node max = first;
	
		
		Node temp = max;
		while(temp.next!=null) {
			
			if(((int)max.getData())<((int)temp.getData())) {
				max=temp;
				
			}
				temp = temp.next;
			
			
		}
		
System.out.println(max.getData());		
	}
	
	public void rd(Node f) {
		
		if(f.next==null) {
			return;
		}
		
		Node temp = f;
		while(temp.next!=null) {
			
			if(f.getData().equals(temp.next.getData())) {
				temp.next = temp.next.next;
				
			}else {
				temp = temp.next;
			}
			
		}
		
		rd(f.next);
		
	}
public Node  PrevLast() {
	Node prev = first;
	
	while(prev.next.next!=null) {
		prev =prev.next;
		
	}
	return prev;
	
}
	
public void pr(Node head) {
    if (head == null) {
        return;
    }
    pr(head.next);
    System.out.print(head.getData() + " ");
}
	
	
	public void printList() {
		Node temp = first;
		if(temp!=null) {

		for(int i=0;i<count;i++) {
			if(temp==null) {
				System.out.println();
				return;
			}

			System.out.print(temp.getData()+" "); 

			temp=temp.next;

		}
		if(temp!=null) {
		System.out.println(temp.getData()+" "); 
		}else {
			System.out.println(); 

		}

		}}

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
		}else {
			newNode.next = first;
			first=newNode;
		}
		count++;
	}
	
	public void addSort(Object data) {
		Node newNode = new Node(data);
		if(first==null) {
			first=last=newNode;
		}else {
			
			if((int)newNode.getData()<(int)first.getData()) {
				newNode.next = first;
				first=newNode;
			}else {
				
			
			Node curr = first;
			Node prev=null,next=null;
			while(curr!=null) {

				next=curr.getNext()	;//next------>2
				if((int)curr.getData()<(int)next.getData()) {
					curr.next = next;
					first=newNode;
				}
				
				
				curr.setNext(prev);//curr.next----->null
				prev=curr;//prev--------->1
				curr=next;//curr----->2
			}
			}
		}
		count++;
	}
	
	public void getReverse() {
		if(first==null) {
			return;
		}
		Node curr = first;
		Node prev=null,next=null;
		while(curr!=null) {

			next=curr.getNext()	;//next------>2
			curr.setNext(prev);//curr.next----->null
			prev=curr;//prev--------->1
			curr=next;//curr----->2
		}
		first=prev;

		
	}
	
	
	
	



	
	
	public void sort() {
		if(first==null) {
			return;
		}
		Node curr = first;
		Node prev=null,next=first.getNext();
		Node min=null;
		while(curr!=null) {
			next=curr.getNext()	;

			if((int)curr.getData()<(int)next.getData()) {
				
				swap( curr,  next);
			
				
			}
			
			
		}

		
	}
	
	public void swap(Node curr, Node min) {
		Node prev = first;
		System.out.println("curr---> "+(int)curr.getData());
		for (int i = 0; i <count; i++) {

			if(((int)prev.next.getData())==((int)curr.getData())) {
				break;
			}

			prev = prev.next;
		}
		System.out.println((int)prev.getData());
		curr.next=min.next;
		min.next=curr;
		prev.next=min;
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
		}
		count--;
		return true;
	}

	public void addLast(Object data) {
		Node newNode = new Node(data);
		if(last==null) {
			first=last=newNode;
		}else {
			last.next = newNode;
			last=newNode;
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
