public class createlinkedlist {
    public Node head;
    public Node tail;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        // create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        // create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Function for adding in the middle of linkedlist
    public void addmid(int idx, int data) {
        // Check if the index is valid
        if (idx <= 0 || head == null) {
            System.out.println("Invalid index or LinkedList is empty");
            return;
        }

        // Create the new node with the provided data
        Node newNode = new Node(data);

        // Traverse to the node just before the desired position
        Node temp = head;
        int i = 0;
        while (i < idx - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        // Insert the new node in the middle
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Function for printing
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        createlinkedlist ll = new createlinkedlist();
        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addmid(4, 0);
        ll.print();
    }
}
