package com.company.Mathieu;

import java.util.List;
import java.util.Map;
/**
 *
 * Sort a list and count occurrence
 *
 */
public interface ICountSymptoms {
    /**
     * @param countSymptoms sort the list getSymptoms
     *
     * @return a list of symptoms with occurrence, sort alphabetically and avoiding overlap
     */
    Map<String, Integer> countSymptoms(List<String> result);
}
