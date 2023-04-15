package org.example.nested;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.random.RandomGenerator;

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

    public Inner inner1 = new Inner() {
        private static int value;

        public void doA() {
            System.out.println("doing A");
            int myControlValue = 2;
            BAD_LABEL:
            while (myControlValue > 1) {
                Random random = new Random();
                if (random.nextInt() > 4) {
                    continue;
                } else {
                    break BAD_LABEL;
                }
            }

            BAD_LABEL:
            while (myControlValue < 0) {
                break BAD_LABEL;
            }
        }
    };

    public void doA() {
        inner1.doA();
    }


    class Inner {
        int value;

        private void doA() {
        }
    }

    public class InnerClassB extends InnerClassA {
        void method2() throws RuntimeException, IOException, FileNotFoundException {
        }
    }

    public static void main(String[] args) throws Exception {

/*
        InnerClassA innerClassA = new SimpleClass().new InnerClassA();
        innerClassA.method2();
        InnerClassA.method();
*/


        var myInt = 5;
        var myOtherInt = (myInt++ * 4 * (++myInt * --myInt) * (--myInt));
        // 5* 4(7*6)*(5)
        System.out.println(myOtherInt);//
        System.out.println(myOtherInt == 4200 ? "true" : "false|");
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
