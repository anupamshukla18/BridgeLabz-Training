package com.objectmodeling;

import java.util.*;

//================= Learner Class (Earlier Student) =================
class Learner {

	private String learnerName;
	private List<Subject> enrolledSubjects;

	public Learner(String learnerName) {
		this.learnerName = learnerName;
		enrolledSubjects = new ArrayList<>();
	}

	public String getLearnerName() {
		return learnerName;
	}

	// Learner enrolling subject (Association + Communication)
	public void enrollSubject(Subject subject) {
		enrolledSubjects.add(subject);
		subject.addLearner(this); // maintain relationship both sides
		System.out.println(learnerName + " enrolled in " + subject.getSubjectName());
	}

	public void showMySubjects() {
		System.out.println("\nSubjects of " + learnerName + ":");
		for (Subject s : enrolledSubjects) {
			System.out.println("- " + s.getSubjectName());
		}
	}
}

//================= Professor Class =================
class Professor {

	private String professorName;
	private List<Subject> teachingSubjects;

	public Professor(String professorName) {
		this.professorName = professorName;
		teachingSubjects = new ArrayList<>();
	}

	public String getProfessorName() {
		return professorName;
	}

	// Professor assigned to subject
	public void teachSubject(Subject subject) {
		teachingSubjects.add(subject);
		subject.assignProfessor(this);
		System.out.println("Professor " + professorName + " is assigned to teach " + subject.getSubjectName());
	}

	public void showTeachingSubjects() {
		System.out.println("\nSubjects taught by Professor " + professorName + ":");
		for (Subject s : teachingSubjects) {
			System.out.println("- " + s.getSubjectName());
		}
	}
}

//================= Subject Class =================
class Subject {

	private String subjectName;
	private Professor professor;
	private List<Learner> learners;

	public Subject(String subjectName) {
		this.subjectName = subjectName;
		learners = new ArrayList<>();
	}

	public String getSubjectName() {
		return subjectName;
	}

	// add learner internally
	public void addLearner(Learner learner) {
		learners.add(learner);
	}

	// assign professor to this subject
	public void assignProfessor(Professor professor) {
		this.professor = professor;
	}

	public void showLearners() {
		System.out.println("\nLearners enrolled in " + subjectName + ":");
		for (Learner l : learners) {
			System.out.println("- " + l.getLearnerName());
		}
	}

	public void showProfessor() {
		if (professor != null)
			System.out.println("Professor for " + subjectName + ": " + professor.getProfessorName());
		else
			System.out.println(subjectName + " has no professor assigned yet.");
	}
}

//================= Main Class =================
public class UniversityManagementTest {

	public static void main(String[] args) {

		// Learners
		Learner l1 = new Learner("Rohan");
		Learner l2 = new Learner("Ananya");

		// Professors
		Professor p1 = new Professor("Dr. Mehta");
		Professor p2 = new Professor("Dr. Sharma");

		// Subjects
		Subject sub1 = new Subject("Data Structures");
		Subject sub2 = new Subject("Operating Systems");

		// assign professors
		p1.teachSubject(sub1);
		p2.teachSubject(sub2);

		// learners enroll
		l1.enrollSubject(sub1);
		l1.enrollSubject(sub2);

		l2.enrollSubject(sub1);

		// show details
		l1.showMySubjects();
		l2.showMySubjects();

		p1.showTeachingSubjects();
		p2.showTeachingSubjects();

		sub1.showProfessor();
		sub1.showLearners();

		sub2.showProfessor();
		sub2.showLearners();
	}
}
