import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + indexNumber + ") - Average: " + String.format("%.2f", calculateAverageGrade());
    }
}

public class Lab11 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Pawel", "Wisniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student topStudent = null;
        double highestAverage = 0;
        for (Student student : students) {
            double average = student.calculateAverageGrade();
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student;
            }
        }

        double totalSum = 0;
        int totalGrades = 0;
        for (Student student : students) {
            for (int grade : student.getGrades()) {
                totalSum += grade;
                totalGrades += 1;
            }
        }
        double overallAverage = totalSum / totalGrades;

        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("Student with the highest average:");
        System.out.println(topStudent);

        System.out.println("\nStudents sorted by last names:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nOverall average grade of all students: " + String.format("%.2f", overallAverage));
    }
}
