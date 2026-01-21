package org.example.oops;

public class Inheritance {
    int c;
    String str;

    public void add() {
        System.out.println("parent class method add");
    }

    public static void minus() {
        System.out.println("parent class method minus");
    }

    public static class ChildClass extends Inheritance {

        int a;
        String str;

        @Override
        public void add() {
            a = 12;
            System.out.println("child class method add");
            Inheritance.minus();
        }

    }
}
