package com.sophon.segregation;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());

        C c = new C();
        c.depend1(new D());
    }
}

interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {
    public void operation1() {
        System.out.println("Class B implements operation1.");
    }

    public void operation2() {
        System.out.println("Class B implements operation2.");
    }

    public void operation3() {
        System.out.println("Class B implements operation3.");
    }

    public void operation4() {
        System.out.println("Class B implements operation4.");
    }

    public void operation5() {
        System.out.println("Class B implements operation5.");
    }
}

class D implements Interface1 {
    public void operation1() {
        System.out.println("Class D implements operation1.");
    }

    public void operation2() {
        System.out.println("Class D implements operation2.");
    }

    public void operation3() {
        System.out.println("Class D implements operation3.");
    }

    public void operation4() {
        System.out.println("Class D implements operation4.");
    }

    public void operation5() {
        System.out.println("Class D implements operation5.");
    }
}

class A {
    public void depend1(B i) {
        i.operation1();
    }

    public void depend2(B i) {
        i.operation2();
    }

    public void depend3(B i) {
        i.operation3();
    }
}

class C {
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
