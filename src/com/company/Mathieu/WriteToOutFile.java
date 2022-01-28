package com.company.Mathieu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteToOutFile implements IwriteOut {
    private String fileOut;

    public WriteToOutFile(String fileOut) {
        this.fileOut=fileOut;
    }

    /**
     * Read all key and value from TreeMap
     * Get key, get value and write them in a file name result.out
     */
    @Override
    public void iWriteSymptoms(TreeMap<String, Integer> tsortMap) {
        try {
            FileWriter fw = new FileWriter(fileOut);
            for (Map.Entry<String, Integer> entry : tsortMap.entrySet()) {
                String Key = entry.getKey();
                Integer value = entry.getValue();
                fw.write("File 'symptoms.txt' has: " + Key + " = " + value + System.lineSeparator());
            }
                fw.close();
            File file = new File(fileOut);
            System.out.println("The file has been successfully analyzed");
            System.out.println("the external file ---> "+file.getAbsoluteFile()+" <---");
        } catch (IOException e) {
            System.err.println("Error IO: " + e.getMessage());
        }
    }
}


