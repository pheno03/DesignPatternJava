package com.designpattern.filtre;

import java.util.List;

public class AndCriteria implements ICriteria {

	private ICriteria criteria;
	private ICriteria otherCriteria;

	/**
	 * @param criteria
	 * @param otherCriteria
	 */
	public AndCriteria(ICriteria criteria, ICriteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
