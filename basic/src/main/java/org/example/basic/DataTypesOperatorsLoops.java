package org.example.basic;

public class DataTypesOperatorsLoops {



    public void dataTypes() {

        // Data Types
        int a = 10;
        short s = 12;
        long l = 12345L;
        double d = 1234567;
        float f = 123.45f;
        char c = 's';
        boolean b = true;

        // Operators
        System.out.println(a + 13);
        System.out.println(a - 13);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a % 2);
        System.out.println(a * 13);
        System.out.println(a / 13);

        // conditional statements

        if (a <= 9) {
            System.out.println("true");
        } else if (a < 9 && b == true) {
            System.out.println("false");
        } else {
            System.out.println("true-false");
        }

        // loops

        while (a <= 12) {
            System.out.println("while");
            a++;
        }
        do {
            a++;
            System.out.println("do while");
        }
        while (a <= 12);

        for (int i = 0; i <= 3; i++) {
            System.out.println("for loop");
            if (i == 2) {
                continue;
            }

        }

        switch (c) {
            case 'p':
                System.out.println("case1");
            case 's':
                System.out.println("true case");
                break;
            default:
                System.out.println("default case");

        }
    }
}
