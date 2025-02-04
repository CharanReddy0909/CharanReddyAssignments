package practicePackage;

class Exception_2 {

    public static void main(String[] args) {
        try {
            checkEvenNumber(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("The number " + number + " is odd.");
        }
        System.out.println("The number " + number + " is even.");
    }
}
