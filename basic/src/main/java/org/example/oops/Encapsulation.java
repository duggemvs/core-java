package org.example.oops;

public class Encapsulation {
    private int a=10;
    private int b=20;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public class ChildClass
    {
        Encapsulation encapsulation = new Encapsulation();
        public int add()
        {
           int a =  encapsulation.getA();
            int b = encapsulation.getB();
            return a+b;
        }
    }

}
