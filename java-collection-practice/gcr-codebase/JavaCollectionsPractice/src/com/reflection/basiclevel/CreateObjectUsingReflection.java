package com.reflection.basiclevel;
import java.lang.reflect.Constructor;

public class CreateObjectUsingReflection {

    // Inner Student class
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }

    public static void main(String[] args) {

        try {
            // Load Student class dynamically
            Class<?> cls = Class.forName(
                "CreateObjectUsingReflection$Student"
            );

            // Get constructor with parameters
            Constructor<?> constructor =
                cls.getDeclaredConstructor(int.class, String.class);

            // Create object dynamically (no new keyword)
            Object obj = constructor.newInstance(101, "Anuj");

            // Cast and use object
            Student student = (Student) obj;
            student.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
