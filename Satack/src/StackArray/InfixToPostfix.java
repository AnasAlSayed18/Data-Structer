package P1;

public class InfixToPostfix {
    // Function to convert Infix expression to postfix
    public static String infixToPostfix(String expression) {
        // Declaring a Stack for operators
        Stack stack = new Stack();
        StringBuilder postfix = new StringBuilder(); // Initialize postfix as empty string.

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If character is a delimitter, move on.
            if (c == ' ' || c == ',') continue;

            // If character is operator, pop two elements from stack, perform operation and push the result back.
            else if (isOperator(c)) {
                while (!stack.isEmpty() && (char)stack.peek() != '(' && hasHigherPrecedence((char) stack.peek(), c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
            // Else if character is an operand
            else if (isOperand(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && (char)stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Function to verify whether a character is alphanumeric character (letter or numeric digit) or not.
    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    // Function to verify whether a character is operator symbol or not.
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '$';
    }

    // Function to verify whether an operator has higher precedence over other
    private static boolean hasHigherPrecedence(char op1, char op2) {
        int op1Weight = getOperatorWeight(op1);
        int op2Weight = getOperatorWeight(op2);

        // If operators have equal precedence, return true if they are left associative.
        // return false, if right associative.
        // if operator is left-associative, left one should be given priority.
        if (op1Weight == op2Weight) {
            return !isRightAssociative(op1);
        }
        return op1Weight > op2Weight;
    }

    // Function to verify whether an operator is right associative or not.
    private static boolean isRightAssociative(char op) {
        return op == '$';
    }

    // Function to get weight of an operator. An operator with higher weight will have higher precedence.
    private static int getOperatorWeight(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '$':
                return 3;
            default:
                return -1; // Unknown operator
        }
    }


}