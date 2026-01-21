package org.example.oops;

public  class Abstraction {
    public abstract static class AbstractClass {

        // abstract method
        public abstract void add();

        //non abstract method
        public void sum() {
            System.out.println("non abstract method");
        }

    }

    public interface Rectangle
    {
        // abstract method
        void size();
        // default method
         default void name()
         {
             System.out.println("default method");
         }
         // static method
        static void area()
        {
            System.out.println("static method");
        }
        // private method
        private void perimeter()
        {
            System.out.println("private method");
        }

    }
}
