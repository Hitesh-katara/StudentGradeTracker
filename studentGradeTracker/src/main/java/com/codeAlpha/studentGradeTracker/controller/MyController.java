package com.codeAlpha.studentGradeTracker.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.codeAlpha.studentGradeTracker.entities.Student;
import com.codeAlpha.studentGradeTracker.services.StudentServices;
import org.springframework.ui.Model;

@Controller
public class MyController {

	
	private final StudentServices studentServices;
	
	@Autowired
	public MyController(StudentServices studentServices) {
        this.studentServices = studentServices;
        }
	
	@GetMapping("/")
        public String viewHomePage(Model model) {
        model.addAttribute("listStudents", studentServices.getStudent());
        return "index.html";
        }
	// Add student form
	@GetMapping("/addNewStudentForm")   
	public String addNewStudentForm(Model model) {
		Student student  = new Student();
		model.addAttribute("student",student);
		return "addNewStudent";
	}
	 
	       //add a student 
		@PostMapping("/students")
		public String addStudent(@ModelAttribute("student") Student student)
		{
			studentServices.addStudent(student);
			return "redirect:/";
		}
		
		//Update student form
		@GetMapping("/showFormForUpdate/{id}")
	        public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

	        Student student = studentServices.getStudent(id);
	        model.addAttribute("student", student);
	        return "update_student";
	        }
		
		//updating student
		@PostMapping("/saveStudents")
		public String updateStudent(@ModelAttribute("student") Student student)
		{
			studentServices.updateStudent(student);
			return "redirect:/";
		}
		
		// delete Student
		@GetMapping("/deleteStudent/{id}")
		public String deleteEmployee(@PathVariable (value = "id") long id) {
		 
		 // call delete employee method 
		 this.studentServices.deleteStudentById(id);
		 return "redirect:/";
		} 
		
		//about page
		@GetMapping("/about")
		public String about() {
			return "about";
		}
		
}
