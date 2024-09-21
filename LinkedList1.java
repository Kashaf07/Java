public class LinkedList1 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    LinkedList1() {
        head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void delete(int data) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.display();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.display();
        list.delete(15);
        list.delete(30); // Element not found
        list.display();
    }
}
