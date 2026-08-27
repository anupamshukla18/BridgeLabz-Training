package day20.classproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("Anupam", 22);
        Student s2 = new Student("Yashraj", 21);

        list.add(s1);
        list.add(s2);

        Collections.sort(list);
        for (Student element : list) {
            System.out.println(element);
        }
    }
}
