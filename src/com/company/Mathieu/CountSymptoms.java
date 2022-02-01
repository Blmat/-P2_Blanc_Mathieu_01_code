package com.company.Mathieu;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * Create a map and read the list
 * <p>
 * Test if symptoms(key) exist in map
 * <p>
 * If exist : get the value for the occurrence of symptoms, increment and put the value in map
 * <p>
 * Else: add symptoms and an occurrence(value) of 1 in the map
 */
public class CountSymptoms implements ICountSymptoms{
    @Override
    public Map<String, Integer> countSymptoms(List<String> result) {

        Map<String, Integer> tSymptomMap = new TreeMap<>();
        result.forEach(s -> {
            int value=tSymptomMap.getOrDefault(s ,0)+1;
            tSymptomMap.put(s, value);
        });
        System.out.println("Total symptom = " + tSymptomMap.size());
        System.out.println("Total occurencies = " + result.size());
        return tSymptomMap;
    }
}
