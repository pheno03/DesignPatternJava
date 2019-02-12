/**
 * 
 */
package com.designpattern.filtre;

import java.util.List;

/**
 * Interface Critere
 * @author srakotomalala
 *
 */
public interface ICriteria {
	public  List<Person> meetCriteria(List<Person> persons);

}
