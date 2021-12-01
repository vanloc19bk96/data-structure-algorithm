package CTDL;

public class Tree {
    class Node {
        int value;
        Node leftNode;
        Node rightNode;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;
    boolean isLeft = false;

    public void addNodeRecursive(Node newNode, Node parent, Node grandParent) {
        if (parent != null) {
            if (parent.value >= newNode.value) {
                isLeft = true;
                addNodeRecursive(newNode, parent.leftNode, parent);
            } else {
                isLeft = false;
                addNodeRecursive(newNode, parent.rightNode, parent);
            }
        } else {
            if (isLeft)
                grandParent.leftNode = newNode;
            else
                grandParent.rightNode = newNode;
        }
    }

    public void addNode(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            addNodeRecursive(newNode, root, null);
        }
    }

    public void display(Node parent) {
        if (root == null) {
            System.out.println("Empty tree");
        } else if (parent != null) {
            display(parent.leftNode);
            display(parent.rightNode);
            System.out.printf("%d ", parent.value);
        }
    }

    public void remove(Node parent, Node grandParent, boolean isLeft, int x) {
        if (root == null) {
            System.out.println("Empty tree");
        } else if (parent != null) {
            remove(parent.rightNode, parent, false, x);
            remove(parent.leftNode, parent, true, x);
            if (parent.value == x) {
                if (isLeft)
                    grandParent.leftNode = null;
                else
                    grandParent.rightNode = null;
            }
        }
    }

    public void search(Node parent, int x) {
        if (parent != null) {
            search(parent.leftNode, x);
            search(parent.rightNode, x);
            System.out.printf("Search: %d", parent.value);

        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(7);

        tree.addNode(5);
        tree.addNode(9);
//        tree.addNode(4);
//        tree.addNode(6);
//
//        tree.addNode(8);
//        tree.addNode(10);


        tree.remove(tree.root, null, false, 9);

        tree.display(tree.root);
        tree.search(tree.root, 9);
    }

}
