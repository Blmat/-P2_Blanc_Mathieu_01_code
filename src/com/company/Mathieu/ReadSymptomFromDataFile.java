package com.company.Mathieu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * Access to data file and return the result in a list
 */
public class ReadSymptomFromDataFile implements ISymptomFromDateFile {
    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom
     *                 strings in it, one per line
     */
    public ReadSymptomFromDataFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() {
        List<String> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("The file " + filepath + " has been read.");
        } catch (IOException e) {
            System.err.println("File not found or Error IO: " + e.getMessage());
        }
        return result;
    }
}
