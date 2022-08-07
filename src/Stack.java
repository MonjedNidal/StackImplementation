public class Stack {

    String[] stack;
    int top;

    public Stack(int n) {
        stack = new String[n];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == stack.length-1;
    }

    public void push (String value){
        if (!isFull()){
            top++;
            stack[top] = value;
        }else {
            System.out.println("Stack is full");
        }
    }

    public void pop (){
        if (!isEmpty()){
            top--;
        }else {
            System.out.println("Stack is empty");
        }
    }

    public void peek(){
        if (!isEmpty()){
            System.out.println(stack[top]);
        }else {
            System.out.println("Stack is empty");
        }
    }


}
