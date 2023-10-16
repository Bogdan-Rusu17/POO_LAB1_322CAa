package task2;

import java.util.Random;

public class Internship {
    private String name;
    private double minGrade;
    private Student[] students;

    public String getName() {
        return name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student chooseCandidateRandomly() {
        Random random = new Random();
        int min = 0;
        int max = students.length - 1;
        int random_int = random.nextInt(max - min) + min;

        return students[random_int];
    }

    public  void chooseCandidatesForInterview() {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade()>= minGrade)
                System.out.println(students[i].getName());
        }
    }
}
