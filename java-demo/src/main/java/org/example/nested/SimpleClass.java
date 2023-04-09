package org.example.nested;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SimpleClass {
    String sa[] = new String[]{"ass", "", ""};

    private class InnerClassA {
        static void method() throws IOException {
            var sa = new String[]{"ass", "", ""};
            System.out.println("inner class A");
        }

        void method2() throws IOException {
            System.out.println("inner class A//method 2");
        }

    }

    public class InnerClassB extends InnerClassA {
        void method2() throws RuntimeException, IOException, FileNotFoundException {
        }
    }

    public static void main(String[] args) throws Exception {

        InnerClassA innerClassA = new SimpleClass().new InnerClassA();
        innerClassA.method2();
        InnerClassA.method();
    }

    void badCall() {
        InnerClassA innerClassA = new InnerClassA();
    }

    static void otherStaticMethod() {

        final class MySuperLocalClass {
            static void demo() {
            }
        }
        var demo = new MySuperLocalClass();
    }
}
