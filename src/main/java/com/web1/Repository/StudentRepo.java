package com.web1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web1.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
