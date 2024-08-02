package com.web1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web1.Model.Student;
import com.web1.Service.StudentServiceImp;

@RestController
public class MyController {

	
	@Autowired StudentServiceImp studentServiceImp;
	
	@GetMapping("/getAll")
	public List<Student> getAllStudentDetails()
	{
		return studentServiceImp.getAllStudent();
	}
	
	
	@PostMapping("/save")
	public String saveStudentDetails(@RequestBody Student Student)
	{
		Student saveOneStu=studentServiceImp.saveStudent(Student);
		String msg=null;
		if(saveOneStu!=null)
		{
			msg="saved successfully";
		}
		else
		{
			msg="not saved";
		}
		return msg;
	}
	
	
	@GetMapping("/getOne/{sid}")
	public Student getStudentById(@PathVariable int sid)
	{
		return studentServiceImp.getOneStudent(sid);
	}
	
	@DeleteMapping("/delete/{sid}")
	public String deleteStudentById(@PathVariable int sid)
	{
		studentServiceImp.deleteStudent(sid);
		return "successfully deleted";
	}
	
	@PutMapping("/update/{sid}")
	public Student updateById(@RequestBody Student student,@PathVariable int sid)
	{
		Student updateStudent=studentServiceImp.updateStudent(student, sid);
		return updateStudent;
	}
}
