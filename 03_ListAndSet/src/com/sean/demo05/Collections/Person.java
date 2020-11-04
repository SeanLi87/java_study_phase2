package com.sean.demo05.Collections;


public class Person implements Comparable<Person> {

    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;//升序
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
