import java.util.Scanner;

public class LinearSearchDemo {
    private int n;
    private int[] data;
    private int size;

    public LinearSearchDemo(int size) {
        this.size = size;
    }

    public int linearSearch(int target) {
        for (int j = 0; j < n; j++) {
            if (target == data[j]) {
                return j + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinearSearchDemo ls = new LinearSearchDemo(100);

        System.out.print("Enter how many elements you want to enter: ");
        ls.n = scanner.nextInt();

        if (ls.n > ls.size) {
            System.out.println("Array size is not supported.");
        } else {
            ls.data = new int[ls.n];
            for (int i = 0; i < ls.n; i++) {
                System.out.print("Enter value: ");
                ls.data[i] = scanner.nextInt();
            }

            System.out.println("Values available in the array:");

            System.out.print("Enter value to find: ");
            int target = scanner.nextInt();

            int result = ls.linearSearch(target);

            if (result == 0) {
                System.out.println("Entered value is not available in the given array.");
            } else {
                System.out.println("Entered value is available at position " + result);
            }
        }

        scanner.close();
    }
}

