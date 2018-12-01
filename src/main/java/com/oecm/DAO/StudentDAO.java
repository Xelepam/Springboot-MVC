package com.oecm.DAO;

import com.oecm.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDAO {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>() {

            {
                put(1, new Student(1, "Omar", "Computer Science"));
                put(2, new Student(2, "David", "Mechanical Engineering"));
                put(3, new Student(3, "Miguel", "Electrical Engineering"));
            }

        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }
}
