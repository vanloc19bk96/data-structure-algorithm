package CTDL;

public class Queue {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head = null;

    public void enQueue(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
        }else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }

            p.next = newNode;
        }
    }

    public void deQueue() {
        if (head == null) {
            System.out.println("Queue underflow!!!");
        } else {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
    }
}
