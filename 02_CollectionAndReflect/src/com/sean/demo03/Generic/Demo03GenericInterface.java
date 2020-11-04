package com.sean.demo03.Generic;

import java.util.ArrayList;

public class Demo03GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gs1 = new GenericInterfaceImpl1();
        gs1.method1("测试泛型接口");

        GenericInterfaceImpl2<String> gs2 = new GenericInterfaceImpl2<>();
        gs2.method1("测试泛型接口2");

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1.2);


    }
}
