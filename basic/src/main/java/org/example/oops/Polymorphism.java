package org.example.oops;

public class Polymorphism {

    int c;
    String str;

    public void add() {
        System.out.println("parent class method add");
    }

    public static void minus() {
        System.out.println("parent class method minus");
    }

    public static class ChildClass extends Polymorphism {

        int a;
        String str;

        // method overriding
        @Override
        public void add() {
            a = 12;
            System.out.println("child class method add");
            Polymorphism.minus();
        }

        // method overloading
        public void add(int a) {
            a = 12;
            System.out.println("child class method add");
            Polymorphism.minus();
        }

    }
}
