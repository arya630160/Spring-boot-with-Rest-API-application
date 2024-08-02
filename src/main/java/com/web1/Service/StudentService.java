package com.web1.Service;

import java.util.List;

import com.web1.Model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public Student updateStudent(Student student,int sid);
	public Student getOneStudent(int sid);
	public void deleteStudent(int sid);
	public List<Student> getAllStudent();
}
