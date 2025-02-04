package practicePackage;

import java.util.Arrays;

class Thread_3 {

    private static int[] array = {9, 7, 5, 3, 1, 2, 4, 6, 8, 0};

    public static void main(String[] args) throws InterruptedException {
        int mid = array.length / 2;

  
        int[] leftPart = Arrays.copyOfRange(array, 0, mid);
        int[] rightPart = Arrays.copyOfRange(array, mid, array.length);
        Thread leftSorter = new Thread(() -> Arrays.sort(leftPart));
        Thread rightSorter = new Thread(() -> Arrays.sort(rightPart));
        leftSorter.start();
        rightSorter.start();
        leftSorter.join();
        rightSorter.join();
        mergeArrays(leftPart, rightPart, array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    private static void mergeArrays(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}