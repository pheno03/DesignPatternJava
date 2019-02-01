package com.designpattern.dao;

public class DaoPatternDemo {

	public static final String NAME_STUDENT = " is Name : ";
	public static final String FERMETURE_CROCHET_MESSAGE_STUDENT_ROLL_NO = " ]";

	public static final String MESSAGE_STUDENT_ROLL_NO = "Student: [RollNo :";
	public static final String NAME_STUDENT__UPDATE = " Michael ";

	public static void main(String[] args) {

		IStudentDao studentDao = new StudentDaoImpl();

		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println(MESSAGE_STUDENT_ROLL_NO + student.getRollNo() + NAME_STUDENT + student.getName()
					+ FERMETURE_CROCHET_MESSAGE_STUDENT_ROLL_NO);
		}

		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName(NAME_STUDENT__UPDATE);
		studentDao.updateStudent(student);

		// get the student
		studentDao.getStudent(0);
		System.out.println(MESSAGE_STUDENT_ROLL_NO + student.getRollNo() + NAME_STUDENT + student.getName()
				+ FERMETURE_CROCHET_MESSAGE_STUDENT_ROLL_NO);
	}
}
