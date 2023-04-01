package org.example.i_o;

import java.nio.file.Path;
import java.nio.file.Paths;

public class IOMain {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\User\\dev\\java-certification\\java-demo\\src\\main\\resources\\i-o\\demo.txt");
        Path path2 = Paths.get("demo2.txt");
        System.out.println(path1.resolve(path2));
    }
}
