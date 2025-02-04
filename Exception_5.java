package practicePackage;

import java.io.*;

class Exception_5 {

    public static void main(String[] args) {
        try {
            readFile("testfile.txt");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        if (file.length() == 0) {
            throw new IOException("The file is empty: " + fileName);
        }

        System.out.println("File read successfully: " + fileName);
    }
}
