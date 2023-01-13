package com.driver;

public class Main {

    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.meth());
        A obj = new B();
        System.out.println(obj.meth());
    }
}

 class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

 class B extends A {
    public String meth() {
        super.meth();
        return "Method is overridden in Extendend class B";
    }
}



