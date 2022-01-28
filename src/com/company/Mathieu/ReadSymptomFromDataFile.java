package com.company.Mathieu;

import java.io.BufferedReader;
import java.io.File;
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
                             * @param filepath a full or partial path to file with symptom strings in it, one per line
                             */

    public ReadSymptomFromDataFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() {
        List<String> result = new ArrayList<>();
        File file = new File(filepath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.filepath));
            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("The file "+ file.getAbsolutePath()+ " has been read.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
