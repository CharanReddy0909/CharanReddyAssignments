package practicePackage;

import java.io.*;
import java.util.*;

class Exception_4 {

    public static void main(String[] args) {
        try {
            readNumbersFromFile("numbers.txt");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    private static void readNumbersFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    scanner.close();
                    throw new IllegalArgumentException("Positive number found: " + number);
                }
            } else {
                scanner.next();
            }
        }

        scanner.close();
        System.out.println("No positive numbers found.");
    }
}
