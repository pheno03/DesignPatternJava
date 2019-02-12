package com.designpattern.filtre;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements ICriteria {

	private static String  FEMALE_CRITARIA = "FEMALE";
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> femalePersons = new ArrayList<Person>();
		
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase(FEMALE_CRITARIA)) {
				femalePersons.add(person);
			}
		}
		
		return femalePersons;
	}

}
