package com.sean.demo03.Generic;
/*
* 泛型接口第一种使用方式：
* 在实现类中指定泛型
*
* public class 类名称 implements 接口<泛型> {}
*
* 备注：覆盖重写接口方法时，泛型需要指定和类泛型一致
*
* */
public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method1(String s) {

        System.out.println(s);
    }
}
