package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ICounter {
	/**
	 * If no data is available, return an empty map
	 * 
	 * @return a map that matches a string (symptom name) with a long (symptom counter)
	 */
	Map<String, Long> GetSymptomsDistribution (List<String> symptoms);
}
