package ru.headfirstjava.ch6;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0,"zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        printAL(a);
        a.remove(2);
        if (a.contains("three")){
            a.add("four");
        }
        printAL(a);
        if (a.indexOf("four") != 4){
            a.add(4,"4.2");
        }
        printAL(a);
        printAL(a);
        String q = 2+2+"=value";
        System.out.println(q);
        String w = "Java";
        String e = new String("Java");
        System.out.println(w==e);
        System.out.println(w.equals(e));
    }
    void check(){}
    public static void printAL(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
