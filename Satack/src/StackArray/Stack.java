package P1;

public class Stack {
	Object [] stack;
	static int SIZE=25;
	int top;

	
	
	public static void sort(Stack s1) {
		 
        if(s1.isEmpty()) {
             return;
        }

        Object temp = s1.pop();
        sort(s1);

        insertSort(s1, temp);
   }

    public static void insertSort(Stack s1, Object data) {

        if(s1.isEmpty() || (int)s1.peek() < (int)data) {
               s1.push(data);
               return;
         }

         Object temp = s1.pop();
         insertSort(s1, temp);

          s1.push(temp);
     }
	
	
	
	public Stack( ) {
		this(SIZE);
	}

	public Stack( int size) {
		super();
		stack = new Object [size];
		this.top = -1;
	}
	public int getSize() {
		return stack.length;

	}


	public boolean isFull() {
		if(top>=getSize()-1) {
			return true;
		}else {
			return false;
		}
	}

	public boolean isEmpty() {
		if(top<0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean push(Object data) {

		if(isFull()) {
			System.out.println("The Stack is Full !!!!");
			return false;
		}
		else {

			top++;
			stack[top]=data;
			return true;
		}
	}


	public Object pop() {

		if(isEmpty()) {
			System.out.println("The Stack is Empty !!!!");
			return null;
		}
		else {

			return stack[top--];

		}
	}

	public Object peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty !!!!");
			return null;
		}
		else {

			return stack[top];
		}
	}

	public void printStack(Stack s1) {
		Stack s2  = new Stack(s1.getSize());
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
			System.out.println(s2.peek());
		}
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}

	}

	
	
	public void removeMin(Stack s){
		int min;
		Stack tempStack=new Stack(s.getSize());
		min= (int)s.peek();
		while(!s.isEmpty()){
			if(min>(int)s.peek()){
				min=(int)s.peek();
			}
			tempStack.push(s.pop());
		}
	
		while(!tempStack.isEmpty()){

			if((int)tempStack.peek()==min){
				tempStack.pop();
			}
			else{
				s.push(tempStack.pop());
			}
		}

	}
	
	
	
	public void addToSortStack(Stack s1,Object data) {
		Stack tempStack  = new Stack(s1.getSize());
		tempStack.push(data);
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
	
	//ts--> 1 5 6 7 8 
	//min-->
	//s1-->   
	public void sortStack(Stack s1) {
		Stack tempStack  = new Stack(s1.getSize());
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
	
	
	
	
	
	
	
	
	
	
	
	
	public void margeSortStack(Stack s1 ,Stack tempStack) {
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
	
	
	
	
	
	
	
	

}
