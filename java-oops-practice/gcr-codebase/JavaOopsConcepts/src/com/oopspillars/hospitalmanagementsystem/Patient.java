package com.oopspillars.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements MedicalRecord {
    // Encapsulated fields
    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data (private)
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    // Constructor
    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Abstract method for billing
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    // Encapsulation helpers
    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    // Interface method implementations
    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
