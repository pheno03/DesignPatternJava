package com.designpattern.dto;

/**
 * Le modèle de transfert d’objet est utilisé 
 * lorsque nous souhaitons transmettre des données 
 * avec plusieurs attributs en une seule fois, d’un client à un serveur.
 * 
 * @author srakotomalala
 *
 */

public class TransfertObjectPatternDemo {
	public static void main(String[] args) {

		StudentBO studentBO = new StudentBO();

		// print all students
		for (StudentVO student : studentBO.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// update student
		StudentVO student = studentBO.getAllStudents().get(0);
		student.setName("Michael");
		studentBO.updateStudent(student);

		// get the student
		student = studentBO.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}

}
