package com.codeAlpha.studentGradeTracker.entities;

public class Student {
	
	private long student_id;
	private String name;
	private int english;
	private int hindi;
	private int maths;
	private int physics;
	private int chemistry;
	


	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long student_id, String name, int english, int hindi, int maths, int physics, int chemistry) {
		super();
		this.student_id = student_id; 
		this.name = name;
		this.english = english;
		this.hindi = hindi;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		totalMarks();
		highestMark();
		lowesetMark();
		averageMark(); 
		
		
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	
	public int totalMarks() {
		return english + hindi + maths + physics + chemistry;
	}

	public int highestMark() {
        return Math.max(Math.max(english, hindi), Math.max(Math.max(maths, physics), chemistry));
    }
	
	public int lowesetMark() {
        return Math.min(Math.min(english, hindi), Math.min(Math.min(maths, physics), chemistry));
    }
	
	public double averageMark() {
        return totalMarks() / 5.0; 
    }
	

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", english=" + english + ", hindi=" + hindi
				+ ", maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry +
				", total=" + totalMarks() + ", highestMarks=" + highestMark() + ", lowesetMark=" + lowesetMark() +"]";
	}
	
	
	
	
}
