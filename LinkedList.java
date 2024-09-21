public class LinkedList {

    private Node head; // Reference to the first node in the list

    public LinkedList() {
        head = null; // Initially, the list is empty
    }

    // Inner class to represent a node in the linked list
    private static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node in the list

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the beginning of the list (prepend)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Make the new node point to the current head
        head = newNode; // Update the head reference to the new node
    }

    // Method to insert a new node at a specific position in the list
    public void insertAt(int position, int data) {
        if (position < 0) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        Node newNode = new Node(data);

        if (position == 0) {
            push(data); // Use push() for insertion at the beginning
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to remove the first node from the list (pop)
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        int data = head.data;
        head = head.next;
        System.out.println("Removed element at index 0 (head): " + data); // Print removed element and index
        return data;
    }

    // Method to remove a node at a specific position in the list
    public int removeAt(int position) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        if (position < 0) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        if (position == 0) {
            return pop(); // Use pop() for removal at the beginning
        }

        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }

        int data = current.next.data;
        current.next = current.next.next;
        System.out.println("Removed element at index " + position + ": " + data); // Print removed element and index
        return data;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to print the elements of the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(20);
        list.push(10);
        list.push(5);

        System.out.print("Original list: ");
        list.printList();

        list.insertAt(2, 15); // Insert 15 at position 2

        System.out.print("List after insertion: ");
        list.printList();

        System.out.println("Popped element: " + list.pop()); // Remove and return the first element

        System.out.print("List after popping: ");
        list.printList();
    }
}
