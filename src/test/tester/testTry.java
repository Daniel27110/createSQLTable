package test.tester;

import java.io.File;
import java.io.PrintWriter;
import App.App;

public class testTry {

    // for the test in test/testStdIn.txt, write the
    // result of the program to test/testStdOut.txt
    public static void main(String[] args) {

        try {
            // we clear the file
            PrintWriter clear = new PrintWriter("src/test/testIO/testStdOut.txt");
            clear.print("");
            clear.close();

            File file2 = new File("src/test/testIO/testStdOut.txt");
            System.setOut(new java.io.PrintStream(file2));

            // call the main method of the program to test
            App.main(args);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
