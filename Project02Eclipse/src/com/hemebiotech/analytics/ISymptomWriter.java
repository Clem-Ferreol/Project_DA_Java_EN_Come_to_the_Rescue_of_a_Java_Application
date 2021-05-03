package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomWriter {

	void WriteSymptomsDistributionToFile (Map<String, Long> symptomsDistribution);
}
