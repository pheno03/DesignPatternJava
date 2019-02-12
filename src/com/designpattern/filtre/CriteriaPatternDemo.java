package com.designpattern.filtre;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilisation de pattern filtre pour les criteres
 * 
 * @author srakotomalala
 *
 */

public class CriteriaPatternDemo implements IConstantesCriteria {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", MALE_CRITARIA, SINGLE_CRITERE));
		persons.add(new Person("John", MALE_CRITARIA, MARRIED));
		persons.add(new Person("Laura", FEMALE_CRITARIA, MARRIED));
		persons.add(new Person("Diana", FEMALE_CRITARIA, SINGLE_CRITERE));
		persons.add(new Person("Mike", MALE_CRITARIA, SINGLE_CRITERE));
		persons.add(new Person("Bobby", MALE_CRITARIA, SINGLE_CRITERE));

		ICriteria female = new CriteriaFemale();
		ICriteria male = new CriteriaMale();

		ICriteria single = new CriteriaSingle();
		ICriteria singleMale = new AndCriteria(single, male);

		ICriteria singleOrFemale = new OrCriteria(single, female);

		System.out.println(RESULTAT_MALES);
		printPersons(male.meetCriteria(persons));

		System.out.println(RESULTAT_FEMALES);
		printPersons(female.meetCriteria(persons));

		System.out.println(RESULTAT_SINGLE_MALES);
		printPersons(singleMale.meetCriteria(persons));

		System.out.println(RESULTAT_SINGLE_OR_FEMALES);
		printPersons(singleOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {

		for (Person person : persons) {
			System.out.println(PERSON_NAME + person.getName() + PERSON_GENDER + person.getGender() + STATUS_MARITAL
					+ person.getMaterialStatus() + END_CROCHET);
		}
	}

}
