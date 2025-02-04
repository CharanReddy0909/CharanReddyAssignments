package practicePackage;

class Thread_1 extends Thread {
   
    public void run() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        // Create an instance of the HelloJavaThread
        Thread_1 thread = new Thread_1();
        // Start the thread
        thread.start();
    }
}

