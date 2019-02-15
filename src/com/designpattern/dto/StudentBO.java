package com.designpattern.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	List<StudentVO> studentsList;
	
	public StudentBO() {
		studentsList = new ArrayList<StudentVO>();
		StudentVO studentVO = new StudentVO("Robert", 0);
		StudentVO studentVO2 = new StudentVO("John",1);
		
		studentsList.add(studentVO);
		studentsList.add(studentVO2);
		
	}
	
	public void deleteStudent(StudentVO student) {
		studentsList.remove(student.getRollNo());
		System.out.println("Student: Roll No "+student.getRollNo()+ " , delete from datatbase");
		
	}
	
	//retrive list of students from the database
	   public List<StudentVO> getAllStudents() {
	      return studentsList;
	   }
	
	public StudentVO getStudent(int rollNo) {
		return studentsList.get(rollNo);
		
	}
	
	public void updateStudent(StudentVO student) {
		studentsList.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No "+ student.getRollNo() +", updated in the database");
	}
}
