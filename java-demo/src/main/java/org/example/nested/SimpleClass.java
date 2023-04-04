package org.example.nested;

import java.io.IOException;

public class SimpleClass {
            String sa[]=new String[]{"ass","",""};

    private  class InnerClassA {
        static void method() throws IOException {
            var sa=new String[]{"ass","",""};
            System.out.println("inner class A");
        }

        void method2() throws Exception {
            System.out.println("inner class A//method 2");
        }

    }

    public class InnerClassB extends InnerClassA{
        void method2(){}
    }

    public static void main(String[] args) throws Exception {

        InnerClassA innerClassA = new SimpleClass().new InnerClassA();
        innerClassA.method2();
        InnerClassA.method();
    }

    void badCall(){
        InnerClassA innerClassA = new InnerClassA();
    }

}
