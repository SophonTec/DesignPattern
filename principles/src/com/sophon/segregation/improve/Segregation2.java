package com.sophon.segregation.improve;

public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();
    void operation3();
}

interface Interface3 {
    void operation4();
    void operation5();
}

class C implements Interface1, Interface2 {
    public void operation1() {
        System.out.println("class C implements operation1.");
    }
    public void operation2() {
        System.out.println("class C implements operation2.");
    }
    public void operation3() {
        System.out.println("class C implements operation3.");
    }
}

class D implements Interface1, Interface3 {
    public void operation1() {
        System.out.println("class D implements operation1.");
    }
    public void operation4() {
        System.out.println("class D implements operation4.");
    }
    public void operation5() {
        System.out.println("class D implements operation5.");
    }
}

class A {
    public void depend1(C i) {
        i.operation1();
    }
    public void depend2(C i) {
        i.operation2();
    }
    public void depend3(C i) {
        i.operation3();
    }
}

class B {
    public void depend1(D i) {
        i.operation1();
    }
    public void depend2(D i) {
        i.operation4();
    }
    public void depend3(D i) {
        i.operation5();
    }
}
