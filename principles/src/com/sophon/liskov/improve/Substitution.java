package com.sophon.liskov.improve;

public class Substitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func(11, 3));
        B b = new B();
        System.out.println("11 - 3 = " + b.func(11, 3));
        System.out.println("11 - 3 + 9 = " + b.add9(11, 3));
        System.out.println("11 - 3 - 9 = " + b.minus9(11, 3));
    }
}

class Base {
    public int func(int num1, int num2) {
        return num1 - num2;
    }
}

class A extends Base {
    public int minus9 (int num1, int num2) {
        return num1 - num2 - 9;
    }
}

class B extends Base {
    public int add9(int a, int b) {
        return func(a, b) + 9;
    }
    private A a = new A();
    public int minus9(int a, int b) {
        return this.a.minus9(a, b);
    }
}
