package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* SymptomManager is a class that implements ICounter interface methods. 
* 
* @author      Clementine Ferreol
* @since       1.0
*/
public class SymptomManager implements ICounter {
	
	public SymptomManager () {}
	
	
	
	/**
	 * Get symptom distribution. This function will calculate the count of
	 * each symptom based on the list provided.
	 * 
	 * @param symptoms The list of symptoms as strings.
	 *                
	 * @return a map that matches a string (symptom name) with a long (symptom
	 *         counter). If no data is available, return an empty map.
	 */
	@Override
	public Map<String, Long> getSymptomsDistribution (List<String> symptoms) {
		// https://stackoverflow.com/questions/25441088/how-can-i-count-occurrences-with-groupby
        return symptoms.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

}
