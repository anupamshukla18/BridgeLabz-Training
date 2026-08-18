package day12.classproblems.oopsexample;

public class Student {

    String name;
    static String college = "TIT&S";

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
        System.out.println(college);
    }
}