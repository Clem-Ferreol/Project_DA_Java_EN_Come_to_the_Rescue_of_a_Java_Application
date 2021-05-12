package com.hemebiotech.analytics;

import java.util.Map;


/**
* ISymptomWriter is the interface responsible of writing the output result (symptom distribution) inside a file.
* 
* @author      Clementine Ferreol
* @since       1.0
*/
public interface ISymptomWriter {
	
	/**
	 * Write the output result (symptom distribution) inside a file.
	 * 
	 * @param symptomsDistribution The map that holds the distribution.
	 *                
	 * @return void.
	 */
	void writeSymptomsDistributionToFile (Map<String, Long> symptomsDistribution);
	
}
