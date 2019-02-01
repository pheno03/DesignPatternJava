package com.designpattern.dao;

public class DaoPatternDemo implements IStaticValeur {

	public static void main(String[] args) {

		IStudentDao studentDao = new StudentDaoImpl();

		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println(MESSAGE_STUDENT_ROLL_NO_BEGIN + student.getRollNo() + NAME_STUDENT + student.getName()
					+ FERMETURE_CROCHET_MESSAGE_STUDENT_ROLL_NO);
		}

		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName(NAME_STUDENT__UPDATE);
		studentDao.updateStudent(student);

		// get the student
		studentDao.getStudent(0);
		System.out.println(MESSAGE_STUDENT_ROLL_NO_BEGIN + student.getRollNo() + NAME_STUDENT + student.getName()
				+ FERMETURE_CROCHET_MESSAGE_STUDENT_ROLL_NO);
	}
}
