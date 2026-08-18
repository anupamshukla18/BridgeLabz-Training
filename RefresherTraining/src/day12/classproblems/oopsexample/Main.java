package day12.classproblems.oopsexample;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Anupam");
        Student student2 = new Student("Rahul");

        student1.display();
        student2.display();

        Student.college = "TIT";

        student1.display();
        student2.display();
    }
}