package com.generics.coursemanagement;
import java.util.List;

class CourseManager {

    public static void displayCourses(List<? extends CourseType> courseTypes) {
        for (CourseType type : courseTypes) {
            System.out.println("Evaluation Type: " + type.getEvaluationType());
        }
    }
}
