package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


/**
* Main class that will execute the application. It consists of reading a file and 
* calculating a distribution out of it. Then the result is written inside a file.
* 
* @author      Clementine Ferreol
* @since       1.0
*/
public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		// Retrieve symptoms
        List<String> symptomsList = new ReadSymptomDataFromFile("symptoms.txt").getSymptoms();

        // Get symptoms distribution
        Map<String, Long> symptomsDistribution = new SymptomManager().getSymptomsDistribution(symptomsList);

        // Write output to file
        new WriteSymptomDataToFile().writeSymptomsDistributionToFile(symptomsDistribution);
	}
}
