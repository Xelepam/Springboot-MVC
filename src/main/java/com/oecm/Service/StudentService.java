package com.oecm.Service;

import com.oecm.DAO.StudentDAO;
import com.oecm.Entity.Student;

import java.util.Collection;

public class StudentService {

    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

}
