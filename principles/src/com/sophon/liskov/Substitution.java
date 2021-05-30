package com.sophon.liskov;

public class Substitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func(11, 3));
        B b = new B();
        System.out.println("11 - 3 = " + b.func(11, 3));
        System.out.println("11 - 3 + 9 = " + b.add9(11, 3));
    }
}

class A {
    public int func(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    public int func(int num1, int num2) {
        return num1 + num2;
    }

    public int add9(int a, int b) {
        return func(a, b) + 9;
    }
}
