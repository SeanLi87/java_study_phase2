package com.sean.demo03.Generic;
/*
 * 泛型类的格式：
 * 修饰符 class 类名 <泛型> {
 *      //...
 *  }
 *
 * 所有使用到<泛型>的成员方法或者成员变量，都会在创建对象时，赋予指定的数据类型
 *
 *
 *  自定义泛型方法的格式：
 *  修饰符 <泛型> 返回值类型 方法名(参数列表){
 *          //...
 *      }
 *  注意：返回值类型和参数列表均可以使用泛型
 *
 * */
public class GenericClass<E>{

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    //泛型类型的成员变量
    private E name;

    //泛型类型参数的成员方法
    public void method1(E e){
        System.out.println(e);
    }
    //泛型类型参数和返回值的成员方法
    public E method2(E e){
        return e;
    }
    //自定义泛型的成员方法，需要自己重新指定泛型
    public <S> S method3(S a){
        return a;
    }
    //普通成员方法
    public void method4(String str) {
        System.out.println(str);
    }

     void method5(){
        System.out.println("method5");
    };
}
