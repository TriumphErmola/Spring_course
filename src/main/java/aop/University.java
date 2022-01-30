package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Andrey Ermolenko", 4, 9.9);
        Student st2 = new Student("Michail Ivaniv", 2, 8.9);
        Student st3 = new Student("Elena Sidorova", 4, 7.9);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Информация из метода getStudents : ");
        System.out.println(students);
        return students;
    }
}
