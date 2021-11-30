package CTDL;

public class Stack {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node top = null;

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack underflow!!!");
        } else {
            System.out.println(top.value);
            top = top.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if(!isEmpty()) {
            return top.value;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
    }
}
