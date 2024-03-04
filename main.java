package 5;

import 5.controller.c;
import 5.model.student;
import 5.model.teacher;
import 5.model.studygroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Teacher teacher1 = new Teacher("Сидор", "Матрасович", "Пупкин", 1);
        Teacher teacher2 = new Teacher("Максим", "Петрович", "Зайкин", 2);

        controller.createStudent("Студент 1", "Иван", "Иванов", 1);
        controller.createStudent("Студент 2", "Петр", "Петров", 2);
        controller.createStudent("Студент 3", "Семен", "Семенов", 3);
        controller.createStudent("Студент 4", "Роман", "Романов", 4);
        controller.createStudent("Студент 5", "Василий", "Васильев", 5);

        
        List<Integer> studentIds = controller.getAllStudentIds();

        
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Студент 1", "Иван", "Иванов", 1));
        students1.add(new Student("Студент 2", "Петр", "Петров", 2));
        StudyGroup studyGroup1 = controller.formStudyGroup(teacher1, students1);
        System.out.println(studyGroup1);

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Студент 3", "Семен", "Семенов", 3));
        students2.add(new Student("Студент 4", "Роман", "Романов", 4));
        students2.add(new Student("Студент 5", "Василий", "Васильев", 5));
        StudyGroup studyGroup2 = controller.formStudyGroup(teacher2, students2);
        System.out.println(studyGroup2);
    }
}