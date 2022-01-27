package com.company.Mathieu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;
import java.util.Map;
import java.util.TreeMap;

public class WriteToOutFile implements IwriteOut {
    /**
     * Read all key and value from TreeMap
     * Get key, get value and write them in a file name result.out
     */
    @Override
    public void iWriteSymptoms(TreeMap<String, Integer> tsortMap) {
        try {
            FileWriter fw = new FileWriter("result.out");
            for (Map.Entry<String, Integer> entry : tsortMap.entrySet()) {
                String Key = entry.getKey();
                Integer value = entry.getValue();
                fw.write("File 'symptoms.txt' has: " + Key + " = " + value + "\n\n");
            }
            fw.close();
            System.out.println("The file has been successfully analyzed");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


