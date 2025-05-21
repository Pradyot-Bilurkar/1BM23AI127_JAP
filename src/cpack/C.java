package cpack;

import apack.A;

public class C {
    public void display () {
        A obj = new A();
        System.out.println("Default: " + obj.defaultVar); 
        System.out.println("Protected: " + obj.protectedVar); 
        System.out.println("Private: " + obj.privateVar); 
        System.out.println("Public: " + obj.publicVar); 
    }
}
