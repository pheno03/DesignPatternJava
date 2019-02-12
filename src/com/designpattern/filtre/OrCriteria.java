package com.designpattern.filtre;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements ICriteria {

	private ICriteria criteria;
	private ICriteria otherCriteria;
		
	/**
	 * @param criteria
	 * @param otherCriteria
	 */
	public OrCriteria(ICriteria criteria, ICriteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		
		for (Person person : otherCriteriaItems) {
			if(!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
