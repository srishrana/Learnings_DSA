
public class Linkedlist {
    static Node head;
    static Node tail;

    public class Node {
        int data;
        Node pointer;

        Node(int data) {
            this.data = data;
            this.pointer = null;
        }
    }

    public static void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.pointer;
        }
    }

    public static void deletefirst(int data) {
        if (head == null) {
            System.out.println("linked luist is emplty!");
        }
        // delete first

        head = head.pointer;
    }

}

public static void deletemiddle(int data){
    Node temp=head;
    while(temp.pointer==data){
        
    }
}

}

public static void main(String args[]){
LinkedList list=new LinkedList();
list.add(3);
list.add(2);
list.add(1);
list.delete(3);
list.print();
