package com.sean.demo01.Object;

import java.util.Objects;

public class Demo01Object {

    public static void main(String[] args) {
        String a = null;
        String b = "bbb";
        System.out.println(a.equals(b));
        boolean result = Objects.equals(a,b);
        System.out.println(result);
    }

    public class Person {
        private String name;
        private int age;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, age);
        }
    }
}
