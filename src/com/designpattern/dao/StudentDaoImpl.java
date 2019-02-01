package com.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao {
	public static final String NAME_STUDENT_ONE = "Robert";
	public static final String NAME_STUDENT_TWO = "John";	
	public static final String MESSAGE_DELETE = " is deleted from database";
	public static final String MESSAGE_STUDENT_ROLL_NO = "Student: Roll No ";	
	public static final String MESSAGE_UPDATE = " is updated in the database";
	
	
	 
	// list is working as a database
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student studentOne = new Student(NAME_STUDENT_ONE, 0);
		Student studentTwo = new Student(NAME_STUDENT_TWO, 1);

		students.add(studentOne);
		students.add(studentTwo);
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println(MESSAGE_STUDENT_ROLL_NO+ student.getRollNo() + MESSAGE_UPDATE);
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println(MESSAGE_STUDENT_ROLL_NO + student.getRollNo() + MESSAGE_DELETE);
	}

}
