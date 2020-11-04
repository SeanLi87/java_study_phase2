package com.sean.demo03.Generic;
/*
* 泛型接口第二种使用方式
* 实现类中也使用接口泛型，在创建对象的时候再指定泛型
*
* 实现类格式：
* public class 实现类名称<I> implements 接口名称<I> {}
*
* 创建对象格式：
* 实现类名称<指定泛型> 对象名 = new 实现类名称<>();
* */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method1(I i) {
        System.out.println(i);
    }
}
