package StackeList;

public class StackList {

	Node top;
	int count = -1;

	public StackList() {
		this.top=null;
	}



	public boolean isEmpty() {

		return count<0;

	}
	public boolean push(Object data) {

		Node newNode = new Node(data);

		newNode.next=top;

		this.top=newNode;
		count++;
		return true;

	}


	public Object pop() {

		if(isEmpty()) {
			System.out.println("The Stack is Empty !!!!");
			return null;
		}
		else {
			Node temp = this.top;
			top=top.next;
			temp.next=null;
			count--;
			return temp;


		}
	}

	public Object peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty !!!!");
			return null;
		}
		else {

			return top.data;
		}
	}

	public void printStack(StackList s1) {
		StackList s2  = new StackList();
		System.out.print("[ ");
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
			System.out.print(s2.peek()+" ");
		}
		System.out.println(" ]");
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}

	}


	public int getCount() {
		return this.count;

	}

	public void sortStack(StackList s1) {
		StackList tempStack  = new StackList();
		tempStack.push(s1.pop());
		while(!s1.isEmpty()) {
			Object min = s1.pop();
			//comparTo
			if((int)min<(int)tempStack.peek()) {
				s1.push(tempStack.pop());
				while(!tempStack.isEmpty()) {
					if((int)min<(int)tempStack.peek()) {
						s1.push(tempStack.pop());
					}else {
						break;
					}
				}
				tempStack.push(min);

			}
			else {
				tempStack.push(min);


			}	

		}

		while(!tempStack.isEmpty()) {
			s1.push(tempStack.pop());
		}



	}
	public static void main(String[] args) {
		StackList stack = new StackList();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(50);	
		stack.push(5);
		stack.push(900);


		//stack.sortStack(stack);
		stack.printStack(stack);;


	}
}
