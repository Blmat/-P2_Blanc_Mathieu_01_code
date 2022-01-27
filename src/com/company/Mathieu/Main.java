package com.company.Mathieu;

import java.io.File;
import java.io.FileWriter;
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

        List<String> symptoms;
        ISymptomFromDateFile symptomReader= new ReadSymptomFromDataFile("symptoms.txt");
        symptoms = symptomReader.getSymptoms();
        TreeMap<String, Integer> tSymptomsMap;

        ICountSymptoms countSymptoms = new CountSymptoms();
        tSymptomsMap = countSymptoms.countSymptoms(symptoms);

        IwriteOut iwriteOut = new WriteToOutFile();
        iwriteOut.iWriteSymptoms(tSymptomsMap);
    }
}
