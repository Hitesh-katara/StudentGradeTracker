package com.codeAlpha.studentGradeTracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codeAlpha.studentGradeTracker.entities.Student;

@Service
public class StudentServicesImpl implements StudentServices {

	
	List<Student> list;
	
	//constructor
	public StudentServicesImpl() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		list.add(new Student(101,"Aman",65,60,70,68,72));
		list.add(new Student(102,"Raman",75,65,80,86,62));
				
	}
	
	// get all students
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return list;
	}

	// get single student
	@Override
	public Student getStudent(long studentId) {
		// TODO Auto-generated method stub
		Student s = null;
		for(Student student : list)
		{
			if(student.getStudent_id() ==studentId)
			{
				s= student;
				break;
			}
		}
		return s;
	}

	//add New Student
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		list.add(student);
		return student;
	}

	// update marks of students
	@Override
	public Student updateStudent(Student student0) {
		// TODO Auto-generated method stub
		Student s = null;
		for(Student student : list)
		{
			if(student.getStudent_id()==student0.getStudent_id())
			{
				student.setName(student0.getName());
				student.setEnglish(student0.getEnglish());
				student.setHindi(student0.getHindi());
				student.setMaths(student0.getMaths());
				student.setPhysics(student0.getPhysics());
				student.setChemistry(student0.getChemistry());
				break; 
			}
		}
		return student0;
	}

	@Override
	public void deleteStudentById(long studentId) {
		// TODO Auto-generated method stub
		list.removeIf(student -> student.getStudent_id() == studentId);
		
	}


	

}
