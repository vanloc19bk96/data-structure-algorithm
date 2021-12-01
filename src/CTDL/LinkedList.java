package CTDL;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("Linked list is empty!");
        }
        while (currentNode != null) {
            System.out.printf("%d ", currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public int search(int data) {
        Node currentNode = head;
        if (head == null) {
            System.out.println("Linked list is empty!");
        }
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data == data)
                return index;
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("Linked list is empty!");
        } else if (index == 0) {
            head = head.next;
        } else {
            int count = 0;
            Node p = head;
            Node b = p;
            while (count != index) {
                b = p;
                p = p.next;
                count++;
            }
            b.next = p.next;
        }
    }

    public void addNodeAt(int data, int index) {
        if (head == null || index == 0) {
            this.addFirst(data);
        } else {
            Node newNode = new Node(data);
            int count = 0;
            Node p = head;
            Node b = head;
            while (count != index) {
                b = p;
                p = p.next;
                count++;
            }
            b.next = newNode;
            newNode.next = p;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);

        linkedList.addNodeAt(99, 2);

        linkedList.display();
    }
}
