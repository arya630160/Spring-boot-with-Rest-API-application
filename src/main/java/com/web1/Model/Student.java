package com.web1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String name;
	private String course;
	private int hibernate;
	private int spring;
	private int spring_boot;

	private double total;
	private double percentage;
	private String grade;
	private String result;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name, String course, int hibernate, int spring, int spring_boot, double total,
			double percentage, String grade, String result) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.hibernate = hibernate;
		this.spring = spring;
		this.spring_boot = spring_boot;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
		this.result = result;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getHibernate() {
		return hibernate;
	}

	public void setHibernate(int hibernate) {
		this.hibernate = hibernate;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getSpring_boot() {
		return spring_boot;
	}

	public void setSpring_boot(int spring_boot) {
		this.spring_boot = spring_boot;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + ", hibernate=" + hibernate
				+ ", spring=" + spring + ", spring_boot=" + spring_boot + ", total=" + total + ", percentage="
				+ percentage + ", grade=" + grade + ", result=" + result + "]";
	}

	
	
	
	
}
