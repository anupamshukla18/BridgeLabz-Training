package day13.codingexercises;
class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    String course;

    Student(String name, String course) {
        super(name);
        this.course = course;
    }
}

class GraduateStudent extends Student {

    String thesisTitle;

    GraduateStudent(String name, String course, String thesisTitle) {
        super(name, course);
        this.thesisTitle = thesisTitle;
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {

        GraduateStudent student = new GraduateStudent(
                "Anupam",
                "Computer Science",
                "Artificial Intelligence in Healthcare"
        );

        System.out.println("Name: " + student.name);
        System.out.println("Course: " + student.course);
        System.out.println("Thesis Title: " + student.thesisTitle);
    }
}