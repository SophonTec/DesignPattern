package com.sophon.composite;

public class Composite1 {
    public static void main(String[] args) {
        B b = new B();
        b.doSomething();

        C c = new C();
        c.doSpecial(new A());

        D d = new D();
        d.setA(new A());
        d.doSpecial();

        E e = new E();
        e.doSpecial();
    }
}

class A {
    public void nothing() {
        System.out.println("Boring and nothing happens.");
    }

    public void doSomething() {
        System.out.println("Work hard and do something.");
    }
}

class B extends A {

}

class C {
    public void doSpecial(A a) {
        a.doSomething();
        System.out.println("And something should be special.");
    }
}

class D {
    A a = null;
    public void setA(A a) {
        this.a = a;
    }

    public void doSpecial() {
        this.a.doSomething();
        System.out.println("And something should be special.");
    }
}

class E {
    A a = new A();
    public void doSpecial() {
        this.a.doSomething();
        System.out.println("And something should be special.");
    }
}
