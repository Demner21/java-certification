package org.example.methods.foo;

import org.example.methods.Father;

public class ChildrenFar extends Father {
    public static void main(String[] args) {
        ChildrenFar childrenFar = new ChildrenFar();
        System.out.println(childrenFar.lastname);
        Father weirdCase = new ChildrenFar();
        //System.out.println(weirdCase.lastname); //cannot use
    }
}
