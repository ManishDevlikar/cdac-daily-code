package com.stack;
import java.util.Stack;
import java.util.Scanner;

public class InToPost {

    private static int getOperatorPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    private static boolean isOperator(char character) {
        return character == '+' || character == '-' || character == '*' || character == '/' || character == '^';
    }

    public static String convertInfixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char currentChar : infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(currentChar)) {
                postfixExpression.append(currentChar);
            } else if (currentChar == '(') {
                operatorStack.push(currentChar);
            } else if (currentChar == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.pop(); // Remove the '(' from the stack
            } else if (isOperator(currentChar)) {
                while (!operatorStack.isEmpty() && getOperatorPrecedence(operatorStack.peek()) >= getOperatorPrecedence(currentChar)) {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.push(currentChar);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfixExpression.append(operatorStack.pop());
        }

        return postfixExpression.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String infixExpression = scanner.nextLine();
        String postfixExpression = convertInfixToPostfix(infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);
        scanner.close();
    }
}