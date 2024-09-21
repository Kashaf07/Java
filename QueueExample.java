import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements onto the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue after enqueues: " + queue);

        // Peek at the front element
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);
        System.out.println("Queue after peek: " + queue);

        // Dequeue an element from the queue
        int dequeuedElement = queue.remove();
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue after dequeue: " + queue);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);
    }
}
