package practicePackage;

class Thread_2 {

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            System.out.println("Even numbers:");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            System.out.println("Odd numbers:");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
