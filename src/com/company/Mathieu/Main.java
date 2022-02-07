package com.company.Mathieu;

import java.util.List;
import java.util.Map;

public class Main {
    /**
     * Call all methods
     * Get the list of symptoms
     * Sort the list
     * Display the list
     * Write the list in result.out
     */
    public static void main(String[] args) {

        ISymptomFromDateFile readSymptomFromDataFile = new ReadSymptomFromDataFile("symptoms.txt");
        List<String> symptoms = readSymptomFromDataFile.getSymptoms();

        ICountSymptoms countSymptoms = new CountSymptoms();
        Map<String, Integer> tSymptomsMap = countSymptoms.countSymptoms(symptoms);

        IWriteOut writeOut = new WriteToOutFile("result.out");
        writeOut.writeSymptoms(tSymptomsMap)
    }
}
