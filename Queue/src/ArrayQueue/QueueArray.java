package p1;


public class QueueArray {

	int front,rear;
	static int SIZE =25;
	Object []queue;
	int count=0;


	public QueueArray() {
		this(SIZE);
	}

	public QueueArray(int size) {
		front=0;
		rear=size-1;
		this.queue = new Object[size];
	}
	public static void insertSort(QueueArray s1, Object data) {

		if(s1.isEmpty() || (int)s1.getRear() < (int)data) {
			s1.enQueue(data);
			return;
		}

		Object temp = s1.deQueue();
		insertSort(s1, temp);

		s1.enQueue(temp);
	}
	public void addToSortStack(QueueArray s1,Object data) {
		QueueArray tempStack  = new QueueArray(s1.getSize());
		tempStack.enQueue(data);
		while(!s1.isEmpty()) {
			Object min = s1.deQueue();
			//comparTo
			if((int)min<(int)tempStack.peek()) {
				s1.enQueue(tempStack.deQueue());
				while(!tempStack.isEmpty()) {
					if((int)min<(int)tempStack.peek()) {
						s1.enQueue(tempStack.deQueue());
					}else {
						break;
					}
				}
				tempStack.enQueue(min);

			}
			else {
				tempStack.enQueue(min);


			}	

		}

		while(!tempStack.isEmpty()) {
			s1.enQueue(tempStack.deQueue());
		}



	}

	public boolean isEmpty() {

		return  count==0;

	}

	public boolean isFull() {

		return  count==getSize() ;

	}

	public void enQueue(Object data) {
		if(isFull()) {
			System.out.println("The Queue is Full !!!");
			return;
		}else {

			rear=(rear+1)%getSize();
			queue[rear]=data;
			count++;

		}
	}

	public Object deQueue( ) {
		if(isEmpty()) {
			System.out.println("The Queue is Empty !!!");
			return null;
		}
		Object temp = queue[front];
		front=(front+1)%getSize();
		count--;
		return temp;
	}

	public  int getSize() {
		return queue.length;
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
	public Object peek() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty !!!");
			return null;
		}
		return queue[rear];
	}
	public void printQueue(QueueArray q1) {
		QueueArray q2 = new QueueArray(q1.getSize());

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


	public void sortQueue(QueueArray q1, int data ) {
		QueueArray q2 = new QueueArray();

		while(!q1.isEmpty()) {		
			if ((int)q1.peek()> data) {
				q2.enQueue(q1.deQueue());
			}else {
				q2.enQueue(data);	
			}
		}


		while(!q2.isEmpty()) {
			q1.enQueue(q2.deQueue());
		}
	}






	public void printQueue() {
		System.out.print("[ ");

		int i=front;
		while(i!=rear) {

			System.out.print(queue[i]+" ");

			i=(i+1)%getSize();
		}
		System.out.print(queue[rear]+" ]");
		System.out.println();
	}



	public static void main(String[] args) {
		QueueArray	queue = new QueueArray(90);
		queue.enQueue(90);
		queue.enQueue(80);
		queue.enQueue(70);
		queue.enQueue(50);
		queue.printQueue(queue);
		queue.sortQueue(queue,55);

		queue.addToSortStack(queue, 4);
		queue.printQueue(queue);
		//queue.printQueue();
		System.out.println(queue.getRear());
		System.out.println(queue.getFront());

		//System.out.println(s.getSize());



	}



}
