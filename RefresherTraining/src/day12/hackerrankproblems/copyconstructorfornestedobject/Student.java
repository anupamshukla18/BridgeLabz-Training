package day12.hackerrankproblems.copyconstructorfornestedobject;

public class Student {

    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Student(Student student) {
        this.name = student.name;
        this.address = new Address(student.address);
    }
}