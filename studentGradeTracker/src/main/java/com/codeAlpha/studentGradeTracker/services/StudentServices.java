package com.codeAlpha.studentGradeTracker.services;

import java.util.List;

import com.codeAlpha.studentGradeTracker.entities.Student;

public interface StudentServices {

	public Student getStudent(long studentId);

	public List<Student> getStudent();
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudentById(long studentId);
}
