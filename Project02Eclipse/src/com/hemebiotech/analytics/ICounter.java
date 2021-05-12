package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


/**
* ICounter is the interface responsible of 
* handling the distribution
* 
* @author      Clementine Ferreol
* @since       1.0
*/
public interface ICounter {
	/**
	 * Get symptom distribution. This function will calculate the count of
	 * each symptom based on the list provided.
	 * 
	 * @param symptoms The list of symptoms as strings.
	 *                
	 * @return a map that matches a string (symptom name) with a long (symptom
	 *         counter). If no data is available, return an empty map.
	 */
	Map<String, Long> getSymptomsDistribution(List<String> symptoms);
}
