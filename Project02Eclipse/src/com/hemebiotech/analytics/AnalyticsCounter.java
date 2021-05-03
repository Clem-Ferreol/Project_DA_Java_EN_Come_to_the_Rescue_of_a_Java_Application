package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		// Retrieve symptoms
        List<String> symptomsList = new ReadSymptomDataFromFile("symptoms.txt").GetSymptoms();

        // Get symptoms distribution
        Map<String, Long> symptomsDistribution = new SymptomManager().GetSymptomsDistribution(symptomsList);

        // Write output to file
        new WriteSymptomDataToFile().WriteSymptomsDistributionToFile(symptomsDistribution);
	}
}
