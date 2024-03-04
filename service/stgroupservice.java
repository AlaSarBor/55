package 5.service;

import 5.model.student;
import 5.model.teacher;
import 5.model.studygroup;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}