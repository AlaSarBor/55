package 5.model;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName); // Передаем ФИО студента в конструктор суперкласса User
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + " " +
                super.toString() +
                '}';
    }
}