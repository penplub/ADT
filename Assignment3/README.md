# Author 
Karanthaphong Areerak 652115001
# Assignment 3 
This Assignment is about The program that can convert Infix form to Postfix Form That use stack and linked list by use Node.java and have method push pop peek by reading input1.txt in the terminal and this program can checked that infix form is valid or not 
# Requirement
If you want use program you have to download all of myfile and put it in your folder and please check you computer that you have java in your computer if not you can't use my program
# Mycode of this program
//Karanthaphong Areerak 652115001
import java.util.*;
import java.io.*;

public class Convert {
    private Node top;// Create top from Node

    public static void main(String[] args) throws FileNotFoundException {
   if (args.length < 1) {//Check that your args < 1 or not
    System.out.println("Usage java Convert <input_file>");
    return;
    
   }
   String infix = readInfixFromFile(args[0]);//Create Infix lin to method readInfixFromfile
   if (isValid(infix)) {//Use isValidMethod to check
    String postfix = infixToPostfix(infix);//Convert
    System.out.println("Infix "+ infix+" This is valid infix");//Print Infix
    System.out.println("Postfix "+postfix);//Print Postfix
    
   }else{
    System.out.println("Invalid infix expression : "+infix);//If not Print INvalid and Infix
   }

    }

    public Convert() {
        top = null;//set top = null in 

    }

    public boolean isEmpty() {//Check that is empty or not
        return top == null;
    }

    public void push(String data) {// Method push
        Node node = new Node(data);
        node.setNext(top);
        top = node;
    }

    public String peek() {//Method peek for stack
        if (isEmpty()) {
            return null;

        } else {
            return top.getData();
        }
    }

    public String pop() {//Method pop for stack
        if (isEmpty()) {
            return null;

        } else {
            String data = top.getData();
            top = top.getNext();
            return data;
        }

    }

    public static int precedence(String operator) {//Check case for precedence
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;

            default:
                return -1;
        }
    }
    public static boolean isOperator(String token){// check that is operator or not
        return "+-*/".contains(token);

    }
    public static boolean isValid(String infix){//  check that is valid or not
        int openCount = 0;
        int closeCount = 0;
        
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isWhitespace(c)) {// check white pace
                continue;
                
            }else if (Character.isDigit(c) || Character.isLetter(c)) {// check that is digit or letter
                continue;
                
            }else if (c == '(') {
                openCount++;
                
            }else if (c == ')') {
                closeCount++;
                if (closeCount > openCount) {
                    return false;
                    
                }
                
            }else if (isOperator(Character.toString(c))) {// check that is operator or not
                if (i == 0 || i ==infix.length() -1) {
                    return false;
                    
                }else {
                    char prev = infix.charAt(i-1);
                    char next = infix.charAt(i + 1);
                    if (Character.isWhitespace(prev) || Character.isWhitespace(next)) {
                        return false;
                        
                    }

                }
                
            } else{
                return false;
            }
            
        }
        return openCount == closeCount;
    }
    public static String infixToPostfix(String infix){//Method that convert Infix to Postfix
        StringBuilder postfix = new StringBuilder();//USe String builder to help
        Convert stack = new Convert();
        String[] tokens = infix.split("\\s+");
        for (String token : tokens) {//if it is token loop it
            if (isOperator(token)) {//if it is operator 
                while (!stack.isEmpty() && precedence(token) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(" ");
                    
                }
                stack.push(token);//push it
                
            }else if (token.equals("(")) {//Found ( push it
                stack.push(token);
                
            }else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postfix.append(stack.pop());
                    
                }
                stack.pop();//Find ) pop
                
            }else{
                postfix.append(token); //append token " "
            }
            
        }
        while (!stack.isEmpty()) {// if stack not empty
            postfix.append(stack.pop());//pop 
            
        }
        return postfix.toString();

    }
    public static String readInfixFromFile(String fileName)throws FileNotFoundException{ //Read infix
        Scanner scanner = new Scanner(new File(fileName));
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
            
        }
        scanner.close();
        return sb.toString();

    }
}
# This is my Node.java that use for linked list of my program
//Karanthaphong Areerak 652115001
public class Node {//
    private String data;//Create data
    private Node next;//reate next
    public Node(String data){
        setData(data);//Create set data
        setNext(null);// set next = null
    }
    public void setData(String data){//Method set data
        this.data = data;// Set data = data read from main java

    }
    public void setNext(Node next){// set next to next read from Convert.java as same
        this.next = next;

    }
    public String getData(){//return data
        return data;

    }
    public Node getNext(){//return next
        return next;
    }
    public String toString(){////like to show out put like in toString
        if (data == null) {
            return " Node : Null";
            
        }else{
            return "Node :" +data;
        }
    }
    
}
# About my code
If you see mu code first you can see that create that created top from Node.java and continue to the main method that throw filenotfoundexception for sonetime not found next check that your args <1 or not(check that have args or not) if it don't have it say Usage java Convert <input_file> and if it have it have to check first that infix is valid or not if it valid it sayInfix "+ infix+" This is valid infix and "Postfix "+postfix if it not valid it says "Invalid infix expression : "+infix next step the code show that set top = null and have method isEmpty that check is it empty or not and next step is going to stack that have push peek and pop and have method that check the precedence and method isOperator that check is it operator or not and have method isValid that can check is it valid or not and this is important infixToPostfix method that method is convert infix to postfix and finally readInfixFromFile that read from terminal and read file Next is Node.java first that create data node that from start set data from input node = null and have method setData setNext that can set data and next and have method getData getNext that return it and have toString to have pattern to print
# Tutorial
If you want to use this program ypu have to download all of my file and save it in your folder and first thing you have to do if you want to run this code is compile that file to write this to terminal write javac Convert.java it may created class and then write java Convert input1.txt it will run this code
# Output
Infix $a-b/(c+d-e)*(f^g*h+i)$ This is valid infix
Postfix abcd+e-/fg^h*i+*-
# End of my Code

