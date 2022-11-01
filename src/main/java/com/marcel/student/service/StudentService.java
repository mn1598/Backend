package com.marcel.student.service;

import java.util.List;

import com.marcel.student.model.Student;

public interface StudentService {

  public Student saveStudent(Student student);
  public List<Student> getStudents();

}
