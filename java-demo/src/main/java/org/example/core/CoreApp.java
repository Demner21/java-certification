package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class CoreApp {
    public static void main(String[] args) {
        String demneru = "demneru";
        System.out.println(demneru.substring(1, 4));


        String otherName = """
                demneru\
                1234567
                """;
        System.out.println(otherName.substring(4, 9));//eru12

        List<?> demoString = new ArrayList<>();
    }
}
