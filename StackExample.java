import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack after pushes: " + stack);

        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peek: " + stack);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
