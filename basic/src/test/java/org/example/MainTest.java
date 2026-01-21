package org.example;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;


public class MainTest {

    @Test
    public void testMainOutput() {
        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main
        Main.main(new String[]{});

        // Restore System.out
        System.setOut(originalOut);

        // Convert captured output to string
        String output = outContent.toString();

        // Assertions: check that expected substrings are present
        assertTrue(output.contains("23"));          // a+13
        assertTrue(output.contains("-3"));          // a-13
        assertTrue(output.contains("10"));          // a++ prints 10
        assertTrue(output.contains("11"));          // a-- prints 11
        assertTrue(output.contains("1"));           // a%2
        assertTrue(output.contains("0"));           // a/13
        assertTrue(output.contains("true-false"));  // conditional branch
        assertTrue(output.contains("while"));       // while loop
        assertTrue(output.contains("do while"));    // do-while loop
        assertTrue(output.contains("for loop"));    // for loop
        assertTrue(output.contains("true case"));   // switch case
    }
}
