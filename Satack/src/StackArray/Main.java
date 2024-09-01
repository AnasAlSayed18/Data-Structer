package P1;

public class Main {

	public static void main(String[] args) {
		InfixToPostfix I = new InfixToPostfix();
		
		String expression = "2+((8+2*3)/2)-(1+5(";
       // System.out.println("Output = " + I.infixToPostfix(expression));	
        Stack s = new Stack(10);
        Stack s2 = new Stack(10);

		s.push(1);
		s.push(5);
		s.push(7);

		s.push(4);

		
		s2.push(9);
		s2.push(7);
		s2.push(5);

		
		//s.addToSortStack(s, 6);
		
		//s.margeSortStack(s, s2);
		
		
//System.out.println(s.getSize());
	s.printStack(s);
	s.addToSortStack(s, 6);

	s.printStack(s);

	System.out.println(s.peek()+"<-----------top");

	//s.sortStack(s);
	//s.sort(s);
	System.out.println("**********After Sorting*************");

	s.removeMin(s);
	System.out.println("**********After Sorting*************");
	s.printStack(s);
	
	//s.insertSort(s, 4);


	

	}

}
