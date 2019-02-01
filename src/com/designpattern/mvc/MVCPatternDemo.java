package com.designpattern.mvc;

public class MVCPatternDemo {

	public static final String STUDENT_NAME = "Robert";
	public static final String STUDENT_ROLL_NO = "10";
	public static final String STUDENT_NAME_UPDATE_MODEL = "John";
	public static final String SEPARATOR = "---------------";

	private static StudentModel retriveStudentFromDatabase() {
		StudentModel student = new StudentModel();
		student.setName(STUDENT_NAME);
		student.setRollNo(STUDENT_ROLL_NO);
		return student;
	}

	public static void main(String[] args) {
		StudentModel model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		System.out.println(SEPARATOR);

		// update model data
		controller.setStudentName(STUDENT_NAME_UPDATE_MODEL);
		controller.updateView();
	}
}
