package LinkedQueue;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

import p1.QueueArray;

public class LinkedQueue {
	QNode front,rear;
	int count=-1;

	LinkedQueue(){
		this.front=null;
		this.rear=null;
	}


	public boolean isEmpty() {
		return this.front==null;
	}

	public void enQueue(Object data) {
		QNode newNode = new QNode(data);
		if(isEmpty() ) {
			this.front=this.rear=newNode;
		}

		this.rear.next=newNode;
		rear=newNode;
		count++;
		return;
	}
	public boolean deQueue() {
		if(count<0 ) {
			System.out.println("The queue is empty!!!");
			return false;
		}
		else if(count==0) {
			this.front=this.rear=null;
		}
		else {

			QNode temp = this.front;
			this.front = this.front.next;
			temp.next=null;
		}
		count--;
		return true;
	}
	public QNode deQueueData() {
		QNode temp = null ;
		if(count<0 ) {
			System.out.println("The queue is empty!!!");
			return null;
		}
		else if(count==0) {
			temp = this.front;

			this.front=this.rear=null;

		}
		else {

			temp = this.front;
			this.front = this.front.next;
			temp.next=null;

		}

		count--;
		return temp;

	}

	public void clear() {
		while(front!=null) {
			QNode temp = this.front;
			this.front = this.front.next;
			temp.next=null;	
		}
		this.rear=null;
	}


	public void printQueue() {
		QNode curr=this.front;
		System.out.print(" [ ");
		while(curr!=null) {
			System.out.print(curr+" ");
			curr = curr.next;
		}
		System.out.println(" ] ");
	}



	public void sortQueue(LinkedQueue q ,int data) {

		LinkedQueue q2 = new LinkedQueue();
		QNode curr=q.front;
		while(curr!=null) {
			if((int)curr.data>data) {
				q2.enQueue(curr);
			}else {
				q2.enQueue(data);
				q2.enQueue(curr);
			}
			curr = curr.next;
		}

		q.clear();
		QNode curr2=q2.front;
		while(curr2!=null) {
			q.enQueue(curr2);
			curr2 = curr2.next;
		}
	}


	public QNode getFront() {
		return front;
	}


	public void setFront(QNode front) {
		this.front = front;
	}


	public QNode getRear() {
		return rear;
	}


	public void setRear(QNode rear) {
		this.rear = rear;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}



	public void sortQueue1(QueueArray q1, int data ) {

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

	@Override
	public String toString() {
		return "LinkedQueue [front=" + front + ", rear=" + rear + ", count=" + count + "]";
	}


	//	public static void main (String args[]) throws IOException{
	//		LinkedQueue custQ = new LinkedQueue( ); // Line (queue) of customers
	//
	//		Random rand = new Random(System.currentTimeMillis());
	//		int Length, // Length of simulation (minutes)
	//		minute, // Current minute
	//		timeArrived, // Time dequeued customer arrived
	//		waitTime, // How long dequeued customer waited
	//		totalCustomers = 0, // Total customers served
	//		totalWait = 0, // Total waiting time for all customers
	//		maxWait = 0, // Longest wait
	//		numArrivals = 0, // Number of new arrivals
	//		customer; // customer in Queue
	//
	//		System.out.println("Please enter the Length of simulation (minutes)\n");
	//
	//		Scanner scan = new Scanner(System.in);
	//		Length = scan.nextInt();
	//
	//		for ( minute = 0 ; minute < Length ; minute++ ){
	//			// Output time & number of customers waiting in line
	//			if (!custQ.isEmpty())
	//			{
	//				customer = (int)custQ.deQueueData().data;
	//				totalCustomers ++;
	//				waitTime = minute- customer;
	//				totalWait += waitTime;
	//
	//
	//				if (waitTime >maxWait)
	//					maxWait = waitTime;
	//
	//			}
	//			// Dequeue the first customer in line (if any). Increment
	//			// totalCustomers, add the time that this customer waited to
	//			// totalWait, and update maxWait if this customer waited
	//			// longer than any previous customer.
	//			// Determine the number of new customers.
	//			// Uses a random number generator.
	//
	//
	//			switch ( rand.nextInt(4) ) {
	//
	//			case 1: System.out.println("Add 1 customer to the line");
	//			custQ.enQueue(minute);
	//			break;
	//
	//			case 2: System.out.println("Add 2 customers to the	line");
	//			custQ.enQueue(minute);
	//			custQ.enQueue(minute);
	//			break;
	//
	//			default : System.out.println("Do not add any customer to the line");
	//			}
	//
	//		}
	//		// set precision to 2 decimal places
	//		DecimalFormat fmt = new DecimalFormat("0.##");
	//		System.out.println("\nCustomers served : " + totalCustomers);
	//		System.out.println("Average wait : " +
	//				fmt.format((double)totalWait/totalCustomers));
	//		System.out.println("Longest wait : " + maxWait);
	//	} //


	public int peek() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty !!!");
			return -1;
		}
		return (int)rear.data;
	}
















	public static void main(String[] args) {
		LinkedQueue	queue = new LinkedQueue();
		queue.enQueue(90);
		queue.enQueue(80);
		queue.enQueue(70);
		queue.enQueue(50);
		queue.printQueue();
		queue.sortQueue(queue,55);

		queue.printQueue();
	}
}
