package com.designpattern.filtre;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements ICriteria{

	private static String  MALE_CRITARIA = "MALE";
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons=new ArrayList<Person>();
		
		for (Person person: persons) {
			if(person.getGender().equalsIgnoreCase(MALE_CRITARIA)) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
	

}
