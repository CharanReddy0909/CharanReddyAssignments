package practicePackage;

class Exception_1 {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
