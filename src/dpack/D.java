package dpack;

import bpack.B;
import cpack.C;

public class D {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        System.out.println("From class B");
        b.display();
        System.out.println();
        System.out.println("From class C");
        c.display();
    }
}
