package com.web1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web1.Model.Student;
import com.web1.Repository.StudentRepo;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		
		double tot=0.0,per=0.0;
		String gr=null, res=null;
		tot=student.getHibernate()+student.getSpring()+student.getSpring_boot();
		per=tot/3;
		if(per>=70)
		{
			gr="A grade";
		}
		else if(per>=60)
		{
			gr="B grade";
		}
		else if(per>=50)
		{
			gr="C grade";
		}
		else if(per>=40)
		{
			gr="D grade";
		}
		if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpring_boot()>=35)
		{
			res="Pass";
		}
		else
		{
			res="Fail";
		}
		student.setTotal(tot);
		student.setPercentage(per);
		student.setGrade(gr);
		student.setResult(res);
		
		return studentRepo.save(student);
		
	}

	@Override
	public Student updateStudent(Student student, int sid) {
		
			  Student oldRecord=studentRepo.findById(sid).get();
			  double tot=0.0,per=0.0;
			  String gr=null, res=null;
			 tot=student.getHibernate()+student.getSpring()+student.getSpring_boot();
			  per=tot/3;
			  if(per>=70)
			  {
			   gr="A grade";
			  }
			  else if(per>=60)
			  {
			   gr="B grade";
			  }
			  else if(per>=50)
			  {
			   gr="C grade";
			  }
			  else if(per>=40)
			  {
			   gr="D grade";
			  }
			if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpring_boot()>=35)
			  {
			   res="Pass";
			  }
			  else
			  {
			   res="Fail";
			  }
			  oldRecord.setName(student.getName());
			  oldRecord.setCourse(student.getCourse());
			  oldRecord.setHibernate(student.getHibernate());
			  oldRecord.setSpring(student.getSpring());
			  oldRecord.setSpring_boot(student.getSpring_boot());
			  oldRecord.setTotal(tot);
			  oldRecord.setPercentage(per);
			  oldRecord.setGrade(gr);
			  oldRecord.setResult(res);
			  
			  return studentRepo.save(oldRecord);
			 
	}

	@Override
	public Student getOneStudent(int sid) {
		Student getOne=studentRepo.findById(sid).get();
		return getOne;
	
	}

	@Override
	public void deleteStudent(int sid) {
		studentRepo.deleteById(sid);
		
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> listAllStudents=studentRepo.findAll();
		return listAllStudents;
	}

}
