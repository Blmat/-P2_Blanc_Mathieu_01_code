package com.company.Mathieu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteToOutFile implements IWriteOut {

    private String fileOut;

    public WriteToOutFile(String fileOut) {
        this.fileOut = fileOut;
    }

    /**
     * Read all key and value from TreeMap
     * Get key, get value and write them in a file name result.out
     */
    @Override
    public void writeSymptoms(Map<String, Integer> tSortMap) {
        try {
            FileWriter fw = new FileWriter(fileOut);
            tSortMap.forEach((key, value) -> {
                try {
                    fw.write("Symtpoms: " + key + " = " + value + System.lineSeparator());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
            fw.close();
            File file = new File(fileOut);
            System.out.println("The file has been successfully analyzed");
            System.out.println("the external file ---> " + file.getAbsoluteFile() + " <---");
        } catch (IOException e) {
            System.err.println("Error IO: " + e.getMessage());
        }
    }
}



