package P1;

import java.util.Scanner;

public class PostfixEvaluation {
public static boolean isOperator(char c) {
	return c =='+' |  c =='*' | c =='-' |c =='/' ;
}

public static int Calculate(int a,int b,char op) {
	int res=0;
	switch(op) {
	case '+': 
		res =a+b;
		break;
	case '-': 
		res =a-b;
		break;

	case '/': 
		res =a/b;
		break;

	case '*': 
		res =a*b;
		break;

	}
return res;	
	
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Postfix Expression: (e.g. 4 5 *)");
        String exp = scanner.nextLine();
        String[] tokens = exp.split(" ");

        Stack stack = new Stack();
        for(int i=0;i<tokens.length;i++) {
            if (tokens[i].matches("\\d+")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else if (isOperator(tokens[i].charAt(0))) {
                int op1 = (int)stack.pop();
                int op2 = (int)stack.pop();
                stack.push(Calculate(op1, op2, tokens[i].charAt(0)));
            }
        }
        System.out.println("Answer = " + stack.peek());
    }
}