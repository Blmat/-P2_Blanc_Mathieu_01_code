package com.company.Mathieu;

import java.util.List;
import java.util.TreeMap;

public class Main {
    /**
     * Call all methods
     * Get the list of symptoms
     * Sort the list
     * Display the list
     * Write the list in result.out
     */
    public static void main(String[] args) {

        ReadSymptomFromDataFile symptomReader = new ReadSymptomFromDataFile("symptoms.txt");
        List<String> symptoms = symptomReader.getSymptoms();

        CountSymptoms countSymptoms = new CountSymptoms();
        TreeMap<String, Integer> tSymptomsMap = countSymptoms.countSymptoms(symptoms);

        WriteToOutFile writeOut = new WriteToOutFile("result.out");
        writeOut.iWriteSymptoms(tSymptomsMap);
    }
}
