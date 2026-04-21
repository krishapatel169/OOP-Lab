package bpack;

import apack.A;

public class B extends A {

    public B(int pub, int prot, int priv) {
        super(pub, prot, priv);
    }

    public void display() {
        System.out.println("From Class B (Subclass):");

        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);

        System.out.println("Private Variable (via method): " + getPrivVar());
    }
}