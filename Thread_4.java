package practicePackage;

class Thread_4 {

    private static final int[][] matrixA = {
        {1, 2},
        {3, 4}
    };

    private static final int[][] matrixB = {
        {5, 6},
        {7, 8}
    };

    private static final int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[matrixA.length];

        for (int i = 0; i < matrixA.length; i++) {
            int row = i;
            threads[i] = new Thread(() -> multiplyRow(row));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        for (int[] row : resultMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static void multiplyRow(int row) {
        for (int j = 0; j < matrixB[0].length; j++) {
            for (int k = 0; k < matrixB.length; k++) {
                resultMatrix[row][j] += matrixA[row][k] * matrixB[k][j];
            }
        }
    }
}