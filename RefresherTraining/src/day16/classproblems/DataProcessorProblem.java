package day16.classproblems;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

interface DataProcessor<T> {
    void add(T data);

    void processData(T data);
}

class DataProcessorImpl<T> implements DataProcessor<T> {
    @Override
    public void add(T data) {
        System.out.println("Adding: " + data);
    }

    @Override
    public void processData(T data) {
        System.out.println("Processing: " + data);
    }
}

public class DataProcessorProblem {
    public static void main(String[] args) {
        DataProcessor<Student> studentDataProcessor = new DataProcessorImpl<>();
        studentDataProcessor.add(new Student("Anupam"));
        studentDataProcessor.processData(new Student("Anupam"));
        DataProcessor<Employee> employeeDataProcessor = new DataProcessorImpl<>();
        employeeDataProcessor.add(new Employee("Anuj"));
        employeeDataProcessor.processData(new Employee("Anuj"));
    }
}
