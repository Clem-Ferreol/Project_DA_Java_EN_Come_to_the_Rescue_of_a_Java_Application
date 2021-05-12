package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


/**
* WriteSymptomDataToFile is a class that implements ISymptomWriter interface methods. 
* 
* @author      Clementine Ferreol
* @since       1.0
*/
public class WriteSymptomDataToFile implements ISymptomWriter {
	
	
	/**
	 * Write the output result (symptom distribution) inside a file.
	 * 
	 * @param symptomsDistribution The map that holds the distribution.
	 *                
	 * @return void.
	 */
	@Override
	public void writeSymptomsDistributionToFile (Map<String, Long> symptomsDistribution) {
		try {
			FileWriter writer = new FileWriter ("result.out");
			Map<String, Long> orderedSymptomsDistribution = new TreeMap<>(symptomsDistribution);
			for (Map.Entry<String, Long> entry : orderedSymptomsDistribution.entrySet()) {
		        System.out.println(entry.getKey() + "/" + entry.getValue());
		        writer.write(entry.getKey() + "=" + entry.getValue() + " ;\n");
		    }
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
