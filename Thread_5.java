package practicePackage;

import java.util.concurrent.atomic.AtomicInteger;

class Thread_5 {

    private static final int LIMIT = 50;
    private static final int THREAD_COUNT = 4;
    private static AtomicInteger primeSum = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREAD_COUNT];
        int rangePerThread = (int) Math.ceil((double) LIMIT / THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * rangePerThread + 1;
            int end = Math.min((i + 1) * rangePerThread, LIMIT);
            threads[i] = new Thread(new PrimeSumTask(start, end));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Sum of prime numbers up to " + LIMIT + " is: " + primeSum.get());
    }

    static class PrimeSumTask implements Runnable {
        private final int start;
        private final int end;

        PrimeSumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    primeSum.addAndGet(i);
                }
            }
        }

        private boolean isPrime(int num) {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}
