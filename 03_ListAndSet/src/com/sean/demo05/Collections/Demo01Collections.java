package com.sean.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Demo01Collections {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"a","b","c","d");
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("张三",22));
        p.add(new Person("李四",19));
        p.add(new Person("王五",20));
        System.out.println(p);

        Collections.sort(p);
        System.out.println(p);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("b杨幂",18));
        students.add(new Student("a迪丽热巴",18));
        students.add(new Student("古力娜扎",22));
        students.add(new Student("玛尔扎哈",21));

        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge()-o2.getAge();
                if (result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }

                return result;
            }
        });

        System.out.println(students);




    }
}
