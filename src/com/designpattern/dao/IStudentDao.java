package com.designpattern.dao;

import java.util.List;

/**
 * Interface pour les opérations à effectuer sur les objets de modèle
 * 
 * @author srakotomalala
 *
 */
public interface IStudentDao {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

}
