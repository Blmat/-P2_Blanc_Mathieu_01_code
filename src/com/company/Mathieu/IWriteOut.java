package com.company.Mathieu;

import java.util.Map;

/**
 * Write in a File "result.out"
 *
 * @param tsortMap read the map, get key and value and write in a file result.out
 */
public interface IWriteOut {
    void writeSymptoms(Map<String, Integer> tsortMap);
}
