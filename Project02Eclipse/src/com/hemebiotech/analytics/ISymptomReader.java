package com.hemebiotech.analytics;

import java.util.List;


/**
* ISymptomReader is the interface responsible of getting the symptoms from a file.
* Anything that will read symptom data from a source The important part is, the
* return value from the operation, which is a list of strings, that may contain
* many duplications
* 
* @author      Clementine Ferreol
* @since       1.0
*/
public interface ISymptomReader {
	/**
	 * Get a list of symptoms as strings.
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates
	 *         are possible/probable. If no data is available, return an empty List.
	 */
	List<String> getSymptoms();
}
