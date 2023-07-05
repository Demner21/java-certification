package org.example.collections;

import org.example.record.MyRecord;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {


    public static void main(String[] args) {

        Deque<MyRecord> myDeque = new ArrayDeque<>();
        myDeque.addFirst(new MyRecord("dmnr"));
        myDeque.add(new MyRecord("roraito"));
        myDeque.offer(new MyRecord("kami"));
        myDeque.addLast(new MyRecord("kenny"));
        myDeque.offerLast(new MyRecord("crazy"));
        myDeque.offerFirst(new MyRecord("flagg"));

        System.out.println(myDeque);
        myDeque.stream().sorted().forEach(System.out::println);
    }
}
