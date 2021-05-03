package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This class will calculate distribution for the symptoms
 *
 */
public class SymptomManager implements ICounter {
	
	public SymptomManager () {}
	
	@Override
	public Map<String, Long> GetSymptomsDistribution (List<String> symptoms) {
		// https://stackoverflow.com/questions/25441088/how-can-i-count-occurrences-with-groupby
        return symptoms.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

}
