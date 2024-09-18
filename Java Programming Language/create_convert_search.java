public class create_convert_search {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    private static Node convertart2ll(int[] arr) {
        // int i=arr[0];
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            curr.next = temp;
            curr = temp;
        }
        return head;

    }

    public static int searchelemnt(int idx, int[] arr) {
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            if (temp.data == idx) {
                return 1;
            }
            curr.next = temp;
        }
        return 0;

    }

    public static boolean check(int ele, int[] arr) {
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            if (temp.data == ele) {
                return true;
            }
            curr.next = temp;
        }
        return false;

    }

    public static boolean search(Node head, int ele) {
        if (head == null) {
            System.out.println("linkedlist is empty!");
        }
        Node curr = head;
        while (curr != null) {
            if (curr.data == ele) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static Node delete(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;

    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            // curr = curr.next;
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static Node deletelast(Node head) {
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        System.out.println(curr.data);
        curr.next = null;
        return head;

    }

    public static Node deletekth(Node head, int k) {
        if (head == null || k <= 0) {
            System.out.println("k out of bounds!");
        }
        Node curr = head;
        while (curr != null) {
            for (int i = 0; i < k - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        return head;

    }

    public static Node deletemid(int k, Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node key = new Node(k);
        Node curr = head.next;
        while (curr.next.next != key) {
            curr = curr.next;

        }
        Node prev = curr.next;
        prev.next = prev.next.next;
        return prev;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = convertart2ll(arr);
        // int ele = searchelemnt(6, arr);
        // System.out.println(ele);
        // boolean result = check(6, arr);
        // System.out.println(result);
        // boolean res = search(convertart2ll(arr), 9);
        // System.out.println(res);
        // Node y1 = delete(convertart2ll(arr));
        // print(delete(convertart2ll(arr)));
        // System.out.println(y);
        // Node head1 = deletelast(y);
        // print(head1);
        // deletemid(3, y);
        Node y2 = deletekth(head, 2);
        print(y2);

    }
}
