package com.designpattern.filtre;

/**
 * Classe person
 * 
 * @author srakotomalala
 *
 */
public class Person {
	private String name;
	private String gender;
	private String materialStatus;

	
	/**
	 * @param name
	 * @param gender
	 * @param materialStatus
	 */
	public Person(String name, String gender, String materialStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.materialStatus = materialStatus;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the materialStatus
	 */
	public String getMaterialStatus() {
		return materialStatus;
	}

}
