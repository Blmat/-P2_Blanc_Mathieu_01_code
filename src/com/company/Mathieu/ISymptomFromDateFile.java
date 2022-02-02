package com.company.Mathieu;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * <p>
 * The implementation does not need to order the list
 */
public interface ISymptomFromDateFile {
    /**
     * If no data is available, return an empty List
     *
     * @return a listing of all Symptoms obtained from a data source, duplicates are possible
     */
    List<String> getSymptoms();
}
