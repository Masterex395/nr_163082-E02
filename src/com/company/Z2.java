package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Z2 {

    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        print(i);
        TreeSet<String> s = new TreeSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        print(s);
        LinkedList<String> l = new LinkedList<>();
        l.add("D");
        l.add("E");
        l.add("F");
        print(l);
    }
    public static <T> void print(Iterable<T> x){
        x.forEach((i) -> {System.out.print("["+i+"]"+",");});
    }
}
