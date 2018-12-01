package com.oecm.Controller;

import com.oecm.Entity.Student;
import com.oecm.Service.StudentService;

import java.util.Collection;

public class StudentController {

    private StudentService studentService;

    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();

    }
}
