package com.generics.coursemanagement;
class Course<T extends CourseType> {

    private String courseCode;
    private String courseName;
    private int credits;
    private T courseType;

    public Course(String courseCode, String courseName, int credits, T courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getDetails() {
        return courseCode + " - " + courseName +
               " (" + credits + " Credits, " +
               courseType.getEvaluationType() + ")";
    }
}
