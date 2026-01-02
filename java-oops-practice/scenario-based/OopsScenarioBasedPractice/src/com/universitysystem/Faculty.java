package com.universitysystem;

//Faculty assigns grades
class Faculty {
	private String facultyName;

	public Faculty(String facultyName) {
		this.facultyName = facultyName;
	}

	// Faculty assigns grade
	public void gradeStudent(Graded enrollment, String grade) {
		System.out.println("Faculty: " + facultyName);
		enrollment.assignGrade(grade);
	}
}
