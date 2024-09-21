import java.util.Scanner;

public class Queue {
    int front, rear, size;
    int[] queueData;

    Queue(int n) {
        size = n;
        front = rear = -1;
        queueData = new int[size];
    }

    void insert(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is Overflow");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            queueData[rear] = x;
            System.out.println("One Element is Inserted ");
        }
    }

    void remove() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Underflow");
        } else {
            front++;
            System.out.println("One Element is Removed");
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Underflow");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println("Element -> " + queueData[i]);
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Welcome to the NUV\n");
        System.out.println("1: Insert \n2: remove \n3: Display \n4: Exit");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Value");
                    int value = scanner.nextInt();
                    queue.insert(value);
                    break;
                case 2:
                    queue.remove();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
