package com.sean.demo01.List;

import java.util.LinkedList;

public class Demo02LinkedList {

    public static void main(String[] args) {
        show03();
    }

    /*
    * removeFirst
    * removeLast
    * pop
    * */
    private static void show03() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        System.out.println(linkedList.removeFirst());//a，等效于pop
        System.out.println(linkedList);//[b, c]

        System.out.println(linkedList.removeLast());//c
        System.out.println(linkedList);//[b]


        LinkedList<String > linkedList1 = new LinkedList<>();
        linkedList1.add("www");
        linkedList1.add("abc");
        linkedList1.add("www");
        linkedList1.add("itcast");
        System.out.println(linkedList1.get(2));


    }


    /*
     * getFirst
     * getLast
     * */
    private static void show02() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

//        linkedList.clear();
        if (!linkedList.isEmpty()) {
            System.out.println(linkedList.getFirst());//a
            System.out.println(linkedList.getLast());//c

        }
    }


    /*
     * add, addFirst, addLast, push
     * */
    private static void show01() {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        System.out.println(linkedList);//[a, b, c]
        linkedList.addFirst("x");
        linkedList.push("a");//等效于addFirst
        System.out.println(linkedList);//[a, x, a, b, c]

        linkedList.addLast("y");//等效于add
        System.out.println(linkedList);//[a, x, a, b, c, y]


    }
}
