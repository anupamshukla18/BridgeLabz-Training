package com.generics.coursemanagement;

import java.util.Arrays;
import java.util.List;

public class UniversityApp {

	public static void main(String[] args) {

		Course<ExamCourse> examCourse = new Course<>("CS101", "Data Structures", 4, new ExamCourse());

		Course<AssignmentCourse> assignmentCourse = new Course<>("CS202", "Software Engineering", 3,
				new AssignmentCourse());

		Course<ResearchCourse> researchCourse = new Course<>("CS303", "AI Research", 5, new ResearchCourse());

		System.out.println(examCourse.getDetails());
		System.out.println(assignmentCourse.getDetails());
		System.out.println(researchCourse.getDetails());

		List<CourseType> courseTypes = Arrays.asList(new ExamCourse(), new AssignmentCourse(), new ResearchCourse());

		System.out.println("\nSupported Evaluation Types:");
		CourseManager.displayCourses(courseTypes);
	}
}
