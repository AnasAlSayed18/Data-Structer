package LinkedQueue;
/* Java Program to implement a stack using
two queue */
import java.util.*;

public class StackusingQueues {

		static class Stack {
			// Two inbuilt queues
			static LinkedQueue  q1
				= new LinkedQueue();
			static LinkedQueue q2
				= new LinkedQueue();

			// To maintain current number of
			// elements
			static int curr_size;

			static void push(int x)
			{
				// Push x first in empty q2
				q2.enQueue(x);

				// Push all the remaining
				// elements in q1 to q2.
				while (!q1.isEmpty()) {
					q2.enQueue(q1.peek());
					q1.deQueue();
				}

				// swap the names of two queues
				LinkedQueue q = q1;
				q1 = q2;
				q2 = q;
			}

			static void pop()
			{

				// if no elements are there in q1
				if (q1.isEmpty())
					return;
				q1.deQueue();
			}
		
			static int top()
			{
				if (q1.isEmpty())
					return -1;
				return (int)q1.rear.data;
			}

			static int size() { return q1.count; }
		}

		// driver code
		public static void main(String[] args)
		{
			Stack s = new Stack();
			s.push(1);
			s.push(2);
			s.push(3);

			System.out.println("current size: " + s.size());
			System.out.println(s.top());
			s.pop();
			System.out.println(s.top());
			s.pop();
			System.out.println(s.top());
			s.pop();

			System.out.println("current size: " + s.size());
		}
	}
	// This code is contributed by Prerna

	
	

