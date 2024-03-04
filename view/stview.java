package 5.view;

import 5.model.student;

import java.util.List;

public class StudentView implements IUsersView<Student> {
    @Override
    public void PrintOnConsole(Student user) {
        System.out.println(user);
    }

    @Override
    public void PrintOnConsoleArr(List<Student> users) {
        for (Student student : users){
            System.out.println(student);
        }
    }
}