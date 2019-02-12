package com.designpattern.filtre;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements ICriteria {
	static String SINGLE_CRITERE = "SINGLE";

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> singlePersons = new ArrayList<Person>();
		
		for (Person person : persons) {
			if(person.getMaterialStatus().equalsIgnoreCase(SINGLE_CRITERE)) {
				singlePersons.add(person);			}
			
		}
		return singlePersons ;
	}

}
