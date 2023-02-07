public class Stack {
    int top;
    int maxsize;
    Task[] t;
    public static void main(String[] args) {

        Stack t = new Stack(10);
        t.push(new Task("001", "coding"));
        t.push(new Task("002", "design"));
        t.push(new Task("003", "planning"));
        t.push(new Task("004", "testing"));
        t.push(new Task("005", "bug"));
        t.push(new Task("006", "deploy"));
        t.push(new Task("007", "uiedit"));
        t.push(new Task("008", "ux"));
        t.push(new Task("009", "send"));
        t.push(new Task("010", "finish"));
        System.out.println("What is in the stack");
        t.print();
        t.peek();
        System.out.println("Isstack full "+t.isFull());
        System.out.println("Is coding in the stack"+t.search("coding"));
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.peek();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        System.out.println("Is stack empty?"+t.isEmpty());


    }
    public Stack(int size){
        maxsize = size;
        t = new Task[size];
        top = -1;
    }
    public void push(Task value){
        if (top==maxsize-1) {
            System.out.println("The stack is full");
            
        }else{
            top++;
            t[top] = value;
        }
    }
    public void peek(){
        if (top == -1) {
            System.out.println("This stack is empty");

            
        }else{
            System.out.println("Top value: "+t[top]);
        }
    }
    public boolean isEmpty(){
        return(top<0);
    }
    public boolean isFull(){
        return(top == maxsize -1);
    }
    public boolean search(String des){
        for (int i = 0; i <= top; i++) {
            if (t[i].getDes() == des) {
                return true;
                
            }
            
        }
        return false;

    }
    public void print(){
        for (int i = top; i >=0; i--) {
            System.out.println("    "+t[i].toString());
            
        }
    }
    public void pop(){
        if (top == -1) {
            System.out.println("The stack is already empty");
            
        }else{
            t[top] = null;
            top--;
        }
    }

}
