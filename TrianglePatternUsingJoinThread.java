class PrintTriangle extends Thread {
    private int row;

    public PrintTriangle(int row) {
        this.row = row;
    }

    @Override
    public void run() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class TrianglePatternUsingJoinThread {
    public static void main(String[] args) {
        int rows = 5;

        // Create threads for each row
        Thread[] threads = new Thread[rows];
        for (int i = 0; i < rows; i++) {
            threads[i] = new PrintTriangle(i + 1);
            threads[i].start();
            try {
                threads[i].join(); // Wait for each thread to finish before proceeding
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}