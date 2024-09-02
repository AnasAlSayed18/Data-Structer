package p1;

public class QueueArray1 {

int front,rear,capcty;
 Object []queue;
int count=0;


public QueueArray1() {
	this(100);
}

public QueueArray1(int size) {
	this.front=this.rear=size-1;
	this.queue = new Object[size];
}

public boolean isEmpty() {
	
	return  front==rear;
	
}

public boolean isFull() {
	
	return  nextRear()==front ;
	
}
 public int nextRear() {
	 if(rear==capcty-1) {
		 return 0;
	 }else {
		 return rear+1;
	 }
 }
 
 public int nextFront() {
	 if(front==capcty-1) {
		 return 0;
	 }else {
		 return front+1;
	 }
 }
public boolean enQueue(Object data) {
if(isFull()) {
	System.out.println("The Queue is Full !!!");
	return false;
}else {
	
	rear=nextRear();
	queue[rear]=data;
	return true;

}
}

public Object deQueue( ) {
if(isEmpty()) {
	System.out.println("The Queue is Empty !!!");
	return null;
}
	Object temp = queue[front];
	front=nextFront();
return temp;
}

public  int getSize() {
	return queue.length;
}
public Object peek() {
	if(isEmpty()) {
		System.out.println("The Queue is Empty !!!");
		return null;
	}
	return queue[rear];
}
public Object getRear() {
	
	if(isEmpty()) {
		System.out.println("The Queue is Empty !!!");
		return null;
	}
	return  queue[rear];
}
public Object getFront() {
	
	if(isEmpty()) {
		System.out.println("The Queue is Empty !!!");
		return null;
	}
	
	return  queue[front];
}
public void printQueue(QueueArray1 q1) {
	QueueArray1 q2 = new QueueArray1(q1.getSize());
	System.out.print("[ ");

	while(!q1.isEmpty()) {
		q2.enQueue(q1.deQueue());
		
		System.out.print(q2.peek()+" ");

	}
	
	System.out.print(" ]");
	System.out.println();

	while(!q2.isEmpty()) {
		q1.enQueue(q2.deQueue());
		

	}
}



public static void main(String[] args) {
	QueueArray1	queue = new QueueArray1(5);
	queue.enQueue(5);
	queue.enQueue(4);
	queue.enQueue(3);
	queue.enQueue(2);
	queue.enQueue(1);
	queue.printQueue(queue);

	queue.deQueue();
	queue.printQueue(queue);
System.out.println(queue.getRear());
System.out.println(queue.getFront());



}

}
